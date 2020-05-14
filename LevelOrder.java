/**
102. Binary Tree Level Order Traversal
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
**/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        if(root == null)return list;
        
        int level =0;
        q.add(root);
        while(!q.isEmpty()){
            list.add(new ArrayList<>());
            int size = q.size();
            for(int i =0; i < size; i++){
                TreeNode node = q.poll();
                list.get(level).add(node.val);
                
                if(node.left != null)q.add(node.left);
                if(node.right != null)q.add(node.right);
            }
            level++;
        }
        return list;
    }
}