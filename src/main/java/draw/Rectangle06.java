package draw;

/**
 * XXXXX
 * X   X
 * X   X
 * X   X
 * XXXXX
 */
public class Rectangle06 {

    public static void main(String[] args) {
        drawRectangle(5, 5);
    }

    private static void drawRectangle(int height, int width) {
        System.out.println("===============================");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 | i == height - 1 | j == 0 | j == width - 1) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("===============================");
    }

}


