package com.test.code;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class TestCode {
    static BaseSolution solution;
    String digits = "23";

    @BeforeClass
    public static void testBeforeClass() {
        solution = new Solution();
    }

    @AfterClass
    public static void testAfterClass() {
        solution = null;
    }

    @Test
    public void testCombinate() throws Exception {
        List<String> resultList = solution.letterCombination(digits);
        if (resultList != null && resultList.size() > 0) {
            for (String str : resultList) {
                System.out.print(" "+str);
            }
        }
    }

}
