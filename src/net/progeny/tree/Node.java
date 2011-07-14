package net.progeny.tree;

public class Node {
  private Node leftNode;
  private Node rightNode;
  private int value;

  public Node(int value) {
    leftNode = null;
    rightNode = null;
    this.value = value;
  }

  public void setLeftNode(Node node){
    this.leftNode = node; 
  }
  public void setRightNode(Node node){
    this.rightNode = node; 
  }
  public void setValue(int value){
    this.value = value;
  }

  public Node getLeftNode() {
    return leftNode;
  }
  public Node getRightNode() {
    return rightNode;
  }
  public int getValue() {
    return value;
  }

  @Override
    public String toString() {
      String result = value + "";
      if (leftNode  != null) result = leftNode.toString() + "-" + result;
      if (rightNode != null) result = result + "-" + rightNode.toString();
      return result;
    }
}
