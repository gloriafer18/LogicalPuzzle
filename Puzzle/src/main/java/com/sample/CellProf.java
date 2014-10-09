package com.sample;

public class CellProf extends CellFile{
    /**
     * Constructor.
     * 
     * @param number the column number.
     */
    public CellProf(int number) {
        super( number );
    }
    
    /*
     * (non-Javadoc)
     * @see sudoku.CellFile#toString()
     */
    @Override
    public String toString(){
        return "Profundidad " + getNumber() + ": " + super.toString();
    }

}
