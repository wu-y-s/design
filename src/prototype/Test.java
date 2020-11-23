package prototype;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date =new Date();
        Video x = new Video("aa",date);

        Video y = (Video) x.clone();
    }
}
