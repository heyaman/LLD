package StrategyPattern;
/*
* so here in strategy pattern we allow our client to choose multiple strategy via similar implementation
* like below we can choose different search strategy, different insertion strategy via common implementation*/

public class NumberExecutor {
    public static void main(String[] args) {
        NumberGame numberGame=new NumberGame(new PushBackInsertStrategy(), new LinearSearch());
        numberGame.insert(2);
        numberGame.insert(3);
        numberGame.insert(4);
        System.out.println(numberGame.search(3));
    }
}
