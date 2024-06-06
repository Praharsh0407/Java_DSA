import java.util.*;
public class Array_list {


    
    public static void main(String[] args) {
        // ArrayList<Integer> numbers = new ArrayList<Integer>();
        // numbers.add(1);
        // numbers.add(2);
        // numbers.add(3);
        // System.out.println(numbers);   
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
        // stringList.add("A");
        // stringList.add("B");
        // stringList.add("C");
        // stringList.add("D");
        // stringList.add("E");
        // System.out.println(stringList); 

        // accessing the elements
        // System.out.println(numbers.get(2));
        // System.out.println(stringList.get(2));



        //array traversal (M1)
        for(int i =0; i<stringList.size(); i++) {
            String letter = stringList.get(i);
            System.out.println(letter);
        }

        // (M2)
        // for(String letter: stringList) {
        //     System.out.println(letter);
        // }


        // (M3)
        // Iterator<String> iterator = stringList.iterator();
        // while (iterator.hasNext()) {
        //     String letter = iterator.next();
        //     System.out.println(letter);
        // }


        //Searching
        // for(String letter: stringList) {
        //     if (letter.equals("F")){
        //         System.out.println("The element is found");
        //         break;
        //     }
        // }

        //indexOf
        // int index = stringList.indexOf("F");
        // System.out.println("The element is found at index: "+ index);

        //deleting
        // stringList.remove(2);
        // System.out.println(stringList);

    }
}
