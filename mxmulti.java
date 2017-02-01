
public class mxmulti {
    public static void main(String args[]) {

        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] mm;

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

        System.out.println("MUL - ");
        if (m1[0].length == m2.length) {
            mm = new int[m1.length][m2[0].length];
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m2[0].length; j++) {
                    for (int k = 0; k < m2.length; k++) {
                        mm[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }
        } else {
            mm = null;
        }

        for (int i = 0; i < mm.length; i++) {
            for (int j = 0; j < mm[0].length; j++) {
                System.out.print(mm[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
