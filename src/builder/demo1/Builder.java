package builder.demo1;

//抽象建造者
public abstract class Builder {
    abstract void buildA();
    abstract void buildB();
    abstract void buildC();
    abstract void buildD();

    abstract Product getProduct();
}
