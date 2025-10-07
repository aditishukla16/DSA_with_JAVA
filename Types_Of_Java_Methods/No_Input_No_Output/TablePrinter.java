package Types_Of_Java_Methods.No_Input_No_Output;

public class TablePrinter {
    void printTable() {
       int number = 5;
       System.out.println("Table of" + number);
       for(int i = 1;i<=10;i++){
        System.out.println(number + "x" + i + "=" + (number*i));

       }
    }
    public static void main(String[] args){
        TablePrinter obj = new TablePrinter();
        obj.printTable();
    }

}
