package graph;

public class DemoGraph {

    public static void main(String[] args){
        Graph graph = new LGraph(5);
        graph.add(0,2);
        graph.add(0,3);
        graph.add(1,2);
        graph.add(1,3);
        graph.add(4,3);
        graph.add(3,2);

        graph.printGraph();
        graph.bfsTraverse(0,4);
        graph.bfsTraverse(1,4);
    }
}
