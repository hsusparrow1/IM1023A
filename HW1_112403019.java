public class HW1_112403019 {
    public static void main(String[] args) {
        String input = "*i!t c$ou7l#d %ch(an)ge b8ut this+ feel<s li%^ke like t>h9e ca/lm be??fore th[e s=to=rm "
                + "*not that |*i do''n't w3an/,.na t~!ry but *i've &b;ee3n here6 be@.fore";

        String inputWithCapital = changeToCapital(input);//先將星號後的字母轉成大寫
        String result1 = retainEnglishAlphabet(inputWithCapital);//再篩選出英文字母
        System.out.println(result1);

        String onlyNumber = findNumber(input);//篩選出數字
        findAndPlusPrimeNumber(onlyNumber);//篩選出質數並相加
    }

    private static void findAndPlusPrimeNumber(String onlyNumber) {
        int sum = 0;
        for (int i = 0; i < onlyNumber.length(); i++) {
            char c = onlyNumber.charAt(i);
            int num = (int) c - 48;//將字符轉換int值
            boolean b = checkPrimeNumber(num);
            if(b){
                sum = sum + num;
            }
        }
        System.out.println(sum);
    }

    private static boolean checkPrimeNumber(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    private static String findNumber(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c >= '1' && c <= '9'){
                sb.append(c);//判別數字
            }
        }
        return sb.toString();
    }

    private static String retainEnglishAlphabet(String inputWithCapital) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputWithCapital.length(); i++) {
            char c = inputWithCapital.charAt(i);
            if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
                sb.append(c);//判別是否為字母
            }
            else if(c == ' '){
                sb.append(" ");//判別空格
            }
        }
        return sb.toString();
    }

    private static String changeToCapital(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length() - 1; i++) {//input長度要減一因為下面處理連續兩個字符
            char c1 = input.charAt(i);
            char c2 = input.charAt(i + 1);
            sb.append(c1);
            if(c1 == '*'){//如果遇到星號就將後面的字符轉大寫並加進StringBuilder容器
                 c2 = Character.toUpperCase(c2);
                 sb.append(c2);
                 i++;//再一次i++跳過已經大寫的
            }
            if(i == input.length() - 2){
                sb.append(c2);//因為上面同時處理連續兩個字符, 最後一個會因為邊界而無法加進去
            }
        }
        return sb.toString();
    }
}
