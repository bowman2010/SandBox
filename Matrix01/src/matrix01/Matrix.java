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

    private final double[][] mtx;
    private int nbLines;
    private int nbColumns;

    public Matrix(int nbLines, int nbColumns) {
        this.mtx = new double[nbLines][nbColumns];
        this.nbLines = nbLines;
        this.nbColumns = nbColumns;
        dudule();
    }

    public Matrix(Matrix m) {
        int nbl = m.getNbLines();
        int nbc = m.getNbColumns();
        this.mtx = new double[nbl][nbc];

        for (int line=0; line<nbl; line++) {
            for (int column=0; column<nbc; column++) {
                this.setLC(line, column, m.getLC(line, column));
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

        for (int line=1; line<=this.nbLines; line++) {
            for (int column=1; column<=this.nbColumns; column++) {
                result.setLC(
                        line,column,
                        this.getLC(line, column) + m.getLC(line, column)
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

        for (int line=1; line<=this.nbLines; line++) {
            for (int column=1; column<=this.nbColumns; column++) {
                result.setLC(
                        line,column,
                        this.getLC(line, column) - m.getLC(line, column)
                );
            }
        }
        return result;
    }

    public Matrix multiply(double rr) {
        Matrix result = new Matrix(this.nbLines,this.nbColumns);

        for (int line=1; line<=this.nbLines; line++) {
            for (int column=1; column<=this.nbColumns; column++) {
                result.setLC(line, column,rr * this.getLC(line, column));
            }
        }
        return result;
    }

    public Matrix multiply(Matrix mm) throws MatrixException {
        throw new UnsupportedOperationException("Not supported yet."); 
/*        if (this.nbColumns != mm.getNbLines())
            throw new MatrixException("Incompatible sizes");

        Matrix result = new Matrix(this.nbLines, mm.getNbColumns());

        return result;
*/
    }

    public Matrix transpose() {
        Matrix result = new Matrix(this.nbColumns,this.nbLines);

        for (int line=1; line<=this.nbLines; line++) {
            for (int column=1; column<=this.nbColumns; column++) {
                result.setLC( column,line,  this.getLC(line, column));
            }
        }
        return result;
    }
    
    public double det() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void dump() {
        for (int line=0; line<this.nbLines; line++) {
                System.out.print("|  ");
                for (int column=0; column<this.nbColumns; column++) {
                    System.out.print(frmtNumber(this.mtx[line][column]));
                }
                System.out.println("  |");
        }
    }

    public static String frmtNumber(double n) {
        String s = String.format("%4.3f", n);
        StringBuilder sb=new StringBuilder(s);
        int i = sb.length()-1;
        while (sb.charAt(i)=='0') {
            sb.replace(i, i+1, " ");
            i--;
        }
        if (sb.charAt(i)=='.')
            sb.replace(i, i+1, " ");

        return sb.toString();
    }

    public int getNbLines() {
        return this.nbLines;
    }

    public int getNbColumns() {
        return this.nbColumns;
    }

    public double getLC(int line, int column) {
        return this.mtx[line-1][column-1];
    }

    public final void setLC(int line, int column, double value) {
        this.mtx[line-1][column-1] = value;
    }

    public double[] getLine(int line) {
        double[] result = new double[this.nbColumns];
        for (int col=1; col<=this.nbColumns; col++) {
            result[col-1] = this.getLC(line, col);
        }
        return  result;
    }

    public double[] getColumn(int column) {
        double[] result = new double[this.nbLines];
        for (int line=1; line<=this.nbLines; line++) {
            result[line-1] = this.getLC(line, column);
        }
        return  result;
    }

    public void reset() {
        for (int line = 1; line<=nbLines; line++ ) {
            for (int column=1; column<=nbColumns; column++) {
                this.setLC(line, column, 0);
            }
        }
    }

    private void dudule() {
    }

}
