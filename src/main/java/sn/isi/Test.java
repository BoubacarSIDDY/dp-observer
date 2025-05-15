package sn.isi;

import sn.isi.obs.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {
    public static void main(String[] args) {
        Observer observer1 = new ObserverImpl();
        Observer observer2 = new ObserverImpl2();
        ObservableImpl1 observableImpl1 = new ObservableImpl1();
        observableImpl1.subscribe(observer1);
        observableImpl1.subscribe(observer2);
        observableImpl1.setState(10);
        observableImpl1.unsubscribe(observer1);
        observableImpl1.subscribe(state -> {
            System.out.println("++++++ Direct +++++++");
            System.out.println("value : " + (Math.random()*0.5 + state));
            System.out.println("++++++++++++++");
        });
        observableImpl1.setState(1);
    }
}