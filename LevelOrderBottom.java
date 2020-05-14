/**
107. Binary Tree Level Order Traversal II
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]

*/


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
class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l;
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        ArrayDeque<List<Integer>> stack = new ArrayDeque<>();
        int level = 0;
        if(root == null){
            return list;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            l = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                l.add(node.val);
                if(node.left != null)q.offer(node.left);
                if(node.right != null)q.offer(node.right);
            }
            stack.push(l);
            level++;
        }
        for(List<Integer> l2: stack){
            list.add(l2);
        }
        return list;
    }
}