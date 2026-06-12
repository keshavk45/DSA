package Sorting;

public class MergeSort{
    public static void main(String[] args){
        int[] arr = {5 , 1, 3, 4 ,6 , 7 ,2 , 8};
        mergesort(arr);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
        }
    }

    public static void mergesort(int[] arr){
        int n = arr.length;
        if(n==1){
            return;
        }
        int[] a  = new int[n/2];
        int[] b = new int[n-n/2];
        int idx = 0;
        for(int i = 0 ; i<a.length ; i++){
            a[i] = arr[idx];
            idx++;
        }
        for(int i = 0 ; i<b.length ; i++){
            b[i] = arr[idx];
            idx++;
        }
        mergesort(a);
        mergesort(b);
        merge(a , b , arr);
    }

    public static void merge(int[] a , int[] b , int[] ar){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                ar[k] = a[i];
                i++;
                k++;
            }else{
                ar[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            ar[k++] = a[i++];
        }
        while(j<b.length){
            ar[k++] = b[j++];
        }

    }
}