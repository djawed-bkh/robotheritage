package com.company;

public class RobotNG extends Robot {
    int n;
    public RobotNG(double x, double y) {
        super(x, y);
    }


    public void nord(int n){//1
        x=0;
        y=n;
    }
    public void sud(int n) {//2
        x=0;
        y=-n;

    }
    public void est(int n) {//3
        x=n;
        y=0;


    }
    public void ouest(int n) {//4
        x=-n;
        y=0;


    }
    public void avancer(){
        System.out.println(" direction nord 1");
        System.out.println(" direction sud 2");
        System.out.println(" direction est 3");
        System.out.println(" direction ouest 4");
        System.out.println(" direction nord-est 5 ");
        System.out.println("direction nord ouest 6");
        System.out.println("sud est 7");
        System.out.println("sud ouest 7");
        System.out.println("choisissez une direction");
        direction=sc.nextInt();
        System.out.println("de combien de pas vas il avancer ?" );
        direction=sc.nextInt();
        toString();


        switch (direction) {
            case 1:nord(n);break;
            case 2:sud(n);break;
            case 3:est(n);
            case 4:ouest(n);
            case 6:nord(n);est(n);break;
            case 7:nord(n);ouest(n);break;
            case 8:sud(n);est(n);break;
            case 9:sud(n);ouest(n);break;
        }

    }
}
