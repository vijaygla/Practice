public class BinaryToDecimal {

    public static int binaryToDecimal(String s) {
        int decimalNumber = 0;
        int power = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                decimalNumber += Math.pow(2, power);
            }
            power++;
        }

        return decimalNumber;
    }

    public static void main(String[] args) {
        String binaryNumber = "1001";
        System.out.print("Demimal values of given binary Number: ");
        System.out.println(Integer.parseInt(binaryNumber, 2));

        System.out.println("Decimal number of given binary number is: " + binaryToDecimal(binaryNumber));
    }
}
