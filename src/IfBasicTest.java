import java.util.Scanner;

public class IfBasicTest {
    public static void main(String[] args) {
        int x=-10;
            if (x>0){
                System.out.println("양수 입니다.");
            }


        //정수 1개를 입력받아 입력된 수가 7의 배수인지를 출력하세요.
        Scanner scan=new Scanner(System.in);
            System.out.print("정수를 입력하세요:");
            int num = scan.nextInt();

            if (num%7==0){
                System.out.println("num=" + num + "은 7의 배수 입니다.");
            }

            //나이를 입력받아 19세 이상이면 성인을 출력하는 코드를 작성
            System.out.print("나이를 입력하세요:");
            int age = scan.nextInt();
            if (age>=19){
                System.out.println("성인입니다.");
            }




        System.out.println(" 종료 ");
    }
}
