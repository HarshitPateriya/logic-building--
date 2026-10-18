class Solution {
    public String replaceDigits(String s) {
        char[] ch=s.toCharArray();
        for(int i=1;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                ch[i]=(char)(ch[i-1]+(ch[i]-'0'));
            }
        }
        return new String(ch);

        
    }
}