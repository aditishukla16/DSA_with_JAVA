package Types_Of_Java_Methods.No_Input_No_Output;

public class Menu {
    void showMenu() {
        System.out.println("===============MEN============================");
        System.out.println("1. Start");
        System.out.println("2. Settings");
        System.out.println("3. Exit");
        System.out.println("==============================");
    }

    public static void main(String[] args){
        Menu obj = new Menu();
        obj.showMenu();
    }
    
}
