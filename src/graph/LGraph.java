package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LGraph implements Graph {
    private List<List<Integer>> vertices;

    public LGraph(int verticesCount) {
        this.vertices = new ArrayList(verticesCount);
        for (int i = 0; i < verticesCount; i++) {
            vertices.add(new ArrayList());
        }
    }

    @Override
    public void add(int source, int destination) {
        vertices.get(source).add(destination);
        vertices.get(destination).add(source);
    }

    @Override
    public void printGraph() {
        for (int i = 0; i < vertices.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < vertices.get(i).size(); j++) {
                System.out.print(" " + vertices.get(i).get(j));
            }
            System.out.println("");
        }
    }

    @Override
    public int bfsTraverse(int source, int destination) {
        System.out.println("From source "+ source +" to destination "+ destination);
        Queue<Integer> qu = new LinkedList();
       boolean [] visited = new boolean[vertices.size()];
       int[] parent = new int[vertices.size()];
        //start with source, adding it to queue
        qu.add(source);
        visited[source] = true;
        parent[source] = -1; //it is not found with any other node but itself

        while(!qu.isEmpty()){
            int current = qu.poll();
            if(current==destination){
                break;
            }
            //visit neighbour of current node and add to Queue
            for(int node: vertices.get(current)){
                if(!visited[node]){
                    qu.add(node);
                    visited[node] = true;
                    parent[node] = current;
                }
            }
        }

        //calculate distance
        int index = destination; //start with destination and go to source to find the path
        int path = 0;
        System.out.print("node in path: ");
        while(parent[index]!=-1){
            System.out.print(index +" -> ");
            index = parent[index];
            path++;
        }
        System.out.print(source);
        System.out.println(" ");
        System.out.println(" path "+path);
        return path; //path between source and destination

    }
}
