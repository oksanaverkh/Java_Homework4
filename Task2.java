// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

// Example 1:

// Input: s = "()"
// Output: true

import java.util.Arrays;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
    String text = "/f//yyyyy/../iii/aa";
    System.out.println(simplifyPath(text));

}

public static String simplifyPath(String path) {
    Deque<String> list = new LinkedList<>();
    String[] arr = path.split("/");
    for (int i = 0; i < arr.length; i++) {
        if (arr[i].equals(".") || arr[i].equals("")) continue;
            
        else if (arr[i].equals("..")) {
            if (list.isEmpty()) list.add("/");
            else list.pollLast();
        } else list.add(arr[i]);
    }

    return "/"+String.join("/", list);
}
}
