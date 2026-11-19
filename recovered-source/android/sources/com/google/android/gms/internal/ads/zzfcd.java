package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfcd implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final String f15392a;

    /* JADX INFO: renamed from: b */
    public final String f15393b;

    /* JADX INFO: renamed from: c */
    public final String f15394c;

    /* JADX INFO: renamed from: d */
    public final String f15395d;

    /* JADX INFO: renamed from: e */
    public final Long f15396e;

    public zzfcd(String str, String str2, String str3, String str4, Long l2) {
        this.f15392a = str;
        this.f15393b = str2;
        this.f15394c = str3;
        this.f15395d = str4;
        this.f15396e = l2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzflv.m6497e("gmp_app_id", this.f15392a, bundle);
        zzflv.m6497e("fbs_aiid", this.f15393b, bundle);
        zzflv.m6497e("fbs_aeid", this.f15394c, bundle);
        zzflv.m6497e("apm_id_origin", this.f15395d, bundle);
        Long l2 = this.f15396e;
        if (l2 != null) {
            bundle.putLong("sai_timeout", l2.longValue());
        }
    }
}
