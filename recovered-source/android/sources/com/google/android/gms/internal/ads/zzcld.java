package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzcld implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f10394a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f10395b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Uri f10396c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzclm f10397d;

    public zzcld(zzclm zzclmVar, List list, String str, Uri uri) {
        this.f10394a = list;
        this.f10395b = str;
        this.f10396c = uri;
        this.f10397d = zzclmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo3316a(Object obj) {
        String str = this.f10395b;
        this.f10397d.m5643s(str, (Map) obj, this.f10394a);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        String strValueOf = String.valueOf(this.f10396c);
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Failed to parse gmsg params for: ".concat(strValueOf));
    }
}
