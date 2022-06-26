/*
 * Name:Apurva Sonawane
 * RollNo: 3458
 * C Number: C22019221457
 * TSP using BFS and DFS 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
class adj_matrix
{
	int[][] mat;
	int n;
	boolean cycleFound;
	int min=Integer.MAX_VALUE;
	ArrayList<Integer> minPath;

	void creatAdjMat()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Directed graph?(1/0): ");
		int d=sc.nextInt();
		System.out.print("Enter number of vertices: ");
		this.n=sc.nextInt();
		this.mat = new int[n][n];
		
		System.out.print("Enter number of edges: ");
		int e=sc.nextInt();
		System.out.println("Enter edges:");
		for(int i=0;i<e;i++)
		{
			System.out.print((i+1)+")\tEdge :");
			int x=sc.nextInt();
			System.out.print("to:");
			int y=sc.nextInt();
			System.out.print("Input weight: ");
			int w=sc.nextInt();
			//considering we start numbering vertices from zero 
			this.mat[x][y]=w;
			if(d==0)
			{
				this.mat[y][x]=w;
			}
		}
		sc.close();
	}
	
	void displayAdjMat()
	{
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(this.mat[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	void TSP_bfs(int count, ArrayList<Integer> Path, boolean[] visited,int cost) {
		if(count == n) {										//check if all nodes are visited or not
			if(mat[0][Path.get(Path.size()-1)] !=0) {			//check if there exist an edge between start and end vertex
				if(min > cost+mat[Path.get(Path.size()-1)][0]) {		//if path found has cost lesser than any path that has gotten earlier,update min and minPath
					min=cost+mat[Path.get(Path.size()-1)][0];
					minPath = new ArrayList<Integer>(Path);
				}
				cycleFound = true;
			}
		}
		else {															//else check path from all unvisited vertices adjacent to last visited vertex in Path
			for(int j=0;j<n;j++) {
				if(mat[Path.get(count-1)][j]!=0 && Path.contains(j)==false) {
					Path.add(j);
					visited[j]=true;
					TSP_bfs(count+1,Path,visited,cost+mat[Path.get(count-1)][j]);
					Path.remove(Path.size()-1);
					visited[j]=false;
				}
			}
		}
	}

	int TSP_Rdfs(int count,int start,ArrayList<Integer> vis,ArrayList<Integer> Path) {
		count++;
		vis.add(start);
		if(count==n) {									//assuming we always start from zero
			if(mat[start][0] != 0) {					//check whether last visited vertex has starting vertex(0) adjacent to it
				return mat[start][0];
			}
		}
		else {
			//else select minimum weighted adjacent unvisited node
			//firstly add all unvisited adjacent vertices with its weight to 2D arraylist
			ArrayList<ArrayList<Integer>> sortedWeights = new ArrayList<ArrayList<Integer>>();
			for(int i=0;i<n;i++) {												
				if(mat[start][i]!=0 && vis.contains(i)==false) {
					ArrayList<Integer> temp=new ArrayList<Integer>();
					temp.add(i);
					temp.add(mat[start][i]);
					sortedWeights.add(temp);
				}
			}
			//Now, we sort thew 2D arraylist
			Collections.sort(sortedWeights,new Comparator<ArrayList<Integer>>(){
				@Override
				public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
					return a.get(1).compareTo(b.get(1));
				}
			});
			//select minimum weighted edge and explore further if it doesn't form a loop select next minimum
			for(int i=0;i<sortedWeights.size();i++) {
				int res = TSP_Rdfs(count,sortedWeights.get(i).get(0),vis,Path);
				if(res!=0) {
					Path.add(sortedWeights.get(i).get(0));
					return res+sortedWeights.get(i).get(1);
				}
			}
		}
		//control will reach here only when path followed doesn't cover all vertices or doesn't form a loop
		//so remove visited vertex(go back)
		vis.remove(vis.size()-1);
		return 0;
	}
}


class TSP{
	public static void main(String args[]) {
		adj_matrix adjmat = new adj_matrix();
		adjmat.creatAdjMat();
		adjmat.displayAdjMat();
		
		//TSP using DFS
		ArrayList<Integer> Path = new ArrayList<Integer>();
		Path.add(0);
		int Result=adjmat.TSP_Rdfs(0,0,new ArrayList<Integer>(),Path);
		
		if(Result==0) {
			System.out.println("No such path is found.");
		}else {
			System.out.println("DFS:\nPath: ");
			System.out.print("0 ");
			for(int i=Path.size()-1;i>=0;i--) {
				System.out.print(Path.get(i)+" ");
			}
			System.out.println();
			System.out.println("Minimum cost for tsp using DFS = "+Result);
		}
		Path.clear();
		
		
		//TSP using BFS
		adjmat.cycleFound=false;
		boolean[] visited = new boolean[adjmat.n];
		for(int i=0;i<adjmat.n;i++){
			visited[i] = false;
		}
		
		Path.add(0);
		visited[0] = true;
		
		adjmat.TSP_bfs(1,Path,visited,0);
		if(adjmat.cycleFound==false) {
			
		}
		System.out.print("\n\nBFS:\nPath: ");
		for(int k=0;k<adjmat.n;k++)
		{
			System.out.print(adjmat.minPath.get(k)+" ");
		}
		System.out.print("0\nMinimum cost  for tsp using bfs = "+adjmat.min);
		
	
		}
}

/*
 * OUTPUT:
 Directed graph?(1/0): 0
Enter number of vertices: 7
Enter number of edges: 13
Enter edges:
1)	Edge :0
to:1
Input weight: 12
2)	Edge :0
to:2
Input weight: 10
3)	Edge :0
to:6
Input weight: 12
4)	Edge :1
to:2
Input weight: 8
5)	Edge :1
to:3
Input weight: 12
6)	Edge :2
to:3
Input weight: 11
7)	Edge :2
to:4
Input weight: 3
8)	Edge :2
to:6
Input weight: 9
9)	Edge :3
to:4
Input weight: 11
10)	Edge :3
to:5
Input weight: 10
11)	Edge :4
to:5
Input weight: 6
12)	Edge :4
to:6
Input weight: 7
13)	Edge :5
to:6
Input weight: 9
0  12  10  0  0  0  12  
12  0  8  12  0  0  0  
10  8  0  11  3  0  9  
0  12  11  0  11  10  0  
0  0  3  11  0  6  7  
0  0  0  10  6  0  9  
12  0  9  0  7  9  0  
DFS:
Path: 
0 2 4 6 5 3 1 0 
Minimum cost for tsp using DFS = 63


BFS:
Path: 0 1 3 5 6 4 2 0
Minimum cost  for tsp using bfs = 63
 */
*/
