package com.cll.style;

import com.cll.style.common.Degrade;
import com.cll.style.common.FullGray;

@FullGray
public class CityDegrade extends Degrade<DegradeCityContent, DegradeCityResult> {

    @Override
    public boolean doSwitch(DegradeCityContent content) {
        return content.getCityId() % 2 == 0;
    }

    @Override
    public DegradeCityResult doNotDegradeAction(DegradeCityContent content) {
        System.out.println("content not degrade:" + content.getCityId());
        DegradeCityResult result = new DegradeCityResult();
        result.setCityId(content.getCityId());
        return result;
    }

    @Override
    public DegradeCityResult doDegradeAction(DegradeCityContent content) {
        System.out.println("content degrade:" + content.getCityId());
        DegradeCityResult result = new DegradeCityResult();
        result.setCityId(content.getCityId());
        return result;
    }
}
