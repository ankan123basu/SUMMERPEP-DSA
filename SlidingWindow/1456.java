class Solution {

    public int maxVowels(String s, int k) { // O(n) O(1)

        int vowels = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i)))
                vowels++;
        }

        int maxVowels = vowels;

        // Slide the window
        for (int i = k; i < s.length(); i++) {

            // Remove left character
            if (isVowel(s.charAt(i - k)))
                vowels--;

            // Add new character
            if (isVowel(s.charAt(i)))
                vowels++;

            maxVowels = Math.max(maxVowels, vowels);
        }

        return maxVowels;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' ||
               ch == 'i' || ch == 'o' ||
               ch == 'u';
    }
}