/**
144. Binary Tree Preorder Traversal
Given a binary tree, return the preorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]
**/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PreorderTraversal {
    List<Integer> list = new ArrayList<>();
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     if(root == null){
    //         return list;
    //     }
    //     list.add(root.val);
    //     preorderTraversal(root.left);
    //     preorderTraversal(root.right);
    //     return list;
    // }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        if(root == null){
            return list;
        }
        
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right!=null){stack.push(node.right);}
            if(node.left!=null){stack.push(node.left);}
        }
        
        return list;
    }
}