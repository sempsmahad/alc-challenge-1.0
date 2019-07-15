package com.example.alcchallengeone;

import android.content.Context;
import android.graphics.Typeface;

import java.lang.reflect.Field;

public class ReplaceFont {
    public static void changeDefaultFont(Context context, String oldFont, String assetsFont) {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), assetsFont);
        replaceFont(oldFont, typeface);
    }
    private static void replaceFont(String oldFont, Typeface typeface) {
        try {
            Field myField = Typeface.class.getDeclaredField(oldFont);
            myField.setAccessible(true);
            myField.set(null, typeface);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }}
