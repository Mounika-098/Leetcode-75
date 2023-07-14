class Solution {
    public String mergeAlternately(String word1, String word2) {
       int len_word1 = word1.length();
       int len_word2 = word2.length();
       int i=0,j=0;
       String answer = new String();
       while(i<len_word1 || j<len_word2)
       {
           if(i<len_word1)
           {
               answer +=word1.charAt(i++);
           }
           if(j<len_word2)
           {
              answer+=word2.charAt(j++);
           }
       }
       return answer; 
    }
}