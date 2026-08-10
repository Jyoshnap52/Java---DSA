class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, "", map, ans);
        return ans;
    }

    private void backtrack(String digits, int index, String temp,
                           String[] map, List<String> ans) {
        if (index == digits.length()) {
            ans.add(temp);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {
            backtrack(digits, index + 1, temp + c, map, ans);
        }
    }
}