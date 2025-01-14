// tc: O(nl)
// sc: O(nl)


class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        HashSet<String> built = new HashSet();
        String res = "";
        for (String w : words) {
            if (w.length() == 1 || built.contains(w.substring(0, w.length() - 1))) {
                res = w.length() > res.length() ? w : res;
                built.add(w);
            }
        }
        return res;
    }
}