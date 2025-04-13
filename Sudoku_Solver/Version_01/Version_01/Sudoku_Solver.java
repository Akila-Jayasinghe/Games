
 package Version_01;

 /**
  *
  * @author Akila Jayasinghe
  */

 public class Sudoku_Solver {
     
    private int[][] grid;       // Store the initial grid and final grid
    private int[][][] possible; // Store the all possibility grid

    // Main method for testing purpose of the Sudoku_Solver.java class
    public static void main(String[] args) {

        int[][] test_grid = {
            {7, 9, 0,   0, 0, 0,   0, 0, 4},
            {0, 4, 2,   5, 7, 0,   0, 0, 0},
            {0, 0, 0,   0, 2, 4,   0, 6, 7},

            {2, 6, 4,   3, 8, 9,   0, 0, 0},
            {0, 0, 9,   0, 0, 0,   3, 8, 0},
            {0, 0, 8,   0, 0, 0,   0, 0, 0},

            {4, 0, 7,   8, 0, 1,   0, 0, 3},
            {0, 0, 0,   0, 5, 0,   0, 0, 8},
            {0, 8, 0,   6, 4, 0,   0, 9, 0},
        };

        Sudoku_Solver ss = new Sudoku_Solver(test_grid);
        ss.printGrid();
        
        if (ss.CheckValidInit()) {
            ss.CalculatePossible();
            ss.printPossible();
        } else {
            System.out.println("Invalid initial sudoku grid");
        }


    }
 
    // Constructor
    public Sudoku_Solver(int[][] grid) {
        this.grid = grid;
        this.possible = new int[9][9][9];
    }
    
    // calculating all possible values for each cell
    public void CalculatePossible() {
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
                    for (int k=0, l=1; (k<possible[i][j].length) && (l<=9); l++) {
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
        for (int i=(3*(row/3)); ((i<((3*(row/3))+3)) && (i<grid.length)); i++) {
            for (int j=(3*(col/3)); ((j<((3*(col/3))+3)) && (j<grid[row].length)); j++) {
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
        for (int i=(3*(row/3)); ((i<((3*(row/3))+3)) && (i<grid.length)); i++) {
            for (int j=(3*(col/3)); ((j<((3*(col/3))+3)) && (j<grid[row].length)); j++) {
                if ((grid[i][j] == value) && (i != row) && (j != col)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Check the validity of the given initial sudoku grid
    public boolean CheckValidInit() {
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

    // Print the initial sudoku grid in the terminal
    public void printGrid() {
        System.out.println("Valid Sudoku grid received");
        for (int row=0; row<9; row++) {
            for (int col=0; col<9; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Print the calculated all possible values for each cell in the terminal
    public void printPossible() {
        for (int i=0; i<possible.length; i++) {
            System.out.printf("Row no. %02d : \n", i+1);
            for (int j=0; j<possible[i].length; j++) {
                for (int k=0; k<possible[i][j].length; k++) {
                    System.out.printf("%s ", ((possible[i][j][k]==0) ? "-" : possible[i][j][k]));
                }
                System.out.println();
            }
            System.out.println("\n");
        }
    }
     
 }
 