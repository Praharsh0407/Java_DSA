package Searching_Algos;

public class Linear_Search {
    public static int linsearch(int arr[], int value){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                System.out.println("Element found at index " + i);
                return i;
            }
        }
        System.out.println("element not found");
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,10,23,123,11};
        linsearch(arr,123);
    }
}
