package sn.isi.obs;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl1 implements Observable{
    int state = 0;
    List<Observer> observerList = new ArrayList<>(); // liste des observateurs
    @Override
    public void subscribe(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observerList.remove(o);
    }

    @Override
    public List<Observer> listSubscribers() {
        return observerList;
    }

    public void setState(int state) {
        this.state = state;
        for (Observer observer : observerList){
            observer.update(state);
        }
    }
}
