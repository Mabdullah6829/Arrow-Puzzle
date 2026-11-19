package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class SpannedStringKt {
    public static final <T> T[] getSpans(Spanned spanned, int i2, int i3) {
        AbstractC6452k.m12184h();
        throw null;
    }

    public static Object[] getSpans$default(Spanned spanned, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            spanned.length();
        }
        AbstractC6452k.m12184h();
        throw null;
    }

    public static final Spanned toSpanned(CharSequence charSequence) {
        return SpannedString.valueOf(charSequence);
    }
}
