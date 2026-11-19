package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class TypedArrayKt {
    private static final void checkAttribute(TypedArray typedArray, int i2) {
        if (!typedArray.hasValue(i2)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean getBooleanOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getBoolean(i2, false);
    }

    public static final int getColorOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getColor(i2, 0);
    }

    public static final ColorStateList getColorStateListOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        ColorStateList colorStateList = typedArray.getColorStateList(i2);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.");
    }

    public static final float getDimensionOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getDimension(i2, 0.0f);
    }

    public static final int getDimensionPixelOffsetOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getDimensionPixelOffset(i2, 0);
    }

    public static final int getDimensionPixelSizeOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getDimensionPixelSize(i2, 0);
    }

    public static final Drawable getDrawableOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        Drawable drawable = typedArray.getDrawable(i2);
        AbstractC6452k.m12178b(drawable);
        return drawable;
    }

    public static final float getFloatOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getFloat(i2, 0.0f);
    }

    public static final Typeface getFontOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return TypedArrayApi26ImplKt.getFont(typedArray, i2);
    }

    public static final int getIntOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getInt(i2, 0);
    }

    public static final int getIntegerOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getInteger(i2, 0);
    }

    public static final int getResourceIdOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getResourceId(i2, 0);
    }

    public static final String getStringOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        String string = typedArray.getString(i2);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.");
    }

    public static final CharSequence[] getTextArrayOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getTextArray(i2);
    }

    public static final CharSequence getTextOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        CharSequence text = typedArray.getText(i2);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.");
    }

    public static final <R> R use(TypedArray typedArray, InterfaceC6498l interfaceC6498l) {
        R r2 = (R) interfaceC6498l.invoke(typedArray);
        typedArray.recycle();
        return r2;
    }
}
