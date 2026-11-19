package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import java.util.UUID;
import p003C.AbstractC0116g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzww {
    /* JADX INFO: renamed from: a */
    public abstract AbstractC0116g mo10677a();

    /* JADX INFO: renamed from: b */
    public abstract AbstractC0116g mo10678b();

    /* JADX INFO: renamed from: c */
    public abstract UUID mo10679c();

    /* JADX INFO: renamed from: d */
    public abstract long mo10680d();

    public final String toString() {
        return TextUtils.join(" -> ", mo10677a());
    }
}
