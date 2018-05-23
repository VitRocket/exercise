package draw;

/**
 * 111111
 * 222222
 * 333333
 * 444444
 */
public class Rectangle02 {

    public static void main(String[] args) {
        drawRectangle(4, 6);
    }

    private static void drawRectangle(int height, int width) {
        System.out.println("===============================");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
        System.out.println("===============================");
    }

}


