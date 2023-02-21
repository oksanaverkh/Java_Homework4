import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        String symbols = "({[]})";
        System.out.println(isValid(symbols));
    }

    public static Boolean isValid(String text) {
        Boolean flag = false;
        Deque<String> list = new LinkedList<>();
        String[] arr = new String[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = (text.substring(i, i + 1));
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(") || arr[i].equals("{") || arr[i].equals("[")) {
                list.addFirst(arr[i]);
            } else {
                if (!list.isEmpty()
                        && (list.peekFirst().equals("(") && arr[i].equals(")"))
                        || (list.peekFirst().equals("{") && arr[i].equals("}"))
                        || (list.peekFirst().equals("[") && arr[i].equals("]"))) {
                    list.pop();
                } else {
                    return flag;
                }
            }
        }
        if (list.isEmpty()) {
            flag = true;
        }
        return flag;
    }
}
