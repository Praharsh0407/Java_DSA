package Array;
public class TwoDimensionArray {
    int arr[][] = null;
    public TwoDimensionArray(int numberOfRows, int numberOfColumns){
        this.arr = new int[numberOfRows][numberOfColumns];
        for(int row = 0 ; row < numberOfRows ; row++){
            for(int col = 0 ; col < arr[0].length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValueInTheArray(int row, int col, int value){
        try{
            if (arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("Value successfully inserted.");
            }

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index of the 2D Array");
        }
    }

    public void traverseArray(){
        try{
            for (int i = 0;i<arr.length;i++){
                for (int j = 0;j<arr[i].length;j++){
                    System.out.println(arr[i][j] + " ");
                }
                System.out.println();
            }
        }catch (Exception e){
            System.out.println("Array no longer exists");
        }
    }

    public void accessCell(int row, int col){
        System.out.println("Accessing row "+ row + ", col "+ col);
        try{
            System.out.println("Cell value is: "+ arr[row][col]);

        }catch (Exception e){
            System.out.println("Invalid Index for 2D Array");
        }
    }

    public void searchingValue(int value){
        for(int i = 0; i <arr.length;i++){
            for(int j = 0; j< arr[i].length;j++){
                if (arr[i][j] == value){
                    System.out.println("Row: "+i+", Col: "+j);
                    return;
                }
            }
            System.out.println("Value not found");
        }
    }

    public void deleteValue(int row, int col){
        try{
            arr[row][col] =Integer.MIN_VALUE;
            System.out.println("Value deleted Successfully");
        } catch (Exception e){
            System.out.println("Value not in range");
        }
    }

    public static void main(String[] args){
        TwoDimensionArray sda = new TwoDimensionArray(3,3);
        sda.insertValueInTheArray(0,0,10);
        sda.insertValueInTheArray(0,1,20);
        sda.insertValueInTheArray(0,2,30);
        // System.out.println(Arrays.deepToString(sda.arr));
        sda.traverseArray();
        // sda.accessCell(0, 1);
        // sda.searchingValue(30);
        sda.deleteValue(0, 0);
        sda.traverseArray();

    }
}
