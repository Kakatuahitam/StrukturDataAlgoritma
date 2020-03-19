/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas_2e.while_;

/**
 *
 * @author Yuda Kurnia NF
 */
public class while_2 {
    public static void main(String[] args) {
        int kucing = 5;
        
        // while (booleanCondition) {statement body}
        while (kucing >=0){
            System.out.println("Kucing saya ada " + kucing);
            kucing --;
        }
        System.out.println("Kucing saya hilang semua :(");
    }
}
