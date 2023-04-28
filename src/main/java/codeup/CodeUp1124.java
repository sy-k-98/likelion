package codeup;

import java.util.Scanner;

public class CodeUp1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String formula = sc.next();
        String[] arr = formula.split("H");
        arr[0] = arr[0].substring(1, arr[0].length());
        int cWeight = Integer.parseInt(arr[0]);
        int hWeight = Integer.parseInt(arr[1]);

        System.out.printf("%d", cWeight * 12 + hWeight);
    }

}
