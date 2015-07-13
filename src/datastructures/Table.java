package datastructures;

public class Table {
    private String title;
    private String[] nameCols;
    private String[] nameRows;
    private Matrix m;

    public Table(String title, Matrix m) {
        this.title = title;
        this.m = m;
        nameCols = new String[m.getCols()];
        nameRows = new String[m.getRows()];
    }
    
    public void setColNames(String... names) {
        for(int i=0; i<m.getCols(); i++)
            nameCols[i] = names[i];
    }
    
    public void printTable() {
        System.out.println("Table: " + this.title);
        for(int i=0; i<m.getCols(); i++)
            System.out.printf("%10s ", nameCols[i]);
        System.out.println("");
        
        for(int i=0; i<m.getRows(); i++) {
            for(int j=0; j<m.getCols(); j++)
                System.out.printf("%10.5f ", m.get(i, j));
            System.out.println();
        }
    }
}
