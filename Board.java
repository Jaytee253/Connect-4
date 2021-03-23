public class Board {

    public boolean[] columnStatus = new boolean[7];
    public char[] column = new char[7];
    public boolean[] rowStatus = new boolean [6];
    public char[] row = new char[6];

    public static void setBoard(boolean[] columnStatus, char[] column, boolean[] rowStatus, char[] row){
        for (int i = 0; i < 8; i++){
            columnStatus[i] = true;
        }

        for (int i = 0; i < 7; i++){
            rowStatus[i] = true;
        }

        for (int i = 0; i < 8; i++){
            column[i] = ' ';
        }

        for (int i = 0; i < 7; i++){
            row[i] = ' ';
        }
    }
    

    public static void createRow(char[] column){
        for (int i = 0; i < 8; i++){
            System.out.print(column[i] + "|");
        }
    }

    public static void createBoard(char[] columnMarkers){
        
    }

}
