package com.lyy.dsa.queue;

import com.sun.org.apache.bcel.internal.generic.RET;

/**
 * 数组实现循环队列
 */
public class CircleQueue {
    private Object[] items;
    private int size;

    private int head = 0;
    private int tail = 0;

    public CircleQueue(int size) {
        items = new Object[size];
        this.size = size;
        this.head = 0;
        this.tail = 0;
    }

    //入队
    public boolean enqueue(Object o) {
        //判断队列是否满
        if ((tail + 1) % size == head) {
            return false;
        }

        items[tail] = o;

        tail = (tail + 1) % size;
        return true;
    }

    //出队
    public Object dequeue() {
        //1、判断是否为空
        if (tail == head) {
            return null;
        }

        Object res = items[head];
        head = (head + 1) % size;
        return res;
    }
}