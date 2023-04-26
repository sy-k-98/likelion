package codeup;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] Arr = str.split("\\:");
        System.out.println(Integer.parseInt(Arr[1]));
    }

}
