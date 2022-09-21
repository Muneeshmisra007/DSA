package graph;

public class MGraph implements Graph {

    private int[][] matrix;

    public MGraph(int vertexCount) {
        matrix = new int[vertexCount][vertexCount];
    }

    @Override
    public void add(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;

    }

    @Override
    public void printGraph() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println("");
        }
    }

    @Override
    public int bfsTraverse(int source, int destination) {
        //TODO
            return 0;
    }
}
