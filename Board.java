import java.util.Arrays;
public class Board {

    public static boolean[] columnStatus = new boolean[7];
    public static char[] column = new char[7];
    public static boolean[] rowStatus = new boolean [6];
    public static char[] row = new char[6];

    public static void setBoard(boolean[] columnStatus, char[] column, boolean[] rowStatus, char[] row){
        for (int i = 0; i < 7; i++){
            columnStatus[i] = true;
        }

        for (int i = 0; i < 6; i++){
            rowStatus[i] = true;
        }

        for (int i = 0; i < 7; i++){
            column[i] = ' ';
        }

        for (int i = 0; i < 6; i++){
            row[i] = ' ';
        }
    }
    

    public static void createRow(char[] column){
        for (int i = 0; i < 7; i++){
            System.out.print(" " + column[i] + "|");
        }
    }

    public static void createBoard(){
        for (int i = 1; i < 7; i++){
            createRow(column);
            System.out.println(i);
        }
    }

}
