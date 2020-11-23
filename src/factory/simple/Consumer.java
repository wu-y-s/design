package factory.simple;

public class Consumer {
    public static void main(String[] args){
        //不用工厂
        Car car1 = new Wulin();
        Car car2 = new Tesla();
        car1.name();
        car2.name();

        //简单
        Car car3 = CarFactory.getCar("五菱");
    }



}
