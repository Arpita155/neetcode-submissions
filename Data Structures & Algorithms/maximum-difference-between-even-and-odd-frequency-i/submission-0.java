class Solution {
    public int maxDifference(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int res = Integer.MIN_VALUE;
        for (int odd : count) {
            if (odd == 0 || odd % 2 == 0) continue;
            for (int even : count) {
                if (even == 0 || even % 2 == 1) continue;
                res = Math.max(res, odd - even);
            }
        }
        return res;
    }
}