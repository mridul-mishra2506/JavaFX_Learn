package com.first.topics.PasswordFieldControl;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.skin.TextFieldSkin;

public class MySkin extends TextFieldSkin {

    private final char mask_char = '*';

    public MySkin(TextField args) {
        super(args);
    }

    @Override
    protected String maskText(String text) {
        if (getSkinnable() instanceof PasswordField) {
            int n = text.length();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                stringBuilder.append(mask_char);
            }

            return stringBuilder.toString();
        } else {
            return text;
        }
    }

}
