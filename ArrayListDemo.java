package Review9;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
ArrayList<Integer> aList=new ArrayList<>();
aList.add(12);
aList.add(13);
aList.add(14);

int size=aList.size();
        System.out.println("The size of alist is "+size);

        int firstEle=aList.get(0);
        System.out.println(firstEle);
        // Replacing value of the 1 element
        aList.set(0,453);

        firstEle=aList.get(0);
        System.out.println(firstEle);

        aList.remove(2);
        System.out.println(aList);

    }
}
