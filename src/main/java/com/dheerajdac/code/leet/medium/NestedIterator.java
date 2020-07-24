package com.dheerajdac.code.leet.medium;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;


interface NestedInteger {
 
      public boolean isInteger();
 
      public Integer getInteger();
 
      public List<NestedInteger> getList();
}
 

public class NestedIterator implements Iterator<Integer> {

    private List<NestedInteger> nestedList;
    private Stack<Integer> stack;

    public NestedIterator(List<NestedInteger> nestedList) {
        this.nestedList = nestedList;
        stack = new Stack<>();
        flat(this.nestedList);
    }

    @Override
    public Integer next() {
        return stack.pop();
    }

    @Override
    public boolean hasNext() {
        return !stack.empty();
    }

    public void flat(List<NestedInteger> nestedList){
        for(int i = nestedList.size()-1; i>=0; i--){
            NestedInteger nestedInteger = nestedList.get(i);
            if(nestedInteger.isInteger()){
                stack.push(nestedInteger.getInteger());
            } else {
                flat(nestedInteger.getList());
            }
        }

    }
    
}