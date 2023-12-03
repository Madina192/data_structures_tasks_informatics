import java.util.ArrayList;
import java.util.Scanner;

public class GraphC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph.get(i).add(scanner.nextInt());
            }
        }
        //find number of edges of a graph
    }
}
