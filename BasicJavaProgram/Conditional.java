public class Conditional {
    public static void main(String[] args){
        // Home work  ques1
        // int x= 10;
        // int y= 5;
        // int z = (x>y) ? (x<15?x:y) : (x>5 ? y:x);
        // System.out.println(z);
        // -------------
        // ques2
        // int x = 10;
        // System.out.println(x>10 ?"A": (x<10 ? "B":"c"));
        // -----------
        //ques4
        // int a = 5;
        // int b = 10;
        // int c = (a>b) ? b++ : (a<b)? --b : b;
        // System.out.println(c);
        // --------
        // ques 6
        int x = 5;
        int y = 7;
         int z= 3;
         int result = (x>y)?(y<z)?x:y:(x>z) ? x:z;
         System.out.println(result);


    }
    
}
