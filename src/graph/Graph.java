package graph;

public interface Graph {

    void add(int source, int destination);
    void printGraph();
    int bfsTraverse(int source, int destination);
}
