package com.lyy.dsa.array;

public class ArrayStack {

    private String[] items; //存放栈元素
    private int cnt;        //当前栈存放元素的个数
    private int size;      // 栈空间大小

    //初始化栈
    public ArrayStack(int size) {
        items = new String[size];
        this.size = size;
        this.cnt = 0;
    }

    //入栈操作
    public boolean push(String item) {
        if (cnt >= size) {
            return false;
        } else {
            items[cnt++] = item;
        }
        return true;
    }

    //出栈操作
    public String pop() {
        String res = null;
        if (cnt <= 0) {
            return null;
        } else {
            res = items[cnt - 1];
            items[--cnt] = null;
        }
        return res;
    }
}