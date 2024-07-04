import java.util.ArrayList;
public class Operations {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();

       //Add Operations
       list.add(1); //O(1)
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       System.out.println(list);

       //Get Operations -O(1)
       int element = list.get(2);
       System.out.println(element);

       //Delete - O(n)
       list.remove(3);
       System.out.println(list);

       //Set -O(n)
       list.set(2, 10);
       System.out.println(list);

       //Contains - O(n)
       System.out.println(list.contains(10));
       System.out.println(list.contains(0));

       //Size
       System.out.println(list.size());

       for(int i=0; i<list.size(); i++) {
        System.out.print(list.get(i)+" ");
       }
       System.out.println();
    }
}