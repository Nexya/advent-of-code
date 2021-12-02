import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2{
    public static void main(String[] args) throws FileNotFoundException {
        int depth = 0;
        int horizontal = 0;

        File file = new File("2021\\day2\\input.txt");
        Scanner scanner = new Scanner(file);  
        
        while(scanner.hasNextLine()){
            String number = scanner.nextLine();
            depth += calcDepth(number);
            horizontal += calcHorizontal(number);
        }

        System.out.println("Total depth: " + depth);
        System.out.println("Total movement forward: " + horizontal);
        System.out.println("Muliplied: " + depth*horizontal);
    }

    public static int calcDepth(String move){
        int depth = 0;
        int number = Integer.parseInt(move.substring(move.length()-1).trim());

        if(move.contains("down")){
            depth += number;
        } else if(move.contains("up")){
            depth -= number;
        }
        return depth;
    }

    public static int calcHorizontal(String move){
        int horizontal = 0;
        int number = Integer.parseInt(move.substring(move.length()-1).trim());

        if(move.contains("forward")){
            horizontal += number;
        }
        return horizontal;
    }
}