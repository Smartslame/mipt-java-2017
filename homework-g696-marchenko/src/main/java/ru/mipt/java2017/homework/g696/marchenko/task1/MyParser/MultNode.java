package ru.mipt.java2017.homework.g696.marchenko.task1.MyParser;

public class MultNode extends MyExpression {

  private MyExpression leftNode;
  private MyExpression rightNode;

  MultNode(MyExpression left, MyExpression right) {
    leftNode = left;
    rightNode = right;
  }

  @Override
  public double count() {
    return leftNode.count() * rightNode.count();
  }
}
