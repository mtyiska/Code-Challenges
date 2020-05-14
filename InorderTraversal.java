/**
94. Binary Tree Inorder Traversal
Given a binary tree, return the inorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
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
 
class InorderTraversal {
    List<Integer> list = new ArrayList<>();
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     if(root == null){
    //         return list;
    //     }
    //     inorderTraversal(root.left);
    //     list.add(root.val);
    //     inorderTraversal(root.right);
    //     return list;
    // }
    
     public List<Integer> inorderTraversal(TreeNode root) {
         ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        if(root == null){
            return list;
        }
         
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            list.add(node.val);
            root = node.right;
        }
         return list;
    }
}