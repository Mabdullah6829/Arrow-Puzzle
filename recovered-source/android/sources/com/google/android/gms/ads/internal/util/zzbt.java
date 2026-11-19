package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzfsd;

/* JADX INFO: loaded from: classes.dex */
public final class zzbt extends zzb {

    /* JADX INFO: renamed from: b */
    public final com.google.android.gms.ads.internal.util.client.zzu f3540b;

    /* JADX INFO: renamed from: c */
    public final String f3541c;

    /* JADX INFO: renamed from: d */
    public final com.google.android.gms.ads.internal.util.client.zzv f3542d;

    public zzbt(Context context, String str, String str2, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.f3540b = new com.google.android.gms.ads.internal.util.client.zzu(context, com.google.android.gms.ads.internal.zzt.f3698C.f3703c.m3231E(context, str));
        this.f3541c = str2;
        this.f3542d = zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    /* JADX INFO: renamed from: a */
    public final void mo3002a() {
        String str = this.f3541c;
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.f3542d;
        if (zzvVar == null) {
            this.f3540b.m3081a(null, str);
            return;
        }
        new zzfsd(zzvVar.f3446a, this.f3540b, zzcfy.f9950e, null, null).m6636a(str);
    }
}
