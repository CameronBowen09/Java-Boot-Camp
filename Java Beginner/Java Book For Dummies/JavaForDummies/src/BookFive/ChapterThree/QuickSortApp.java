/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFive.ChapterThree;

/**
 *
 * @author User
 */
public class QuickSortApp {

    public static void main(String[] args) {
        int LEN = 100;
        int[] unsorted = new int[LEN];
        for (int i = 0; i < LEN; i++) //→7
        {
            unsorted[i]
                    = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Unsorted array:");
        printArray(unsorted); //→10
        int[] sorted = sort(unsorted); //→11
        System.out.println("\n\nSorted array:");
        printArray(sorted); //→13
    }

    private static void printArray(int[] array) //→16
    {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                System.out.print(" ");
            }
            System.out.print(array[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }
    private static int[] a; //→29

    public static int[] sort(int[] array) //→31
    {
        a = array;
        sort(0, a.length - 1);
        return a;
    }

    public static void sort(int low, int high) //→38
    {
        if (low >= high) {
            return;
        }
        int p = partition(low, high);
        sort(low, p);
        sort(p + 1, high);
    }

    public static int partition(int low, int high) //→47
    {
        int pivot = a[low];
        int i = low - 1;
        int j = high + 1;
        while (i < j) {
            for (i++; a[i] < pivot; i++);
            for (j--; a[j] > pivot; j--);
            if (i < j) {
                swap(i, j);
            }
        }
        return j;
    }

    public static void swap(int i, int j) //→64
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
/*
→7 This for loop assigns 100 random values to the array.
→10 The printArray method is called to print the unsorted array.
→11 The sort method is called to sort the array.
→13 The printArray method is called again to print the sorted array.
→16 The printArray method uses a for loop to print array elements. Each
element is separated by two spaces. An additional space, however, is
printed before each element if the element’s value is less than 10. That
way, the values line up in columns. Also, the remainder operator (%) is
used to call the println method every 20 elements. Thus this method
prints 5 lines with 20 values on each line. (The last few values in the array
won’t line up exactly if they happen to be 100, but that’s okay.)
→29 A static variable named a is used to hold the array while it is being sorted
→31 The sort method has two versions. The first accepts an int array as a
parameter and returns an int array with the sorted values. This method
sets the static a variable to the array passed via the parameters, calls the
second version of the sort method to sort the entire array, and then
returns the sorted array.
→38 This line is the second sort method. It sorts the partition indicated by the
parameters. (The operation of this method is explained in detail in the
section “Using the sort method,” earlier in this chapter.)
→47 The partition method is explained in detail in the preceding section.
→64 The swap method simply exchanges the two indicated values.
Remember the cool XOR technique for exchanging two integer values
without the need for a temporary variable? You can improve the performance
of your sort ever so slightly by replacing the swap method with
this code:
public static void swap(int i, int j)
{
a[i] ^= a[j];
a[j] ^= a[i];
a[i] ^= a[j];
}
*/
