// package Practice.DSA.Global_Logic;

import java.util.Arrays;

public class StreamUses {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int sq[] = Arrays.stream(arr).filter(x -> x % 2 == 0).map(x -> x * x).toArray();
        System.out.println(Arrays.toString(sq));
    }
}
