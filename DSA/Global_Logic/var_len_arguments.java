// package Practice.DSA.Global_Logic;

import java.util.*;

public class var_len_arguments {

    static int sum(int ...a) {
        return Arrays.stream(a).sum();
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
    }
}
