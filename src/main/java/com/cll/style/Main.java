package com.cll.style;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DegradeCityContent content = new DegradeCityContent();
        content.setCityId(11);
        CityDegrade cityDegrade = new CityDegrade();
        DegradeCityResult result = cityDegrade.doAction(content);
        System.out.println("result: " + result.getCityId());
    }
}