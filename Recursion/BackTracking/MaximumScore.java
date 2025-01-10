


public class MaximumScore {

    public static void main(String[] args) {
        String[] words = {"dog", "cat", "dad", "good"};
        char[] letters = {'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'};
        int[] score = {1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] letterFrequency = new int[26];
        for (char ch : letters) {
            letterFrequency[ch - 'a']++;
        }
        int ans = maxScore(words, letterFrequency, score, 0);
        System.out.println(ans);
    }

    static int maxScore(String[] words, int[] letters, int[] score, int idx) {
        // Here we have two choices include the word or not including the word
        if (idx == words.length) {
            return 0;
        }
        // not including the word;
        int sno = maxScore(words, letters, score, idx + 1);
        String word = words[idx];
        int sword = 0; // score of words
        boolean flag = true;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (letters[ch - 'a'] == 0) {
                flag = false;
            }
            letters[ch - 'a']--;
            sword += score[ch - 'a'];
        }
        int syes = 0;
        if (flag) {
            syes = sword + maxScore(words, letters, score, idx + 1);
        }
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            letters[ch - 'a']++;
        }
        return Math.max(syes, sno);
    }

}
