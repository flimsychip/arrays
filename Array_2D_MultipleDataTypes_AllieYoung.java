import java.util.Scanner;

public class Array_2D_MultipleDataTypes_AllieYoung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Object[][] inputDatabase = new Object[4][3];

        System.out.print("Row 1 | Please enter 3 integers:     ");
        inputDatabase[0][0] = input.nextInt();
        inputDatabase[0][1] = input.nextInt();
        inputDatabase[0][2] = input.nextInt();
        System.out.print("Row 2 | Please enter 3 characters:   ");
        inputDatabase[1][0] = input.next().charAt(0);
        inputDatabase[1][1] = input.next().charAt(0);
        inputDatabase[1][2] = input.next().charAt(0);
        System.out.print("Row 3 | Please enter 3 strings:      ");
        inputDatabase[2][0] = input.next();
        inputDatabase[2][1] = input.next();
        inputDatabase[2][2] = input.next();
        System.out.print("Row 4 | 1 int, 1 char, 1 string:     ");
        inputDatabase[3][0] = input.nextInt();
        inputDatabase[3][1] = input.next().charAt(0);
        inputDatabase[3][2] = input.next();
        System.out.println();

        printDataTypes(inputDatabase);
        System.out.println();
        printArray(inputDatabase);
    }

    static void printArray(Object[][] arr) {
        System.out.println("- Data Value View:");
        for(int i = 0; i < arr.length; i++) {
            //spaces before each row
            System.out.print(" ".repeat(15));
            for(int j = 0; j < arr[i].length; j++) {
                //so i can do .length()
                String item = arr[i][j].toString();
                System.out.print(item + " ".repeat(31 - item.length()));
            }
            System.out.println();
        }
    }

    static void printDataTypes(Object[][] arr) {
        System.out.println("- Data Type View:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(" ".repeat(15));
            for(int j = 0; j < arr[i].length; j++) {
                String type = arr[i][j].getClass().getSimpleName();
                System.out.print(type + " ".repeat(31 - type.length()));
            }
            System.out.println();
        }
    }
}
