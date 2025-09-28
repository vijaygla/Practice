import java.util.Arrays;

public class MaxmumProductsOTwoDigit {

    public static int maxmumProductsOTwoDigit(int num) {
        // int num = Integer.parseInt("123");
        String s = String.valueOf(num);
        char arr[] = s.toCharArray();

        Arrays.sort(arr);

        int num1 = arr[arr.length - 1] - '0'; // -0 to convert this char into number
        int num2 = arr[arr.length - 2] - '0';

        return num1 * num2;
    }

    public static void main(String[] args) {
        int num = 124;
        System.out.println("Output: " + maxmumProductsOTwoDigit(num));
    }
}

