public class MainGraph {
    public static void main(String[] args) {

        //graph for the example

        DFS DFS = new DFS(8);
        DFS.addEdge(0, 3);
        DFS.addEdge(3, 7);
        DFS.addEdge(7, 4);
        DFS.addEdge(3, 5);
        DFS.addEdge(5, 6);
        DFS.addEdge(6, 2);
        DFS.addEdge(2, 1);

        //System.out.println(bfs);
        DFS.search(0);

    }
}
