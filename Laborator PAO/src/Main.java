import java.util.*;

enum Categorii{
    Lactate,
    Paine,
    Mezeluri
}
public class Main {
    public static void main(String[] args) {
        List<Aliment> alimentList = new ArrayList<>();
        alimentList.add(new Carne(1.02));

        alimentList.add(new Lapte(2.0));
        alimentList.add(new Cereale(2.02));
        alimentList.add(new Carne(3.0));
        alimentList.add(new Lapte(1.02));
        alimentList.add(new Cereale(1.5));
        alimentList.add(new Carne(1.03));

        Comparator<Aliment> byCalorii = Comparator.comparing(Aliment::getCalorii);
        List<Aliment> sortedList = alimentList.stream().sorted(byCalorii).toList();
        System.out.println(sortedList);
    }
}