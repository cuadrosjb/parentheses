package cuadros.jeffrey.etl;

import java.util.Stack;

public class PairFinder {

    public static Character OPEN_PARENTESIS = '(';
    public static Character CLOSE_PARENTESIS = ')';

    public Integer find(String listofparentesis){
        Integer counter = 0 ;
        //first rule: It must start with "("

        Stack<Character> myList = new Stack<Character>();

        for(Character parentesis : listofparentesis.toCharArray()){
            if (parentesis.equals(OPEN_PARENTESIS)){
                myList.push(parentesis);
            } else if(!myList.isEmpty() && parentesis.equals(CLOSE_PARENTESIS)) {
                counter++;
                myList.pop();
            }
        }

       return counter;
    }

}
