package factory.abstruct;

public class XiaomiRouter implements RouterProduct{
    @Override
    public void start() {
        System.out.println("小米路由器开机");
    }

    @Override
    public void shurDown() {
        System.out.println("小米路由器关机");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器设密码");
    }

    @Override
    public void openWifi() {
        System.out.println("小米路由器打开wifi");
    }
}
