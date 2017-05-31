package ua.com.solodilov.evgen.appartholidaytest.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import ua.com.solodilov.evgen.appartholidaytest.Utils.TypefaceUtils;


public class SFTextView extends android.support.v7.widget.AppCompatTextView {

    public static final String ANDROID_SCHEMA = "http://schemas.android.com/apk/res/android";

    public SFTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context, attrs);
    }

    public SFTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFont(context, attrs);
    }

    private void applyCustomFont(Context context, AttributeSet attrs) {
        int textStyle = attrs.getAttributeIntValue(ANDROID_SCHEMA, "textStyle", Typeface.NORMAL);

        Typeface customFont = selectTypeface(context, textStyle);
        setTypeface(customFont);
    }

    private Typeface selectTypeface(Context context, int textStyle) {
        /*
        * information about the TextView textStyle:
        * http://developer.android.com/reference/android/R.styleable.html#TextView_textStyle
        */
        switch (textStyle) {
            case Typeface.BOLD: // bold
                return TypefaceUtils.getSanFranciscoTypeface("SFNS-DisplayBold", context);

            case Typeface.NORMAL: // regular
            default:
                return TypefaceUtils.getSanFranciscoTypeface("SFNS-DisplayRegular", context);
        }
    }
}