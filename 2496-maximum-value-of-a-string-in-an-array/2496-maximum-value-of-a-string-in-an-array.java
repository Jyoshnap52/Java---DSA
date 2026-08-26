class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;

        for (String s : strs) {
            boolean digit = true;

            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    digit = false;
                    break;
                }
            }

            int value = digit ? Integer.parseInt(s) : s.length();
            max = Math.max(max, value);
        }

        return max;
    }
}