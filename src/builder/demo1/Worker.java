package builder.demo1;

//具体建造者
public class Worker extends Builder{

    private Product product;

    public Worker(){
        product = new Product();
    }
    @Override
    void buildA() {
        product.setA("地基");
        System.out.println("地基");
    }

    @Override
    void buildB() {
        product.setA("钢筋");
        System.out.println("钢筋");
    }

    @Override
    void buildC() {
        product.setA("铺地线");
        System.out.println("铺地线");
    }

    @Override
    void buildD() {
        product.setA("粉刷");
        System.out.println("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
