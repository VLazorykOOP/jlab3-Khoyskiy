package ZOO;

public class Bird extends Animal{   
    private String beakType;        //дзьоб тип
    
    public Bird(String species, double averageWeight, String beakType) {
        super(species, averageWeight);
        this.beakType = beakType;
    }
    
    public void show() {
        super.show();
        System.out.println("Beak type: " + beakType);
    }
}
