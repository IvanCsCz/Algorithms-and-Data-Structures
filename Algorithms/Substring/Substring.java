package Algorithms.Substring;

import java.util.ArrayList;
import java.util.List;

class Substring {

  public static List<Integer> getSubstring(String str, String substr) {
    int strLen = str.length();
    int substrLen = substr.length();
    List<Integer> positions = new ArrayList<>();
    for (int i = 0; i <= strLen - substrLen; i++) {
      if (str.substring(i, i + substrLen).equals(substr)) {
        positions.add(i);
      }
    }

    return positions;
  }

  public static void main(String[] args) {
    String str = "ababcabc";
    String substr = "abc";
    List<Integer> result = getSubstring(str, substr);
    System.out.println("Substring found at positions: " + result);
  }

}