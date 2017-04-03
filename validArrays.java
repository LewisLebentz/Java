import java.io.*;
import java.util.*;

class validArrays {

  public static void main(String[] args) {

    int[] array1 = {2, 3, 4, 5, 6, 1};
    int[] array2 = {1, 2, 3, 4, 5, 6};
    int[] array3 = {6, 5, 4, 3, 2, 1};
    Arrays.sort(array3);

    System.out.println(Arrays.equals(array1, array2));
    System.out.println(!(array1 == array2));
    System.out.println(array2[2] == 3);
    System.out.println(array3.length == 6);
    System.out.println(array3[1] == 5);

  }

}
