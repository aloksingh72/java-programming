public class SequenceProgram2 {
    public static void main(String[] args) {
        int i=1;
        double p =2;
        double sum =0;

        while (i<=100) {
            sum=sum+(Math.pow(i,p));
            i++;
            
        }
        System.out.println("the of square sequence is " +sum);
    }
    
}
