package codeup.basic100;

import java.util.Scanner;

public class CodeUp1065 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i : arr){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
