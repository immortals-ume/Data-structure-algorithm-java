# Data Structure : Tree

1. BST - Binary Search Tree | Time Complexity is directly proportional to Height Of tree

   Tree consist of key and satellite data , in addition to previous values it also consists of left, right , parent
   which points to respective left child and right child and its parent.
   If child or parent is missing , the appropriate attributes contains the value as NULL.
   The root node is only node whose parent is NIL

Representation of BST : refer TreeNode.java

BST-property

    let x be a node in BST , if y is a node in the left subtree of x then y.key <= x.key,
    if y is a node in the right subtree of x then y.key >= x.key.

Traversing a BST using DEPTH FIRST SEARCH

    Depth First Search (DFS) algorithm traverses a graph in a depth ward motion and uses a stack to remember
    to get the next vertex to start a search, when a dead end occurs in any iteration.
    
    There are three ways in which we can perform Depth first Search on a BST.

      a. Inorder Tree Walk : left subtree  -> parent node -> Right Subtree
      b. Preorder Tree Walk : parent node -> left subtree -> right subtree
      c. Postorder Tree Walk : left subtree -> right subtree -> parent node

    |Space complexity: O(n)
    |Time Complexity : The time complexity is O(n) because the recursive function is
    T(n) = 2T(n/2)+1T(n)=2T(n/2)+1.

Traversing a BST using BREADTH FIRST SEARCH

     Breadth-first search (BFS) is an algorithm for searching a tree data structure for a node that satisfies
     a given property.It starts at the tree root and explores all nodes at the present depth prior to moving
     on to the nodes at the next depth level.

Querying a BST

a. Searching an element in BST

    Given a pointer to the root of the tree and a key ,
    tree search returns pointer to a node with a Key k if one exists otherwise returns NIL
    
    |Time Complexity : The time complexity is O(h)  where h is height of the tree

b. Finding a MIN and MAX of BST

    Minimum Value In BST - find an element such a way in BST , whose key is minimum by following
    all the left child pointers until it reaches NIL
    
    Maximum Value In BST  - find an element such a way in BST , whose key is maximum by following 
    all the right child pointers until it reaches NIL
   
    |Time Complexity : The time complexity is O(h)  where h is height of the tree

c. finding a successor or predecessor in BST
d. Insertion in BST
e. deletion in BST
f. create a tree from given traversal array . Inorder , postorder, preorder Traversal
