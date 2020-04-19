class myBinarySearchTreeNode
{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;
    
  myBinarySearchTreeNode(int inValue)
  {
    myBinarySearchTreeNode instance = new myBinarySearchTreeNode(inValue);

  }
  
  myBinarySearchTreeNode(int[] A)
  {
    // creates a new Binary Search Tree rooted at the first value in the array
    /// by inserting elements into the tree in the order they are given in A.
    myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A);
    myValue = A[0];
    left = null;
    right = null;
    for(int i = 1;i< A.length - 1; i++)
      insert(A[i]);

  }
  
  public void insert(int inValue){
    // This method takes a new integer as input and decides 
    // if it should be place: 
    //    * as the left child,
    //    * as the right child, 
    //    * in the left subtree,
    //    * or in the right subtree.
    // If the value already exists in the tree, no action is taken.
    if (inValue != myValue)
    {
      if (inValue < myValue)
      {
        if(left == null)
        {
          left = new myBinarySearchTreeNode(inValue);
        }
        else
        {
          left.insert(inValue);
        }
      }
      else if (inValue > myValue)
        {
          if (right == null)
          {
            right = new myBinarySearchTreeNode(inValue);
          }
          else
          {
            right.insert(inValue);
          }
        }
      }
    else if(inValue == myValue)
    {
      System.out.print("Sorry, " + inValue + " could not be added since it already exist.");
    }
    
  }
  
  public int height()
  {
     // This method recursively calculates the height of the entire (sub)tree.
     // This method will take O(n)
    int leftHeight = 0;
    int rightHeight = 0;

    if ( left != null)
    {

     leftHeight = left.height();
    }

    if (right != null)
    {
      rightHeight = right.height();
    }

     if (leftHeight > rightHeight)
     {
       return leftHeight +1;
     }

     if (leftHeight <= rightHeight)
     {
       return rightHeight +1;
     }
     else return 0;
  }
  
  public int depth(int search)
  {
     // This method recursively calculates the depth of a given search value. 
     // If the given value is not in the tree, this method returns -1. 
     // Note that if the tree is a proper BST, this method should complete in O(log n) time.
     // Additionally, remember that the depth is the number of nodes on the path from a node to the root 
     // (i.e. the number of the recursie calls).
    if ( search < myValue)
    {
      if (left != null)
      {
        return left.depth(search) +1;
      }
      else
      {
        return -1;
      }
    }
   else if (search > myValue)
    {
      if (right != null)
      {
        return right.depth(search) +1;
      }
      else
      {
        return -1;
      }
    }
   else if ( search == myValue)
   {
     return 0;
   }
   else
   {
      return -1;
   }
  }

  public int size ()
  {
    // This method recursively calculates the number of nodes in the (sub)tree.
    int sum = 1;

    if (right != null )
    {
      sum = sum + right.size();
    }

    if (left != null)
    {
      sum = sum + right.size();
    }
    return sum;
  }
  
  // Utility function included so you can debug your solution. 
  public void print() { print(""); }
  private void print(String prefix)
  {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }
  
} 
