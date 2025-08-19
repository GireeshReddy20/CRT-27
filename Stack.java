public class Stack {
    private int[] stack=new int[10];
    private int top=-1;
    public void push(int value) {
        if (top==stack.length - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            stack[++top]=value;
        }

        public int pop() {
            if (top==-1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return stack[top--];
        }

        public int peek() {
            if (top==-1) {
                System.out.println("Stack is empty");
                return -1;
            }
            return stack[top];
        }
        public static void main(String[] args) {
            Stack s=new Stack();
            s.push(7);
            s.push(11);
            System.out.println(s.peek());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
        }

    }


