package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalx implements zzahh {

    /* JADX INFO: renamed from: b */
    public static final zzalx f5896b = new zzalx(true);

    /* JADX INFO: renamed from: c */
    public static final zzalx f5897c = new zzalx(false);

    /* JADX INFO: renamed from: a */
    public final boolean f5898a;

    public zzalx(boolean z) {
        this.f5898a = z;
    }

    public final String toString() {
        boolean z = !this.f5898a;
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 33);
        sb.append("IncorrectFragmentation{expected=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
