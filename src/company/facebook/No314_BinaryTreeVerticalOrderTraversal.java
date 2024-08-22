package company.facebook;

import java.util.*;

class No314_BinaryTreeVerticalOrderTraversal {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        //3 -> (0,0)
        //9 -> (-1, -1)
        //20 -> (1, -1)
        //15 -> (0, -2)
        // 7 -> (2, -2)
        //         x                   y            [val,...]
        //0    0   3
        //    -2   15
        //-1  -1   9
        // 1  -1   20

        SortedMap<Integer, SortedMap<Integer, Integer>> map = new TreeMap<>();
        int x = 0, y = 0;
        if (root == null) return new ArrayList<>();

        SortedMap<Integer, Integer> subMap = new TreeMap<>();
        subMap.put(y, root.val);
        map.put(x, subMap);

        helper(root.left, map, x - 1, y - 1);
        helper(root.right, map, x + 1, y - 1);
        List<List<Integer>> res = new ArrayList<>();
        for (Map.Entry<Integer, SortedMap<Integer, Integer>> entry : map.entrySet()) {
            SortedMap<Integer, Integer> valueMap = entry.getValue().reversed();
            List<Integer> innerList = new ArrayList<>();
            for (Map.Entry<Integer, Integer> subMapEntry : valueMap.entrySet()) {
                innerList.add(subMapEntry.getValue());
            }
            res.add(innerList);
        }
        return res;
    }

    public void helper(TreeNode root, SortedMap map, int x, int y) {
        if (root == null) return;
        SortedMap<Integer, Integer> subMap = new TreeMap<>();
        subMap.put(y, root.val);
        map.put(x, subMap);

        helper(root.left, map, x - 1, y - 1);
        helper(root.right, map, x + 1, y - 1);
    }
}
