class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = paragraph.toLowerCase().replaceAll("[^a-zA-Z ]", " ").split("\\s+");
        for (String word : words) 
        {
            if (!bannedSet.contains(word)) 
            {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        String result = "";
        int maxCount = 0;
        for (String word : wordCount.keySet()) 
        {
            if (wordCount.get(word) > maxCount) 
            {
                result = word;
                maxCount = wordCount.get(word);
            } 
            else if (wordCount.get(word) == maxCount && word.compareTo(result) < 0) 
            {
                result = word;
            }
        }
        return result;
    }
}