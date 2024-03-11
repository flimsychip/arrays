public class Array_2D_SingleDataType_AllieYoung {
    public static void main(String[] args) {
        char[][] abc = {
                {'A', 'B', 'C', 'D', 'E', 'F', 'G'},
                {' ', ' ', ' ', 'H', 'I', 'J', 'K'},
                {' ', ' ', 'L', 'M', 'N', 'O', 'P'},
                {' ', ' ', ' ', ' ', 'Q', 'R', 'S'},
                {' ', ' ', ' ', ' ', 'T', 'U', 'V'},
                {' ', ' ', ' ', ' ', ' ', 'W', 'X'},
                {' ', ' ', ' ', ' ', ' ', 'Y', 'Z'}
        };
        char[][] abcJagged = new char[7][];
        abcJagged[0] = new char[7];
        abcJagged[1] = new char[4];
        abcJagged[2] = new char[5];
        abcJagged[3] = new char[3];
        abcJagged[4] = new char[3];
        abcJagged[5] = new char[2];
        abcJagged[6] = new char[2];
        abcJagged[0][0] = 'A';
        abcJagged[0][1] = 'B';
        abcJagged[0][2] = 'C';
        abcJagged[0][3] = 'D';
        abcJagged[0][4] = 'E';
        abcJagged[0][5] = 'F';
        abcJagged[0][6] = 'G';
        abcJagged[1][0] = 'H';
        abcJagged[1][1] = 'I';
        abcJagged[1][2] = 'J';
        abcJagged[1][3] = 'K';
        abcJagged[2][0] = 'L';
        abcJagged[2][1] = 'M';
        abcJagged[2][2] = 'N';
        abcJagged[2][3] = 'O';
        abcJagged[2][4] = 'P';
        abcJagged[3][0] = 'Q';
        abcJagged[3][1] = 'R';
        abcJagged[3][2] = 'S';
        abcJagged[4][0] = 'T';
        abcJagged[4][1] = 'U';
        abcJagged[4][2] = 'V';
        abcJagged[5][0] = 'W';
        abcJagged[5][1] = 'X';
        abcJagged[6][0] = 'Y';
        abcJagged[6][1] = 'Z';
        printArray(abc);
        printArray(abcJagged);
    }

    static void printArray(char[][] arr) {
        System.out.println("Displaying contents in any 2D arrays:");
        for(int i = 0; i < arr.length; i++) {
            //spaces before each line (before H, before L, etc)
            System.out.print(" ".repeat((7-arr[i].length)*4));
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}