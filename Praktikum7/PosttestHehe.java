package Praktikum7;

import java.util.*;

public class PosttestHehe {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] data = { 2, 4, 6, 8, 10 };

        for (int num : data) {
            if (stack.isEmpty() || num < stack.peek()) {
                stack.push(num);
            }
        }

        System.out.println("Stack : ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
