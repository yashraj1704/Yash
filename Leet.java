import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
    System.out.println(isAnagram("yash","asyh"));
    }
    public static  boolean isAnagram(String s, String t) {
        String p = "";
        String q = "";
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            p = p + arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            q = q + arr2[i];
        }
        return p.equals(q);
    }
}
