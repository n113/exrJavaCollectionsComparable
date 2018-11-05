import java.util.*;

public class Main {
    private ArrayList<Integer> arr = new ArrayList<>();
    private ArrayList<Students> arrS = new ArrayList<>();

    public static void main(String[] args) {
        //TODO: implement Comparable in your class, make Collections.sort(m.arrS)
        Main m = new Main();
        Random rand = new Random();
        Students jeff = new Students("Jeff", "18", "male");
        Students anna = new Students("Anna", "19", "female");
        Students alice = new Students("Alice", "30", "female");
        Students nick = new Students("Nick", "25", "male");
        Students john = new Students("John", "21", "male");

        m.arrS.add(jeff);
        m.arrS.add(anna);
        m.arrS.add(john);
        m.arrS.add(alice);
        m.arrS.add(nick);

        Collections.sort(m.arrS);

        for (int i = 0; i <m.arrS.size() ; i++) {
            System.out.println(m.arrS.get(i).getAge());
        }





    }//main


    private void printArr(ArrayList arr){
        for (Object obj : arr) {System.out.println(obj);}
    }




}//class
