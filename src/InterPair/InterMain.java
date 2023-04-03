package InterPair;


public class InterMain {
    public static void main(String[] args) {
    InterPair Pair = new InterMoney(1,78);
    InterMoney Me = new InterMoney(20,50);
    System.out.println(Pair.add(Me));

    System.out.println("\n");

    InterPair[] pairs = new InterPair[4];
    pairs[0] = new InterMoney(20, 60);
    pairs[1] = new InterMoney(5, 75);
    pairs[2] = new InterFraction(3, 4);
    pairs[3] = new InterFraction(5, 6);
    for (InterPair pair : pairs) {
        System.out.println(pair.toString());
    }
    
    InterPair sum =   pairs[0].add(pairs[1]);
    InterPair difference =  pairs[0].subtract(pairs[1]);
    InterPair product =  pairs[2].multiply(2);
    InterPair quotient =  pairs[3].divide(5);
    System.out.println("Sum: " + sum.toString());
    System.out.println("Difference: " + difference.toString());
    System.out.println("Sum Fraction: " + pairs[2].toString() +" + " + pairs[3] + " = " + pairs[2].add(pairs[3]));
    System.out.println("Product: " + product.toString());
    System.out.println("Quotient: " + quotient.toString());
    
    System.out.println(pairs[0].equals(pairs[1])); // false
    System.out.println(pairs[2].equals(new InterFraction(6,8))); // true
    //new Fraction(6, 4).f(new Fraction(12, 8)); 
    }
}
