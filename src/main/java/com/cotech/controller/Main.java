package com.cotech.controller;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String param = scanner.nextLine();
        scanner.close();
        char[] params = param.toCharArray();
        Deque list = new LinkedList();
        for (int i = 0; i <param.toCharArray().length ; i++) {
            list.add(Integer.valueOf(params[i])-48);
        }
        System.out.println(list.size());
        while (list.size()>0)
            System.out.print(list.pollLast());
        System.out.println();
    }
}
