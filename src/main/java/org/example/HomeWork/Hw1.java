package org.example.HomeWork;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class Hw1 {
    public static void main(String[] args) {
        //Вывести список на экран в перевернутом виде (без массивов и ArrayList)

        // 1-ый способ
        StringBuilder list = new StringBuilder("1234");
        System.out.println("list = " + list);
        System.out.println("Reverse List = " + list.reverse());

        // 2-ой способ
        String list1 = "1234";
        String reverseList1 = "";
        for (int i = list1.length() - 1; i >= 0; i--) {
            reverseList1 += list1.charAt(i);
        }
        System.out.println("Reverse list1 = " + reverseList1);

        // 3-ой способ
        Stack<Character> stack = new Stack<>();
        String reverseList2 = "";
        for (Character character : list1.toCharArray()) {
            stack.add(character);
        }
        while (!stack.isEmpty()) {
            reverseList2 += stack.pop();
        }
        System.out.println("Reverse List2 = " + reverseList2);

    }
}
