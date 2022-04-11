import java.util.LinkedList;
import java.util.Stack;

public class DFS {
    // array of linked lists(adjacency List)
    private LinkedList<Integer>[] adjList;
    private int vertexCount;// number of vertexes
    private int edges;

    public DFS(int nodes){
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

    public void search(int startNode) {
        boolean[] visitedNodes = new boolean[vertexCount];

        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);//add start node to the stack

        while(!stack.isEmpty()) {

            int topNode = stack.pop();// to get last in value
            if(!visitedNodes[topNode]) {// check visited
                visitedNodes[topNode] = true; // mark as visited
                System.out.print(topNode + " ");

                for(int node : adjList[topNode]) {
                    if(!visitedNodes[node]) {
                        stack.push(node); // adding to stack if not visited
                    }
                }
            }
        }
    }

}
