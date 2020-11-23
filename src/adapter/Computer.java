package adapter;

//客户端类

public class Computer {

    public void net(NetToUsb adapter){
        adapter.handlerRequest();
    }

    public static void main(String[] args){
        Computer computer = new Computer();
        NetToUsb netToUsb1 = new Adapter();
        NetToUsb netToUsb2 = new Adapter2(new Adaptee());
        computer.net(netToUsb2);
    }
}
