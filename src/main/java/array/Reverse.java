package array;

import java.util.function.Consumer;

public class Reverse {

    public static void main(String[] args) {
        System.out.println("Hello!");
        Consumer<String[]> print = getConsumerPrinter();

        String[] numbers = {"one", "two", "three", "four", "five", "six"};
        //System.out.println(Arrays.asList(numbers));
        print.accept(numbers);

        reverseNumbers(numbers);
        System.out.println();
        print.accept(numbers);
    }

    private static void reverseNumbers(String[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            String temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
    }

    private static Consumer<String[]> getConsumerPrinter() {
        return x -> {
            int count = 0;
            System.out.print("[");
            for (String s : x) {
                System.out.print(s);
                if (count < x.length - 1) {
                    System.out.print(", ");
                }
                count++;
            }
            System.out.print("]");
        };
    }
}
