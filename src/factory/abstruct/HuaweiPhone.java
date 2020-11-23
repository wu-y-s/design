package factory.abstruct;

public class HuaweiPhone implements PhoneProduct{
    @Override
    public void start() {
        System.out.println("华为开机");
    }

    @Override
    public void shurDown() {
        System.out.println("华为关机");
    }

    @Override
    public void callUp() {
        System.out.println("华为打电话");
    }

    @Override
    public void sendSms() {
        System.out.println("华为发短信");
    }
}
