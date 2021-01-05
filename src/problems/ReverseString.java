/*   Revese the String of array with out the using the loop or inbuilt function */

package problems;

import java.util.Arrays;

public class ReverseString {

  public static void reverse(String[] a, int num) {

    if (num >= a.length / 2) {
      return;
    }

    String temp = a[num];
    a[num] = a[a.length - 1 - num];
    a[a.length - 1 - num] = temp;
    reverse(a, ++num);
  }

  public static void main(String[] args) {
    String[] arr = new String[7];
    arr[0] = "s";
    arr[1] = "A";
    arr[2] = "N";
    arr[3] = "j";
    arr[4] = "A";
    arr[5] = "J";
    arr[6] = "as";

    reverse(arr, 0);
    Arrays.stream(arr)
        .forEach(
            e -> {
              System.out.println(e);
            });
  }
}
