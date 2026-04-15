import java.util.Scanner;

public class StringLogic1 {
    public static void main(String[] args) {
                    /*     Input:
                           aB3cD1e2
                           Output:
                           312aceBD    */
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        StringBuilder digits = new StringBuilder();
        StringBuilder lower = new StringBuilder();
        StringBuilder caps =  new StringBuilder();

        for(char ch : name.toCharArray()){

            if(Character.isDigit(ch)){
                digits.append(ch);
            }else if(Character.isLowerCase(ch)){
                lower.append(ch);
            }else {
                caps.append(ch);
            }
        }
        System.out.println(digits.toString()+lower.toString()+caps.toString());
    }
}
