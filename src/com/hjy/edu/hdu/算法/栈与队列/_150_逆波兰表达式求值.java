package com.hjy.edu.hdu.算法.栈与队列;

import java.util.Stack;

/**
 * 逆波兰表达式：
 *
 * 逆波兰表达式是一种后缀表达式，所谓后缀就是指算符写在后面。
 *
 * 平常使用的算式则是一种中缀表达式，如 ( 1 + 2 ) * ( 3 + 4 ) 。
 * 该算式的逆波兰表达式写法为 ( ( 1 2 + ) ( 3 4 + ) * ) 。
 * 逆波兰表达式主要有以下两个优点：
 *
 * 去掉括号后表达式无歧义，上式即便写成 1 2 + 3 4 + * 也可以依据次序计算出正确结果。
 * 适合用栈操作运算：遇到数字则入栈；遇到算符则取出栈顶两个数字进行计算，并将结果压入栈中。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/evaluate-reverse-polish-notation
 */
/**
 *  boolean                  isEmpty() // 判断当前栈是否为空
 *  synchronized E              peek() //获得当前栈顶元素                      等效方法：peekFirst()
 *  synchronized E              pop() //获得当前栈顶元素并删除             等效方法：removeFirst()
 *  E                       push(E object) //将元素加入栈顶             等效方法： addFirst(e)
 *  synchronized int            search(Object o)  //查找元素在栈中的位置，由栈低向栈顶方向数
 *  offer(e)                          offer(e)/offerLast(e)  //进队列，将元素加入队列末尾
 *  poll()                              poll()/pollFirst()  //获取队列头的元素并移除
 *  链接：https://blog.csdn.net/cxfjava/article/details/87635983
 */

public class _150_逆波兰表达式求值 {
    public int evalRPN(String[] tokens) {
        int len = tokens.length;
        Stack<Integer> nums = new Stack<>();
        if (tokens.length == 0){
            return 0;
        }
        for (int i = 0; i < len; i++){
            if ("+".equals(tokens[i])){
                // 弹出两个， 然后计算结果压回去栈里
                int a = nums.pop();
                int b = nums.pop();
                nums.push(a + b);
            } else if ("-".equals(tokens[i])){
                int a = nums.pop();
                int b = nums.pop();
                nums.push(b - a);
            } else if ("*".equals(tokens[i])){
                int a = nums.pop();
                int b = nums.pop();
                nums.push(a * b);
            } else if ("/".equals(tokens[i])){
                // 后弹出除先弹出！
                int a = nums.pop();
                int b = nums.pop();
                nums.push(b / a);
            } else {
                nums.push(Integer.valueOf(tokens[i]));
            }
        }

        return nums.peek();
    }
}














