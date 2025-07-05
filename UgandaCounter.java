import java.util.Scanner;

public class UgandaCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book description: ");
        String desc = sc.nextLine();

        int count = 0;
        String[] words = desc.split("\\W+"); // Split by non-word characters

        for (String w : words) {
            if ("uganda".equalsIgnoreCase(w)) count++;
        }

        System.out.printf("\"Uganda\" appears %d time(s).%n", count);
    }
}
