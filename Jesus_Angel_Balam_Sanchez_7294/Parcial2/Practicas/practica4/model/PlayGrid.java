package model;

import java.awt.Color;
import java.util.LinkedList;

public class PlayGrid {

    private Grid grid;

    private boolean show;

    private Cell[][] arrGrid;

    private LinkedList<Cell> visited;

    private LinkedList<Cell> checked;

    private int battleShipsLeft;

    public static final int GRID_SIZE = 10;

    public PlayGrid(int x, int y, boolean show) {

        grid = new Grid(GRID_SIZE + 1, GRID_SIZE + 1, 40, 40);
        grid.setLocation(x, y);

        this.show = show;

    }

    public Cell[][] getArrGrid() {
        return arrGrid;
    }

    public void clearGrid() {
        battleShipsLeft = 10;

        arrGrid = new Cell[GRID_SIZE][GRID_SIZE];

        checked = new LinkedList<>();

        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                arrGrid[row][col] = new Cell(row, col);
            }
        }

        grid.setCellColor(GRID_SIZE, 0, Color.BLACK);

        for (int row = 0; row < GRID_SIZE + 1; row++) {
            grid(GRID_SIZE - row - 1, 0, ((char) (('A') + row)) + "");
        } 

        for (int col = 1; col < GRID_SIZE + 1; col++) {
            grid.setCellText(GRID_SIZE, col, col - 1 + "");
        }

    }

    private void grid(int i, int j, String string) {
    }

    /*
     * Este método obtiene las coordenadas de una determinada celda y comprueba si hay un
     * barco, si es cierto, lo destruye, cambia el estado de la cuadrícula y devuelve el valor true,
     * si no, si la celda ya está comprobada o no hay barco' devuelve false
     */
    public boolean guess(int row, int col) {

        if (checked.contains(arrGrid[row][col]))
            return false;
        checked.add(arrGrid[row][col]);

        if (arrGrid[row][col].hasBattleShip()) {

            BattleShip tmp = arrGrid[row][col].getBattleShip();
            tmp.destory();
            grid.setCellColor(GRID_SIZE - (row + 1), col + 1, Color.ORANGE);

            if (tmp.completlyDestroied()) {
                for (Cell c : tmp.getCells()) {
                    grid.setCellColor(GRID_SIZE - (c.row + 1), c.col + 1, Color.red);
                }
                battleShipsLeft -= 1;
            }
            arrGrid[row][col].removeBattleShip();
            return true;
        }

        grid.setCellColor(GRID_SIZE - (row + 1), col + 1, Color.gray);
        return false;
    }

    public boolean isBoardEmptyFromShips() {
        return battleShipsLeft <= 0;
    }

    public void generateGrid() {
        clearGrid();

        Random rnd = new Random();
        int[] sizes = { 1, 2, 3, 4 };

        for (int size : sizes) {

            for (int i = size; i > 0; i--) {

                visited = new LinkedList<>();
                int rndRow = rnd.nextInt(GRID_SIZE);
                int rndCol = rnd.nextInt(GRID_SIZE);

                boolean vertical = rnd.nextInt(2) == 1;

                lookForPlacement(rndRow, rndCol, 5 - size, vertical);

            }
        }

        grid.show();

    }

    /*
     * Un método recursivo que toma un punto de partida (row, col), el tamaño de la nave y
     * una bandera que indica si es vertical o no. su comienza a comprobar si hay
     * Si encuentra un lugar, genera una nueva nave con el tamaño dado y la coloca.
     * Si encuentra un lugar, genera una nueva nave con el tamaño dado y la coloca.
     * hasta que encuentre un lugar.
     */
    private boolean lookForPlacement(int row, int col, int size, boolean vertical) {

        visited.add(arrGrid[row][col]);

        if (isCellFree(row, col, size, vertical)) {
            putShip(row, col, size, vertical);
            return true;
        }

        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {

                if (r < 0 || r >= GRID_SIZE)
                    continue;
                if (c < 0 || c >= GRID_SIZE)
                    continue;

            
                if (!visited.contains(arrGrid[r][c])) {
                    if (lookForPlacement(r, c, size, vertical))
                        return true;

                }
            }
        }

        return false;

    }

    /*
     * Un método simple que toma las coordenadas (row,col), el tamaño del barco y el indicador vertical
     * indicador, y coloca el barco en las celdas necesarias
     */
    private void putShip(int row, int col, int size, boolean vertical) {

        BattleShip s = new BattleShip(size);

        if (vertical) {
            for (int r = row; r < row + size; r++) {

                arrGrid[r][col].setBattleShip(s);
                s.addCell(arrGrid[r][col]);

                if (show) {
                    grid.setCellColor(GRID_SIZE - (r + 1), col + 1, Color.GREEN);

                }
            }

        }
        else {
            for (int c = col; c < col + size; c++) {

                arrGrid[row][c].setBattleShip(s);
                s.addCell(arrGrid[row][c]);

                if (show) {
                    grid.setCellColor(GRID_SIZE - (row + 1), c + 1, Color.GREEN);
                }
            }
        }

    }

    /*
     * Comprobación de si un barco con cierto tamaño puede ser colocado en la fila y columna actuales
     * el método realmente comprueba si el barco y su relleno envolvente no
     * colisiona con otros. por lo tanto los bucles comienzan un índice antes y terminan
     * un índice después
     */
    private boolean isCellFree(int row, int col, int size, boolean vertical) {

        if (vertical) {
            for (int r = row - 1; r <= row + size; r++) {

                if (r < 0 || r >= GRID_SIZE)
                    return false;
                for (int c = col - 1; c <= col + 1; c++) {
                    if (c < 0 || c >= GRID_SIZE)
                        continue;
                    if (arrGrid[r][c].hasBattleShip()) {
                        return false;
                    }
                }
            }
            return true;
        }

        for (int c = col - 1; c <= col + size; c++) {

            if (c < 0 || c >= GRID_SIZE)
                return false;
            for (int r = row - 1; r <= row + 1; r++) {
                if (r < 0 || r >= GRID_SIZE)
                    continue;
                if (arrGrid[r][c].hasBattleShip())
                    return false;
            }
        }
        return true;
    }

    public LinkedList<Cell> getCellsList() {
        LinkedList<Cell> cells = new LinkedList<>();

        for (int r = 0; r < GRID_SIZE; r++) {
            for (int c = 0; c < GRID_SIZE; c++) {
                cells.add(arrGrid[r][c]);
            }
        }

        return cells;
    }

    public Grid getGrid() {
        return grid;
    }

}
