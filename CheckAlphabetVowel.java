import java.util.Scanner;

public class CheckAlphabetVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // String[] vowel = {"a","e","i","o","u"};
        System.out.println("Enter the alphabet");
        char alpha = sc.next().toLowerCase().charAt(0);
        // string containing all the vowel
        String vowels = "aeiou";
        // check karega that ki vowels ke andar jo aap ne character enter kiya hai woh hai ki nahi 
        // using the contains method
        boolean isVowel = vowels.contains(Character.toString(alpha));
        
        String result = alpha + (isVowel? " is a vowel":" is not a vowel");
        System.out.println(result);
        
    }
    
}
