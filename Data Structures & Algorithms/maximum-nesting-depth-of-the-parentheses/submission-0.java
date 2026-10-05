class Solution {
    private int res = 0;

    public int maxDepth(String s) {
        dfs(s, 0);
        return res;
    }

    private int dfs(String s, int i) {
        if (i == s.length()) {
            return 0;
        }

        int cur = dfs(s, i + 1);
        if (s.charAt(i) == '(') {
            cur += 1;
        } else if (s.charAt(i) == ')') {
            cur -= 1;
        }

        res = Math.max(res, Math.abs(cur));
        return cur;
    }
}