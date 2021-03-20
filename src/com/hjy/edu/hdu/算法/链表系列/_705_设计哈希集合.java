package com.hjy.edu.hdu.算法.链表系列;

import java.util.ArrayList;

public class _705_设计哈希集合 {

    //用 ArrayList 实现 hashset的部分功能

    ArrayList<Integer> set = new ArrayList<Integer>();
    /** Initialize your data structure here. */

    public void add(int key) {
        if (set.contains(key) == false){
            set.add(key);
        }
    }

    public void remove(int key) {
        for (int i = 0; i < set.size(); i++){
            if (set.get(i) == key){
                set.remove(i);
            }
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return set.contains(key);
    }

    public static void main(String[] args) {
        _705_设计哈希集合 myHashSet = new _705_设计哈希集合();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(4);
        myHashSet.remove(1);
        System.out.println(myHashSet.set);
        System.out.println(myHashSet.contains(4));
        System.out.println(myHashSet.contains(2));
    }
}
