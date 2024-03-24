import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        // Read lines until EOF and add them to the list
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }

        // Enumerate each line using a for loop
        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + " " + lines.get(i));
        }

        scanner.close();
    }
}
