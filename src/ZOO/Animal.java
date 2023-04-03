package ZOO;

public class Animal {
    private String species;                //Вид
    private double averageWeight;          //Вага
    
    public Animal(String species, double averageWeight) {
        this.species = species;
        this.averageWeight = averageWeight;
    }
    
    public void show() {
        System.out.println("Species: " + species);
        System.out.println("Average weight: " + averageWeight + " kg");
    }
}
