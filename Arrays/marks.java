package Arrays;

public class marks {
    public static void main(String[] args){
        int[] marks = {28,45,40,23,30};
        int n = marks.length;
        System.out.println("Roll no. of students with marks less than 35 : ");
        for(int i = 0; i<n; i++){
            if(marks[i]<35){
                System.out.println("Roll no :" + i);

            }

        }
    }
}
