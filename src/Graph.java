import java.util.ArrayList;

class Graph{
    ArrayList<ArrayList<Integer>> graph;
    int size;

    Graph(int numOfLists){
        size = numOfLists;
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < size; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }

    void addToList(int v, int u) {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }

    void printElements(){
        for (int i = 0; i < size; i++) {
            System.out.print("List: ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(" -> " + graph.get(i).get(j));
            }
            System.out.println();
        }
    }
}
