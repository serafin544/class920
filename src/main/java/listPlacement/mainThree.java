package listPlacement;

import java.util.ArrayList;
import java.util.Arrays;

public class mainThree {

    static ArrayList<ArrayList<String >> letterGroup = new ArrayList<ArrayList<String>>();
    static ArrayList<String> letterA = new ArrayList<String>();
    static ArrayList<String> letterB = new ArrayList<String>();
    static ArrayList<String> allOtherLetters = new ArrayList<String>();
    public static void main(String[] args) {

        String[] arrayOne =  {"abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb", "eeee"};
        groupEm(arrayOne);


        //System.out.println(Arrays.toString(letterGroup));
    }
    public static void groupEm(String[] arr){

        for(int i = 0;i< arr.length;i++){
            char tmp = arr[i].charAt(0);
            if(tmp == 'a'){
                letterA.add(arr[i]);
                letterGroup.add(letterA);
            } else if(tmp == 'b'){
                letterB.add(arr[i]);
                letterGroup.add(letterB);
            } else{
                 allOtherLetters.add(arr[i]);
                 letterGroup.add(allOtherLetters);
            }

        }
    }







}
