public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i <= arr.length; i++) { // <= instead of < 
            arr[i] = i * 2; 
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}