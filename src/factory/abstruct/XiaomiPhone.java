package factory.abstruct;

public class XiaomiPhone implements PhoneProduct{
    @Override
    public void start() {
        System.out.println("小米开机");
    }

    @Override
    public void shurDown() {
        System.out.println("小米关机");
    }

    @Override
    public void callUp() {
        System.out.println("小米打电话");
    }

    @Override
    public void sendSms() {
        System.out.println("小米发短信");
    }
}
