package codeup;

import java.util.Scanner;

public class CodeUp1671 {
    public String rockPaperScissors(int user, int computer) {
        if (user == computer)
            return "tie";
        else if ((user == 0 && computer == 1) || (user == 1 && computer == 2) || (user == 2 && computer == 0))
            return "win";
        else return "lose";

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int computer = sc.nextInt();
        CodeUp1671 code = new CodeUp1671();

        System.out.println(code.rockPaperScissors(user, computer));
    }

}
