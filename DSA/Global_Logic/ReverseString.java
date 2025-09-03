public class ReverseString {

    public static void reverseUsingStringBuilder(String s) {
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
    }

    public static void reverseUsingItrator(String s) {
        String ans = "";
        for(int i=s.length()-1; i>=0; i--) {
            ans += s.charAt(i);
        }
        System.out.println(ans);
    }

    public static void reverseStringUsingArray(String s) {
        char arr[] = s.toCharArray();

        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }

    public static String reverseUsingRecursion(String s) {
        if(s.isEmpty()) {
            return s;
        }
        return reverseUsingRecursion(s.substring(1)) + s.charAt(0);
    }
    
    public static void main(String[] args) {
        String s = "i am kumar";

        System.out.print("using iterator: ");
        reverseUsingItrator(s);

        System.out.print("using string builder: ");
        reverseUsingStringBuilder(s);
        
        System.out.print("using array: ");
        reverseStringUsingArray(s);
        System.out.println();

        System.out.print("using recursion: ");
        System.out.print(reverseUsingRecursion(s));
    }
}

