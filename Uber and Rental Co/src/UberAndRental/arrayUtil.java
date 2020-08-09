/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UberAndRental;

import java.util.LinkedList;

/**
 *
 * @author karki
 */
public class arrayUtil {
       public static void swap(LinkedList<Integer> list, int minPos, int i)
   {
        int temp = list.get(minPos);
        list.set(minPos, list.get(i)); 
        list.set(i, temp);
   }

}
