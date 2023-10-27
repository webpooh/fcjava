public class BookExam {
    public static void main(String[] args) {
        // 정수 1개 저장할 변수를 선언 하시오
        int a;
        a=10;
        //책 1권을 저장할 변수를 선언 하시오.

        //Book b;
        //b=new Book();
        //b.title="자바 기초";


        // 책이라는 데이터 만들어서 넣기
        // 한권의 책 데이터를 저장하기 위해서 객체 생성 또는 인스턴스를 만드시오
        Book b=new Book();
        b.title ="자바";
        b.price=30000;
        b.company="패스트캠퍼스";
        b.author="김진호";
        b.page=500;
        b.isbn="123-456-789";
        System.out.println(b.title+"\t"+b.price+"\t"+b.company+"\t"+b.author+"\t"+b.page+"\t"+b.isbn+"\t");


    }
}
