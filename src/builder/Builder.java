import java.util.Scanner;

public class Builder {

    public static void main(String[] args) {
        String input,input2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Enter: Java is fun!");
        input = keyboard.nextLine();
        StringBuilder builder = new StringBuilder(input);
       System.out.println("The capacity is: " + builder.capacity()); 
        builder.append(" I love it!");
        System.out.println("Please Enter: Yes,");
        input2 = keyboard.nextLine();
        builder.insert(input.length()," "+ input2);
        System.out.println(builder);
       
        
    
    }
    
}
