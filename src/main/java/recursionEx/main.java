package recursionEx;
public class main{
    public static void main(String[] args) {
    int[] testOne = {1,2,3};
    printPermutn(testOne,0);
    }
    public static void printPermutn(int[] arr, int index) {
        int size = arr.length;
        if(index == size){
            for(int i = 0; i< arr.length;i++){
                System.out.print(arr[i] );
            }
            System.out.print(", ");
        }else{
            for (int i = index; i < size; i++) {

                int tmp = arr[i];
                arr[i] = arr[index];
                arr[index] = tmp;
                printPermutn(arr, index + 1);
               tmp = arr[i];
               arr[i] = arr[index];
               arr[index]=  tmp; 
            }
    }

    }


}















//Password Checker
/*
package recursionEx;
import java.util.*;
import java.util.Scanner;
public class main {
    static String passWord = "abc123";
    static String USERNAME ="Beast";
    static ArrayList<String> wrongAttempts = new ArrayList<String>();
    public static void main(String[] args) {


        int AttemptLimit = 9;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome back 'beast' ! \nPlease Enter Your password: ");

        for(int i = 0; i < AttemptLimit; i++){
            String attmpt = scan.nextLine();
            if(attmpt.equalsIgnoreCase(passWord)){
                System.out.println(CheckPassword(attmpt));

                break;

            }else{
                System.out.println(CheckPassword(attmpt));

            }

        }
        if(wrongAttempts.size() > 0){
            attemptLIST();
        }





    }
    public static String CheckPassword(String p){
        String result = "";
        if(p.equalsIgnoreCase(passWord)){
            result = "Login Information is Correct";
        }else{
            result ="Wrong PassWord";
            wrongAttempts.add(p);

        }

        return result;
    }
    public static void attemptLIST(){
        for(int i = 0; i < wrongAttempts.size(); i++){
            System.out.println("Wrong Attempt: " + wrongAttempts.get(i));
        }
        System.out.println("limit  " +wrongAttempts.size() +" Will Now commence Self Destruction");
    }

}
*/
