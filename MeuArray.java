import java.util.Arrays;

public class MeuArray {
    public static void main(String[] args) {
        int[] unidimensionalArr = {2,5,46,12,34};
        int[][] multiDimensialArr = {{2,3}, {5,9}};
        
        // 1 forma
        // for(int i = 0; i<intArray.length; i++){
        //     System.out.print(intArray[i]);
        // }

        // 2 forma
        // for (int i : intArray) {
        //     System.out.print(i);
        // }

        // 3 forma
        System.out.println(Arrays.toString(unidimensionalArr));
        System.out.println(Arrays.deepToString(multiDimensialArr));
        
    }
}
