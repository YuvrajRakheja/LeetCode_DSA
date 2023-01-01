class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
    if (words.length != pattern.length()) {
      return false;
    }
    HashMap< Character, String> map = new HashMap< Character, String>();
    HashMap<String,Boolean> used = new HashMap< String, Boolean>();

    for (int i = 0; i < pattern.length(); i++) {
      char c = pattern.charAt(i);
      if (map.containsKey(c) == false) {
        if
        (used.containsKey(words[i]) == true) {
          return false;
        }
        else {
          used.put(words[i], true);
          map.put(c, words[i]);
        }
      }
      else {
        String
        mwith = map.get(c);
        if (mwith.equals(words[i]) == false) {
          return false;
        }
      }
    }
    return true;
  }
}