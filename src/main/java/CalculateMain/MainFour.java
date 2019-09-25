package CalculateMain;
import java.util.Scanner;
import java.util.Stack;

public class MainFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        System.out.println(doMath(input));
    }
    public static int doMath(String input){
        char[] expression = input.toCharArray();
        int answer = 0;
        int[] values = new int[10];
        String[] op = new String[5];
        for(int i = 0; i < expression.length;i++){
            if(expression[i] >= '0' && expression[i] <= '9' ) {
                String tmp = String.valueOf(expression[i]);
                values[i] = Integer.parseInt(tmp);
            }
            else if(expression[i] == '+' || expression[i] == '-' ||expression[i] == '*' || expression[i] == '/' ) {
                op[i] = String.valueOf(expression[i]);
            }
        }
        if(op[0] == "+"){
            answer = values[0] + values[1];
        }else if(op[0] == "-"){
            answer= values[0]  - values[1];
        }else if(op[0] == "*"){
            answer = values[0] * values[1];
        }else if(op[0] == "/"){
            answer = values[0] / values[1];
        }else if(op.length > 1){
            answer = 99;
        }

        return answer;
    }

}
