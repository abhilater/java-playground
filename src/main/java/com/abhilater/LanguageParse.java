package com.abhilater;

/**
 * Created by abhishek on 06/10/17.
 */

import java.io.IOException;

public class LanguageParse {

    public String evaluate(String inputLang) throws IOException {
        String normalizedLanguage = null;
        if (inputLang != null) {
            String langId = inputLang.toString();
            if (langId != null) {
                normalizedLanguage = langId;
            }
        }
        return normalizedLanguage;
    }
}