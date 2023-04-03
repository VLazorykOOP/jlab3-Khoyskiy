package InterPair;

public class InterMoney implements InterPair {
    private int dollars;
    private int cents;
    
    public InterMoney(int dollars, int cents) {
        if (cents >= 100) {
            dollars += cents / 100;
            cents = cents % 100;
        }
        this.dollars = dollars;
        this.cents = cents;
    }
    public InterMoney() {
        dollars = 350;
        cents = 50;
    }
    
    public int getFirst() {
        return dollars;
    }
    
    public int getSecond() {
        return cents;
    }

    @Override
    public InterMoney add(InterPair other) {
        if(this == null || other == null || !(other instanceof InterPair)){
            System.out.println("Error");
            return null;
        }
        int newDollars = this.dollars + other.getFirst();
        int newCents = this.cents + other.getSecond();
        if (newCents >= 100) {
            newDollars += newCents / 100;
            newCents = newCents % 100;
        }
        return new InterMoney(newDollars, newCents);
    }
    
    @Override
    public InterMoney subtract(InterPair other) {
        if(this == null || other == null || !(other instanceof InterPair)){
            System.out.println("Error");
            return null;
        }
        int newDollars = this.dollars - other.getFirst();
        int newCents = this.cents - other.getSecond();
        if (newCents < 0) {
            newDollars--;
            newCents += 100;
        }
        return new InterMoney(newDollars, newCents);
    }

    @Override
    public InterMoney multiply(int n) {
        int totalCents = dollars * 100 + cents;
        totalCents *= n;
        int newDollars = totalCents / 100;
        int newCents = totalCents % 100;
        return new InterMoney(newDollars, newCents);
    }
    
    @Override
    public InterMoney divide(int n) {
        int totalCents = dollars * 100 + cents;
        totalCents /= n;
        int newDollars = totalCents / 100;
        int newCents = totalCents % 100;
        return new InterMoney(newDollars, newCents);
    }

    public String toString() {
        return "$" + dollars + "." + cents;
    }
    
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
    }
        if (!(obj instanceof InterMoney)) {
            return false;
    }
    InterMoney money = (InterMoney)obj;
    return this.dollars == money.dollars && this.cents == money.cents;
    }
}
