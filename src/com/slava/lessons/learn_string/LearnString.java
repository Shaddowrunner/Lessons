package com.slava.lessons.learn_string;


public class LearnString {

    public static void changeValue(String string) {
        string.concat("Gun");//new String("RunGun")
    }

    public static void changeValue(int value) {
        value = 15;
    }

    public static void main(String[] args) {
//        type name = value(new type)
        String s = "Hello";//object-literal
        String str = new String("Run");//object
        String str1 = new String("Hello");//object

        int a = 4;
//        changeValue(str);
//        System.out.println(str);
        changeValue(a);
        System.out.println(a);
//        str1 = str;

  //    System.out.println(s == str);
 //     System.out.println(s == str.intern());
//        System.out.println(s == str);

      /*  for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);
            System.out.println(element);
        }*/

//        System.out.println(s.substring(1, 3));
//        System.out.println(s.indexOf('l'));
//        System.out.println(s.lastIndexOf('l'));


    }
}
