package Backtracking;

public class N_Queens {
    private int queens[];  //private int array to store position of queens
    private int N; //private integer N to show size of chessboard

    public N_Queens(int N) { //constructor
        queens = new int[N]; //initialise queens array with size N
        this.N = N; //sets the class instance variable N with the given input N to represent the board's size
    }

    private boolean placeQueen(int col){
        if (col == N){
            return true; //all queens placed successfully
        }

        for(int row = 0;row <N;row++){
            if(canPlace(row,col)){
                queens[col] = row; //place queen
                if (placeQueen(col+1)){
                    return true; //found a valid placement
                }
                //if no valid placement found, unplace current queen and backtrack
            }
        }
        return false; //no valid placement found in current column
    }

    private boolean canPlace(int row, int col){
        for(int i = 0;i<col;i++){
            if(queens[i] == row|| Math.abs(queens[i]-row) == Math.abs(i-col)){ //checks if there's any queen in the same row or diagonals that threatens the current cell.
                return false; //Queen cant be placed here
            }
        }
        return true;
    }

    public void placeNQueens(){ //initiate placing of queens on board
        if (placeQueen(0)){
            printQueens();
        }
        else{
            System.out.println("No Solution found");
        }
    }

    private void printQueens(){
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                if(queens[i] ==j){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        N_Queens nQueens = new N_Queens(10);
        nQueens.placeNQueens();
    }
}
