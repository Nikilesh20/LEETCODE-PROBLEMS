class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < words.length) 
        {
            int lineLen = words[i].length();
            int j = i + 1;
            while (j < words.length && lineLen + 1 + words[j].length() <= maxWidth) 
            {
                lineLen += 1 + words[j].length(); 
                j++;
            }
            int spaces = maxWidth - (lineLen - (j - i - 1)); 
            int gaps = j - i - 1;
            StringBuilder sb = new StringBuilder(words[i]);
            if (j == words.length || gaps == 0) 
            {
                for (int k = i + 1; k < j; k++) 
                {
                    sb.append(" ").append(words[k]);
                }
                while (sb.length() < maxWidth) sb.append(" ");
            } 
            else 
            {
                int spacePerGap = spaces / gaps;
                int extra = spaces % gaps;
                for (int k = i + 1; k < j; k++) 
                {
                    int spaceToApply = spacePerGap + (extra-- > 0 ? 1 : 0);
                    for (int s = 0; s < spaceToApply; s++) sb.append(" ");
                    sb.append(words[k]);
                }
            }
            result.add(sb.toString());
            i = j;
        }
        return result;
    }
}