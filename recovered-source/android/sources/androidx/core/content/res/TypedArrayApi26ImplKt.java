package androidx.core.content.res;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
final class TypedArrayApi26ImplKt {
    public static final TypedArrayApi26ImplKt INSTANCE = new TypedArrayApi26ImplKt();

    private TypedArrayApi26ImplKt() {
    }

    public static final Typeface getFont(TypedArray typedArray, int i2) {
        Typeface font = typedArray.getFont(i2);
        AbstractC6452k.m12178b(font);
        return font;
    }
}
