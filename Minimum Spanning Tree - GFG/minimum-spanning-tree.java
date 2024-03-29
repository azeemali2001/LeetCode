//{ Driver Code Starts


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static BufferedReader br;
	static PrintWriter ot;
    public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			int edges[][] = new int[E][3];
			for(int i = 0; i < E; i++){
				s = br.readLine().trim().split(" ");
				edges[i][0] = Integer.parseInt(s[0]);
				edges[i][1] = Integer.parseInt(s[1]);
				edges[i][2] = Integer.parseInt(s[2]);
			}
			ot.println(new Solution().spanningTree(V, E, edges));
		}
		ot.close();
	}
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    
    static class Edge {
        int src;
        int nbr;
        int wt;
        
        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    
	static int spanningTree(int V, int E, int edges[][]){
	   // Creating a Grpah
	   ArrayList<Edge> graph[] = new ArrayList[V];
	   
	   for(int i=0;i<V;i++) {
	       graph[i] = new ArrayList<>();
	   }
	   
	   
	   for(int i=0;i<E;i++) {
	       int v1 = edges[i][0];
	       int v2 = edges[i][1];
	       int wt = edges[i][2];
	       
	       graph[v1].add(new Edge(v1, v2, wt));
	       graph[v2].add(new Edge(v2, v1, wt));
	   }
	   
	   //Applying Prims
	   int ans = 0;
	   
	   PriorityQueue<Pair> pq = new PriorityQueue<>();
	   pq.add(new Pair(0, -1, 0));
	   
	   boolean[] visited = new boolean[V];
	   
	   while(pq.size() != 0) {
	       Pair rem = pq.remove();
	       
	       if(visited[rem.v] != false) {
	           continue;
	       }
	       
	       visited[rem.v] = true;
	       
	       //Work
	       ans += rem.wt;
	       
	       
	       for(Edge e : graph[rem.v]) {
	           if(visited[e.nbr] == false) {
	               pq.add(new Pair(e.nbr, rem.v, e.wt));
	           }
	       }
	   }
	   return ans;
	}
	
	static class Pair implements Comparable<Pair> {
	    int v;
	    int av;
	    int wt;
	    
	    Pair(int v, int av, int wt) {
	        this.v = v;
	        this.av = av;
	        this.wt = wt;
	    }
	    
	    public int compareTo(Pair o) {
	        return this.wt - o.wt;
	    }
	}
}