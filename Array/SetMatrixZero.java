package Array;

class SetMatrixZero {
    static void setZeroRow(int i,int [][]matrix,int len){
        for(int a=0;a<len;a++){
            matrix[i][a]= 0;
        }        
    }
    
    static void setZeroColumn(int j,int [][]matrix,int len){
        for(int a=0;a<len;a++){
            matrix[a][j]= 0;
        }
    }
    public static void main(String[] args) {
        
        int [][] matrix = { {1,1,1},
                            {1,0,1},
                            {1,1,1},};

        int arr1[]= new int[3];
        int arr2[]= new int[3];
        int k =0;
        int m=0;
        int len = matrix.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(matrix[i][j]==0){
                    arr1[k++]=i;
                    arr2[m++]=j;
                }
            }
        }

        for(int i=0;i<k;i++){
            setZeroRow(arr1[i],matrix,len);
        }
        for(int i=0;i<m;i++){
            setZeroColumn(arr2[i],matrix,len);
        }


        System.out.println("The matrix after:");
        for(int a=0;a<len;a++){
            for(int b=0;b<len;b++){
                System.out.print(matrix[a][b]+" ");
            }
            System.out.println();
        }
    }
}