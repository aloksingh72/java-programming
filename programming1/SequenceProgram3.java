public class SequenceProgram3 {
    public static void main(String[] args) {
        double i=1;
        double p=3;
        double sum =0;
        while(i<=100){
            sum = sum+ Math.pow(i,p);
            i++;
        }
        System.out.println("the cube of sequence " +sum);
    }
    
}
