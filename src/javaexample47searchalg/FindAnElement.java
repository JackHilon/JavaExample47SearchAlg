
package javaexample47searchalg;


public class FindAnElement {  // #### Linear Search ####
    
    public static int Find(int[] array, int element) 
    {
        for (int pos = 0; pos < array.length; pos++) {
            if(element==array[pos])
                return pos;
        }
        return -1;
    }
}
