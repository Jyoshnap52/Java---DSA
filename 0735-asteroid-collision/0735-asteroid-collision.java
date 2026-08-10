class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            int num = asteroids[i];
            boolean destroyed = false;

            while (!stack.isEmpty() && stack.peek() > 0 && num < 0 && !destroyed) {
                if (Math.abs(stack.peek()) < Math.abs(num)) {
                    stack.pop();

                } else if (Math.abs(stack.peek()) == Math.abs(num)) {
                    stack.pop();
                    destroyed = true;
                } else if (Math.abs(stack.peek()) > Math.abs(num)) {
                    destroyed = true;
                }

            }
            if (!destroyed) {
                stack.push(num);
            }

        }

        int[] arr = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            arr[i] = stack.pop();
            i++;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;

    }
}