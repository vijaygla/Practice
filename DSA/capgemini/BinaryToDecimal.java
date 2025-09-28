public class BinaryToDecimal {

    public static int binaryToDecimal(String s) {
        int sum = 0;
        int power = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                sum += Math.pow(2, power);
            }
            power++;
        }

        return sum;
    }

    public static void main(String[] args) {
        String s = "1001";

        System.out.println("Decimal number of given binary number is: " + binaryToDecimal(s));
    }
}
