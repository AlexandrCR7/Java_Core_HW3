import java.util.List;

public class ListIterator {

    public void printList(List<BaseEmployee> list) {
        for (BaseEmployee base : list) {
            System.out.println(base);
        }
    }
}
