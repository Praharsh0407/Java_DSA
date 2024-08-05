package Array;
public class SingleDimensionArray{
    int arr[] = null;
    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {
        try{
            if (arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            } else{
                System.out.println("Cell already occupied");
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array!");
        }
    }

    public void traverseArray(){
        try{
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]+ " ");
            }
        } catch (Exception e){
            System.out.println("Array no longer exists");
        }
    }

    public void searchInArray(int valueToSearch){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] ==valueToSearch){
                System.out.println("Value is found at index of "+ i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    public void deleteValue(int valueToDeleteIndex){
        try{
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("Value deleted Successsfully");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Value provided is not in the range of array");
        }
    }

    public static void main(String[] args){
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 0);
        sda.insert(1, 10);
        sda.insert(2, 20);
        
        // var firstElement = sda.arr[0];
        // System.out.println(firstElement);
        // var thirdElement = sda.arr[2];
        // System.out.println(thirdElement);

        // System.out.println("Array Traversal");
        sda.traverseArray();

        // sda.searchInArray(20);

        sda.deleteValue(0);
        System.out.println(sda.arr[0]); 
        
    }
}