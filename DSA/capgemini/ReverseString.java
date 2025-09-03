public class ReverseString {

    public static char[] reveseString(char s[]) {
        int start = 0, end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end]  = temp;
            start++;
            end--;
        }

        return s;
    }
    
    public static void main(String[] args) {
        char s[] = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Rversed String: ");
        reveseString(s);
        for(char c : s) {
            System.err.print(c + " ");
        }
    }
}
