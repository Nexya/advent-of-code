import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2{

    public static int aim = 0;
    public static int depth = 0;
    public static int horizontal= 0;

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("2021\\day2\\input.txt");
        Scanner scanner = new Scanner(file);  
        
        while(scanner.hasNextLine()){
            String number = scanner.nextLine();
            
            if(!number.contains("forward")){
                calcAim(number);
            } else{
                calcHorizontal(number);
            }
            
        }

        System.out.println("Total depth: " + depth);
        System.out.println("Total movement forward: " + horizontal);
        System.out.println("Muliplied: " + depth*horizontal);
        scanner.close();
    }

    public static void calcAim(String move){
        int number = Integer.parseInt(move.substring(move.length()-1).trim());

        if(move.contains("down")){
            aim += number;
        } else if(move.contains("up")){
            aim -= number;
        }
    }

    public static void calcHorizontal(String move){
        int number = Integer.parseInt(move.substring(move.length()-1).trim());

        horizontal += number;
        depth += (aim*number);
        
    }
}