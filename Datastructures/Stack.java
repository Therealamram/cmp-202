public class Stack {
    int size;
    int top;
    int[] array;

    Stack(int capacity) {
        top = -1;
        size = capacity;
        array = new int[size];
    }

    public void printstack() {
        if (isEmpty()) {
            System.out.println(x:"stack element");
        } else {
            System.out.println(x:"stack element");
            for (int i = 0; i <= top; i++) {
                System.out.println(array[i] + "");
            }
            System.out.println();
        }
    }


    boolean isFull() {
        return (top == size - 1);
    }
