package graphimpelentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

    private double[][] edges;

    public Graph(int vertices) {
        edges = new double[vertices][vertices];
    }

    public void addEdge(int i, int j) {
        edges[i][j] = 1;
    }

    public void addUndirectedEdge(int i, int j) {
        edges[i][j] = 1;
        edges[j][i] = 1;
    }

    public double getEdge(int i, int j) {
        return edges[i][j];
    }

    public void setEdge(int i, int j, double weight) {
        edges[i][j] = weight;
    }

    public int size() {
        return edges.length;
    }

    public boolean hasEdge(int i, int j) {
        return edges[i][j] != 0.0;
    }

    public void addUndirectedEdgeWithWeight(int i, int j, double wieght) {
        edges[i][j] = wieght;
        edges[j][i] = wieght;
    }

    public ArrayList<Integer> neightbors(int i) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int j = 0; j < size(); j++) {
            if (hasEdge(i, j)) {
                result.add(j);
            }
        }
        return result;
    }

    public ArrayList<Integer> breadthFirstTraverse(int source) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[size()];
        Queue<Integer> q = new LinkedList<Integer>();
        visited[source] = true;
        q.offer(source);

        while (!(q.isEmpty())) {
            int vertex = q.poll();
            result.add(vertex);
            ArrayList<Integer> arrNodes = neightbors(vertex);
            for (int i = 0; i < arrNodes.size(); i++) {
                int k = arrNodes.get(i);
                if (!visited[i]) {
                    visited[i] = true;
                    q.offer(k);
                }
            }
        }
        return result;
    }

    public void deathFirstTraverse(int vertex, ArrayList<Integer> result) {
        Stack<Integer> visited = new Stack<Integer>();
        visited.add(vertex);

        while (result.size() != size() && !visited.isEmpty()) {
            while (result.contains(visited.peek())) {
                visited.pop();
            }
            int closedVertex = visited.pop();
            result.add(closedVertex);
            ArrayList<Integer> arrNodes = neightbors(closedVertex);
            for (int i = 0; i < arrNodes.size(); i++) {
                int k = (int) arrNodes.get(i);
                if (!result.contains(k)) {
                    visited.push(k);
                }
            }
        }
    }

    public int cheapset(double[] distances, boolean[] visited) {
        int best = -1;
        for (int i = 0; i < size(); i++) {
            if (!visited[i] && ((best < 0) || (distances[i] < distances[best]))) {
                best = i;
            }
        }
        return best;
    }

    public double[] distanceFrom(int source) {
        double[] result = new double[size()];
        Arrays.fill(result, Double.POSITIVE_INFINITY);
        result[source] = 0;
        boolean[] visited = new boolean[size()];
        for (int i = 0; i < size(); i++) {
            int vertex = cheapset(result, visited);
            visited[vertex] = true;
            for (int j = 0; j < size(); j++) {
                result[j] = Math.min(result[j], result[vertex] + getCost(vertex, j));
            }
        }
        return result;
    }

    private double getCost(int vertex, int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
