public class White {
        public static void main(String[] args) {         
            String str1="Remove white spaces";  
            System.out.println("String before removing all the white spaces : " + str1);             
            str1 = str1.replaceAll("\\s+", "");          
            System.out.println("String after removing all the white spaces : " + str1);    
        }    
    }    
    

