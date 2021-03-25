package main;


import media.Radio;
import media.Television;

public class Main {

    public static void main(String[] args) {
    
        Television rts = new Television(1, 2, false);
        rts.printAttributes();
        
        System.out.println("");
        
        Radio sport = new Radio(91.8, 600, 'A', 'F');
        sport.printAttributes();
    }
  
}
