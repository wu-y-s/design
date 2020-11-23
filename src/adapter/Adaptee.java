package adapter;

//要被适配的类 比如网线
public class Adaptee {

    public void request(){
        System.out.println("连接网线上网");
    }
}
