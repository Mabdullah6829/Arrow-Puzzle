package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzyc implements zzyd {

    /* JADX INFO: renamed from: a */
    public static final zzyc f23093a = new zzya();

    /* JADX INFO: renamed from: a */
    public abstract String mo10727a();

    /* JADX INFO: renamed from: b */
    public abstract String mo10728b();

    /* JADX INFO: renamed from: c */
    public abstract int mo10729c();

    /* JADX INFO: renamed from: d */
    public abstract String mo10730d();

    /* JADX INFO: renamed from: e */
    public String mo10731e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogSite{ class=");
        sb.append(mo10727a());
        sb.append(", method=");
        sb.append(mo10728b());
        sb.append(", line=");
        sb.append(mo10729c());
        if (mo10730d() != null) {
            sb.append(", file=");
            sb.append(mo10730d());
        }
        if (mo10731e() != null) {
            sb.append(", filePath=");
            sb.append(mo10731e());
        }
        sb.append(" }");
        return sb.toString();
    }
}
