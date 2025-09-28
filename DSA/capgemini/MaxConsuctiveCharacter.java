public class MaxConsuctiveCharacter {

    public static int maxConsuctiveCharacter(String s) {
        int count = 1, maxCount = 1;

        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                count++;

                if(count > maxCount) {
                    maxCount = count;
                }
            }
            else {
                count = 1;
            }
        }

        return maxCount;
    }
    
    public static void main(String[] args) {
        String s = "aplle";
        int ans = maxConsuctiveCharacter(s);

        System.out.println("Max Consucutive charcter: " + ans);
    }
}
