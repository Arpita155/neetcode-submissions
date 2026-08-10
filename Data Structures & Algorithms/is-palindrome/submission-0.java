class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            // Skip non-alphanumeric characters from the left
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } 
            // Skip non-alphanumeric characters from the right
            else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } 
            // Compare characters after converting both to lowercase
            else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false; // Characters mismatch
                }
                left++;
                right--;
            }
        }

        return true;
    }
}
