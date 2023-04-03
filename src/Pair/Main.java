package Pair;

public class Main {
    public static void main(String[] args){
        Money Me = new Money();
        Money You = new Money(200,85);
        Money Cocacola = new Money(60,285);
        Money Cocacolazero = new Money(62,85);
        System.out.println("Cocacola: " + Cocacola.toString());
        Money Pizza = new Money(152,35);
        Money Sum = (Money) Me.add(You);
        Money Price = (Money) Cocacola.add(Pizza);
        System.out.println("We have: " + Sum.toString() + " we need: " + Price);
        Money Change = (Money) Sum.subtract(Price);
        System.out.println("Change " + Change);
        System.out.println("Let's divide by 2 change for me and you - " + Change.divide(2));
        System.out.println(Cocacola.multiply(3));
        System.out.println(Cocacola.equals(Cocacolazero));

        System.out.println("\n\n\n");

        Pair[] pairs = new Pair[4];
        pairs[0] = new Money(20, 60);
        pairs[1] = new Money(5, 75);
        pairs[2] = new Fraction(3, 4);
        pairs[3] = new Fraction(15, 7);
        for (Pair pair : pairs) {
            System.out.println(pair.toString());
        }

        Pair sum = pairs[0].add(pairs[1]);
        Pair difference = pairs[0].subtract(pairs[1]);
        Pair product = pairs[2].multiply(2);
        Pair quotient = pairs[3].divide(5);
        System.out.println("Sum: " + sum.toString());
        System.out.println("Difference: " + difference.toString());
        System.out.println("Sum Fraction: " + pairs[2].toString() +" + " + pairs[3] + " = " + pairs[2].add(pairs[3]));
        System.out.println("Product: " + product.toString());
        System.out.println("Quotient: " + quotient.toString());
        
        System.out.println(pairs[0].equals(pairs[1])); // false
        System.out.println(pairs[2].equals(new Fraction(6,8))); // true
    }
}

