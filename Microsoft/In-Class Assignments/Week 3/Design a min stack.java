class MinStack {

ArrayList<int[]> minStack;

public MinStack() {
    minStack=new ArrayList<>();    
}

public void push(int val) {
    if(minStack.size()==0){
        minStack.add(new int[]{val,val});
    }else{
        int m= minStack.get(minStack.size()-1)[1];
        minStack.add(new int[]{val,m<val?m:val});
    }
}

public void pop() {
    minStack.remove(minStack.size()-1);
}

public int top() {
    return minStack.get(minStack.size()-1)[0];
}

public int getMin() {
    return minStack.get(minStack.size()-1)[1];
}
}
