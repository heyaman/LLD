package StrategyPattern;
import java.util.*;

public class NumberGame {
    private final List<Integer>list;
    private final InsertStrategy insertStrategy;
    private final  SearchStrategy searchStrategy;

    public NumberGame(InsertStrategy insertStrategy, SearchStrategy searchStrategy) {
        this.list = new ArrayList<>();
        this.searchStrategy = searchStrategy;
        this.insertStrategy=insertStrategy;
    }
    public void insert(int val){
        this.insertStrategy.insert(list,val);

    }
    public int search(int val){
       return this.searchStrategy.search(list, val);
    }

}
