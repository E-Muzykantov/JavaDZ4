package org.example.HomeWork;


import java.util.Stack;

public class Hw2 {
    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(isValid(s));
    }

    /**
     * @apiNote Проверка валдиности закрытия скобок
     * @param s входящая строка
     * @return Строка валидна или нет
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (Character c : s.toCharArray()) {
            if (!stack.isEmpty() && c == ')' && stack.peek() == '(') {
                stack.pop();
            }
            else if (!stack.isEmpty() && c == ']' && stack.peek() == '[') {
                stack.pop();
            }
            else if (!stack.isEmpty() && c == '}' && stack.peek() == '{') {
                stack.pop();
            }
            else stack.push(c);
        }
        return stack.isEmpty();
    }
}