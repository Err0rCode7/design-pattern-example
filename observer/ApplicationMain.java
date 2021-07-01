package design.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class ApplicationMain {

    /**
     *  Observer Pattern Example
     *
     *  Observable, Observer Interface is deperecated
     *  So we use PropertyChangeSupport.
     *
     *  옵저버 패턴을 이용해서 뉴스를 구독하는 예제
     */
    public static void main(String[] args) {
        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();

        observable.addPropertyChangeListener(observer);
        observable.setNews("news");

        System.out.println("Observable notify news: " + observable.getNews());
        System.out.println("Observer news: " + observer.getNews());

        observable.setNews("second news");
        System.out.println("Observable notify news: " + observable.getNews());
        System.out.println("Observer news: " + observer.getNews());

        observable.setNews("third news");
        System.out.println("Observable notify news: " + observable.getNews());
        System.out.println("Observer news: " + observer.getNews());


    }
}
