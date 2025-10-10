package Types_Of_Java_Methods.No_Input_return_Output;

public class Example1 {
    int getLuckynumber() {
        return 16;
    }
    public static void main(String[] args){
        Example1 obj  = new Example1();
        int num = obj.getLuckynumber();
        System.out.println("Your lucky number is : "+ num);
    }
    
}

// Syntax

// returnType methodName() {
//     // some logic
//     return value;
// }
// returnType variable = object.methodName();


