package net.progeny.tree;

import net.progeny.tree.Node;

public class Tree {
  private Node rootNode;

  public void insertValue(int value) {
    insertNode(new Node(value));
  }

  public void insertNode(Node newNode){
    if (rootNode == null) {
      rootNode = new Node(newNode.getValue());
    } else {
      insertNode(rootNode, newNode);
    }
  }

  public boolean containsValue(int value){
    if (getNode(rootNode, value) == null) {
      return false;
    }
    return true;
  }

  public Node getNode(Node currentNode, int value){
    if (currentNode == null)
      return null;
    if (currentNode.getValue() == value)
      return currentNode;
    if (value < currentNode.getValue())
      return getNode(currentNode.getLeftNode(), value);
    return getNode(currentNode.getRightNode(), value);
  }

  private void insertNode(Node currentNode, Node newNode) {
    if (newNode.getValue() < currentNode.getValue()) {
      if (currentNode.getLeftNode() == null)
        currentNode.setLeftNode(newNode);
      else
        insertNode(currentNode.getLeftNode(), newNode);
    }
    if (newNode.getValue() > currentNode.getValue()) {
      if (currentNode.getRightNode() == null)
        currentNode.setRightNode(newNode);
      else
        insertNode(currentNode.getRightNode(), newNode);
    }
  }

  @Override
    public String toString(){
      if (rootNode != null){
        return rootNode.toString();
      }
      return "";
    }
}
