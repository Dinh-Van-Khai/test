package com.example;

public class Test{
    Translater translate = Translator.getInstance();
    String text = translate.translate("Hello!", Language.ENGLISH, Language.ROMANIAN);
    System.out.println(text);
}
