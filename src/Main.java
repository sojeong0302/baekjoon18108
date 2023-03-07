import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int y;

        Scanner sc = new Scanner(System.in);
        y=sc.nextInt();

        if((y>=1000)&&(y<=3000))
        {
            System.out.println(y-543);

        }else{
            System.out.println("다시 입력 바람");
        }

    }
}