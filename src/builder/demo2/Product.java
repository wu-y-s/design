package builder.demo2;

//套餐
public class Product {
    private String A = "炸鸡";
    private String B = "汉堡";
    private String C = "薯条";
    private String D = "可乐";

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    public String getD() {
        return D;
    }

    public void setD(String d) {
        D = d;
    }

    @Override
    public String toString() {
        return "Product{" +
                "A='" + A + '\'' +
                ", B='" + B + '\'' +
                ", C='" + C + '\'' +
                ", D='" + D + '\'' +
                '}';
    }
}
