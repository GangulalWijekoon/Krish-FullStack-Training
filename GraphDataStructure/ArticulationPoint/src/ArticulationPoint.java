import java.util.ArrayList;
import java.util.Scanner;

public class ArticulationPoint {

    static int dfs_counter;
    static int[] visited;
    static int[] dfs_num;
    static int[] dfs_low;
    static int[] isArticulation;
    static ArrayList<Integer> arrList[];


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        ArrayList<Integer> list;

        while (input > 0) {

            // Initialize variable
            arrList = new ArrayList[input];
            for (int i = 0; i < input; i++) {
                arrList[i] = new ArrayList<Integer>();
            }
            dfs_counter = 0;

            dfs_low = new int[input];
            visited = new int[input];
            dfs_num = new int[input];

            isArticulation = new int[input];

            int m = scanner.nextInt();
            for (int i = 0; i < m; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                arrList[a].add(b);
                arrList[b].add(a);
            }

            dfs(-1, 0);

            System.out.printf("Articulation point is:");
            for (int i = 0; i < input; i++) {
                if (isArticulation[i] == 1) {
                    System.out.printf(" %d", i);
                }
            }
            System.out.println();

            input = scanner.nextInt();
        }
    }

    public static void mapArr() {
        for (int i = 0; i < arrList.length; i++) {
            for (int j = 0; j < arrList[i].size(); j++) {
                System.out.printf("%d ", arrList[i].get(j));
            }
            System.out.println();
        }
    }

    public static void dfs(int parent, int curr) {
        dfs_num[curr] = dfs_counter;
        dfs_low[curr] = dfs_counter;
        dfs_counter++;

        visited[curr] = 1;

        ArrayList<Integer> list = arrList[curr];


        int child = 0;

        for (int i = 0; i < list.size(); i++) {
            int next = list.get(i);

            // If it is a parent node, do nothing.
            if (next == parent) {
                continue;
            }

            if (visited[next] == 1) {


                dfs_low[curr] = Math.min(dfs_low[curr], dfs_num[next]);
            }

            else {
                child++;
                dfs(curr, next);

                dfs_low[curr] = Math.min(dfs_low[curr], dfs_low[next]);

                if (parent == -1 && child > 1) {
                    isArticulation[curr] = 1;
                }

                if (parent != -1 && dfs_num[curr] <= dfs_low[next]) {
                    isArticulation[curr] = 1;
                }
            }
        }
    }


}
