// Hussein's Binary Search Tree
// 27 March 2017
// Hussein Suleman
// edited by ayanda phaketsi.

public class BinarySearchTree extends BinaryTree
{  
   // BinarySearchTree takes it instances varialble for binaryTree class
   // because it extends the binaryTree.
   // also has excess to methods to the binaryTree class.
   public void insert ( account d )
   {
      // if root is null create the given binary tree node for the give in account 
      // if root is null makes first account--(node version) to be the root
      // else calls the insert method with the account entered and node 
      
      if (root == null)
         root = new BinaryTreeNode (d, null, null);
      else
         insert (d, root);
   }
   public void insert ( account d, BinaryTreeNode node )
   {
      
      
      if (d.toString().compareTo (node.data.toString()) < 0)// checks if account name name of d is greater then the node.data.name
      {
         if (node.left == null)//  check if left node is empty
            node.left = new BinaryTreeNode (d, null, null);//create binaryTreeNode for for the account entered then inserts it to left
         else
            insert (d, node.left);// if left node is not null calls insert for the left node of the entered node.
      }
      else// if name is less then
      {
         if (node.right == null)//check if right is empty
            node.right = new BinaryTreeNode (d, null, null);//create binaryTreeNode for for the account entered then inserts it to right

         else// if right is not empty
            insert (d, node.right);// if right node is not null calls insert for the right node of the entered node.
      }
   }
   
   public BinaryTreeNode find ( account d )
   {
      if (root == null)// checks if root has not been initialiseed
         return null;//returns null
      else//if root has been initialised
         return find (d, root);//calls find method with the given account and root node.
   }
   public BinaryTreeNode find ( account d, BinaryTreeNode node )
   {
      if (d.toString().compareTo (node.data.toString()) == 0) // check if acount named is the same as that of account in the given node
         return node;//returns node
      else if (d.toString().compareTo (node.data.toString()) < 0)// if Accout name is less  
         return (node.left == null) ? null : find (d, node.left);//checks if left node is null if not null calls find  method with the given account and root node.left
      else// if Accout name is greater
         return (node.right == null) ? null : find (d, node.right);//checks if right node is null if not null calls find  method with the given account and root node.right.

   }
   
   public void delete ( account d )
   {
      root = delete (d, root);// changes value of root with new binary node
   }   
   public BinaryTreeNode delete ( account d, BinaryTreeNode node )
   {
      if (node == null) 
         return null;// if node is null turns null
      if (d.toString().compareTo (node.data.toString()) < 0)// check if acount named is less than that of account in the given node
         node.left = delete (d, node.left);//changesleft node with new node.
      else if (d.toString().compareTo (node.data.toString()) > 0)//// check if acount named is greater than that of account in the given node
         node.right = delete (d, node.right);//changes rigt node with new node.

      else if (node.left != null && node.right != null )// check both left and right values are nulll
      {
         node.data = findMin (node.right).data;//replaces acount value with account value of the minimum value under the given node. 
         node.right = removeMin (node.right);//replaces right value with new node
      }
      else
         if (node.left != null)//if left node is not null
            node = node.left; //replace node value that of in the left
         else// if left node is null
            node = node.right;//insert right node in node.
      return node; //return the new node
   }
   
   public BinaryTreeNode findMin ( BinaryTreeNode node )
   {
      if (node != null)// checks if node is null 
         while (node.left != null) // While node is not null
            node = node.left; // gets left value of the given node
      return node;//return the node at left bottom of the tree.
   }

   public BinaryTreeNode removeMin ( BinaryTreeNode node )
   {
      if (node == null)// checks if node is null
         return null;// return null if node is node
      else if (node.left != null)//checks if left node value if not null
      {
         node.left = removeMin (node.left);//calls the removemin method with left node.left and node.left if equated to the next node value until the last left is made null 
         return node;//returns new node;
      }
      else// there is no left value
         // meaning the entered node is the smalles value
         return node.right;//returns the next node in the right.
   }
   
}