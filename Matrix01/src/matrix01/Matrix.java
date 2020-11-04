/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix01;

/**
 *
 * @author bowman
 */
public class Matrix {
    
    private double[][] mtx;
    private int nbLines;
    private int nbColumns;

    public Matrix(int nbLines, int nbColumns) {
        this.mtx = new double[nbLines][nbColumns];
        this.reset();
    }
    
    public Matrix(Matrix m) {
        int nbl = m.getNbLines();
        int nbc = m.getNbColumns();
        this.mtx = new double[nbl][nbc];
        
        for (int line=0; line<nbl; line++) {
            for (int column=0; column<nbc; column++) {
                this.mtx[line][column] = m.getLC(line, column);
            }
        }
    }
    
    public Matrix add(Matrix m) throws MatrixException {
        int nbl = m.getNbLines();
        int nbc = m.getNbColumns();
        Matrix result;
        
        if ( nbl!=this.nbLines || nbc!=this.nbColumns) 
            throw new MatrixException("incompatible sizes");

        result = new Matrix(nbl,nbc);
        
        for (int line=0; line<this.nbLines; line++) {
            for (int column=0; column<this.nbColumns; column++) {
                result.setLC( 
                        line,column,
                        this.mtx[line][column] + m.getLC(line, column)
                );
            }
        }
        return result;
    }
        
    public Matrix substract(Matrix m) throws MatrixException {
        int nbl = m.getNbLines();
        int nbc = m.getNbColumns();
        Matrix result;
        
        if ( nbl!=this.nbLines || nbc!=this.nbColumns) 
            throw new MatrixException("incompatible sizes");

        result = new Matrix(nbl,nbc);
        
        for (int line=0; line<this.nbLines; line++) {
            for (int column=0; column<this.nbColumns; column++) {
                result.setLC( 
                        line,column,
                        this.mtx[line][column] - m.getLC(line, column)
                );
            }
        }
        return result;
    }
    
    public Matrix scalarMultiply(double rr) {
        Matrix result = new Matrix(this.nbLines,this.nbColumns);
        
        for (int line=0; line<this.nbLines; line++) {
            for (int column=0; column<this.nbColumns; column++) {
                result.setLC(line, column,rr * this.mtx[line][column]);
            }
        }
        return this;
    }

    public void dump() {
        for (int line=0; line<this.nbLines; line++) {
                System.out.print("|  ");
                for (int column=0; column<this.nbColumns; column++) {
                    System.out.printf("%5f ",this.mtx[line][column]);
                }
                System.out.println("  |");
        }
    }
    
    public int getNbLines() {
        return this.nbLines;
    }
    
    public int getNbColumns() {
        return this.nbColumns;
    }
    
    public double getLC(int line, int column) {
        return this.mtx[line][column];
    }
    
    public void setLC(int line, int column, double value) {
        this.mtx[line][column] = value;
    }
    
    public void reset() {
        for (int l = 0; l<=nbLines; l++ ) {
            for (int c=0; c<=nbColumns; c++) {
                this.mtx[l][c] = 0;
            }
        }
    }
    
}
