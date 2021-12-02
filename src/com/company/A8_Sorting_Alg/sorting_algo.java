package com.company.A8_Sorting_Alg;


/*
public class SortExample
{
    public static void main(String[] args)
    {
        int[] arr = {5, 30, 20, 10, 8};

        // Sort subarray from index 1 to 3, i.e.,
        // only sort subarray {30, 20, 10} and
        // keep other elements as it is.
        Arrays.sort(arr, 1, 4);

        System.out.println(Arrays.toString(arr));
    }
}

 */// custom sort

/*
 class Bubble_Sort {
    public static void main(String[] args) {

        int[] a={1,6,12,45,664,5,424,7,656,345};
        int temp;

        for (int i=0;i<a.length;i++)
        {

        // all number are flagged as zero

            int flag=0;
            for (int j=0;j<a.length-1-i;j++){

                //swapping if the number is greater than the next number
                if (a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                    // marking flag as one as swapped happened

                    flag=1;
                }
            }
            //if the swap does not happen we break loop

            if (flag==0){
                break;
            }
        }
        //printing the sorted array
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

 *//// Bubble Sort O(n2)

/*
class Selection_sort{
    public static void main(String[] args) {

        int[] a={1,6,12,45,664,5,424,7,656,345};

        int temp;
        int min;

        for (int i=0;i<a.length-1;i++){
           min=i;

            for (int j=i+1;j<a.length;j++){

                if (a[j]<a[min]){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

 */////Selection_sort

/*
class Insertion_Sort{

    //used only for short sized array
    public static void main(String[] args) {
        int[] a={5,0,1,6,12,45,664,424,7,656,345};

        int temp,j;
        for (int i=1;i<a.length;i++){
            temp=a[i];
            j=i;
            while (j>0 && a[j-1] > temp){
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+"  ");
        }
    }
}
 */ ////Insertion_Sort

/*
    //here we use interval to sort thr array its better than insertion sort
    // Shell sort partially sorts the arrays by sorting elements that are a
    //certain numbers of spaces apart called the Interval
        class ShellSort {

        // function to sort arr using shellSort
        int sort(int arr[]) {
            int n = arr.length;
            for (int gap = n / 2; gap > 0; gap /= 2) {
                for (int i = gap; i < n; i++) {
                    int temp = arr[i];
                    int j;
                    for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                        arr[j] = arr[j - gap];
                    arr[j] = temp;
                }
            }
            return 0;
        }

        // Driver method
        public static void main(String args[]) {
            int arr[] = {12, 34, 54, 2, 3,0,92,52};
            int n= args.length;
            System.out.println("Array before sorting");
            printArray(arr);

            ShellSort ob = new ShellSort();
            ob.sort(arr);

            System.out.println("Array after sorting");
            printArray(arr);
        }

        // An utility function to print array of size n
        static void printArray(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }//this will print array

    }

 */// Shell short

/*
//read  this terms first- tree, binary tree , heap
class heap_Sort{
    // 2*i+1-->child index(left)
    // 2*i+2-->child index(right)
    // i-1/2  index value parent node representation
    void sort(int[] a){
        int length=a.length;

        for (int i=length/2-1;i>=0;i--){
            heapify(a,length,i);
        }
        // swap the elements are heapify it again
        for (int i=length-1;i>=0;i--){
            int temp=a[0];
            a[0]=a[i];
            a[i]=temp;

            heapify(a, i ,0);

        }
    }

   void  heapify(int[] a,int n,int i){
        int largest=i;        //parent index
        int left=2*i+1;      // left child
        int right=2*i+2;     //right child

       if (left<n  && a[left]>a[largest]){
           largest=left;

       }if (right<n && a[right]>a[largest]){
           largest=right;
       }
       if (largest!=i){
           int temp=a[i];
           a[i]=a[largest];
           a[largest]=temp;

           heapify(a,n,largest);
       }

   }

   // printing array
   void printArray(int []a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

   }

   //driver code
    public static void main(String[] args) {
        heap_Sort hs =new heap_Sort();
        int[] a={22,13,17,11,10,14,12};
        hs.sort(a);
        hs.printArray(a);

    }

}

 *///Heap Sort

// TODO bucket and Radix sort which will be covered after we do "List"

/*
class Merge_sort {
    int[] array;
    int[] tempMergeArr;
    int length;


    private void sort(int[] a) {
        this.array = a;
        this.length = a.length;
        this.tempMergeArr = new int[length];
        divideArray(0, length - 1);
    }

    public void divideArray(int lowIndex, int higherIndex) {
        if (lowIndex < higherIndex) {
            int middle = lowIndex + (higherIndex - lowIndex) / 2;
            //it will sort the left side of the array

            divideArray(lowIndex, middle);

            //it will sort the right side of the array
            divideArray(middle + 1, higherIndex);

            mergeArray(lowIndex, middle, higherIndex);

        }
    }

    public void mergeArray(int lowerindex, int middle, int higherindex) {
        for (int i = lowerindex; i <= higherindex; i++) {
            tempMergeArr[i] = array[i];
        }
        int i = lowerindex;
        int j = middle + 1;
        int k = lowerindex;

        while (i <= middle && j <= higherindex) {
            if (tempMergeArr[i] <= tempMergeArr[j]) {
                array[k] = tempMergeArr[i];
                i++;
            } else {
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;

        }
        while (i <= middle) {
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }

    }

    public static void main(String[] args) {
        int[] a = {1, 6, 12, 45, 664, 5, 424, 7, 656, 345, 11};
        Merge_sort ms = new Merge_sort();
        ms.sort(a);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}

 */// Merge_Sort (need to know Recursion)   MIMP   for interview use of  knowledge of divide and concur method

/*
class QuickSort
{
    * This function takes last element as pivot,
    places the pivot element at its correct
    position in sorted array, and places all
    smaller (smaller than pivot) to left of
    pivot and all greater elements to right
    of pivot *


    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    * The main function that implements QuickSort()
    arr[] --> Array to be sorted,
    low --> Starting index,
    high --> Ending index *
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
			* pi is partitioning index, arr[pi] is
			now at right place *
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    //A utility function to print array of size n
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array");
        printArray(arr);
    }
}
*/ //Quick Sort

/*
//All searching algorithm are imp in interview because they are frequently used
// Merge sort is more important

 */

/*
class main{
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        for (int i=0;i<n;i++)
        {
            int min =i;
            for (int j=i+1;j<n;j++){

                if (i-1>j){

                    int temp=min;
                    min=j;
                    j=temp;
                    min=j;
                }

            }
        }

        for (int k=0;k<n;k++)
        System.out.println(arr[k]);

    }
}


 */