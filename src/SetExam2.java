import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetExam2 {
    public static void main(String[] args) {
        Set<MyData> mySet = new HashSet<>();
        mySet.add(new MyData("kim", 500));
        mySet.add(new MyData("lee", 200));
        mySet.add(new MyData("hong", 700));
        mySet.add(new MyData("hong", 700));

        Iterator<MyData> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            MyData str = iterator.next();
            System.out.println(str);
        }
    }


    }
    class MyData { // 불변 객체

        private String name;

        private int value;

        @Override
        public boolean equals(Object o) {
            System.out.println("equals!");
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyData myData = (MyData) o;
            return value == myData.value && Objects.equals(name, myData.name);
        }

        @Override
        public int hashCode() {
            System.out.println("hashcode!");
            return Objects.hash(name, value);
        }

        public String getName() {
            return name;
        }

        public int getValue() {
            return value;
        }

        public MyData(String name, int value) {
            this.name = name;
            this.value = value;
        }

        @Override
        public String toString() {
            return "MyData{" +
                    "name='" + name + '\'' +
                    ", value=" + value +
                    '}';
        }
}
