package factory.simple;

public class CarFactory {
    //简单工厂
    public static Car getCar(String car){
        if("五菱".equals(car)){
            return new Wulin();
        }else if("特斯拉".equals(car)){
            return new Tesla();
        }
        return null;
    }
}
