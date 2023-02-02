package home_work3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;



public class Main {
    public static void main(String[] args) {
        task1();
        task2();


    }


    private static void task1(){
        ArrayList<Integer> list = createIntList(0,10,10);
        System.out.println(list);
        evenRemove(list);
        System.out.println(list);
    }

    private static void task2(){
        ArrayList<Integer> list = createIntList(0,10,10);
        System.out.println(list);
        int min = list.get(0);
        int max = list.get(0);
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)){
                min = list.get(i);
            }
            if (max < list.get(i)){
                max = list.get(i);
            }
            sum += list.get(i);
        }
        System.out.printf(" max = %s%n min = %s%n", max, min);
        System.out.printf(" Average: %s", sum/list.size());
    }

    private static void evenRemove(ArrayList<Integer> list) {
        Iterator<Integer> listIterator = list.iterator();
        while (listIterator.hasNext()){
            int item = listIterator.next();
            if (item % 2 == 0){
                listIterator.remove();
            }
        }
    }

    public static ArrayList<Integer> createIntList(int first, int last, int size){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(first, last));
        }
        return list;
    }
}

