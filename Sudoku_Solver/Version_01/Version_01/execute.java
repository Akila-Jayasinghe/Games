
package Version_01;

/**
 *
 * @author Akila Jayasinghe
 */

public class execute {
    
    public static void main(String args[]) {
        
        //new interface_01().setVisible(true);
        interface_01 ui_01 = new interface_01();
        ui_01.setVisible(true);
        Sudoku_Solver ss = new Sudoku_Solver(ui_01.getGrid(), 1, 9);
        ss.printGrid();
        //ui_01.invalidHintWarning(ss);
        
    }
    
}
