package com.brianattwell.app;

import com.brianattwell.StaticStringUtil;

@StaticStringUtil
public class SamplePojo2 {
    public String cat;
    public String dog;

    public SamplePojo2(String cat, String dog) {
        this.cat = cat;
        this.dog = dog;
    }
    @Override
    public String toString() {
        return StringUtil.createString(this);
    }
}
