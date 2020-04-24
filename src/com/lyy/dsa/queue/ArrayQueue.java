package com.lyy.dsa.queue;

import java.util.Objects;

/**
 * 数组实现的队列
 */
public class ArrayQueue {
    private Object[] items;
    private int size;

    private int head;
    private int tail;

    //初始化队列
    public ArrayQueue(int size) {
        items = new Object[size];
        this.size = size;
        this.head = 0;
        this.tail = 0;
    }

    //入队操作
    public boolean enqueue(Object o) {
        if (tail == size) {
            if (head == 0) {
                return false;
            }

            //搬移数据
            for (int i = head; i < size; i++) {
                items[i - head] = items[i];
            }

            //数据搬移后更新head与tail
            head = 0;
            tail = tail - head;
        }

        items[tail++] = o;
        return true;
    }

    //出队操作
    public Object dequeue() {
        if (tail == head) {
            return false;
        }
        return items[head++];
    }
}