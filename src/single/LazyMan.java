package single;

public class LazyMan {

    private static String x = EnumSingle.INSTANCE.getCode();

    private LazyMan(){
        if(x.equals(EnumSingle.INSTANCE.getCode())){
            x = "0";
        }else{
            throw new RuntimeException("不要试图通过反射破环！");
        }
    }

    private volatile static LazyMan lazyMan;

    //DCL懒汉式
    public static LazyMan getInstance(){
        if(lazyMan == null){
            synchronized (LazyMan.class){
                if(lazyMan == null){
                    //不是原子性操作1.分配内存空间2.执行构造方法，初始化对象3.把对象指向这空间,所以要避免指令重排
                    lazyMan = new LazyMan();
                }
            }
        }
        return lazyMan;
    }
}

