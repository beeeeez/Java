package com.example.inclass_week7;

public class BulkDiscount extends DiscountPolicy {

    public int min;
    public float percent;
    public BulkDiscount(int x, float y){
       min=x;
       percent=y;
    }

    @Override
    public float computeDiscount(int count, float itemCost) {
        if(count>min){
            return (itemCost*count)*(percent/100);
        }
        return 0;
    }



}
