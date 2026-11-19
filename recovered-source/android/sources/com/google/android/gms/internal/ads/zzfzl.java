package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfzl {

    /* JADX INFO: renamed from: a */
    public final byte[] f16859a;

    /* JADX INFO: renamed from: b */
    public int f16860b;

    /* JADX INFO: renamed from: c */
    public int f16861c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzfzm f16862d;

    public /* synthetic */ zzfzl(zzfzm zzfzmVar, byte[] bArr) {
        this.f16862d = zzfzmVar;
        this.f16859a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6821a() {
        try {
            zzfzm zzfzmVar = this.f16862d;
            if (zzfzmVar.f16864b) {
                zzfzp zzfzpVar = zzfzmVar.f16863a;
                zzfzpVar.mo6827l2(this.f16859a);
                zzfzpVar.mo6826l(this.f16860b);
                zzfzpVar.mo6823I(this.f16861c);
                zzfzpVar.mo6828u3();
                zzfzpVar.mo6824a();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
