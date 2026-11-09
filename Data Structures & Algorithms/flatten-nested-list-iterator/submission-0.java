class NestedIterator {
    private Deque<NestedInteger> stack=new ArrayDeque<>();
    public NestedIterator(List<NestedInteger> nestedList){
        for(int i=nestedList.size()-1;i>=0;i--)stack.push(nestedList.get(i));
        }
    public boolean hasNext(){
        while(!stack.isEmpty()&&!stack.peek().isInteger()){
            List<NestedInteger> row=stack.pop().getList();
            for(int i=row.size()-1;i>=0;i--)stack.push(row.get(i));
            }
            return !stack.isEmpty();}
    public Integer next(){
        hasNext();return stack.pop().getInteger();
    }
}