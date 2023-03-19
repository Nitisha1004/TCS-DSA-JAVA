import java.util.*;
public class Small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, size1=1;
        System.out.println("Enter the size of array:");
        size = sc.nextInt();
        int [] Array = new int[size];
          for(int i= 0; i<size; i++)
          {
            Array[i] = sc.nextInt();
          }
      for(int i = 0; i<size; i++)
      {
        for(int j = i+1 ; j<size; j++)
        {
            int temp =0;
            if(Array[i]>Array[j])
            {
                temp = Array[i];
                Array[i] = Array[j];
                Array[j] = temp;
        }
       
    }
}
System.out.println("Array after sorting:");
for(int i =0; i<size; i++){
    System.out.println(Array[i]);
}
for(int i =0; i<size;i++){
    if(Array[i]==size1){
        size1++;

    }
   }

   System.out.println("Missing element in array:");
   System.out.print("\n" +size1);
}
}


    

