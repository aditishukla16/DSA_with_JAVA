package Types_Of_Java_Methods.No_Input_No_Output;

import java.time.LocalDateTime;
public class TimeDisplay {
    void showDateTime() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date & Time:"+ now);
    }
    public static void main(String[] args) {
        TimeDisplay obj = new TimeDisplay();
        obj.showDateTime();
    }

    
}
