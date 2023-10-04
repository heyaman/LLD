package StrategyPattern;

import java.util.List;

public class LinearSearch implements SearchStrategy{
    @Override
    public int search(List<Integer>list, int val) {
        for (int i=0;i<list.size();i++){
            if(list.get(i)==val){
                return i;
            }
        }
        return -1;
    }
}
