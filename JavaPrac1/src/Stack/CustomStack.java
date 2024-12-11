package Stack;

 class CustomStack {
    private int[] arr;
    private int capacity ;
    private int top;

    public CustomStack(int size){
        arr = new int[size];
        capacity = size-1;
        top = -1;
    }

    public void push(int x){
        if(top == capacity-1){
            System.out.println("The stack is over flow");
            return;
        }
        arr[++top] = x;
    }

    public int pop(){
        if(top == -1){
            System.out.println("The stack is under flow");
            return -1;
        }
       return arr[top--] ;
    }

    public int peek(){
        if(top == -1){
            System.out.println("The stack is under flow");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }


}
