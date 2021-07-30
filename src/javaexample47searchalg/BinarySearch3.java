
package javaexample47searchalg;


public class BinarySearch3 {   // BinarySearch1 another way
    
    public static int Find(int[] array, int element) {
        
        int elementPos=-1;
        int first=0;
        int last=array.length-1;
        int middle=0;
        boolean found=false;
        
        while(first<=last && !found)
        {
            middle=(last-first+1)/2+first;
            if(element==array[middle])
            {
                elementPos=middle;
                found=true;
            }
            else if(element < array[middle])
            {
                last=middle-1; // <==== (-1) is very important
            }
            else // if(element > array[middle])
            {
                first=middle+1; // <==== (+1) is very important
            }
        }// end while
        return elementPos;
    }
}
