public class CommandLineArgumentExam {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("사용법 : CommandLineArgumentExam 값 값 ....");

            /*

             프로그램이 종료될 때 들어가는 숫자가 의미하는 것은?
             명령을 실행했을 때 성공하면 아무런 메세지가 출력되지 않는다. -> Unix 철학.
             Linux도 Unix의 계열이다.
             작은 명령들을 조합해서 또 다른 명령을 만든다. -> 셸 스크립트 작성
             작은 명령들이 실행되고 종료될 때 종료코드를 넣어줌.

             */

            System.exit(0);  // 프로그램 종료 , return; 으로 변경 가능
        }

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
