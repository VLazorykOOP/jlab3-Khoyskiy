package ZOO;

public class Ungulate extends Animal{
    private String hornType;                       //тип рогів 
    private double averageRunningSpeed;            //середня швидкість бігу
    
    public Ungulate(String species, double averageWeight, String hornType, double averageRunningSpeed) {
        super(species, averageWeight);
        this.hornType = hornType;
        this.averageRunningSpeed = averageRunningSpeed;
    }
    
    public void show() {
        super.show();
        System.out.println("Horn type: " + hornType);
        System.out.println("Average running speed: " + averageRunningSpeed + " km/h");
    }
}
