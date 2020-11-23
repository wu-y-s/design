package builder.demo1;

//指挥，核心，负责构建一个工程
public class Director {

    public Product build(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();

        return builder.getProduct();
    }
}
