package androidx.core.app;

import android.os.Parcelable;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* JADX INFO: renamed from: androidx.core.app.d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1157d {
    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ android.app.Person m2028f(Parcelable parcelable) {
        return (android.app.Person) parcelable;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ android.app.Person m2029g(Object obj) {
        return (android.app.Person) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ PrecomputedText.Params.Builder m2035m(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ PrecomputedText m2038p(Object obj) {
        return (PrecomputedText) obj;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m2048z(Object obj) {
        return obj instanceof PrecomputedText;
    }
}
