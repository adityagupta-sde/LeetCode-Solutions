class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count = new int[26];
        int left = 0;
        int best = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            count[c - 'a']++;

            while (count[c - 'a'] > 2) {
                count[s.charAt(left) - 'a']--;
                left++;
            }
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}