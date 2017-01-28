
public class mxmulti {
    public static void main(String args[]) {

        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] mm = new int[3][3];

        System.out.println("Matrix 1 - ");
        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[row].length; col++) {
                m1[row][col] = (int) Math.round(Math.random() * 10);
                m2[row][col] = (int) Math.round(Math.random() * 10);
                System.out.print(m1[row][col] + "   ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2 - ");
        for (int row = 0; row < m2.length; row++) {
            for (int col = 0; col < m2[row].length; col++) {
                System.out.print(m2[row][col] + "   ");
            }
            System.out.println();
        }

        System.out.println("SUM - ");
        for (int row = 0; row < mm.length; row++) {
            for (int col = 0; col < mm[row].length; col++) {
                mm[row][col] = m1[row][col] + m2[row][col];
                System.out.print(mm[row][col] + "   ");
            }
            System.out.println();
        }
    }
}
