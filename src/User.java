public class User {
    private String email;
    private String password;
    private String name;

    //생성자 오버로딩
    public User(String name, String email, String password) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    // 생성자를 하나라도 만들게 되면 기본생성자가 자동으로 안 만들어진다.
    public User(String name, String email) { // 코드 중복 해결
        this(name, email, null);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
