package javaexample47searchalg;

public class BinarySearch2 {

    // ************* This is my solution ***************************************
    // ************* There is insertion sort in this method ********************
    // *************************************************************************
    public static int Find(int[] array, int element) {

        ArrayHelper.InsertionSort(array);

        int first = 0;
        int last = array.length - 1;
        int middle = MiddleItemIndex(first, last);

        while (first <=last) {
            if (first == last) {
                if(element==array[first])
                    return first;
                else
                    return -1;
            } 
            else //if(first < last) 
            {
                if (element < array[middle]) {
                    last = middle;
                    middle = MiddleItemIndex(first, last);
                } else if (element > array[middle]) {
                    first = middle;
                    middle = MiddleItemIndex(first, last);
                } else {
                    return middle;
                }
            }
            
        }// end while

        return -1;
        /*
        if (element == array[first]) {
            return first;
        } else {
            return -1;
        }*/
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
            res = ((len / 2)) + firstIndex;
        } else {
            res = ((len / 2)) + firstIndex;
        }
        return res;
    }
}
