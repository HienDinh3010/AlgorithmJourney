package com.assessment.com1;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HandleRequest {
    public static void main(String[] args) {
        String str = "GET https://www.javatpoint.com/java-regex?token=daniellovehien&name=daniel&id=1234";
        str = str.substring(str.indexOf("?") + 1);
        Pattern pattern = Pattern.compile("(\\w+)=(\\w+)");
        Matcher matcher = pattern.matcher(str);

        Map<String, String> paramMap = new HashMap<>();
        while (matcher.find()) {
            String key = matcher.group(1);
            String value = matcher.group(2);
            paramMap.put(key, value);
        }

        for (Map.Entry<String, String> entry : paramMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
