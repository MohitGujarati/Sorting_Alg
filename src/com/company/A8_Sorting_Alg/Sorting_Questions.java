package com.company.A8_Sorting_Alg;


/*
import java.util.Arrays;

class Point implements Comparable<Point>
{
    int x, y;
    // Costructor intialising x & y
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    // compareTo() function defining the
    // nature of sorting i.e., according to
    // x-coordinate
    public int compareTo(Point P)
    {
        // Comparing two objects by
        // Subtracting the passed object
        // from current object
        return this.x - P.x;
    }
}
// Main class
class Test
{
    public static void main(String[] args)
    {
        // Array of 3 objects
        Point arr[] = {
                new Point(10, 20),
                new Point(3, 12),
                new Point(5, 7) };

        // Sorting the object containing array
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i].x + " " + arr[i].y);
    }
}

 */// A sample Java program to implementing Comparable alongside Arrays.sort().

/*
// This class implements
// Comparator interface to compare
class MyCmp implements Comparator<Integer>
{
    // Sorts the Integers
    public int compare(Integer a, Integer b)
    {
        return a%2 - b%2;
    }
}
// Main class
class Test
{
    public static void main(String[] args)
    {
        // Integer array
        Integer[] arr = {5, 20, 10, 3, 12};

        // Sorting arrays by passing
        // arr and MyCmp object
        Arrays.sort(arr, new MyCmp());

        // Displaying the sorted array
        System.out.println(Arrays.toString(arr));
    }
}

 *///program to print the even number first in a sorted form and then print the odd number in a sorted for

//gfg merge

/*
class merge{
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 80};
        int b[] = {1, 2, 3, 8, 100};

        int n = a.length, m = b.length;

        int i = 0;
        int j = 0;

        while (i < m && j < n) {

            if (a[i] <= b[i]) {
                System.out.println(a[i]);
                i++;
            } else
                System.out.println(b[j]);
            j++;

        }
        while (i < m) {
            System.out.println(a[i]);
            i++;
        }

        while (j < n) {
            System.out.println(b[j]);
            j++;
        }

    }
}

 *///merge two sorted arrays efficient way //naive way we have seen in basic arrays

/*
class main{
    public static void main(String[] args) {
        int a[]={3,5,10,10,10,15,20};
        int b[]={5,10,10,10,20,30};

        fun(a,b);

    }

    private static void fun(int[] a, int[] b) {
        int m=a.length;
        int n=b.length;

        for (int i=0;i<m;i++){
            if (i>0 && a[i]==a[i-1])
                continue;

            for (int j=0;j<n;j++){
                if (a[i]==b[j]){
                    System.out.println(a[i]+" ");
                    break;
                }
            }
        }

    }
}

 *///intersection of two arrays

/*
class main{
    public static void main(String[] args) {
        int a[]={3,5,10,10,10,15,20};
        int b[]={5,10,10,10,20,30};

        fun(a,b);

    }

    private static void fun(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        int i=0, j = 0;

        while (i < m && j < n) {

            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (a[i] < b[j]) {
                i++;
            }
            if (a[i] > b[j]) {
                j++;
            } else System.out.println(a[i] + " ");

            i++;
            j++;
        }
    }
}


 *///intersection of two arrays efficient way


/*
class main {
    static void Merge(int a[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];


        for (int i = 0; i < n1; i++)
            left[i] = a[low + i];

        for (int j = 0; j < n2; j++)
            right[j] = mid + j + 1;


        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];

            } else {
                a[k++] = right[j++];

            }
            while(i<n1)
                a[k++]=left[i++];
            while(j<n2)
                a[k++]=right[j++];
        }

    }

    static void Mergesort(int[] a, int left, int right) {

        if (right > left) {
            int mid = left + (right - left) / 2;

            Mergesort(a, left, right);
            Mergesort(a, mid + 1, right);
            Merge(a, left, mid, right);
        }
    }


    public static void main(String[] args) {


        int a[]={12,13,15,2,3,7};
        int l=0;
        int r=a.length-1;

        Mergesort(a,l,r);
        for (int i=0;i<a.length-1;i++) {
            System.out.println(a[i] + " ");

        }
    }

}

 *///error look again



/*
class Solution
{
    public static void main (String[] args)
    {
        int a[] ={3,8,8};
        int b[] = {2,8,8,10,15};

        int m = a.length;
        int n = b.length;
        printUnion(a,b,m,n);

    }

    static void printUnion(int a[], int b[], int m, int n){

        int i=0,j=0;

        while(i<m && j<n){
            if(i>0 && a[i-1]==a[i]){
                i++
                ;continue;
            }

            if(j>0 && b[j-1]==b[j]){
            j++;
            continue;
            }

            if(a[i]<b[j])
            {
            System.out.print(a[i]+" ");
            i++;
            }
            else if(a[i]>b[j])
            {
            System.out.print(b[j]+" ");
            j++;
            }
            else{System.out.print(a[i]+" ");
            i++;
            j++;
            }
        }
        while(i<m){
            if(i==0||a[i]!=a[i-1])
            System.out.print(a[i]+" ");
            i++;
        }
        while(j<n) {
            if(j==0||b[j]!=b[j-1])
            System.out.print(b[j]+" ");
            j++;}
    }
}

 *///print unioun of two arrays in sorted form













