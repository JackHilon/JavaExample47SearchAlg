
package javaexample47searchalg;

import java.util.Arrays;


public class JavaExample47SearchAlg {

    
    public static void main(String[] args) {
        
        int[] a=new int[] {1,2,9,5,4,8,6,3,7,0};
        int[] b=new int[] {1,2,9,5,4,8,6,3,7,0};
        int[] c=new int[] {1,2,9,5,4,8,6,3,7,0};
        int[] d=new int[] {1,2,9,5,4,8,6,3,7,0};
        int[] f=new int[] {1,2,9,5,4,8,6,3,7,0};
        
        int e1=9;
        int e2=100;
        int e3=4;
        int e4=5;
        int e5=6;
        int e6=100;
        
        LinearSearch(a, e1, e2);
        
        MySpace();
        
        BinarySearch1(b, e3, e4, e5, e6);
        
        MySpace();
        
        BinarySearch2(c, e3, e4,e5,e6);
        
        MySpace();
        
        BinarySearch3(f, e3,e4,e5,e6);
        
        MySpace();
        
        BinarySearch4(d, e3,e4,e5,e6);
        
    }
    
    private static void BinarySearch4(int[] nonSortedArray, int... e)
    {
        System.out.print("Your array is: "); PrintArray(nonSortedArray);
        
        for (int i = 0; i < e.length; i++) 
        {
            System.out.println("element ("+e[i]+") in the array has index (my solution2): "+BinarySearch4.Find(nonSortedArray,e[i]));
        }
    }
    
    //--------------------------------------------------------------------------
    
    private static void BinarySearch3(int[] nonSortedArray, int... e)
    {
        ArrayHelper.InsertionSort(nonSortedArray);
        
        System.out.print("Your array is: "); PrintArray(nonSortedArray);
        
        for (int i = 0; i < e.length; i++) 
        {
            System.out.println("element ("+e[i]+") in the array has index: "+BinarySearch3.Find(nonSortedArray,e[i]));
        }
    }
    
    //--------------------------------------------------------------------------
    
    private static void BinarySearch2(int[] nonSortedArray, int e1, int e2, int e3,int e4)
    {
        System.out.print("Your array is: "); PrintArray(nonSortedArray);
        System.out.println("element ("+e1+") in the array has index (my solution): "+BinarySearch2.Find(nonSortedArray,e1));
        System.out.println("element ("+e2+") in the array has index (my solution): "+BinarySearch2.Find(nonSortedArray,e2));
        System.out.println("element ("+e3+") in the array has index (my solution): "+BinarySearch2.Find(nonSortedArray,e3));
        System.out.println("element ("+e4+") in the array has index (my solution): "+BinarySearch2.Find(nonSortedArray,e4));
        
    }
    
    //--------------------------------------------------------------------------
    
    private static void BinarySearch1(int[] nonSortedArray, int e1, int e2, int e3, int e4 )
    {
        ArrayHelper.InsertionSort(nonSortedArray);
        
        System.out.print("Your array is: "); PrintArray(nonSortedArray);
        System.out.println("element ("+e1+") in the array has index: "+BinarySearch1.Find(nonSortedArray,e1));
        System.out.println("element ("+e2+") in the array has index: "+BinarySearch1.Find(nonSortedArray,e2));
        System.out.println("element ("+e3+") in the array has index: "+BinarySearch1.Find(nonSortedArray,e3));
        System.out.println("element ("+e4+") in the array has index: "+BinarySearch1.Find(nonSortedArray,e4));
    }
    
    private static void LinearSearch(int[] array, int e1, int e2)
    {
        System.out.print("Your array is: "); PrintArray(array);
        System.out.println("element ("+e1+") in the array has index: "+FindAnElement.Find(array,e1));
        System.out.println("element ("+e1+") in the array has index: "+FindAnElement2.Find(array,e1));
        System.out.println("---");
        System.out.println("element ("+e2+") in the array has index: "+FindAnElement2.Find(array,e2));
        System.out.println("element ("+e2+") in the array has index: "+FindAnElement.Find(array,e2));
        System.out.println("---");
        System.out.print("Your array is: "); PrintArray(array);
        ArrayHelper.InsertionSort(array);
        System.out.print("Your sorted-array is: "); PrintArray(array);
        System.out.println("---");
    }
    
    private static void PrintArray(int[] array)
    {
        System.out.println(Arrays.toString(array));
    }
    
    private static void MySpace()
    {
        System.out.println();
        System.out.println();
    }
}
