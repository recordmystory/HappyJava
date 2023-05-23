public class Book { // Book 클래스는 title과 price 두 개의 프로퍼티를 가지고 있다.
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    private int price; //field price

    // 필드의 값을 수정하고 받기 위한 메소드를 만든다. -> getter, setter

    public int getPrice() {
        return this.price * 2; // this는 내 자신 인스턴스를 참조하는 예약어;
    }

    public void setPrice(int price) { // 지역변수 price
        this.price = price;
    }
}
