package bridge;
//抽象电脑类
public abstract class Computer {
    private Brand brand;

    public Computer(Brand brand){
        this.brand = brand;
    }

    public void info(){
        brand.info();
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}

