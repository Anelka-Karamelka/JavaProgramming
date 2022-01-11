package day22_MultiDimensionalArray;

public class IteratingMultiDimenArray {
    public static void main(String[] args) {

        int arr2D[][] = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};
        //    0          1             2   index array
        for (int i = arr2D.length - 1; i >= 0; i--) { //i index number of Array from last index to 0

            for (int j = 0; j < arr2D[i].length; j++) {// j index number of elements starting from0
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
    }

}
/*
9, 10, 11 ,12, 13
4,5,6,7,8
1,2,3
 */