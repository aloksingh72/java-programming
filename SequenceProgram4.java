public class SequenceProgram4 {
    public static void main(String[] args) {
        double i =1;
        double p=4;
        double sum =0;
        while(i<=100){
            sum = sum +Math.pow(i, p);
            i++;
        }
        System.out.println("the sum of given seq. is "+sum);
    }
    
}
