class Solution {
    public int smallestNumber(int n) {
        int x = 1;

        while (x < n) {
            x = (x << 1) | 1;  // Shift left and add a set bit
        }

        return x;
    }
}
