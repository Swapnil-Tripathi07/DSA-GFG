class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] map = new int[26];

        // Create mapping
        for (int i = 0; i < order.length(); i++) {
            map[order.charAt(i) - 'a'] = i;
        }

        // Compare adjacent words
        for (int i = 0; i < words.length - 1; i++) {
            if (!inOrder(words[i], words[i + 1], map)) {
                return false;
            }
        }

        return true;
    }

    private boolean inOrder(String w1, String w2, int[] map) {
        int len = Math.min(w1.length(), w2.length());

        for (int i = 0; i < len; i++) {
            char c1 = w1.charAt(i);
            char c2 = w2.charAt(i);

            if (c1 != c2) {
                return map[c1 - 'a'] < map[c2 - 'a'];
            }
        }

        // Edge case
        return w1.length() <= w2.length();
    }
}