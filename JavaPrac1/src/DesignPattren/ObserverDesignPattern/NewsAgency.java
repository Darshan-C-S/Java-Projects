package DesignPattren.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String newsText ;

    public void addSubscriber(Subscriber subscriber ){
        subscribers.add(subscriber);
    }
    public  void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void NotifySubscriber(){
        for(Subscriber s : subscribers){
            s.update(newsText);
        }
    }

    public void setNews(String news){
        this.newsText = news;
        NotifySubscriber();
    }




}
