package com.example.inclass_week7;

public class BuyNItemsGetOneFree extends DiscountPolicy {
    public int n;

    public BuyNItemsGetOneFree(int x){
        n=x;
    }

    @Override
    public float computeDiscount(int count, float itemCost) {
        float dis=0;
        int hard=n;
        for(int i=1; i<=count; i++){
            if(i==hard){
                dis+=itemCost;
                hard+=n;
            }
        }
        return dis;
    }
}
