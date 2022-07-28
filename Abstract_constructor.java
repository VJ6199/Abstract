abstract class Cars{
    abstract void features(String colour, String model, String speed, int price);
    Cars(){
        System.out.println("Sports car");
    }
}
class Hyundai extends Cars{
    Hyundai(String name){
        System.out.println("Hyundai cars are Trusted with long service and resale value");
    }
    void features(String colour, String model, String speed, int price){
        System.out.println(colour +" " + model + " " + speed +" " + price);
    }
}
class Toyota extends Cars{
    Toyota(String name){
        System.out.println("Toyota cars give best milage and long service");
    }
    void features(String colour, String model, String speed, int price){
        System.out.println(colour +" " + model + " " + speed +" " + price);
    }
}
public class Abstract_constructor {
    public static void main(String[] args){
        Hyundai cars = new Hyundai("Elantra");
        cars.features("Black", "sports", "120mph " , 35000);
        Toyota vehicle = new Toyota("Camry");
        cars.features("Red", "sports", "100mph " , 30000);
    }
}
