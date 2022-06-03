package model;

public class Cell {

    // con esto indicamos las coordenadas
    public int row, col; 
    private BattleShip battleShip;

    // inicializa las cordenasdas en el constructor
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    // devuelve si hay un battleship en la celda
    public boolean hasBattleShip() {
        return battleShip != null;
    }

    // remueve el battleship de la celda
    public void removeBattleShip() {
        battleShip = null;
    }

    public void setBattleShip(BattleShip b) {
        battleShip = b;
    }
    public BattleShip getBattleShip() {
        return battleShip;
    }

}