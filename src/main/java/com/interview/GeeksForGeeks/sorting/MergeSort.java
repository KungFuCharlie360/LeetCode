package com.interview.GeeksForGeeks.sorting;

public class MergeSort {
    public void merge(int[] arr,int l, int m, int r) {
        int l1 = m-l+1;
        int l2 = r-m;
        int arr1[] = new int[l1];
        int arr2[] = new int[l2];
        int k = l;
        int i = 0;
        int j = 0;
        for(i = 0; i<l1 && k<(m+1) ;i++) {
            arr1[i] = arr[k];
            k++;
        }
        k = m+1;
        for(i = 0; i<l2 && k<=r ; i++ ) {
            arr2[i] = arr[k];
            k++;
        }

        k=l;
        i=0;
        j=0;
        while(i<l1 && j<l2) {
            if(arr1[i]<arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<l1) {
            arr[k]=arr1[i];
            k++;
            i++;
        }
        while(j<l2) {
            arr[k]=arr2[j];
            k++;
            j++;
        }

    }

    public void mergeSort(int[] nums, int l, int r) {
        if(l<r) {
            int m = l + (r-l)/2;
            mergeSort(nums,l,m);
            mergeSort(nums,m+1,r);
            merge(nums,l,m,r);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}