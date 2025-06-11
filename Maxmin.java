package array;
import java.util.Scanner;

public class Maxmin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of scores: ");
        int n = scanner.nextInt();
        int[] scores = new int[n];
        System.out.println("Enter the scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println("The total score is: " + sum);
        System.out.println("The average score is: " + sum / n);
        int max = scores[0];
        int min = scores[0];
        for (int i = 1; i < n; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println("The highest score is: " + max);
        System.out.println("The lowest score is: " + min);
    }
}
