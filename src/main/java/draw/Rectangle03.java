package draw;

/**
 * 123456
 * 123456
 * 123456
 * 123456
 */
public class Rectangle03 {

    public static void main(String[] args) {
        drawRectangle(4, 6);
    }

    private static void drawRectangle(int height, int width) {
        System.out.println("===============================");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
        System.out.println("===============================");
    }

}


