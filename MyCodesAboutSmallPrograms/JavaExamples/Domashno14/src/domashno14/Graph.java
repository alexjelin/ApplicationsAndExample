package domashno14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph<T extends Comparable<T>> {

    private ArrayList<T>[] edges;

    public Graph(int vertices) {
        this.edges = new ArrayList[vertices];
    }

    public void addEdge(int index, T e) {
        edges[index].add(e);
    }

    public void addUndirectedEdge(int i, int j, Object e) {
        T object = (T) e;
        edges[i].add(j, object);
    }

    public ArrayList<Integer> breadthFirstTraverse(int source) {
        ArrayList<Integer> result = new ArrayList<Integer>(size());
        boolean[] visited = new boolean[size()];
        Queue<Integer> q = new LinkedList<Integer>();
        visited[source] = true;
        q.offer(source);
        while (!(q.isEmpty())) {
            int vertex = q.poll();
            result.add(vertex);
            ArrayList<Integer> arrNodes = neighbors(vertex);
            for (int k = 0; k < arrNodes.size(); k++) {
                int i = arrNodes.get(k);
                if (!visited[i]) {
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
        return result;
    }

    /**
     * Return the index of the smallest element of distances, ignoring those in
     * visited.
     */
    protected int cheapest(double[] distances, boolean[] visited) {
        int best = -1;
        for (int i = 0; i < size(); i++) {
            if (!visited[i]
                    && ((best < 0) || (distances[i] < distances[best]))) {
                best = i;
            }
        }
        return best;
    }

    /**
     * Return a list of the vertices reachable from source, in depth- first
     * order.
     */
    public ArrayList<Integer> depthFirstTraverse(int source) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        boolean[] visited = new boolean[size()];
        depthFirstTraverse(source, result, visited);
        return result;
    }

    /**
     * Visit the vertices reachable from vertex, in depth-first order. Add
     * vertices to result as they are visited.
     */
    protected void depthFirstTraverse(int vertex,
            ArrayList<Integer> result,
            boolean[] visited) {
        visited[vertex] = true;
        result.add(vertex);
        ArrayList<Integer> arrNodes = neighbors(vertex);
        for (int k = 0; k < arrNodes.size(); k++) {
            int i = (Integer) arrNodes.get(k);
            if (!visited[i]) {
                depthFirstTraverse(i, result, visited);
            }
        }
    }

    public T getEdge(int i, int j) {
        return edges[i].get(j);
    }

    public T getCost(int i, int j) {
        if (i == j) {
            return null;
        }
        if (edges[i].get(j) == null) {
            return null;
        }
        return edges[i].get(j);
    }

    public boolean hasEdge(int i, int j) {
        return edges[i].get(j) != null;
    }

    /**
     * Return a List of the neighbors of vertex i.
     */
    public ArrayList<Integer> neighbors(int i) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int j = 0; j < size(); j++) {
            if (hasEdge(i, j)) {
                result.add(j);
            }
        }
        return result;
    }


    public int size() {
        return edges.length;
    }

    public static void main(String[] args) {
        Graph g = new Graph(2);
        g.addUndirectedEdge(0, 0, "Integer");
        System.out.println(g.depthFirstTraverse(0));
        System.out.println(g.breadthFirstTraverse(0));
    }
}
