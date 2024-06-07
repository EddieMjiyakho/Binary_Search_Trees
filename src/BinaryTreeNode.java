// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman
// class creates binary node with data of the class account left and right instance varialble which are off the binaryTreeNode class
public class BinaryTreeNode
{
  
   account data; // account data typ
   BinaryTreeNode left;//binary node data type left of node
   BinaryTreeNode right;////binary node data type right of node

   
   public BinaryTreeNode ( account d, BinaryTreeNode l, BinaryTreeNode r )
   {
      /*
         intialises the instance variables during object creation 
      */
      data = d;
      left = l;
      right = r;
   }
   
   BinaryTreeNode getLeft () { return left; }// return left 
   BinaryTreeNode getRight () { return right; }// return right.
}
