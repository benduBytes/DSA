package Tree;
import java.util.*;


/*
class Solution {
	
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);
 
        while (!Q.isEmpty()) {
            int n = Q.size();
            List<Integer> subResult = new ArrayList<>();
            for (int index = 0; index < n; index++) {
                TreeNode currNode = Q.poll();
                subResult.add(currNode.val);
 
                if (currNode.left != null) {
                    Q.add(currNode.left);
                }
                if (currNode.right != null) {
                    Q.add(currNode.right);
                }
            }
            result.add(subResult);
        }
        return result;
    }
}
*/
public class LevelOrder {
	public static void main(String[] args) {
		
	}
}
