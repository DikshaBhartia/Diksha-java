package com.company;
import java.util.*;

public class nodesBinaryTree {
        static class Node
        {
            public int data;
            public Node left, right;
        }

        static void printLeafNodes(Node root)
        {
            if (root == null)
                return;

            if (root.left == null && root.right == null)
            {
                System.out.print(root.data + " ");
                return;
            }

            if (root.left != null)
                printLeafNodes(root.left);

            if (root.right != null)
                printLeafNodes(root.right);
        }

        static Node newNode(int data)
        {
            Node temp = new Node();
            temp.data = data;
            temp.left = null;
            temp.right = null;
            return temp;
        }

        public static void main(String args[])
        {
            //take alphabet A=1,B=2,C=3...Z=26 as order of alphabets originally Node root = newNode(1);
            Node root = newNode(1);
            root.left = newNode(2);
            root.right = newNode(6);
            root.left.left = newNode(3);
            root.left.right = newNode(5);
            root.right.left = newNode(7);
            root.right.right = newNode(8);
            root.left.left.left = newNode(4);
            root.right.right.right = newNode(11);

            printLeafNodes(root);
        }
    }


