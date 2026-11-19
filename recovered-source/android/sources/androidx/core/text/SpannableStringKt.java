package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;
import p087v0.C6545d;

/* JADX INFO: loaded from: classes.dex */
public final class SpannableStringKt {
    public static final void clearSpans(Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(Spannable spannable, int i2, int i3, Object obj) {
        spannable.setSpan(obj, i2, i3, 17);
    }

    public static final Spannable toSpannable(CharSequence charSequence) {
        return SpannableString.valueOf(charSequence);
    }

    public static final void set(Spannable spannable, C6545d c6545d, Object obj) {
        spannable.setSpan(obj, c6545d.f24767s, c6545d.f24768t, 17);
    }
}
