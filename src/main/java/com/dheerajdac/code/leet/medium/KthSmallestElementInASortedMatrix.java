package com.dheerajdac.code.leet.medium;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElementInASortedMatrix {

    public class Node implements Comparable<Node> {
        int val;
        int x;
        int y;

        public Node(int val, int x, int y) {
            this.val = val;
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Node o) {
            return this.val - o.val;
        }
    }

    public int kthSmallest(int[][] matrix, int k) {
        int length = matrix.length;

        PriorityQueue<Node> heap = new PriorityQueue<>();


        for (int i = 0; i < matrix.length; i++) {
            heap.add(new Node(matrix[i][0], i , 0));
        }


        int i = 1;

        while (i != k){
            Node node = heap.poll();
            if(node.y + 1  < matrix[node.x].length){
                heap.add(new Node(matrix[node.x][node.y +1], node.x, node.y +1));
            }
            i++;
        }

        return heap.poll().val;

    }


    public static void main(String[] args) {
        int[][] arr = {{1,  5,  9},{10, 11, 13},{12, 13, 15}};
        KthSmallestElementInASortedMatrix matrix = new KthSmallestElementInASortedMatrix();
        matrix.kthSmallest(arr, 8);
    }

}
