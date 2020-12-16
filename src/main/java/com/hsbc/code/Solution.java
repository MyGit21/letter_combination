package com.hsbc.code;

import java.util.List;

public class Solution extends BaseSolution{


    public void loopExec(int index, List<String> letterResult) {
        //满足条件保存的字符串长度等于digits长度时，保存buffer字符串，终止loop
        if (index == digits.length()) {
            letterResult.add(buffer.toString());
            return;
        }

        char digit = digits.charAt(index); // 获取下标0的字符开始执行
        String letters = BaseConstant.PHONE_MAP.get(digit);
//        String letters = NumberPhoneEnum.getEnumType(digit).getLetter();
        int letterLength = letters.length();
        for (int i = 0; i < letterLength; i++) {
            buffer.append(letters.charAt(i));//save letter
            loopExec(index + 1, letterResult);//loop
            buffer.deleteCharAt(index);//遍历保存后删除最后一个字符
        }
    }

}
