import java.util.*;

public class Collections {
    public static void main(String[] args) {
        String arr[]=new String[2];
        arr[0]="Natasha";
        arr[1]="Tamana";
        // for (int i=0; i<2;i++){
        //     System.out.println(arr[i]);
        // }


        /* {
              1) add    2)get   3)contains  4)size  5)set  6)clear 7) addAll
         }*/

/*
        ArrayList<String> a1=new ArrayList<String>();
        a1.add("Ankit");
        a1.add("Anand");
        a1.add("Pankaj");
        a1.add("Natasha");
        ArrayList<String> newList=new ArrayList<String>();
        newList.add("Shyam");
        a1.addAll(4, newList);
        // System.out.println(newList);
        // System.out.println(a1.get(3));
        System.out.println(a1.remove(3));
        //a1.clear();
            a1.set(0,"Nitya");
        System.out.println(a1);
        System.out.println(a1.contains("Ankit"+" "));
        for(int i=0;i<a1.size();i++){
            System.out.print(a1.get(i)+" ");
        }       
        System.out.println();
        for (String it : a1) {
             System.out.print(it+" ");
        } 
    }*/


    // Stack

     /* {
          1) add    2)get   3)contains  4)size  5)set  6)clear 7) addAll 8)push 9)pop 10)peek
         }*/
/*
    Stack<String> s1=new Stack<>();
    Stack<String> s2=new Stack<>();
    s2.add("Tejaswini Gondhale");
    s1.push("Ankit");
    s1.push("Tanya");
    s1.push("Sonal");
    s1.push("Sonalika");
    s1.push("Sonali");
    System.out.println(s1);
    System.out.println(s1.peek());
    s1.pop();
    s1.add(0, "Malika");
    s1.remove(1);
    System.out.println(s1.contains("Malika"));
    s1.set(1,"Anabella");
    s1.addAll(0, s2);
    s1.add("Ashu");
    System.out.println(s1.peek());
    System.out.println(s1);
    for(String it:s1){
        System.out.print(it+" ");
    }
    */

    // Queue InterFace and Linked List Class

     /* {
          1) add    2)offer   3)contains  4)size  5)poll  6)clear 7) addAll 8)push 9)remove 10)element
         }*/

   /*  Queue<Integer> l1=new LinkedList<Integer>();
    l1.offer(22);
    l1.offer(23);
    l1.add(345);
    l1.offer(26);
    // Alternative 3 methos give exception if failed
    System.out.println(l1);
    System.out.println(l1.peek());
    System.out.println(l1.element());
  System.out.println(l1.contains(26));
    l1.poll();
    l1.remove();
    */

        /* {
          1) add    2)offer   3)contains  4)size  5)poll  6)clear 7) addAll 8)push 9)remove 10)element
         }*/

    // MAX Heap MIN Heap
    /*
    Queue<Integer> pq=new PriorityQueue<>();
    Queue<Integer> pq2=new PriorityQueue<>(Comparator.reverseOrder());
     pq.offer(22);
     pq.offer(225);
     pq.offer(21);
     System.out.println(pq);
     pq.poll();
     System.out.println(pq);
     pq.add(3);
     System.out.println(pq.peek());
     pq2.offer(222);
     pq2.offer(22);
     pq2.offer(1);
     System.out.println(pq2.peek());
     pq.addAll(pq2);
    //  pq.clear();
     System.out.println(pq);*/

        /* {
          1) add    2)offer   3)contains  4)size  5)poll  6)clear 7) addAll 8)push 9)remove 10)element
         }*/

    // DeQueue
  /*  ArrayDeque<Integer> dq=new ArrayDeque<>();
     dq.offer(22);
     dq.offerFirst(225);
     dq.offerLast(21);
     System.out.println(dq);
     dq.poll();
     System.out.println(dq);
     dq.add(3);
     System.out.println(dq.peekFirst());
     System.out.println(dq.peekLast());
    //  pq.clear();
     System.out.println(dq);
     System.out.println(dq.pollLast());
     System.out.println(dq.pollFirst());*/
     
     
     /* {
          1) add      3)contains  4)size    6)clear 7) addAll  9)remove 
         }*/

    // HashSet
    // Set<Integer> st=new HashSet<Integer>(); // O(1) --> Time Complexity
    // Set<Integer> st=new LinkedHashSet<Integer>();  //O(n) --> Time Complexity
   /*  Set<Integer> st=new TreeSet<Integer>();   // O(log(n)) --> Time Complexity
      st.add(22);
      st.add(22);
      st.add(105);
      st.add(33);
      System.out.println(st);
      System.out.println(st.isEmpty());
      System.out.println(st.contains(22));*/
     /* {
          1) put     3)contains  4)size    6)clear  7) addAll  9)remove  2)putIfAbsent
         }*/

    // MAPS
    // Map<String,Integer> st=new HashMap<>(); // O(1) --> Time Complexity
    // Map<String,Integer> st=new TreeMap<>();  //O(log(n)) --> Time Complexity
     Map<String,Integer> mp=new TreeMap<>();   
      mp.put("Ankit",343);
      mp.put("Natasha",134);
      mp.put("Sahana",345);
      mp.put("Sonal",34);
      System.out.println(mp.putIfAbsent("Ankit",23));
      System.out.println(mp.containsKey("Ankit"));
      System.out.println(mp.containsValue(345));
      System.out.println(mp);


}

}
