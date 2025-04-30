public class Quiz4_A_112403019 {
    public static void main(String[] args) {

        Budi car1 = new Budi();
        car1.brand = "Budi";
        car1.setType("sedan");
        car1.setCc(4500);
        car1.setCarsize(4600, 2600);

        Cenz car2 = new Cenz();
        car2.brand = "Cenz";
        car2.setType("suv");
        car2.setCc(6000);
        car2.setCarsize(4600, 1800);

        Cmw car3 = new Cmw();
        car3.brand = "Cmw";
        car3.setType("sports_car");
        car3.setCc(8600);
        car3.setCarsize(4600, 2000);

        Cenz car4 = new Cenz();
        car4.brand = "Cenz";
        car4.setType("garbage_truck");
        car4.setCc(5000);
        car4.setCarsize(6000, 2500);

        System.out.println("car1's Information:\n"+car1.brand +" "+ car1.type+" HP：" +car1.get_Horsepower()+" Wheel Size："+car1.get_Wheel_size() );
        System.out.println("car2's Information:\n"+car2.brand +" "+ car2.type+" HP：" +car2.get_Horsepower()+" Wheel Size："+car2.get_Wheel_size() );
        System.out.println("car3's Information:\n"+car3.brand +" "+ car3.type+" HP：" +car3.get_Horsepower()+" Wheel Size："+car3.get_Wheel_size() );
        System.out.println("car4's Information:\n"+car4.brand +" "+ car4.type+" HP：" +car4.get_Horsepower()+" Wheel Size："+car4.get_Wheel_size() );
    }
}
interface Engine {
    double get_Horsepower();
}
interface Wheel {

    double get_Wheel_size();
}


abstract class Car {

    protected String type;
    protected int cc;
    protected int car_len;
    protected int car_width;
    protected String brand;
    protected int level;


    Car(){
    }
    abstract void setType(String type);

    abstract void setCc(int Cc);

    abstract void setCarsize(int car_len, int car_width);

    public abstract double get_Horsepower();

    public abstract double get_Wheel_size();
}

class Budi extends Car implements Engine, Wheel{

    Budi() {
        super();
    }

    @Override
    void setType(String type) {
        this.type = type;
        if(this.type.equals("sedan")){
            this.level = 10;
        }
    }

    @Override
    void setCc(int Cc) {
        this.cc = Cc;
    }

    @Override
    void setCarsize(int car_len, int car_width) {
        this.car_len = car_len;
        this.car_width = car_width;
    }

    @Override
    public double get_Horsepower() {
        return (double) cc / level;
    }

    @Override
    public double get_Wheel_size() {
        return (double) (car_len - car_width) / 100 - level;
    }
}
class Cenz extends Car implements Engine, Wheel{
    Cenz() {
        super();
    }

    @Override
    void setType(String type) {
        this.type = type;
        if(this.type.equals("suv")){
            this.level = 8;
        }
        else{
            this.level = 10;
        }
    }

    @Override
    void setCc(int Cc) {
        this.cc = Cc;
    }

    @Override
    void setCarsize(int car_len, int car_width) {
        this.car_len = car_len;
        this.car_width = car_width;
    }

    @Override
    public double get_Horsepower() {
        return (double) cc / level;
    }

    @Override
    public double get_Wheel_size() {
        return (double) (car_len - car_width) / 100 - level;
    }
}
class Cmw extends Car implements Engine, Wheel{
    Cmw() {
        super();
    }

    @Override
    void setType(String type) {
        this.type = type;
        if(this.type.equals("sports_car")){
            this.level = 6;
        }
    }

    @Override
    void setCc(int Cc) {
        this.cc = Cc;
    }

    @Override
    void setCarsize(int car_len, int car_width) {
        this.car_len = car_len;
        this.car_width = car_width;
    }

    @Override
    public double get_Horsepower() {
        return (double) cc / level;
    }

    @Override
    public double get_Wheel_size() {
        return (double) (car_len - car_width) / 100 - level;
    }
}

