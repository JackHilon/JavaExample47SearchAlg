
package javaexample47searchalg;


public class FindAnElement2 {  // #### Linear Search ####
    
    public static int Find(int[] array, int element) 
    {
        int pos=0;
        boolean found=false;
        int elementPos=-1;
        
        while(pos<array.length && !found)
        {
            if(element==array[pos])
            {
                elementPos=pos;
                found=true;
                // continue; // <-- I think it is not necessary
            }// end if
            
            pos++;
            
        } // end while
        return elementPos;
    }
}
    

