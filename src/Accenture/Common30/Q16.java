package Accenture.Common30;

import java.util.*;


public class Q16 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(1);
        list.add(1);
        list.add(1);
        int getAns = getMostNum(list);
        System.out.println(getAns);
    }

    public static int getMostNum(ArrayList<Integer> list) {
        int n = list.size();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : list) {
            int prev = map.get(num) == null ? 0 : map.get(num);
            map.put(num, prev + 1);
        }
        int maxV = 0;
        int key = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> obj : map.entrySet()) {
            if (obj.getValue() > maxV) {
                maxV = obj.getValue();
                key = obj.getKey() < key ? obj.getKey() : key;
            }

        }
        return key;
    }
}
