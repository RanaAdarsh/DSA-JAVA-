public class DiagonalSum {
    public static void diagonalSum(int matrix[][]){
        if(matrix.length!=matrix[0].length){
            System.out.println("Not a NxN matrix!");
            return;
        }
        int sum = 0;
        for(int i =0;i<matrix.length;i++){
            //primary Diagonal
            sum+=matrix[i][i];
            //second Diagonal
            if(i!=matrix.length-1-i){
            sum+= matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(sum);
    }
   public static void main(String[] args) {
    int matrix[][] ={{1, 2, 3, 4},
                     {5, 6, 7, 8},
                     {9, 10,11,12},
                     {13,14,15,16}};
    diagonalSum(matrix);
   } 
}
