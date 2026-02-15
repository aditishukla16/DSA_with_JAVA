package Arrays;

import java.util.ArrayList;

public class basicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);//initialise
        arr.add(1,20);
        arr.add(2,80);
        arr.add(3,30);
        arr.add(4,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr);

        arr.set(2,600);//modify
    System.out.println(arr);

    arr.add(98); //push back
    System.out.println(arr.size());
    System.out.println(arr);
    }

}
