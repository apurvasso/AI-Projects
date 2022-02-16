import java.util.Scanner;

public class TSP_DFS {
    int[][] adjMat=new int[100][100];
    int cities;
    boolean[] visited;

    void AdjacencyMatrix() //create using adjaacency matrix
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter total number of cities");
        this.cities = sc.nextInt();
        for (int i = 0; i < cities; i++)
        {
            for (int j = 0; j < cities; j++) {
                System.out.print( "Distance from city "+(i+1) +" to city "+ (j+1)+": ");
                adjMat[i][j]=sc.nextInt();
            }
            System.out.println();
        }
    }
    void displayAdjacencyMatrix() //display for adjacency matrix
    {
        int i,j;
        System.out.printf("%5s"," ");
        for (i = 0; i < cities; i++)
            System.out.printf("%5d",(i+1));
        System.out.println();
        for (i = 0; i < cities; i++)
        {
            System.out.printf("%5d",(i+1));
            for (j = 0; j < cities; j++)
                System.out.printf("%5d",this.adjMat[i][j]);
            System.out.println();
        }
    }






    public static int calcShortestPath(int[][] graph, boolean[] visited, int currentpos, int cities, int count, int cost, int path)
    {
        if(count == cities && graph[currentpos][0] > 0)
        {
            path = Math.min(path,cost + graph[currentpos][0]);
            return path;
        }
        for(int i = 0; i < cities; i++)
        {
            if(!visited[i] && graph[currentpos][i] > 0)
            {
                visited[i] = true;// Mark as visited
                System.out.println("Starting from "+i);
                path = calcShortestPath(graph,visited,i,cities,count + 1,cost + graph[currentpos][i],path);
                visited[i] = false;// Mark ith node as unvisited
                System.out.println("unvisited"+i);
            }
        }
        return path;
    }

    public static void main(String[] args)
    {
//        int cities;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter total number of cities : ");
//        cities = sc.nextInt();
//
//        int graph[][] = new int[cities][cities];
//        for( int i = 0; i < cities; i++){
//            for( int j = 0; j < cities; j++){
//                System.out.println("Distance from city " + (i+1) + " to city " + (j+1) + " : ");
//                graph[i][j] = sc.nextInt();
//            }
//        }

//        boolean[] visited = new boolean[cities];
//        visited[0] = true;
//        int path = Integer.MAX_VALUE;
//        path = calcShortestPath(graph, visited, 0, cities, 1, 0, path);
//
//        System.out.println("Graph is represented as: ");
//        for(int i = 0; i < cities; i++){
//            for(int j = 0; j < cities; j++){
//                System.out.print(graph[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Length of shortest path: " + path);

        TSP_DFS tsp_dfs= new TSP_DFS();
        tsp_dfs.AdjacencyMatrix(); //input matrix from user

        System.out.println("\nThe matrix of cities with edge weights is: \n");
        tsp_dfs.displayAdjacencyMatrix(); //display the input matrix

        tsp_dfs.visited = new boolean[tsp_dfs.cities];
        tsp_dfs.visited[0] = true; // start from 1st vertex
        int path = Integer.MAX_VALUE;
        path= calcShortestPath(tsp_dfs.adjMat, tsp_dfs.visited, 0, tsp_dfs.cities,1, 0, path);
        System.out.println("\nThe shortest distance to travel all cities is: "+path);
//display minimum cost
    }

}
