package sn.isi.obs;

import java.util.List;
/*
* Observés
*/
public interface Observable {
    void subscribe(Observer o);
    void unsubscribe(Observer o);
    List<Observer> listSubscribers();
}
