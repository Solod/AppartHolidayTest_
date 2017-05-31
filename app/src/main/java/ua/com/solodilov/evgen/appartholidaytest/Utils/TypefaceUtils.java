package ua.com.solodilov.evgen.appartholidaytest.Utils;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by jack on 31.05.17.
 */

public class TypefaceUtils {
    private static Typeface mSanFrancisco=null;

    public static Typeface getSanFranciscoTypeface(String path, Context context){
        if (mSanFrancisco == null) {
            mSanFrancisco = Typeface.createFromAsset(context.getAssets(), path);
        }
        return mSanFrancisco;
    }
}
