import java.util.Scanner;

public class robotng extends robotag {
    public robotng(double x, double y, String nom, char direction) {
        super(x, y, nom, direction);
    }

    @Override
    public void avance() {
        super.avance();
    }

    @Override
    public void droite() {
        super.droite();
    }
    public void gauche(){
        for (int i=0;i<=3;i++){
          droite();
        }
    }
    public void arriere(){
        for (int i=0;i<=3;i++){
            avance();}
    }
}
