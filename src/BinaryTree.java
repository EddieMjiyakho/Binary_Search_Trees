// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman
//edited By ayanda phaketsi


public class BinaryTree
{
   BinaryTreeNode root;
   
   public BinaryTree ()
   {
      // makes root null during Binarytree object creation 
      root = null;
   }

   public int getHeight ()
   {
      
      return getHeight (root);// returns height of the whole biary tree.
   }   
   public int getHeight ( BinaryTreeNode node )
   {
      if (node == null)
         return -1;
      else
      // uses recursion to count number of nodes in the binary tree.
         return 1 + Math.max (getHeight (node.getLeft ()), getHeight (node.getRight ())); //return all the 1's that were returned during recursion.then sums them up
         
   }
   
   public int getSize ()
   {  
   
      return getSize (root);//return size of the whole binary tree by getsize method with root.
   }   
   public int getSize ( BinaryTreeNode node )
   {
      if (node == null)
         return 0;
      else// uses recursion to count number of node  in the binary tree
         return 1 + getSize (node.getLeft ()) + getSize (node.getRight ());
   }
   
   public void visit ( BinaryTreeNode node )
   {
      System.out.println (node.data);// prints of the the account name of the entered binary node
   }
   
   public void preOrder ()
   {
      preOrder (root);// prints out all the nodes in the binary tree
   }
   public void preOrder ( BinaryTreeNode node )
   {
      if (node != null)
      {
      
         //uses recursion to print the binary the under a specified node X
         //by printing the node entered(X) first the every node in the left of X and the right of X. 
         visit (node);
         preOrder (node.getLeft ());
         preOrder (node.getRight ());
      }   
   }

}
