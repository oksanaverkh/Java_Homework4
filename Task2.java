// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

// Example 1:

// Input: s = "()"
// Output: true

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        String symbols = "()[]{}";
        System.out.println(isValid(symbols));

    }

    public static Boolean isValid(String text) {
        Boolean flag = false;
        text = "()[]{}";
        Deque<String> list = new LinkedList<>();
        String[] arr = new String[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] =text.substring(i, i+1);
 
        }
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            // System.out.println(list.getFirst());
            // System.out.println(arr[i]);
            if (list.getFirst().equals("(") && arr[i]==")") list.pollFirst();
            else if (list.getFirst().equals("[") && arr[i]=="]") list.remove();
            else if (list.getFirst().equals("{") && arr[i]=="}") list.remove();
            else list.addLast(arr[i]);
            
        }
 
        System.out.println(list);

        if (list.isEmpty()) flag = true;
        return flag;
    }
}
