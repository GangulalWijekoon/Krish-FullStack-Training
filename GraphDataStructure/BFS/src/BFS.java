import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    // array of linked lists(adjacency List)
    private LinkedList<Integer>[] adjList;
    private int vertexCount;// number of vertexes
    private int edges;

    public BFS(int nodes){
        this.vertexCount = nodes;
        this.edges = 0;
        this.adjList = new LinkedList[nodes];

        for (int vert = 0; vert < vertexCount; vert++) {
            adjList[vert] = new LinkedList<>();
        }
    }

    public void addEdge(int v1, int v2){

        adjList[v1].add(v2);
        adjList[v2].add(v1);

        edges++;
    }

    public void search(int startNode){
        //array to keep info on visited nodes
        boolean[] visitedNodes = new boolean[vertexCount];

        Queue<Integer> queue = new LinkedList<>();
        visitedNodes[startNode] = true;// make initial node as visited
        queue.add(startNode);//adding initial node to the queue

        while(!queue.isEmpty()) {

            int head = queue.poll();// retrieves the head of the queue FIFO
            System.out.print(head + " ");

            for(int node : adjList[head]) {
                if(!visitedNodes[node]) {// check the node is visited
                    visitedNodes[node] = true;//if not mark it as visited
                    queue.add(node);
                }
            }
        }

    }
}
