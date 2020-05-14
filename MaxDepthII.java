/**
559. Maximum Depth of N-ary Tree
Given a n-ary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.


**/


/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class MaxDepth {
    public int maxDepth(Node root) {
        int depth = 0;
        ArrayDeque<Node> q = new ArrayDeque<>();
        if(root == null){
            return 0;
        }
        
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 0; i< size; i++){
                Node node = q.poll();
                if(node.children.size() > 0){
                    int cSize = node.children.size();
                    for(Node n: node.children){
                        q.add(n);
                    }
                }
                
            }
            depth ++;
        }
        return depth;
    }
}