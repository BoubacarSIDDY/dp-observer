package sn.isi.obs;
/*
 * Observateur implementation
 */
public class ObserverImpl implements Observer{
    @Override
    public void update(int state) {
        System.out.println("**** OBS 1 ****");
        System.out.println("State value : " + state);
        System.out.println("***** FIN OBS 1 ****");
    }
}
