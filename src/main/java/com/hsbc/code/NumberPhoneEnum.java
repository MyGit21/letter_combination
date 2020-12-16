package com.hsbc.code;

public enum  NumberPhoneEnum {

    NUMBER_2('2', "abc"),
    NUMBER_3('3', "def"),
    NUMBER_4('4', "ghi"),
    NUMBER_5('5', "jkl"),
    NUMBER_6('6', "mno"),
    NUMBER_7('7', "pqrs"),
    NUMBER_8('8', "tuv"),
    NUMBER_9('9', "wxyz"),
    NOTFOUND('0', "");

    private char num;
    private String letter;

    /**
     * @param num
     * @param letter
     */
    NumberPhoneEnum(char num, String letter) {
        this.num = num;
        this.letter = letter;
    }

    public char getNum() {
        return num;
    }

    public String getLetter() {
        return letter;
    }

    /**
     * 根据Key得到枚举的Value
     * 增强for循环遍历，比较判断
     * @param num
     * @return
     */
    public static NumberPhoneEnum getEnumType(char num) {
        NumberPhoneEnum[] numbers = NumberPhoneEnum.values();
        for (NumberPhoneEnum numberEnum : numbers) {
            if (numberEnum.getNum() == num) {
                return numberEnum;
            }
        }
        return NumberPhoneEnum.NOTFOUND;
    }

}
