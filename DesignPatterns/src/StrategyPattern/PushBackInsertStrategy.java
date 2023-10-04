package StrategyPattern;

import java.util.List;

public class PushBackInsertStrategy implements InsertStrategy{


    @Override
    public void insert(List<Integer> list, int val) {
        list.add(val);
    }
}
