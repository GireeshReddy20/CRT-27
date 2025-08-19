public class ArrayQueue {
        private int front, rear, capacity;
        private int[] queue;
        public ArrayQueue(int size) {
            capacity = size;
            queue = new int[capacity];
            front = 0;
            rear = 0;
        }
        public void enqueue(int item) {
            if (rear == capacity) {
                System.out.println("Queue is full. Cannot enqueue " + item);
            } else {
                queue[rear] = item;
                rear++;
                System.out.println("Enqueued: " + item);
            }
        }
        public void dequeue() {
            if (front == rear) {
                System.out.println("Queue is empty. Cannot dequeue.");
            } else {
                int removed = queue[front];
                for (int i = 0; i < rear - 1; i++) {
                    queue[i] = queue[i + 1];
                }
                rear--;
                System.out.println("Dequeued: " + removed);
            }
        }
        public void display() {
            if (front == rear) {
                System.out.println("Queue is empty.");
            } else {
                System.out.print("Queue elements: ");
                for (int i = front; i < rear; i++) {
                    System.out.print(queue[i] + " ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            ArrayQueue q = new ArrayQueue(5);
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.display();
            q.dequeue();
            q.display();
            q.enqueue(40);
            q.enqueue(50);
            q.enqueue(60);
            q.display();
            q.enqueue(70);
        }
    }


