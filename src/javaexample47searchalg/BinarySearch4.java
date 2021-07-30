package javaexample47searchalg;

public class BinarySearch4 {

    // ************* This is my solution  (another way) ************************
    // ************* There is insertion sort in this method ********************
    // *************************************************************************
    public static int Find(int[] array, int element) {

        ArrayHelper.InsertionSort(array);

        int first = 0;
        int last = array.length - 1;
        int middle = MiddleItemIndex(first, last);

        while (first <= last) {
            
            if (first == last && element == array[first]) 
            {
                return first;
            } 
            else if (first == last && element != array[first]) 
            {
                return -1;
            } 
            else {
                if (element == array[middle]) {
                    return middle;
                } 
                else if (element < array[middle]) 
                {
                    last = middle - 1;         // <=== (-1) is very important         
                    middle = MiddleItemIndex(first, last);
                } 
                else 
                {
                    first = middle + 1;        // <=== (+1) is very important 
                    middle = MiddleItemIndex(first, last);
                }
            }
        }// end while 
        return -1;
    }

    private static int MiddleItemIndex(int firstIndex, int lastIndex)
            throws IllegalArgumentException {

        if (firstIndex > lastIndex || firstIndex < 0 || lastIndex < 0) {
            throw new IllegalArgumentException();
        }

        if (firstIndex == lastIndex) {
            return firstIndex;
        }

        int len = lastIndex - firstIndex + 1;
        int res;

        if (len % 2 == 0) {
            res = ((len / 2) - 1) + firstIndex;
        } else {
            res = ((len / 2)) + firstIndex;
        }
        return res;
    }
}
