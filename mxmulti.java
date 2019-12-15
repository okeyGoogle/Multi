
public class mxmulti {
    public static void main(String[] args) {
     
     // =============Создание масивов=======================   
        int[][]mat1 = new int[3][3];
        int[][]mat2 = new int[3][3];
        int[][]matRes = new int[3][3];
     // ====================================================
     
     
 
   
   
// =============Инициализация массива и доступ к его элементам и отрисовка 1 и 2 матрицы=======================
        System.out.println("Mat1:");
        for (int i = 0; i < mat1.length; i++) {
            mat1[i] = new int[3];
            mat2[i] = new int[3];
            matRes[i] = new int[3];
            for (int j = 0; j < mat1.length; j++) {
                mat1[i][j] = (int) (Math.random()*10);
                mat2[i][j] = (int) (Math.random()*10);
                        System.out.print(mat1[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Mat3:");
        for (int i = 0; i < mat2.length; i++) {
             for (int j = 0; j < mat2.length; j++) {
                System.out.print(mat2[i][j]+"  "); 
                }
                System.out.println();
             }        
 // ====================================================        
        
// ===========Перемножение матриц===================
        for (int i = 0; i < mat1.length; i++) {
             for (int j = 0; j < mat2[i].length; j++) {
                 for (int l = 0; l < mat2.length; l++) {
            matRes [i][j] += mat1[i][l]*mat2[l][j];
                }
            }
        }
// ====================================================

// ===========Вывод результата==========
        
          System.out.println("MatRes:");
        for (int i = 0; i < matRes.length; i++) {
             for (int j = 0; j < matRes.length; j++) {
                System.out.print(matRes[i][j]+"  "); 
                }
                System.out.println();
             }        
// ====================================================
        }
    }
