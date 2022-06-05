package main.ds.tree;

public class Tree{


    private TreeNode root;

    private TreeNode createTree( TreeNode current,int data ){

        if ( current==null ) {
            return new TreeNode( data );
        }

        if ( data<=current.data ) {
            current.left=createTree( current.left,data );
        } else
            if ( data>=current.data ) {
                current.right=createTree( current.right,data );
            } else {
                return current;
            }

        return current;
    }

    public void binarySearchTree( int data ){
        root=createTree( root,data );
    }

    public void traverseInOrder( TreeNode node ){
        if ( node!=null ) {
            traverseInOrder( node.left );
            visit( node );
            traverseInOrder( node.right );
        }
    }

    private void visit( TreeNode node ){
        System.out.print( " "+node.data );
    }

    public void traversePreOrder( TreeNode node ){
        if ( node!=null ) {
            visit( node );
            traversePreOrder( node.left );
            traversePreOrder( node.right );
        }
    }

    public void traversePostOrder( TreeNode node ){
        if ( node!=null ) {
            traversePostOrder( node.left );
            traversePostOrder( node.right );
            visit( node );
        }
    }
}
