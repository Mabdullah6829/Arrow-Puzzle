package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class zzimm extends zzimr {

    /* JADX INFO: renamed from: a */
    public final String f19978a;

    public zzimm(String str) {
        this.f19978a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzimr
    /* JADX INFO: renamed from: a */
    public final void mo8542a(String str) {
        String str2 = this.f19978a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
