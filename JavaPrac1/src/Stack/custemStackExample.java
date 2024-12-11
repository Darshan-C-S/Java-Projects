package Stack;

public class custemStackExample{
    public static void main(String[] args) {

        CustomStack customStack = new CustomStack(15);

        customStack.push(1);;
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);

        System.out.println("Peeked element at the top : "+customStack.peek());

        System.out.println("Poped Element : "+customStack.pop());

        customStack.push(5);
        System.out.println("Peeked element after push : "+customStack.peek());

        System.out.println(customStack.isEmpty());



        
    }
}
