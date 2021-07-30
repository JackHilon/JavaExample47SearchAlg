
package javaexample47searchalg;


public class BinarySearch1 {
    
    public static int Find(int[] array, int element) {
        
        int elementPos=-1;
        int first=0;
        int last=array.length-1;
        int middle=0;
        boolean found=false;
        
        while(first<=last && !found)
        {
            middle=(last+first)/2;
            if(element==array[middle])
            {
                elementPos=middle;
                found=true;
            }
            else if(element < array[middle])
            {
                last=middle-1;
            }
            else // if(element > array[middle])
            {
                first=middle+1;
            }
        }// end while
        return elementPos;
    }
}
