package DesignPattren.Singleton;

public class Jalebi{

/*    Eager way of initialising single ton,
*     The disadvantage here is that the object will be pre created before calling so the performence of the
*  application will be redused as due to unused object instance
* */

    private static Jalebi jalebi  =  new Jalebi();

    public static Jalebi getInstance(){
        return jalebi;
    }
}
