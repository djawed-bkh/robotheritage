package com.company;
import java.util.Scanner;
public class Robot {


        protected int nom;
        protected int direction;
        protected double x;
        protected double y;
        Scanner sc=new Scanner(System.in);

        public Robot(double x, double y) {
            this.x = 0;
            this.y = 0;
        }

        public void nord(){//1
            x=0;
            y=1;
        }
        public void sud() {//2
            x=0;
            y=-1;

        }
        public void est() {//3
            x=1;
            y=0;


        }
        public void ouest() {//4
            x=-1;
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
            toString();


            switch (direction) {
                case 1:nord();break;
                case 2:sud();break;
                case 3:est();
                case 4:ouest();
                case 6:nord();est();break;
                case 7:nord();ouest();break;
                case 8:sud();est();break;
                case 9:sud();ouest();break;
            }

        }


        public String toString() {
            return "la position du robot est("+x+","+y+")";
        }
    }

