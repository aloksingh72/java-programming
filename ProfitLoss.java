import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the cost price:-");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price:-");
        int sp = sc.nextInt();

        if(sp>cp){
            int profit = sp -cp;
            double profitPercent = (profit *100)/cp;
            System.out.println("the profit percentage is: " + profitPercent);

        }
        else if(cp>sp){
            int loss = cp-sp;
            double lossPercent = (loss *100)/cp;
            System.out.println("the loss percentage is: " + lossPercent);
        }
        else{
            System.out.println("Neither profit nor loss");
        }

        sc.close();
    }
    
}
