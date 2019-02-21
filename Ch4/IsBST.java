class IsBST {
    static boolean checkBST(TreeNode n) {
        return checkBST(n, null, null);
    }

    static boolean checkBST(TreeNode n, Integer min, Integer max) {
        if (n == null)
            return true;

        if ((min != null && n.data <= min) || (max != null && n.data > max)) {
            return false;
        }

        if (!checkBST(n.left, min, n.data) || !checkBST(n.right, n.data, max)) {
            return false;
        }
        return true;
    }
}