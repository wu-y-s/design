package adapter;

//适配器实体\
//类适配器
public class Adapter extends Adaptee implements NetToUsb{

    @Override
    public void handlerRequest() {
        super.request();
    }
}
