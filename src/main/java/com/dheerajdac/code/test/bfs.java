package com.dheerajdac.code.test;

import java.util.LinkedList;

public class bfs {

    static class Graph {
        int v;
        LinkedList<Integer> adjList[];

        Graph(int v) {
            this.v = v;
            adjList = new LinkedList[this.v];

            for (int i = 0; i < this.v; i++) {
                adjList[i] = new LinkedList<>();
            }
        }
    }

    static void addEdge(Graph graph, int src, int des) {
        graph.adjList[src].addFirst(des);
        graph.adjList[des].addFirst(src);
    }

    static void print(Graph graph) {
        for (int i = 0; i < graph.v; i++) {
            System.out.print(i);
            for (Integer y : graph.adjList[i]) {
                System.out.print("-->" + y);
            }
            System.out.println("");
        }
    }

    static void traverseBfs(Graph graph, int startNode) {
        boolean visited[] = new boolean[graph.v];
        visited[startNode] = true;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(startNode);

        while (queue.size() != 0){
            startNode = queue.poll();
            System.out.print(startNode + "\t");

            for(Integer i : graph.adjList[startNode]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String args[]) {
        Graph graph = new Graph(5);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        print(graph);
        traverseBfs(graph, 0);
    }
}
