package Array;

import java.util.ArrayList;
import java.util.Arrays;

class SetMatrixZero {
   static void SetZero(int [][]matrix, int []arr1,int []arr2,int len){
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(arr1[i]==1 || arr2[j]==1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        
        int [][] matrix = { {1,1,1},
                            {1,0,1},
                            {1,1,1},};

        int []arr1= new int[3];
        int []arr2= new int[3];
        int len = matrix.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(matrix[i][j]==0){
                    arr1[i]=1;
                    arr2[j]=1;
                }
            }
        }

        SetZero(matrix,arr1,arr2,len);

        System.out.println("The matrix after:");
        for(int a=0;a<len;a++){
            for(int b=0;b<len;b++){
                System.out.print(matrix[a][b]+" ");
            }
            System.out.println();
        }
    }
}

// class SetMatrixZero {
   
//     static void SetZero(ArrayList<ArrayList<Integer>> matrix,int i,int j,int n,int m){
//         for(int a=0;a<n;a++){
//             if(matrix.get(a).get(j) !=0){
//                 matrix.get(a).set(j,-1);
//             }
//         }
//         for(int a=0;a<m;a++){
//             if(matrix.get(i).get(a)!=0){
//                 matrix.get(i).set(a,-1);
//             }
//         }
//     }
//     public static void main(String[] args) {
        
//         ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
//         matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
//         matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
//         matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
//         int n = matrix.size();
//         int m = matrix.get(0).size();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix.get(i).get(j)==0){
//                     SetZero(matrix,i,j,n,m);
//                 }
//             }
//         }

//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix.get(i).get(j)==-1){
//                     matrix.get(i).set(j,0);
//                 }
//             }
//         }

//         System.out.println("The matrix after: ");
//         for(ArrayList<Integer> row : matrix){
//             for( int ele : row){
//                 System.out.print(ele+" ");
//             }
//             System.out.println();
//         }

//     }
// }