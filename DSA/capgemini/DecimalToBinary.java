public class DecimalToBinary {

    public static String decimalToBinary(int num) {
        if (num == 0)
            return "0";

        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 2);
            num /= 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 10;
        String ans = decimalToBinary(num);

        System.out.println("Output: " + ans);
    }
}
