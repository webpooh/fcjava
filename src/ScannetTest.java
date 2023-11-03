import java.util.Scanner;

public class ScannetTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("정수를 입력 하세요:");
        int num= scan.nextInt();
        System.out.println("num = " + num);

        System.out.println("실수를 입력");
        float f= scan.nextFloat();
        System.out.println("f = " + f);

        System.out.println("문자열 입력");
        String str=scan.next();
        System.out.println("str = " + str);
        
        scan.nextLine();//버퍼비우기(스트링 비우기)
        System.out.println("문자열 입력");
        String str1=scan.nextLine();
        System.out.println("str = " + str1);

        scan.close();




    }
}
