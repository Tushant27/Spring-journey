//List


public class ListEg {
    public static void main(String args[])
    {
        System.out.println("ArrayList");
        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i : list)
        {
            System.out.println(i);
        }

        System.out.println("LinkedList");
        List <Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        for (int i : list1)
        {
            System.out.println(i);
        }

        System.out.println("Vector");
        List <Integer> list2 = new Vector<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        for (int i : list2)
        {
            System.out.println(i);
        }

        System.out.println("Stack");
        Vector <Integer> list3 = new Stack<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        for (int i : list2)
        {
            System.out.println(i);
        }
    }
}