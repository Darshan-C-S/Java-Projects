package DesignPattren.Singleton;

public enum DemoEnum{
    INSTANCE;
    
    private int num ;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
