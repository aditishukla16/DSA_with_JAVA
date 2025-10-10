package Types_Of_Java_Methods.Takes_Input_but_No_Output;

public class Example2 {
    void displaySum(int a, int b){
        int sum = a + b;
        System.out.println("Sum is:" + sum);

    }

    public static void main(String[] args){
        Example2 obj = new Example2();
        obj.displaySum(10, 20);

    }
    
}

/* ----------Syntax--------
void methodName(dataType parameter1, dataType parameter2, ...) {
    // logic using parameters
}
object.methodName(value1, value2, ...);


 */