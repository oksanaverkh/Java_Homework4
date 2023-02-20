import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list length: ");
        int n = scanner.nextInt();

        System.out.println("Enter numbers: ");
        Deque<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.addLast(scanner.nextInt());
        }
        scanner.close();

        Deque<Integer> reversedlist = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            reversedlist.addFirst(list.pop());
        }

        System.out.println(reversedlist);

    }
}