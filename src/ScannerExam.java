import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        //도서정보 입력 받기
        Scanner scan=new Scanner(System.in);
        System.out.println("도서제목 입력");
        String title=scan.nextLine();
        System.out.println("title = " + title);

        System.out.println("도서가격 입력");
        int price=scan.nextInt(); //30000
        System.out.println("price = " + price);

        scan.nextLine();

        System.out.println("출판사 입력");
        String company=scan.nextLine();
        System.out.println("company = " + company);



        System.out.println("저자 입력");
        String author=scan.nextLine();
        System.out.println("author = " + author);

        System.out.println("페이지수 입력");
        int page=scan.nextInt();
        System.out.println("page = " + page);

        scan.nextLine();

        System.out.println("Isbn 입력");
        String isbn=scan.nextLine();
        System.out.println("isbn = " + isbn);

        scan.close();



        
    }
}
