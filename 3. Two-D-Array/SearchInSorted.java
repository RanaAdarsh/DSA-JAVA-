public class SearchInSorted {
    public static void Search(int matrix[][], int key){
        //starting key is (0,m-1)
        int i = 0;
        int j = matrix[0].length-1;
        int count = 0;
        while(i<matrix.length&&j>=0){
            if(matrix[i][j]==key){
                System.out.println(key+" is present at cell: ("+i+","+j+") with loop : "+count);
                return;
            }
            else if(key>matrix[i][j]){
                i = i+1;
            }
            else if(key<matrix[i][j]){
                j = j-1;
            }
            count++;
        }
        System.out.println(count);
        System.out.println("Key is not in the matrix!");
    }
    public static void main(String[] args) {
        int matrix[][] ={{10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50}};

        Search(matrix, 100);
    }
}
