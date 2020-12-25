package com.test.code;

import java.util.HashMap;
import java.util.Map;

public class BaseConstant {

    public static final Map<Character, String> PHONE_MAP = new HashMap<Character, String>() {{
        put('0', "");
        put('1', "");
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

}
