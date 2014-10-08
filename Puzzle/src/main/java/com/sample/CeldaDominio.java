package com.sample;

public class CeldaDominio extends CellGroup {

	
	   /**
     * Constructor.
     * @param cellRow0 the 1st row passing through this block.
     * @param cellRow1 the 2nd row passing through this block.
     * @param cellRow2 the 3rd row passing through this block.
     * @param cellCol0 the 1st column passing through this block.
     * @param cellCol1 the 2nd column passing through this block.
     * @param cellCol2 the 3rd column passing through this block.
     */
    public CeldaDominio(CellRow cellRow0, CellRow cellRow1, CellRow cellRow2,
                   CellCol cellCol0, CellCol cellCol1, CellCol cellCol2) {
        super();

        for (int iRow = cellRow0.getNumber(); iRow <=  cellRow2.getNumber(); iRow++) {
        	addCelda(cellCol0.getCeldas().get(iRow));
        	addCelda(cellCol1.getCeldas().get(iRow));
        	addCelda(cellCol2.getCeldas().get(iRow));
        }
    }
}
