package com.company.A8_Sorting_Alg;


public class Quicksort {
    public static void main(String[] args) {
        int arr[] = new int[]{10,80,30,90,40,50,70};

        int n = arr.length;

        Lomuto_Partition(arr,0,n-1);  //l=first element in array and h= last element in array
        Hoare_partition(arr,0,n-1);

        for(int x: arr)
            System.out.print(x+" ");

    }

   protected   static int Lomuto_Partition(int arr[], int l, int h)
    {
        int pivot=arr[h];
        int i=l-1;

        for(int j=l; j<=h-1; j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;

        return i+1;
    }

    protected  static int Hoare_partition(int arr[], int l, int h)
    {
        int pivot=arr[l];
        int i=l-1,j=h+1;

        while(true)
        {
            do{
                i++;
            }
            while(arr[i]<pivot);
            do {
                j--;
            }
            while(arr[j]>pivot);
            if(i>=j)return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

}//Lomuto_Partition , Hoare_partition are functions of this code



/*
class Kth_Smallest_element{
    private static int  kthsmalleest(int[] a, int k, int n) {
        int l = 0, r = n - 1;

        while (l <= r) {
            int p = Quicksort.Lomuto_Partition(a, l, r);//calling Lomuto_Partition function
            //similar to binary search
            if (p == k - 1)
                return p;
            else if(p > k-1)
                r=p-1;
            else
                l=p+1;
        }
        return -1;

    }
    public static void main(String[] args) {
        int a[]={10,4,5,8,11,6,26};
        int k=5,
        int n=a.length;

        System.out.println( kthsmalleest(a,k,n));
    }

}

 */// find Kth_Smallest_element in an unsorted array

/*
class chocolate{
    private static int  minimumdiff(int[] a, int n, int m) {
        int l=a[0];
        if (m>n) return -1;
        Arrays.sort(a);

        int res=a[m-1]-a[0];

        for (int i=1;(i+m-1)<n;i++)

            res=Math.min(res,(a[i+m-1]-a[i]));
            return res;
        }

    public static void main(String[] args) {
        int a[]={7,3,2,4,9,12,56};
        int m=3,n=a.length;
        System.out.print(minimumdiff(a,n,m));
    }
}

 *///chocolate distribution problem

/*
class main{
    private static void modified_Hoare_partition(int[] a, int n) {
        int i=-1, j=n-1;
        while (true) {
            do {
                i++; //we increment before the check
            } while (a[i] < 0);//check if i is smaller than 0
            do {
                j--; // we decrementbefor check
            } while (a[j] >= 0);//if it is grater than 0 or not

            if (i>=j)       //if both pointer crosses each outer just stop and return
                return;

                      // (if condition) not fulfilled then  swap the numbers
                int temp=a[i];
                a[i]=temp;
                a[j]=temp;


        }
    }
    public static void main(String[] args) {
        int a[]={1,0,0,1,1,1,0};
        int n=a.length;

        Arrays.sort(a);

        for(int x:a)
            System.out.print(x+" ");

    }


}

 */ //Sort the elements by not using in-build method


