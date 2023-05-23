public class BookExam01 {
    public static void main(String[] args) {
        Book b1 = new Book();
        //b1.price = 100;
        //System.out.println(b1.price);

        b1.setTitle("김성박의 즐거운 자바");
        System.out.println(b1.getTitle());
        b1.setPrice(500);
        System.out.println(b1.getPrice());
    }

    /*

    price field : 클래스가 가지는 것.
    price property : getter, setter 메소드

     */
}
