/*
Roll no.:3458
Cno.:C22019221457
Name: Apurva Ashok Sonawane
Batch: B4
T.Y.B.Tech. Computer
AIML Assignment Number 1:
Problem Statement: BFS and DFS traversal for graph
 */
import java.util.*;
class Graph
{
    private int V;                              //number of nodes in the graph
    private final LinkedList<Integer>[] adj;              //adjacency list
    private final Queue<Integer> queue;                   //maintaining a queue

    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++)
        {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }

    void addEdge(int v,int w)
    {
        adj[v].add(w);                          //adding an edge to the adjacency list (edges are bidirectional in this example)
    }
    void BFS(int n)
    {
        boolean[] nodes = new boolean[V];       //initialize boolean array for holding the data
        int a;
        nodes[n]=true;
        queue.add(n);                   //root node is added to the top of the queue
        while (queue.size() != 0)
        {
            n = queue.poll();             //remove the top element of the queue
            System.out.print(n+" ");           //print the top element of the queue
            for (int i = 0; i < adj[n].size(); i++)  //iterate through the linked list and push all neighbors into queue
            {
                a = adj[n].get(i);
                if (!nodes[a])                    //only insert nodes into queue if they have not been explored already
                {
                    nodes[a] = true;
                    queue.add(a);
                }
            }
        }
    }
    void DFSUtil(int vertex, boolean[] nodes)
    {
        nodes[vertex] = true;                         //mark the node as explored nodes[] = explored or visited
        System.out.print(vertex + " ");
        int a;
        for (int i = 0; i < adj[vertex].size(); i++)  //iterate through the linked list and then propagate to the next few nodes
        {
            a = adj[vertex].get(i);
            if (!nodes[a])                    //only propagate to next nodes which haven't been explored
            {
                DFSUtil(a, nodes);
            }
        }
    }
    void DFS(int v)
    {
        boolean[] already = new boolean[V];             //initialize a new boolean array to store the details of explored nodes
        DFSUtil(v, already);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices: ");
        int v = sc.nextInt();
        Graph graph = new Graph(v);
        System.out.println("Enter number of edges: ");
        int e = sc.nextInt();
        System.out.println("Enter the edges: ");
        while(e!=0){
            graph.addEdge(sc.nextInt(),sc.nextInt());
            e--;
        }
        System.out.println("Enter starting vertex for BFS: ");
        int s = sc.nextInt();
        System.out.println("The Breadth First Traversal of the graph is as follows :");
        graph.BFS(s);
        System.out.println(" ");
        System.out.println("Enter starting vertex for DFS: ");
        int t = sc.nextInt();
        System.out.println("Following is Depth First Traversal: ");
        graph.DFS(t);
    }
}





//OUTPUT:
//Enter number of vertices:
//6
//Enter number of edges:
//12
//Enter the edges:
//0 1
//0 3
//0 4
//4 5
//3 5
//1 2
//1 0
//2 1
//4 1
//3 1
//5 4
//5 3
//Enter starting vertex for BFS:
//0
//The Breadth First Traversal of the graph is as follows :
//0 1 3 4 2 5
//Enter starting vertex for DFS:
//0
//Following is Depth First Traversal:
//0 1 2 3 5 4