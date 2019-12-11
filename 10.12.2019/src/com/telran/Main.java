package com.telran;

public class Main {
    public static void main(String[] args) {
        String s = "я говорю нехорошее, матерное слово";
        System.out.println(s.replaceAll(censorWords("нехорошее", "матерное", "слово"), "*"));
    }

    public static String censorWords(String... words) {
        String re = "";
        for (String w : words)
            for (int i = 0; i < w.length(); i++)
                re += String.format("|((?<=%s)%s(?=%s))",
                        w.substring(0, i), w.charAt(i), w.substring(i + 1));
        return re.substring(1);
    }
}