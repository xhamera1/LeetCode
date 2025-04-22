class Solution {
    public String intToRoman(int num) {
        Stack<String> nums = new Stack<>();
        int position = 0;

        while (num>0) {
            int rest = num%10;
            nums.push(getRomanNumber(rest, position));
            num = num/10;
            position++;
        }

        StringBuilder sb = new StringBuilder();
        while (!nums.empty()) {
            sb.append(nums.pop());
        }
        return sb.toString();
        
    }

    public String getRomanNumber(int number, int position) {
        switch (position) {
            case 0:
                if (number == 0) {
                    return "";
                }
                else if (number>0 && number<4) {
                    return "I".repeat(number);
                }
                else if (number==4) {
                    return "IV";
                }
                else if (number==5) {
                    return "V";
                }
                else if (number>5 && number<9) {
                    return "V" + "I".repeat(number-5);
                }
                else if (number == 9) {
                    return "IX";
                }
                else {
                    return "";
                }
            case 1:
                if (number == 0) {
                    return "";
                }
                else if (number>0 && number<4) {
                    return "X".repeat(number);
                }
                else if (number==4) {
                    return "XL";
                }
                else if (number==5) {
                    return "L";
                }
                else if (number>5 && number<9) {
                    return "L" + "X".repeat(number-5);
                }
                else if (number == 9) {
                    return "XC";
                }
                else {
                    return "";
                }
            case 2:
                if (number == 0) {
                    return "";
                }
                else if (number>0 && number<4) {
                    return "C".repeat(number);
                }
                else if (number==4) {
                    return "CD";
                }
                else if (number==5) {
                    return "D";
                }
                else if (number>5 && number<9) {
                    return "D" + "C".repeat(number-5);
                }
                else if (number == 9) {
                    return "CM";
                }
                else {
                    return "";
                }
            case 3:
                if (number>0 && number<4) {
                    return "M".repeat(number);
                }
                else {
                    return "";
                }
            default:
                return "";
        }
    }
}