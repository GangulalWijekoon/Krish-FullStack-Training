public class MainGraph {
    public static void main(String[] args) {

        //creating graph for the example
        BFS bfs = new BFS(7);
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 3);
        bfs.addEdge(2, 6);
        bfs.addEdge(1, 5);
        bfs.addEdge(5, 4);
        bfs.addEdge(4, 3);


        bfs.search(0);

    }
}
