package androidx.core.view.accessibility;

import android.text.PrecomputedText;
import android.webkit.TracingConfig;

/* JADX INFO: renamed from: androidx.core.view.accessibility.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1253a {
    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ boolean m2294B(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ TracingConfig.Builder m2303g() {
        return new TracingConfig.Builder();
    }
}
