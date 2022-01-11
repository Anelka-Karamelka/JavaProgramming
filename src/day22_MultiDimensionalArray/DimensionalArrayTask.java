package day22_MultiDimensionalArray;

public class DimensionalArrayTask {

    public static void main(String[] args) {
        //  index elemnts  0 1 2    0 1  2 3 4   0  1 2 3 4 5
        int[][] arr2D = { {1,2,3} , {4,5,6,7,8}, {9,10,11,12,13}  };
         // index array       0          1         2

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j>= 0; j--) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();

        }


    }
}
/*
13 12 11 10 9
8 7 6 5 4
3 2 1
 */