public class MapEg {
    public static void main(String args[])
    {
        Map<Integer,String> map = new HashMap<>();
        map.put(26,"Tushant");
        map.put(27,"Jojo");

        for(Map.Entry<Integer,String>entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " +entry.getValue());
        }

        System.out.println("TreeMap");
        Map<Integer,String> map1 = new TreeMap<>();
        map1.put(29,"Tushant");
        map1.put(27,"Jojo");

        for(Map.Entry<Integer,String>entry1 : map1.entrySet())
        {
            System.out.println(entry1.getKey() + " " +entry1.getValue());
        }

    }

}
