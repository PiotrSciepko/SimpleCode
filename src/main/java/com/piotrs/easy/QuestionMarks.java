package com.piotrs.easy;
/*
Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers, letters,
and question marks, and check if there are exactly 3 question marks between every pair of two numbers that add up to 10.
If so, then your program should return the string true, otherwise it should return the string false. If there aren't
any two numbers that add up to 10 in the string, then your program should return false as well.

For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because there are exactly 3 question
marks between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.

Input: "aa6?9"
Output: false
Input: "acc?7??sss?3rr1??????5"
Output: true
*/

public class QuestionMarks {

    private static final String STR = "arrb6???4xxbl5???eee5";

    public static void main(String[] args) {

        String qMarks = STR.replaceAll("([a-zA-Z ])", "").replaceAll("(\\?\\?\\?)", "#");

        String result = "false";
        int index = 0;
        int number1;
        int number2;

        while (index < qMarks.length() - 1) {
            index = qMarks.indexOf("#", index);
            if (index > 0 && index < qMarks.length()) {
                number1 = Character.getNumericValue(qMarks.charAt(index - 1));
                number2 = Character.getNumericValue(qMarks.charAt(index + 1));
                if (number1 + number2 == 10) {
                    result = "true";
                    break;
                }
            }
            index += 1;
        }
        System.out.println(result);
    }
}
