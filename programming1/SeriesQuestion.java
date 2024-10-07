public class SeriesQuestion {

    public static void seqProg5() {
        int i = 1;
        double sum = 0;
        while (i <= 99) {
            sum = sum + (i * (i + 1));
            i++;
        }
        System.out.println("the sum is " + sum);

    };

    public static void seqProg6() {
        int i = 1;
        double sum = 0;
        while (i <= 99) {
            sum = sum + (i * (i+1)*(i + 1));
            i++;

        }
        System.out.println("the sum is " + sum);
    }


    public static void seqProg7(){
        int i = 1;
        double sum =0;
        while(i<=99){
            sum = sum +(i*i* (i+1));
            i++;
        }
        System.out.println("the sum is " + sum);

    }
    public static void seqProg8(){
        int i= 1;
        double sum =0;
        while(i<=100){
            sum = sum +(1.0/i);
            i++;

        }
        System.out.println("the sum is " + sum);
    }
    public static void seqProg9(){
        int i= 1;
        double sum =0;
        while(i<=100){
            sum = sum +(1.0/i*i);
            i++;

        }
        System.out.println("the sum is " + sum);
    }
    public static void seqProg10(){
        int i = 1;
        double sum = 0;
        while(i<=100){
            if (i%2==0){
                sum =sum -i;
            }
            else{
                sum =sum +i;
            }
            i++;
        }
        System.out.println("the sum is " + sum);
    }
    public static void seqProg11(){
        int i =1;
        double sum = 0;
        while(i<=99){
            sum =sum +(1.0/(i*(i+1)));
            i++;
        }
        System.out.println("the sum is " + sum);
    }

    public static void main(String[] args) {
        //seqProg5();
       // seqProg6();
        //seqProg7();
        //seqProg8();
        //seqProg9();
        //seqProg10();
        seqProg11();

    }

}
