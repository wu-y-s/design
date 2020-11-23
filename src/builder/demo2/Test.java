package builder.demo2;



public class Test {
    public static void main(String[] args){
        Worker worker = new Worker();
        Product product = worker.buildA("全家桶").getProduct();
        System.out.println(product);
    }
}
