public class Car{
    String name;
    int number;    
    
    public Car(String name) {
        this.name = name;
    }
    
    public Car() {
        this.name = "이름없음"; ---①
        this.number = 0;
    }
    
    public Car(String name, int number) {
        this.name = name;
        this.number = number; 
    }
}