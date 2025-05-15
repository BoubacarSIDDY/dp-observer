package sn.isi.obs;

import java.util.ArrayList;
import java.util.List;
/*
 * Observateur implementation 2
 */
public class ObserverImpl2 implements Observer{
    List<Integer> historiques = new ArrayList<>();
    @Override
    public void update(int state) {
        historiques.add(state);
        int somme = 0;
        for (Integer value : historiques){
            somme += value;
        }
        System.out.println("---- OBS 2 -----");
        System.out.println("AVG State : " + ((float) somme/historiques.size()));
        System.out.println("---- OBS 2 -----");
    }
}
