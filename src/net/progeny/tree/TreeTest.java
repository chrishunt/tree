package net.progeny.tree;

import net.progeny.tree.Tree;

public class TreeTest {
  public static void main(String[] args) {
    Tree myTree = new Tree();
    myTree.insertValue(10);
    myTree.insertValue(11);
    myTree.insertValue(9);
    myTree.insertValue(20);
    myTree.insertValue(15);
    System.out.println(myTree.toString());
    System.out.println(myTree.containsValue(10));
    System.exit(0);
  }
}
