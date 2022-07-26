package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 0 ; i < cathetusLength; i++) {
            for (int j = cathetusLength + 1; j > 0; j--) {
                if (cathetusLength - j  < cathetusLength - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
            for (int j = 2; j <= cathetusLength; j++) {
                if (j > i + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
