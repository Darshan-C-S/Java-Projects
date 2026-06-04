package DesignPattren.Singleton;

/*
* The thread safety of enums in Java comes from the JVM's
 class loading guarantees and the immutable, static final nature of
 enum instances, making them the best way to implement the
 Singleton pattern safely and simply.
* */
enum DemoEnum{
    INSTANCE ;

   private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
