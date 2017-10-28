import java.util.Scanner;

public class robotag extends position {
    Scanner sc=new Scanner(System.in);
    protected String nom;
    protected int direction;

    public robotag(double x, double y, String nom, char direction) {
        super(x, y);
        this.nom = nom;
        this.direction = direction;
    }
    public void main() {
        System.out.println(" direction nord 1");
        System.out.println(" direction sud 2");
        System.out.println(" direction est 3");
        System.out.println(" direction ouest 4");
        System.out.println(" direction nord-est 5 ");
        System.out.println("direction nord ouest 6");
        System.out.println("sud est 7");
        System.out.println("sud ouest 7");
        System.out.println("choisissez une direction");
        direction = sc.nextInt();
        toString();


        switch (direction) {
            case 1:
               avance();
                break;
            case 3:
                droite(); break;
        }
    }

    public void avance(){
        x+=0;
        y+=1;
    }

    public void droite(){
        x+=1;
        y+=0;
    }
}