public class SprialMatrix {
    
    public static void PrintSprial(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        
        while(startRow<=endRow && startCol<=endCol){
            //Top
            for(int i = startCol ;i<=endCol;i++){
                System.out.print(matrix[startRow][i]+" ");
            }

            //Right
            for(int j = startRow+1;j<=endRow;j++){
                System.out.print(matrix[j][endCol]+" ");
            }
            
            //Bottom
            for(int i = endCol-1;i>=startCol;i--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }

            //Left
            for(int j = endRow-1;j>=startRow+1;j--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[j][startCol]+" ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    public static void main(String[] args) {
        int matrix1[][] = {{1 ,2 ,3,4,14},
                             {5, 6, 7,8,15},
                             {9, 10,11,12,16},
                            {12,13,14,17,18}};

        PrintSprial(matrix1);
    }
}
