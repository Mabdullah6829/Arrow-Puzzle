package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbg implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final String f15315a;

    /* JADX INFO: renamed from: b */
    public final Integer f15316b;

    /* JADX INFO: renamed from: c */
    public final String f15317c;

    /* JADX INFO: renamed from: d */
    public final String f15318d;

    /* JADX INFO: renamed from: e */
    public final String f15319e;

    /* JADX INFO: renamed from: f */
    public final String f15320f;

    public zzfbg(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f15315a = str;
        this.f15316b = num;
        this.f15317c = str2;
        this.f15318d = str3;
        this.f15319e = str4;
        this.f15320f = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzflv.m6497e("pn", this.f15315a, bundle);
        Integer num = this.f15316b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        zzflv.m6497e("vnm", this.f15317c, bundle);
        zzflv.m6497e("dl", this.f15318d, bundle);
        zzflv.m6497e("ins_pn", this.f15319e, bundle);
        zzflv.m6497e("ini_pn", this.f15320f, bundle);
    }
}
