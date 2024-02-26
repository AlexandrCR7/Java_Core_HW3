import java.util.*;

public class App {

    public static void main(String[] args) {


        BaseEmployee freeLancer1 = new FreeLancer("Sasha", 500);
        BaseEmployee worker1 = new Worker("Marina", 30000);
        BaseEmployee freeLancer2 = new FreeLancer("Misha", 200);
        BaseEmployee worker2 = new Worker("Ira", 40000);

        List<BaseEmployee> listOfEmployees = Arrays.asList(freeLancer1, freeLancer2, worker1, worker2);
        System.out.println("Неотсортированная коллекция: " + "\n" + listOfEmployees);
        Collections.sort(listOfEmployees);
        System.out.println("Отсортированная коллекция: " + "\n" +listOfEmployees);

        ListIterator listIterator = new ListIterator();
        listIterator.printList(listOfEmployees);

    }
}
