import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class SetEg {
    public static void main(String args[])
    {
        System.out.println("Hashset");
        Set<Integer> set = new HashSet<>();
        set.add(8);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(5);
        set.add(6);
        set.add(7);
        Iterator it = set.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        for (int i : set)
        {
            System.out.println(i);
        }

        System.out.println("LinkedHashset");
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(3);
        for (int i : set)
        {
            System.out.println(i);
        }

        System.out.println("Sortset");
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(3);
        for (int i : set)
        {
            System.out.println(i);
        }

                System.out.println("Treeset");
        Set<Integer> set3 = new HashSet<>();
        set3.add(4);
        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(3);
        for (int i : set3)
        {
            System.out.println(i);
        }

    }
}
