package Types_Of_Java_Methods.Takes_Input_gives_Output;

public class Calculator {
    int add(int a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int result = obj.add(10,25);
        System.out.println("Sum is:" + result);
    }
    
}

/* -------------Syntax-----------------
returnType methodName(dataType parameter1, dataType parameter2) {
    // logic using parameters
    return value;
}
dataType variable = object.methodName(value1, value2);


 */
