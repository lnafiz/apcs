/**
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
  BST()
  {
    _root = null;
  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );
    if (_root == null){
      _root = newNode;
    }
    else{
      insert(_root, newNode);
    }
  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode ){
    if(stRoot.getValue() > newNode.getValue()){
      if(stRoot.getLeft() == null){
        stRoot.setLeft(newNode);
      } //2nd if
      else{
        insert(stRoot.getLeft(), newNode);
      } //1st else
    } //1st if
    else{
      if(stRoot.getRight() == null){
        stRoot.setRight(newNode);
      } //3rd if
      else{
          insert(stRoot.getRight(), newNode);
      } //3rd else
    } //2nd else
  }//end insert()




  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
  {
    System.out.println(currNode.getValue() + " ");

    if (currNode.getLeft() != null){
      preOrderTrav(currNode.getLeft());
    }

    if (currNode.getRight() != null){
      preOrderTrav(currNode.getRight());
    }
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    inOrderTrav(_root);
  }
  public void inOrderTrav( TreeNode currNode )
  {
    if (currNode.getLeft() != null){
      preOrderTrav(currNode.getLeft());
    }

    System.out.println(currNode.getValue() + " ");

    if (currNode.getRight() != null){
      preOrderTrav(currNode.getRight());
    }
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    postOrderTrav(_root);
  }
  public void postOrderTrav( TreeNode currNode )
  {
    if (currNode.getLeft() != null){
      preOrderTrav(currNode.getLeft());
    }

    if (currNode.getRight() != null){
      preOrderTrav(currNode.getRight());
    }

    System.out.println(currNode.getValue() + " ");
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  /*****************************************************
       * TreeNode search(int)
       * returns pointer to node containing target,
       * or null if target not found
       *****************************************************/
      TreeNode search( int target )
      {
      	return searchHelper (target, _root);
      }

      TreeNode searchHelper(int target, TreeNode st){
        if (st == null){
          return null;
        } // case 1
        else if (st.getValue() == target){
          return st;
        } // case 2
        else {
          if(st.getValue() < target){
            return searchHelper(target, st.getRight());
          }
          else {
            return searchHelper(target, st.getLeft());
          }
        } // case 3
      }

      /*****************************************************
       * int height()
       * returns height of this tree (length of longest leaf-to-root path)
       * eg: a 1-node tree has height 1
       *****************************************************/
      public int height()
      {
      	return heightHelper(_root);
      }

      public int heightHelper (TreeNode st){
        if (st == null){
          return 0;
        } // case 1
        else{
          return Math.max(heightHelper(st.getLeft()), heightHelper(st.getRight())) + 1; // a stroke of genius that resulted in time saved
        } // case 2
      }

      /*****************************************************
       * int numLeaves()
       * returns number of leaves in tree
       *****************************************************/
      public int numLeaves()
      {
      	return numLeavesHelper(_root);
      }

      public int numLeavesHelper(TreeNode st){
        if (st == null){
          return 0;
        } // case 1
        else if (st.getLeft() == null && st.getRight() == null){
          return 1;
        } // case 2
        else {
          return numLeavesHelper(st.getLeft()) + numLeavesHelper(st.getRight());
        }
      }

  //main method for testing
  public static void main( String[] args )
  {

      BST arbol = new BST();

      //PROTIP: sketch state of tree after each insertion
      //        ...BEFORE executing these.
      arbol.insert( 4 );
      arbol.insert( 2 );
      arbol.insert( 5 );
      arbol.insert( 6 );
      arbol.insert( 1 );
      arbol.insert( 3 );
/*
      4        4       4         4               4                 4
             /       /  \      /  \            /  \              /  \        *SKETCHED TREES*
           2       2     5    2    5          2    5           2     5
                                    \       /      \         /  \     \
                                     6     1        6       1   3      6
*/
      System.out.println( "\n-----------------------------");
      System.out.println( "pre-order traversal:" );
      arbol.preOrderTrav();

      System.out.println( "\n-----------------------------");
      System.out.println( "in-order traversal:" );
      arbol.inOrderTrav();

      System.out.println( "\n-----------------------------");
      System.out.println( "post-order traversal:" );
      arbol.postOrderTrav();

      System.out.println( "\n-----------------------------");

      BST mamba = new BST();

      mamba.insert(8); // first jersey #
      mamba.insert(24); // second jersey #
      mamba.insert(5); // championships won
      mamba.insert(20); // years in the NBA

/*
            8       8         8           8
                     \      /  \        /  \        *SKETCHED TREES*
                     24   5    24     5    24
                                           /
                                          20
*/
      System.out.println( "\n-----------------------------");
      System.out.println("Find second jersey #:   " + mamba.search(24)); // should print location of node with 24
      System.out.println("Find third jersey #:   " + mamba.search(17)); // should print null

      System.out.println( "\n-----------------------------");
      System.out.println("Find mamba tree height:   " + mamba.height()); // should print 3

      System.out.println( "\n-----------------------------");
      System.out.println("Find # of mamba tree leaves:   " + mamba.numLeaves()); // should print 2
      /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class
