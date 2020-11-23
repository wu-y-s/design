package proxypattern.staticproxy;

public class Proxy {

    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    public void rent(){
        seeHouse();
        host.rent();
        fare();
    }

    public void seeHouse(){
        System.out.println("看房");
    }

    public  void fare(){
        System.out.println("收中介费");
    }
}
