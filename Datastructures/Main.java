public class Main {

    public static <Stack> void main(String[] args, Object capacity) {
        Stack myStack = new Stack(capacity:10);
        myStack.push(item:0);
        myStack.push(item:45);
        myStack.push(item:96);
        myStack.push(item:68);
        myStack.push(item:80);
        myStack.pop(item:0);
        myStack.pop(item:0);
        myStack.printStack();
    }
}
