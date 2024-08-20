package Generics;

class Test<T>{
    T obj;
    Test(T obj){
        this.obj = obj;
    }
    public T getObj(){
        return this.obj;
    }
}
public class GenricBasic  {
    public static void main(String[] args) {
        Test<String> t = new Test("Darshan");
        System.out.println(t.getObj());

        Test<Integer> ti = new Test(10);
        System.out.println(ti.getObj());


    }


}
