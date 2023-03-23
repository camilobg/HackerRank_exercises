package HackerRank;

import java.util.*;

public class ArrayGame {
    public static boolean canWin(int leap, int[] game) throws IndexOutOfBoundsException{
        // Set of visited indices
        Set<Integer> visited = new HashSet<>();
        // Queue of indices to explore
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0); // Start at index 0
        while (!queue.isEmpty()) {
            int current = queue.remove();
            if (current + leap >= game.length || current == game.length - 1) {
                // Can win by leaping or already reached the end
                return true;
            }
            if (current - 1 >= 0 && game[current - 1] == 0 && !visited.contains(current - 1)) {
                // Can step back
                queue.add(current - 1);
            }
            if (game[current + 1] == 0 && !visited.contains(current + 1)) {
                // Can step forward
                queue.add(current + 1);
            }
            if (current + leap < game.length && game[current + leap] == 0 && !visited.contains(current + leap)) {
                // Can leap
                queue.add(current + leap);
            }
            visited.add(current);
        }
        // Cannot reach the end
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println("Prueba "+(5000-q)+" "+n+" "+leap);
            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }

}
