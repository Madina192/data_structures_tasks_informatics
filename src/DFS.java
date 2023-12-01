import java.util.ArrayList;
import java.util.Arrays;

public class DFS {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int size = 5;
    static boolean[] visited = new boolean[5];

    public static void main(String[] args) {

        addToGraph();
        addToList(0,1);
        addToList(3,2);
        addToList(2,4);
        addToList(1,4);
        addToList(3,1);
        addToList(2,0);
        printElements();

        DepthFirstSearch(0);
        System.out.println(Arrays.toString(visited));

    }

    static void DepthFirstSearch(int vertex){
        visited[vertex] = true;
        System.out.println(" in " + vertex);
        for (int i = 0; i < graph.get(vertex).size(); i++) {
            if(!visited[graph.get(vertex).get(i)]){
                System.out.println(Arrays.toString(visited));
                DepthFirstSearch(graph.get(vertex).get(i));
            }
            System.out.println(" out " + vertex);
        }
    }

    static void addToGraph(){
        for (int i = 0; i < size; i++) {
            graph.add(new ArrayList<>());
        }
    }

    static void addToList(int v, int u) {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }

    static void printElements(){
        for (int i = 0; i < size; i++) {
            System.out.print("List: ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(" -> " + graph.get(i).get(j));
            }
            System.out.println();
        }
    }

}
