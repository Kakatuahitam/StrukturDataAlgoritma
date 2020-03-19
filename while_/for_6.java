/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas_2e.while_;
import java.util.Random;
/**
 *
 * @author Yuda Kurnia NF
 */
public class for_6 {
    public static void main(String[] args) {
        Random r = new Random();
        
        float health = 100;
        float damage = 0;
        int factor = 0;
        int counter = 0;
        
        System.out.println("Current Health: " + health);
        System.out.println("Damage: 1");
        System.out.println("WARNING! ENTERING RADIOACTIVE ZONE");
        // for(initialization; booleanCondition; decrement){}
        for (health = 99 ; health > 0; health--){
            counter++;
            System.out.println("\nCurrent Health: " + health);
            System.out.println("!Toxic Area!");
            System.out.println("Get OUT from here!");
            
            factor = r.nextInt(5);
            damage = r.nextFloat()*factor;
            health -= damage;
            System.out.println("Damage: " + (damage + 1));
        }
        
        System.out.println("\nWarning occurence: " + counter);
        System.out.println("GAME OVER");
        System.out.println("YOU LOSE YOUR HEALTH");
    }
}
