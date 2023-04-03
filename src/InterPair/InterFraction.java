package InterPair;

public class InterFraction implements InterPair{
    private int numerator;
        private int denominator;
    
        public InterFraction(int numerator, int denominator) {
            simplify(numerator, denominator);
        }
        public InterFraction() {
            this.numerator = 1;
            this.denominator = 2;
        }
    
        public int getFirst() {
            return numerator;
        }
        
        public int getSecond() {
            return denominator;
        }
    
        @Override
        public InterFraction add(InterPair other) {
            if(this == null || other == null || !(other instanceof InterPair)){
                System.out.println("Error");
                return null;
            }
            int newNumerator = this.numerator * other.getSecond() + other.getFirst() * this.denominator;
            int newDenominator = this.denominator * other.getSecond();
            return new InterFraction(newNumerator, newDenominator);
        }
    
        @Override
        public InterFraction subtract(InterPair other) {
            if(this == null || other == null || !(other instanceof InterPair)){
                System.out.println("Error");
                return null;
            }
            int newNumerator = this.numerator * other.getSecond() - other.getFirst() * this.denominator;
            int newDenominator = this.denominator * other.getSecond();
            return new InterFraction(newNumerator, newDenominator);
        }

        @Override
        public InterFraction multiply(int n) {
            int newNumerator = this.numerator * n;
            return new InterFraction(newNumerator, this.denominator);
        }       

        @Override
        public InterFraction divide(int n) {
            int newDenominator = this.denominator * n;
            return new InterFraction(this.numerator, newDenominator);
        }
            
        private void simplify(int A, int B) {
            int gcd = gcd(A, B);
           // System.out.println(gcd+" ");
            this.numerator = A / gcd;
            this.denominator = B / gcd;
        }

        private int gcd(int a, int b) {
            //System.out.println(a+" "+b);                                            
            if (b == 0) {                                                             
                return a;                 //   81 28    28 25   25 3   3 1    1 0                                       
            }                                                                        
            return gcd(b, a % b);
        }

        @Override
        public String toString() {
            return this.numerator + "/" + this.denominator;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InterFraction)) {
                return false;
            }
            InterFraction f = this;
            f.simplify(f.numerator, f.denominator);
            InterFraction g = (InterFraction) obj;
            g.simplify(g.numerator, g.denominator);
            return g.numerator == f.numerator && g.denominator == f.denominator;
        }
}
