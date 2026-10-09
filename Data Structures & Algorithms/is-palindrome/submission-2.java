class Solution {
    public boolean isPalindrome(String s) {
    int leftPointer = 0;
    int rightPointer = s.length()-1;
   while(leftPointer<rightPointer){
            

            if(leftPointer < rightPointer && !alphaNum(s.charAt(leftPointer))){
                leftPointer++;
                continue;
            }
            if(rightPointer > leftPointer && !alphaNum(s.charAt(rightPointer))){
                rightPointer--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(leftPointer)) != Character.toLowerCase(s.charAt(rightPointer))){
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
