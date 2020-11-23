package bridge;

public class Test {

    public static void main(String[] args){
        Computer appleLaptop = new Laptop(new Apple());
        Computer lenovoDesktop = new Desktop(new Lenovo());
        appleLaptop.info();
        lenovoDesktop.info();
    }
}
