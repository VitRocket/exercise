package draw;

/**
 * Created by VitRocket on 22.05.2018.
 */
public class Triangle {

    public static void main(String[] args) {

        drawTriangle(5);
        drawTriangle(3);

    }

    /**
     * Вывести треугольник из звездочек в консоли
     *
     * @param line количество строк
     */
    private static void drawTriangle(int line) {
        System.out.println("===============================");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                if (j < line - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("Х");
                }
            }
            System.out.println();
        }
        System.out.println("===============================");
        System.out.println("===============================");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line * 2; j++) {
                if (j >= (line) - i - 1 & j <= (line) + i) {
                    System.out.print("X");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("===============================");
    }
}
