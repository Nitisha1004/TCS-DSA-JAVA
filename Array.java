import java.util.ArrayList;
import java.util.Arrays;
public class Array {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(42, 24, 39, 41, 53, 67)); 
        for(int j=0; j<=list.size(); j++){
            System.out.println("Iteration using for loop ");
            System.out.println(list.get(j) + " ");
        }
        int i=0;
        while(i<=list.size()){
            System.out.println("Iteration using for while loop ");
            System.out.println(list.get(i) + " ");
            i++;

        }

    }
    
}
