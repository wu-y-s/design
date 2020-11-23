package proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public ProxyInvocationHandler(Rent rent){
        this.rent = rent;
    }

    public ProxyInvocationHandler(){

    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生产代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);

    }

    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        seeHouse();
        Object result = method.invoke(rent,args);
        fare();
        return result;
    }

    public void seeHouse(){
        System.out.println("看房");
    }

    public  void fare(){
        System.out.println("收中介费");
    }
}
