package org.mashurova;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        Random random = new Random();
        List<Integer> list = random.ints(10, 1, 10)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .boxed()
                .toList();
        System.out.println("Task 1:\n"+list);
    }

    public static void task2() {
        List<String> strings = Arrays.asList("APPLE", "ORANGE", "KIWI", "BANANA", "LIME");
        //List<String> strings = Arrays.asList("Apple","Orange","Kiwi","banana","Lime");
        boolean bool1 = strings.stream().anyMatch(s -> s.startsWith("A"));
        System.out.println("Task 2:\nThis list content fruit with prefix \"A\": " + bool1);
        boolean bool2 = strings.stream().allMatch(s -> s.startsWith(s.toUpperCase()));
        System.out.println("This list content fruit with only upper prefix : " + bool2);
    }

    public static void task3() {
        List<String> name = Arrays.asList("Iven", "Dario", "Margaret", "Tobias");
        String nameCollect = name.stream().collect(Collectors.joining(","));
        System.out.println("Task 3:\n"+nameCollect);
    }

    public static void task4() {
        List<Integer> numbers = Arrays.stream(IntStream.rangeClosed(0, 10).toArray())
                .takeWhile(n -> (n<5))
                .boxed()
                .toList();
        System.out.println("Task 4:\n"+numbers);
    }
}
