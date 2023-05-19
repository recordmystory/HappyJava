public class StandardOutput {
    public void println(boolean a){
        System.out.println(a);
    }
    public void println(int b){
        System.out.println(b);
    }
    public void println(double c){
        System.out.println(c);
    }
    public void println(String d){
        System.out.println(d);
    }

    public static void main(String[] args) {
        StandardOutput output = new StandardOutput();
        output.println(100);
        output.println("h");
        output.println(10.5);
        output.println(false);

    }
}
