
package Version_01;
 

 /**
  *
  * @author Akila Jayasinghe
  */

 public class Solver {



    

    private int[][] grid;       // Store the initial grid and final grid
    private int[][][] possible; // Store the all possibility grid
    private final int min, max, blockLen;




 
    // Constructor
    public Solver(int[][] grid, int min, int max) {
        this.grid = grid;
        this.possible = new int[max][max][max];
        this.min = min;
        this.max = max;
        blockLen = (int)(Math.sqrt(max));
    }





    // function for the use
    public boolean solveSudoku() {

        if (CheckValidInit()) {

            CalculatePossible();

            int iter = 0;

            while ((!isSolved()) && (iter<=100)) {
                iter++;
                FirstCheck();
                SecondCheck();
                ThirdCheck();
                FourthCheck();
            }   

            return (iter>100) ? false : true;
        } else {
            return false;
        }
    }





    // Check the validity of the given initial sudoku grid
    private boolean CheckValidInit() {
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] != 0) {
                    if (isInRow(i, j) || isInCol(i, j) || isInBlock(i, j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    




    // calculating all possible values for each cell
    private void CalculatePossible() {
        // Assign 0 as a initial value of possible array
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                FillArray(possible[i][j], 0);
            }
        }

        // Calculate All Pssibilities
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    for (int k=0, l=min; (k<possible[i][j].length) && (l<=max); l++) {
                        if (isPossibleInRow(i, j, l) && isPossibleInCol(i, j, l) && isPossibleInBlock(i, j, l)) {
                            possible[i][j][k++] = l;
                        }
                    }
                }
            }
        }
    }





    // Fill any array with given integer as a initialization
    private void FillArray(int[] array, int fill) {
        for (int i=0; i<array.length; i++) {
            array[i] = 0;
        }
    }





    // Check whether the given cell is repeated within that row
    private boolean isInRow(int row, int col) {
        for (int i=0; i<grid[row].length; i++) {
            if ((grid[row][i] == grid[row][col]) && (i != col)) {
                return true;
            }
        }
        return false;
    }





    // Check whether the given cell is repeated within that column
    private boolean isInCol(int row, int col) {
        for (int i=0; i<grid.length; i++) {
            if ((grid[i][col] == grid[row][col]) && (i != row)) {
                return true;
            }
        }
        return false;
    }





    // Check whether the given cell is repeated within that 3x3 block
    private boolean isInBlock(int row, int col) {
        for (int i=(blockLen*(row/blockLen)); ((i<((blockLen*(row/blockLen))+blockLen)) && (i<grid.length)); i++) {
            for (int j=(blockLen*(col/blockLen)); ((j<((blockLen*(col/blockLen))+blockLen)) && (j<grid[row].length)); j++) {
                if ((grid[i][j] == grid[row][col]) && (i != row) && (j != col)) {
                    return true;
                }
            }
        }
        return false;
    }





    // Check whether the given value is repeated within that row
    private boolean isPossibleInRow(int row, int col, int value) {
        for (int i=0; i<grid[row].length; i++) {
            if ((grid[row][i] == value) && (i != col)) {
                return false;
            }
        }
        return true;
    }





    // Check whether the given value is repeated within that column
    private boolean isPossibleInCol(int row, int col, int value) {
        for (int i=0; i<grid.length; i++) {
            if ((grid[i][col] == value) && (i != row)) {
                return false;
            }
        }
        return true;
    }





    // Check whether the given value is repeated within that 3x3 block
    private boolean isPossibleInBlock(int row, int col, int value) {
        for (int i=(blockLen*(row/blockLen)); ((i<((blockLen*(row/blockLen))+blockLen)) && (i<grid.length)); i++) {
            for (int j=(blockLen*(col/blockLen)); ((j<((blockLen*(col/blockLen))+blockLen)) && (j<grid[row].length)); j++) {
                if ((grid[i][j] == value) && (i != row) && (j != col)) {
                    return false;
                }
            }
        }
        return true;
    }





    // Counting possible values of cell
    private int CountPossible(int[] array) {
        int result = 0;
        for (int a : array)
            result += (a != 0) ? 1 : 0;
        return result;
    }





    // Check and update there is any cell with only one possible value
    private void FirstCheck() {
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if ((CountPossible(possible[i][j]) == 1) && (grid[i][j] == 0)){
                    grid[i][j] = possible[i][j][0];
                    ClearPossible(i, j, possible[i][j][0]);
                }
            }
        }
    }





    // check the unique possible values within the row
    private void SecondCheck() {
        for (int i=0; i<possible.length; i++) {
            for (int search=min; search<=max; search++) {
                int count = 0;
                int cell = -1;
                for (int j=0; j<possible[i].length; j++) {
                    if (isExistIn(possible[i][j], search)) {
                        count++;
                        cell = j;
                    }
                }
                if ((count == 1) && (cell != -1)) {
                    grid[i][cell] = search;
                    ClearPossible(i, cell, search);
                    FillArray(possible[i][cell], 0);
                }
            }
        }
    }





    // check the unique possible values within the column
    private void ThirdCheck() {
        for (int i=0; i<possible.length; i++) {
            for (int search=min; search<=max; search++) {
                int count = 0;
                int cell = -1;
                for (int j=0; j<possible.length; j++) {
                    if (isExistIn(possible[j][i], search)) {
                        count++;
                        cell = j;
                    }
                }
                if ((count == 1) && (cell != -1)) {
                    grid[cell][i] = search;
                    ClearPossible(cell, i, search);
                    FillArray(possible[cell][i], 0);
                }
            }
        }
    }





    // check the unique possible values within the block
    private void FourthCheck() {

        for (int i=0; i<blockLen; i++) {
            for (int j=0; j<blockLen; j++) {
                for (int search=min; search<=max; search++) {
                    int count = 0;
                    int cell_row = -1;
                    int cell_col = -1; 
                    for (int k=(i*blockLen); (k<((i*blockLen)+3) && (k<possible.length)); k++) {
                        for (int l=(j*blockLen); (l<((j*blockLen)+3) && (l<possible[i].length)); l++) {
                            if (isExistIn(possible[k][l], search)) {
                                count++;
                                cell_row = k;
                                cell_col = l;
                            }
                        }
                    }
                    if ((count == 1) && (cell_row != -1) && (cell_col != -1)) {
                        grid[cell_row][cell_col] = search;
                        ClearPossible(cell_row, cell_col, search);
                        FillArray(possible[cell_row][cell_col], 0);
                    }
                }

            }
        }
    }





    // Chech the sudoku is solved
    private boolean isSolved() {
        for (int i=0; i<possible.length; i++) {
            for (int j=0; j<possible[i].length; j++) {
                if (grid[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }





    // Check whether the the given value in the given array
    private boolean isExistIn(int[] array, int value) {
        for (int a : array) {
            if (a == value)
                return true;
        }
        return false;
    }





    // Clear possible value from every cell that conflict with given cell
    private void ClearPossible(int row, int col, int value) {

        // Remove from the row
        for (int i=0; i<possible[row].length; i++) {
            RemoveElement(possible[row][i], value);
        }

        // Remove from the column
        for (int j=0; j<possible.length; j++) {
            RemoveElement(possible[j][col], value);
        }

        // Remove from the block
        for (int k=(3*(row/3)); ((k<((3*(row/3))+3)) && (k<grid.length)); k++) {
            for (int l=(3*(col/3)); ((l<((3*(col/3))+3)) && (l<grid[row].length)); l++) {
                if ((k != row) && (l != col)) {
                    RemoveElement(possible[k][l], value);
                } 
            }
        }
    }





    // Remove given value from givrn array
    private void RemoveElement(int[] array, int value) {
        for (int i=0; i<array.length; ) {
            if (array[i] == value) {
                int j=i;
                for ( ; ((array[j] != 0) && (j<(array.length - 1))); j++)
                    array[j] = array[j+1];
                if ((j == (array.length-1)) && (j != 0))
                    array[j] = 0;
            } else {
                i++;
            }
        }
    }





     
 }
 