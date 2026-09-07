class Solution {

    public String encode(List<String> strs) {
      StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
         List<String> result = new ArrayList<>();
         int i=0;
         while(i< str.length()) {
            int index = str.indexOf("#",i);
           
            int length = Integer.parseInt(str.substring(i,index));
             i = index+1;
            result.add(str.substring(i,i+length));

          // Move pointer past the extracted string
            i += length;
         }
         return result;
    }
}
