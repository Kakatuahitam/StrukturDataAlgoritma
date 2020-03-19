/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas_2e.while_;
import java.util.Scanner;
/**
 *
 * @author Yuda Kurnia NF
 */
public class do_while_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        boolean masihmau;
        int kenyang = 0;
        String mau;
        
        // do { statement body }while(booleanCondition);
        do{
            System.out.println("Masih mau makan? (Y jika mau)");
            mau = in.nextLine();
            
            masihmau = "Y".equals(mau) || "y".equals(mau);
            
            if (masihmau == true){
                kenyang++;
            }
            
            System.out.println(masihmau);
            
        }while(masihmau == true);
        
        if (kenyang == 3){
            System.out.println("duh kenyang bgt... dah makan " + kenyang + " kali nih");
        }
        else if (kenyang > 3){
            System.out.println("plis udah...!");
        }
        else{
            System.out.println("kyknya enak. tapi dah makan " + kenyang + " kali.. gmn?");
        }
    }
}
