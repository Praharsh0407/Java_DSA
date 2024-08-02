package Searching_Algos;

public class Binary_Search {
    public static int binsearch(int arr[], int value){
        int start = 0;
        int end = arr.length - 1;
        int middle = (start+end)/2;
        while(arr[middle] != value && start <end){
            if (value < arr[middle]){
                end = middle-1;
            }
            else{
                start = middle+1;
            }
            middle = (start+end)/2;
        } 
        // System.out.println(middle);
        if (arr[middle] == value){
            System.out.println("Element found at index: " + middle);
            return middle;
        }else{
            System.out.println("Elemnent not found");
            return -1;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        binsearch(arr,11);
    }
}
