package com.lijie.bs_healthy.model;

import org.springframework.stereotype.Component;

/**食物
 * @author LiJie
 * @date 2020/6/15-10:27
 */
@Component
public class FoodInfo {
    private Integer foodid;
    private String foodname;
    private String foodtype;//餐食类型：大荤，小荤，素菜。。。。。
    private String foodlable;//餐食标签：多糖、少糖、多脂肪、少油等
    private double price;
    private Integer ishalal;


    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public Integer getFoodid() {
        return foodid;
    }

    public void setFoodid(Integer foodid) {
        this.foodid = foodid;
    }

    public String getFoodtype() {
        return foodtype;
    }

    public void setFoodtype(String foodtype) {
        this.foodtype = foodtype;
    }

    public String getFoodlable() {
        return foodlable;
    }

    public void setFoodlable(String foodlable) {
        this.foodlable = foodlable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getIshalal() {
        return ishalal;
    }

    public void setIshalal(Integer ishalal) {
        this.ishalal = ishalal;
    }



    @Override
    public String toString() {
        return "FoodInfo{" +
                "foodiD=" + foodid+
                ", foodname='" + foodname + '\'' +
                ", foodtype='" + foodtype + '\'' +
                ", foodlable='" + foodlable + '\'' +
                ", price=" + price +
                ", ishalal=" + ishalal +
                '}';
    }
}
