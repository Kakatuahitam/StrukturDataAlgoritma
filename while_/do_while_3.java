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
public class do_while_3 {
    public static void main(String[] args) {
        System.out.println("Saya punya 3 ayam");
        System.out.println("Saat ayam sudah sampai 20 lebih, saya akan jual");
        int ayam = 2;
        
        //do { statement body }while(booleanCondition);
        
        do{
            System.out.println("ayam menetas 3");
            ayam += 3;
            System.out.println("sekarang ayam saya ada " + ayam);
        }while(ayam <20);
        
        ayam -= 18;
        System.out.println("sekarang saya punya " + ayam + " ayam lagi");
    }
}
