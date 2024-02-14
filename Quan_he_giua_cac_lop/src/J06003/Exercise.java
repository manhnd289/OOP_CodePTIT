package J06003;

import java.util.ArrayList;

public class Exercise {

    public static ArrayList<Student>[] arr = new ArrayList[105];
    
    public static void init(){
        for(int i = 0 ; i < 105 ; i++){
            arr[i] = new ArrayList<>();
        }
    }
    
}
