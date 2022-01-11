package day22_MultiDimensionalArray;

public class ItearatingMultiDimArray2 {

    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };

        for (int i = 0; i < arr2D.length; i++) { // index of each array

            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]);

            }
            System.out.println();
            }
        }

    }



/*
task 2
3 2 1
8 7 6 5 4
13,12,11,10,9
 */