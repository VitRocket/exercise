package draw;

/**
 * XXXXXX
 * XXXXXX
 * XXXXXX
 * XXXXXX
 * Created by VitRocket on 22.05.2018.
 */
public class Rectangle01 {

    public static void main(String[] args) {
        drawRectangle(4, 6);
    }

    private static void drawRectangle(int height, int width) {
        System.out.println("===============================");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
        System.out.println("===============================");
    }

}


