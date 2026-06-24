class Solution {
    public int minimumRecolors(String blocks, int k) { // O(n) O(1)

        int whites = 0;
        // First window
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W')
                whites++;
        }
        int ans = whites;

        // Slide the window
        for (int i = k; i < blocks.length(); i++) {

            // Remove left
            if (blocks.charAt(i - k) == 'W')
                whites--;

            // Add new 
            if (blocks.charAt(i) == 'W')
                whites++;

            ans = Math.min(ans, whites);
        }

        return ans;
    }
}