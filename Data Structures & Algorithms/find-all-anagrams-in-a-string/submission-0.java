class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] need=new int[26],window=new int[26];
        for(char c:p.toCharArray())need[c-'a']++;
        List<Integer> answer=new ArrayList<>();
        for(int i=0;i<s.length();i++){window[s.charAt(i)-'a']++;
        if(i>=p.length())window[s.charAt(i-p.length())-'a']--;
        if(i+1>=p.length()&&Arrays.equals(need,window))answer.add(i+1-p.length());
        }
        
        return answer;
    }
}
