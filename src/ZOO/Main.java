package ZOO;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Mammal("Bear", 300, "Me");
        animals[1] = new Ungulate("Deer", 150, "Сoniferous horns", 64);
        animals[2] = new Bird("Eagle", 4,"Curved");
        
        for (Animal animal : animals) {
            animal.show();
            System.out.println();
        }
    }
}
