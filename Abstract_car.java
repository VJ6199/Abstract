abstract class Car{
    abstract void Maxspeed();
    void tyres(){
        System.out.println("Car has 4 winter tyres");
    }
    void feature(){
        System.out.println("Car has rooftop and 6 stroke engine");
    }
}
class BMW extends Car{
    void Maxspeed(){
        System.out.println("Maxspeed of BMW is 140mph");
    }
}
class Audi extends Car{
void Maxspeed() {
    System.out.println("Maxspeed of Audi is 160mph");
}
        }
public class Abstract_car {
    public static void main(String[] args){
        BMW e350 = new BMW();
        e350.Maxspeed();
        e350.tyres();
        e350.feature();
        Audi A8 = new Audi();
        A8.Maxspeed();
        A8.tyres();
        A8.feature();
    }
}
