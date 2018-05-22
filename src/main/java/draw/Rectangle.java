package draw;

/**
 * Created by VitRocket on 22.05.2018.
 */
public class Rectangle {

    public static void main(String[] args) {

        drawRectangle(3, 6);
        drawRectangle(2, 2);

    }

    /**
     * Вывести прямоугольник из звездочек в консоли
     *
     * @param height высота
     * @param width  ширина
     */
    private static void drawRectangle(int height, int width) {
        System.out.println("===============================");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===============================");
    }

}


