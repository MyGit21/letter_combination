package com.test.code;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseSolution {

    protected String digits;
    protected StringBuilder buffer = new StringBuilder();

    public abstract void loopExec(int index, List<String> result);

    public List<String> letterCombination(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        this.digits = digits.replaceAll("[0,1]", "");
        this.loopExec(0, result);
        return result;
    }

}
