import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ListExam03 { // Collection과 Iterator의 관한 예제
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>(); // list는 Collection을 상속받고 있기 때문에 지금과 같은 문법이 가능하다.
        collection.add("kim");
        collection.add("lee");
        collection.add("hong");

        System.out.println(collection.size());

        Iterator<String> iter = collection.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }
    }
}
