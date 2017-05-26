package homeworks;

/**
 * Created by Shaddowrunner on 22.04.2017.
 */
public class StringHome {

    private String hello;
    private String split;

    /* public StringHome(String hello) {
         this.hello = hello;
     }
 */
    public StringHome(String split) {
        this.split = "Initializes a newly created String object so newly it represents an String character sequence";
    }

    public String getSplit() {
        return split;
    }

    public void setSplit(String split) {
        this.split = split;
    }

    /*  public String replaceFirst(String regex, String replacement) {
                return hello.replace(regex, replacement);
            }
        */

    public static void main(String[] args) {
    /*     StringHome stringHome = new StringHome("Hello world");
        //      System.out.println(stringHome.replaceFirst("world", "friend"));
        System.out.println(stringHome.split(" "));*/
        String valueOfElements = "7 + 2 + 3 + 5 - 8";
//        String sumOfElements = valueOfElements.trim();
        String sumOfElements = valueOfElements.replaceAll(" ", "");
//        System.out.println(sumOfElements);

        int indexPlus = sumOfElements.indexOf("+");

        Character valueOneChar = sumOfElements.charAt(indexPlus - 1);

        Character valueSecondChar = sumOfElements.charAt(indexPlus + 1);

        int valueOne = Integer.parseInt(valueOneChar.toString());

        int valueSecond = Integer.parseInt(valueSecondChar.toString());


        int indexMinus = sumOfElements.indexOf("-");

        Character valueThirdChar = sumOfElements.charAt(indexMinus - 1);

        Character valueFourthChar = sumOfElements.charAt(indexMinus + 1);

        int valueThird = Integer.parseInt(valueThirdChar.toString());

        int valueFourth = Integer.parseInt(valueFourthChar.toString());

        int lastIndexPlus = sumOfElements.lastIndexOf("+");

        Character valueFifthChar = sumOfElements.charAt(lastIndexPlus - 1);

        int valueFifth = Integer.parseInt(valueFifthChar.toString());


        int sum = valueOne + valueSecond + valueThird - valueFourth + valueFifth;
        System.out.println(sum);


        /*String inputString = "Hello hello hello friend friend gun gun run friend and me".toLowerCase();

        String[] inputStringToArray = inputString.split(" ");
        String[] inputStringToArray2 = inputString.split(" ");
        int count = 0;

        for (String word : inputStringToArray) {
            for (int i = 0; i < inputStringToArray2.length; ++i) {
                String temp = inputStringToArray2[i];
                if (temp.equals(word)) {
                    inputStringToArray2[i] = "";
                    ++count;
                }
            }
            if (count != 0) {
                System.out.println("Word " + word + " appears  " + count + " times");
            }
            count = 0;
        }*/

    }
}
