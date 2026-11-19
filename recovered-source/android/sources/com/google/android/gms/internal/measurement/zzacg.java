package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzacg {

    /* JADX INFO: renamed from: a */
    public int f21957a;

    /* JADX INFO: renamed from: b */
    public long f21958b;

    /* JADX INFO: renamed from: c */
    public Object f21959c;

    /* JADX INFO: renamed from: d */
    public final zzadf f21960d;

    /* JADX INFO: renamed from: e */
    public int f21961e;

    public zzacg() {
        zzadf zzadfVar = zzadf.f22012b;
        int i2 = zzacf.f21956a;
        this.f21960d = zzadf.f22013c;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m9352a(int i2, int i3, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + b + String.valueOf(i2).length());
        sb.append(str);
        sb.append(i3);
        sb.append(str2);
        sb.append(i2);
        return sb.toString();
    }

    public zzacg(zzadf zzadfVar) {
        zzadfVar.getClass();
        this.f21960d = zzadfVar;
    }
}
