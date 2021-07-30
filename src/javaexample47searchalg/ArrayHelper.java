
package javaexample47searchalg;

import java.util.Arrays;


public class ArrayHelper {
    
    
    public static void InsertionSort(int[] array) throws IllegalArgumentException
    {
        if(array.length==0)
            throw new IllegalArgumentException();
        
        
        int extraPlace=0;
        int j=0;
        for (int i = 1; i < array.length; i++) {
            
            extraPlace=array[i];
            j=i-1;
            while(j>=0 && extraPlace<array[j])
            {
                array[j+1]=array[j];
                j--;
            }// end while
            array[j+1]=extraPlace;
        }// end for
    }// end InsertionSort()
    
    public static void PrintArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    
}


