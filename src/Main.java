import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //System.out.printf("Input Number 1000"); - print
        //Scanner in = new Scanner(System.in);
        //int ind = in.nextInt(); - input
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int start = 1;
        int xday = 1;
        if (year <= 0) {
            System.exit(0);
        }

        while (start <= year) {
            boolean isLeap = (start % 4 == 0 && start % 100 != 0) || start % 400 == 0;
            if(isLeap){
                if(xday == 1) xday = 6;
                else if(xday == 2) xday = 7;
                else xday-=2;
                start++;
                continue;
            }
            else if(xday == 1){
                xday = 7;
                start++;
                continue;
            }
            xday--;
            start++;
        }
        System.out.println(xday);


    }
}