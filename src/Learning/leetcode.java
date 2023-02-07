package Learning;

import java.math.BigInteger;
import java.util.ArrayList;

class Solution {

    public int removeDuplicatesMy(int[] nums) {
        int l = nums.length;
        if (l == 0) return 0; //if array is empty
        if (l == 1) return 1; //if array contain 1 item
        if (l > 1) { //if all items of array equals
            for (int i = 0; i < l - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    if (i == l-2) {
                        return 1;
                    }
                }
                else {break;}
            }
        }
        //int k1 = 0;
        int k2 = l;
        //int k3 = 0;

        for (int i = 0; i < l - 1; i++) {
            //k1 = i + 1;
            if (nums[i] == nums[i + 1]) {
                k2--;
                for (int j = i + 1; j < l - 1; j++) {
                    nums[j] = nums[j + 1];
                    }
                nums[l - 1] = nums[l - 1] - 1;
                //if (i > 0) {i--; }
                i--;
                }
            else if (nums[i] > nums[i + 1])  {
                //k3 = i + 1;
                break;
            }
            }
        return k2;
    }

    public int removeDuplicatesOther(int[] nums) {
        if(nums.length == 0)
            return 0;

        int addIndex = 1; //index that unique characters will be inserted at

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] < nums[i + 1]){ //if true, num[i + 1] is a new unique number
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }
        }
        return addIndex;
    }

    public int[] plusOne(int[] digits) {
        
        String strAll = "";
        String strAdd = "";
        String strIncr = "";

        for (int i = 0; i < digits.length; i++) {
            strAdd = Integer.toString(digits[i]);
            strAll = strAll + strAdd; //one of the available options
        }

        BigInteger bigInt = new BigInteger(strAll);

        BigInteger one = new BigInteger("1");
        bigInt = bigInt.add(one);
        strIncr = bigInt.toString();

        int[] result = new int[strIncr.length()];

        for (int i = 0; i < strIncr.length(); i++) {
            result[i] = Integer.parseInt(strIncr.substring(i, i + 1));
        }

        return result;
    }

    public int[] plusOne2(int[] digits) { //genius solution fro this task ever!!!

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public boolean isPalindrome(int x) { //принимает число, определяет симметричное оно или нет

        boolean result = false;
        int length;
        int step;
        String charStart;
        String charEnd;

        Integer xx = x;
        String str = xx.toString();
        length = str.length();

        if (length > 1) {
            step = length / 2;


            for (int i = 0; i < step; i++) {

                charStart = str.substring(i, i + 1);
                charEnd = str.substring(length - i - 1, length - i);

                if (charStart.equals(charEnd)) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        } else {
            result = true;
        }
        return result;
    }


    public int romanToInt(String s) {  //принимает число римскими цифрами (латиница), переводит в число арабскими цифрами
        int digit;
        int length = s.length();
        int sum = 0;
        String subStr;
        ArrayList<Integer> digitList = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (length - i == 1) subStr = s.substring(i, i + 1);
            else subStr = s.substring(i, i + 2);

            digit = switch (subStr) {
                case "IV"  -> 4;
                case "IX" -> 9;
                case "XL" -> 40;
                case "XC" -> 90;
                case "CD" -> 400;
                case "CM" -> 900;
                default -> 0;
            };
            if (digit != 0) {
                i++;
            } else {
                digit = switch (subStr.substring(0, 1)) {
                    case "I" -> 1;
                    case "V" -> 5;
                    case "X" -> 10;
                    case "L" -> 50;
                    case "C" -> 100;
                    case "D" -> 500;
                    case "M" -> 1000;
                    default -> 0;
                };
            } //if there is digit value still is null, return the exception obviously
            digitList.add(digit);
        }
        for (int i = 0; i < digitList.size(); i++) {
            sum = sum + digitList.get(i);
        }
        return sum;
    }


    public String longestCommonPrefix(String[] strs) {  //принимает массив строк, возвращает максимальный префикс или же пустоту

        String prefix1;
        String prefix2;
        boolean equalPrefix = true;
        int countChar = 0;
        int minLength = strs[0].length();

        for (String j: strs) {
            minLength = Math.min(j.length(), minLength);
        }

        while (equalPrefix && (minLength > countChar)) {
            countChar++;

            for (int i = 0; i < strs.length - 1; i++) {
                prefix1 = strs[i].substring(0, countChar);
                prefix2 = strs[i + 1].substring(0, countChar);

                if (!prefix1.equals(prefix2)) {
                    equalPrefix = false;
                    countChar--;
                    break;
                }
            }
        }
        return strs[0].substring(0, countChar);
    }

    public boolean isValid(String s) {
        int length = s.length();
        char charBreak;
        boolean result = true;

        ArrayList<Character> charList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            charList.add(s.charAt(i));
        }

        for (int i = 0; i < charList.size() - 1; i = i) {
            charBreak = switch (charList.get(i)) {
                case '(' -> ')';
                case '{' -> '}';
                case '[' -> ']';
                default -> '0';
            };

            if (charList.get(i + 1) == charBreak) {
                charList.remove(i + 1);
                charList.remove(i);
                i = 0;
            }
            else i++;
        }
        return charList.size() == 0;
    }
}