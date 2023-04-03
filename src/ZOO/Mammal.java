package ZOO;

class Mammal extends Animal {
    private String lovefood;  //улюблена їжа
    
    public Mammal(String species, double averageWeight, String lovefood) {
        super(species, averageWeight);
        this.lovefood = lovefood;
    }
    
    public void show() {
        super.show();
        System.out.println("Favorite food: " + lovefood);
    }
}