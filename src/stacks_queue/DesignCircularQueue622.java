package stacks_queue;

import java.util.Arrays;

public class DesignCircularQueue622 {
    int arr[];
    int front;
    int rear;
    int size;

    public DesignCircularQueue622(int k) {
        arr = new int[k];
        front = rear = size = 0;
        Arrays.fill(arr,-1);
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if(isEmpty()){
            front=rear=0;
            arr[rear]=value;
            size++;
            return true;
        }
        rear++;
        size++;
        rear=rear%arr.length;
        arr[rear]=value;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        arr[front]=-1;
        size--;
        front++;
        front=front%arr.length;
        return true;
    }

    public int Front() {
        return arr[front];
    }

    public int Rear() {
        return arr[rear];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size==arr.length;
    }
}
