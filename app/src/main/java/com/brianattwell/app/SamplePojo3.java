package com.brianattwell.app;

import com.brianattwell.StaticStringUtil;

@StaticStringUtil
public class SamplePojo3 {
    public String cat = "cat";

    @Override
    public String toString() {
        return StringUtil.createString(this);
    }
}
