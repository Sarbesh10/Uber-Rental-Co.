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
public class selectionSorter {
        public static void sort(LinkedList<Integer> list)
    {
        for (int i = 0; i < list.size() -1; i++)
        {
            //3
            int minPos = minimumPosition(list, i);//finding the samller value
            arrayUtil.swap(list, minPos, i);//swapping the smallest value with the first index
        }    
    }
 
        private static int minimumPosition(LinkedList<Integer> list, int from)
   {  
      int minPos = from;
      for (int i = from + 1; i < list.size(); i++)
      {
         if (list.get(i)<list.get(minPos)) 
         { 
             minPos = i; 
             
         }
      }
      return minPos;
   }
}
