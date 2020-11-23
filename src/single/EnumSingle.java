package single;

public enum EnumSingle {

    INSTANCE("wys");

    private String code;

    EnumSingle(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
