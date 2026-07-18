class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char br = s.charAt(i);
            if(br=='(' || br=='{' || br=='['){
                stack.push(br);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    char top = stack.pop();
                    if(top == '[' && br==']' || top == '{' && br=='}' || top == '(' && br==')'){
                        continue;
                    }else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
