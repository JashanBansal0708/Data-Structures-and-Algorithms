public class Matrix{
    public static void main(String[] args){
        int [][] data1 = new int[0][0];
        int [][] data2 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int [][] data3 = {{1,4,7}, {2,5,8}, {3,6,9}};
        // int [][] data2 = {{2,2,2}, {2,2,2}, {2,2,2}};
        // int [][] data3 = {{2,2,2}, {2,2,2}, {2,2,2}};
    
        // Matrix m1 = new Matrix(data1);
        Matrix m2 = new Matrix(data2);
        Matrix m3 = new Matrix(data3);
        
        // System.out.println("m1 rows --> " + m1.getRows() + " columns ---> " + m1.getColumns());
        
        // System.out.println("m1 rows --> " + m2.getRows() + " columns ---> " + m2.getColumns());

        // m2.scale(2).print();
        // m2.divide(2).print();
        // m2.plus(m3).print();
        // m2.minus(m3).print();
        m2.multiply(m3).print();
        // m2.transpose().print();
    }
    private int[][] data;

    public Matrix(int[][] data){
        if(data.length != 0){
            int[][] newData = new int[data.length][data[0].length];
            for(int i=0; i<data.length; i++){
                for(int j=0; j<data[0].length; j++){
                    newData[i][j] = data[i][j];
                }
            }
            this.data = newData;
        }
        else{
            this.data = null;
        }
    }

    public int getElement(int i,int j){
        return this.data[i][j];
    }

    public int getRows(){
        if(this.data == null){
            return 0;
        }
        return this.data.length;
    }

    public int getColumns(){
        if(this.data == null){
            return 0;
        }
        return this.data[0].length;
    }

    public Matrix scale(int scalar){
        int [][] newData = new int[this.data.length][this.data[0].length];
        for(int i=0; i < this.data.length; i++){
            for(int j=0; j < this.data[0].length; j++){
                newData[i][j] = data[i][j] * scalar;
            }
        }
        return new Matrix(newData);
    }

    public Matrix divide(int scalar){
        int [][] newData = new int[this.data.length][this.data[0].length];
        for(int i=0; i < this.data.length; i++){
            for(int j=0; j < this.data[0].length; j++){
                newData[i][j] = data[i][j] / scalar;
            }
        }
        return new Matrix(newData);
    }

    public Matrix plus(Matrix other){
        int[][] newData = new int[other.getRows()][other.getColumns()];
        for(int i=0; i<other.getRows(); i++){
            for(int j=0; j<other.getColumns() ; j++){
                newData[i][j] = this.data[i][j] + other.getElement(i,j);
            }
        }
        return new Matrix(newData);
    }

    public Matrix minus(Matrix other){
        int[][] newData = new int[other.getRows()][other.getColumns()];
        for(int i=0; i<other.getRows(); i++){
            for(int j=0; j<other.getColumns() ; j++){
                newData[i][j] = this.data[i][j] - other.getElement(i,j);
            }
        }
        return new Matrix(newData);
    }

    // public Matrix multiply(Matrix other) throws RuntimeException {

    //     int[][] newData = new int[this.data.length][other.getColumns()];

    //     if(this.getColumns() !=other.getRows())
    //         throw new RuntimeException("The two matrices cannot be multiplied.");
    //     int sum;
    //     for (int i = 0; i < this.getRows(); ++i)
    //         for(int j = 0; j < other.getColumns(); ++j){
    //             sum = 0;
    //             for(int k=0;k<this.getColumns();++k){
    //                 sum += this.data[i][k] * other.getElement(k, j);
    //             }
    //             newData[i][j] = sum; 
    //         }
                

    //     return new Matrix(newData);
    // }


    public Matrix multiply(Matrix other){
        int[][] newData = new int[other.getRows()][other.getColumns()];
        int sum;
        for(int i=0; i<other.getRows(); i++){
            for(int j=0; j<other.getColumns(); j++){
                sum = 0;
                for(int k=0; k<other.getColumns(); k++){
                    sum += this.data[i][k] * other.getElement(k, j);
                }
                newData[i][j] = sum;
            }
        }
        return new Matrix(newData);
    }

    public boolean equals(Matrix other){
        return this == other;
    }

    public Matrix transpose(){
        int[][] newData = new int[this.data.length][this.data[0].length];
        for(int i=0; i<this.data.length; i++){
            for(int j=0; j<this.data[0].length; j++){
                newData[j][i] = this.data[i][j];
            }
        }
        return new Matrix(newData);
    }

    public void print(){
        for(int i=0; i< this.data.length; i++){
            for(int j=0; j< this.data[0].length; j++){
                System.out.print(this.data[i][j] + " ");
            }
            System.out.println();
        }
    }
}