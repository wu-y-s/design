package factory.method;



public class Consumer {
    public static void main(String[] args){
//        //不用工厂
//        factory.simple.Car car1 = new Wulin();
//        factory.simple.Car car2 = new Tesla();
//        car1.name();
//        car2.name();
//
//        //简单
//        Car car3 = CarFactory.getCar("五菱");

        //工厂方法
        Car car1 = new WulinFactory().getCar();
    }



}
