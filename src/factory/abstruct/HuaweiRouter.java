package factory.abstruct;

public class HuaweiRouter implements RouterProduct{
    @Override
    public void start() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void shurDown() {
        System.out.println("华为路由器关机");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器设密码");
    }

    @Override
    public void openWifi() {
        System.out.println("华为路由器打开wifi");
    }
}
