package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdn implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final String f15499a;

    /* JADX INFO: renamed from: b */
    public final int f15500b;

    public /* synthetic */ zzfdn(String str, int i2) {
        this.f15499a = str;
        this.f15500b = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8252Ob)).booleanValue()) {
            String str = this.f15499a;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("topics", str);
            }
            int i2 = this.f15500b;
            if (i2 != -1) {
                bundle.putInt("atps", i2);
            }
        }
    }
}
