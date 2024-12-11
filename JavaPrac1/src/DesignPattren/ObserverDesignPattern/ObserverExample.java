package DesignPattren.ObserverDesignPattern;

public class ObserverExample {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        User user1= new User("Darshan C S");
        User user2 = new User("Hello all");

        newsAgency.addSubscriber(user1);
        newsAgency.addSubscriber(user2);

        newsAgency.setNews("There is heavy rain in Banglore");

    }
}
