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
public class foreach_7 {
    public static void main(String[] args) {
        int[] array = {1,2,9,4,5,6,4,1,9,0};
        
        for (int element : array){
            System.out.print("Element of index " + element + " is: ");
            System.out.println(array[element]);
        }
    }
}
