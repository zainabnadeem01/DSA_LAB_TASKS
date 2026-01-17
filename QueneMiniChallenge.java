package week8_queue;

import java.util.LinkedList;
import java.util.Queue;

class QueueMiniChallenge {

    static class MyQueue {
        private Queue<Integer> q;

        public MyQueue() {
            q = new LinkedList<>();
        }

        // Enqueue
        public void enqueue(int val) {
            q.add(val);
        }

        // Dequeue
        public int dequeue() {
            if (!q.isEmpty())
                return q.poll();
            return -1; // empty queue
        }

        // Check if empty
        public boolean isEmpty() {
            return q.isEmpty();
        }

        // 1️⃣ Find Maximum Element
        public int findMax() {
            int max = Integer.MIN_VALUE;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int val = dequeue();
                if (val > max) max = val;
                enqueue(val); // restore queue
            }
            return max;
        }

        // 2️⃣ Find Sum of All Elements
        public int findSum() {
            int sum = 0;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int val = dequeue();
                sum += val;
                enqueue(val); // restore queue
            }
            return sum;
        }

        // 3️⃣ Count Elements Without Using Size Variable
        public int countElements() {
            int count = 0;
            Queue<Integer> temp = new LinkedList<>(q); // copy
            while (!temp.isEmpty()) {
                temp.poll(); // remove from temp, not original
                count++;
            }
            return count;
        }


        // Print Queue
        public void printQueue() {
            System.out.println(q);
        }
    }

    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.enqueue(10);
        mq.enqueue(5);
        mq.enqueue(20);
        mq.enqueue(15);

        System.out.print("Queue: ");
        mq.printQueue();

        System.out.println("Max Element: " + mq.findMax());
        System.out.println("Sum of Elements: " + mq.findSum());
        System.out.println("Count of Elements: " + mq.countElements());

        System.out.print("Queue after operations: ");
        mq.printQueue(); // queue restored
    }
}

