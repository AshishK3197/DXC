public class java3{

 public static void main(String[] args) {
     
    String str = "AshishKumar";
    String str2 = "ashishkumar";
    char a1 = 'A';
    char a2 = 'a';
    String data = "Hello";
    char oldchar = 'l';
    char newchar = 'k';
    System.out.println("The given string is: " + hasupper(str) + " " + hasnumber(str) + " " + iscapsonly(str) + " " + countCaps(str) + " " + isEqual(str,str2) + " "+isEqual1(a1, a2) + " " + Replace(data, oldchar, newchar)+ " " + Replace1(data, newchar,oldchar));
 }

 public static boolean hasupper(String str){
    for(int i=0; i<str.length(); i++){
        char c = str.charAt(i);
        if(c >= 97 && c <= 122) {
            return true;
        }
    }
    return false;
 }

 public static boolean hasnumber(String str){
     for(int i=0;i<str.length();i++){
         char c=str.charAt(i);
         if(c>=48   && c<= 57){
             return true;
         }
     } 
     return false;
 }

 public static boolean iscapsonly(String str){
     for(int i=0;i<str.length();i++){
         char c=str.charAt(i);
         if(c>=65  && c<=91){
             return true;
            }
     }
     return false;    
 }

 public  static int countCaps(String str){
     int upper=0;
     for (int i=0;i<str.length();i++){
         char c=str.charAt(i);
         if (c >= 'A' && c <= 'Z'){
                upper++; 
         }    
     }
     System.out.println("No of upper case chars are: " + upper);
     return 0;
    }

 public static boolean isEqual(String str,String str2){
        int i;
        char c;
        char j;
        for (i=0;i<str.length(); i++) {
            c = str.charAt(i);
            j = str2.charAt(i);
            if(c>=65 && c<=90) {
                c+=32;
            }

            if(j>=65 && j<=90) {
                j+=32;
            }

            if (c!=j) {
                return false;
            }else {
                return true;
            }

        }
        return false;    
    }
 public static boolean isEqual1(char a1, char a2){

        if(a1>=65 && a1<=90) {
            a1+=32;
        }
        if(a2>=65 && a2<=90) {
            a2+=32;
        }

        if(a1!=a2) {
            return false;
        }
        else {
            return true;
        }


    }

 public static String Replace(String data,char oldchar,char newchar){
     char[] c= data.toCharArray();
     for (int i=0; i<=c.length;i++){
         if(c[i]==oldchar)
            c[i]=newchar;      
        }
        String s=new String(c);
        return s;
    }

    public static String Replace1(String data,char newchar,char oldchar){
        char[] c= data.toCharArray();
        for (int i=0; i<=c.length; i++) {
            if(c[i]==oldchar)
               c[i]=newchar;
               break;      
           }
           String s=new String(c);
           return s;
       }
}
