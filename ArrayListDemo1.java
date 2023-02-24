package Review9;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<String> computers=new ArrayList<>();
        computers.add("Macbook Pro");
        computers.add("HP");
        computers.add("Lenovo");
        computers.add("Dell");
        System.out.println(computers);

        for (int i = 0; i < computers.size(); i++) {
            String c=computers.get(i);
            if (c.equals("HP")){
                System.out.println("HP Printer");
            }
            System.out.println(c);

        }
        System.out.println("**************************");
        for (String comp:computers){
            System.out.println(comp+" ");
        }

    }
}
