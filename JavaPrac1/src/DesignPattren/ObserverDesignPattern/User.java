package DesignPattren.ObserverDesignPattern;

public class User implements Subscriber{
    private String name;

    public User(String name){
        this.name = name;
    }
    @Override
    public void update(String news) {

        System.out.println("The News is : "+news+" given to user "+name);
    }
}
