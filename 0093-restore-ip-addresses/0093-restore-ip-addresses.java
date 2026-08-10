class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        backtrack(s, 0, 0, new StringBuilder(), ans);
        return ans;
    }

    private void backtrack(String s, int index, int parts,
                           StringBuilder temp, List<String> ans) {
        if (parts == 4) {
            if (index == s.length()) {
                ans.add(temp.substring(0, temp.length() - 1));
            }
            return;
        }

        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String part = s.substring(index, index + len);

            if (part.length() > 1 && part.charAt(0) == '0') break;
            if (Integer.parseInt(part) > 255) break;

            int oldLength = temp.length();
            temp.append(part).append('.');

            backtrack(s, index + len, parts + 1, temp, ans);

            temp.setLength(oldLength);
        }
    }
}