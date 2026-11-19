package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zzflg {

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.client.zzfw f16037a;

    /* JADX INFO: renamed from: b */
    public final zzbsi f16038b;

    /* JADX INFO: renamed from: c */
    public final zzetk f16039c;

    /* JADX INFO: renamed from: d */
    public final com.google.android.gms.ads.internal.client.zzm f16040d;

    /* JADX INFO: renamed from: e */
    public final Bundle f16041e;

    /* JADX INFO: renamed from: f */
    public final com.google.android.gms.ads.internal.client.zzr f16042f;

    /* JADX INFO: renamed from: g */
    public final String f16043g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f16044h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f16045i;

    /* JADX INFO: renamed from: j */
    public final zzbma f16046j;

    /* JADX INFO: renamed from: k */
    public final com.google.android.gms.ads.internal.client.zzx f16047k;

    /* JADX INFO: renamed from: l */
    public final int f16048l;

    /* JADX INFO: renamed from: m */
    public final AdManagerAdViewOptions f16049m;

    /* JADX INFO: renamed from: n */
    public final PublisherAdViewOptions f16050n;

    /* JADX INFO: renamed from: o */
    public final com.google.android.gms.ads.internal.client.zzcl f16051o;

    /* JADX INFO: renamed from: p */
    public final zzfku f16052p;

    /* JADX INFO: renamed from: q */
    public final boolean f16053q;

    /* JADX INFO: renamed from: r */
    public final boolean f16054r;

    /* JADX INFO: renamed from: s */
    public final boolean f16055s;

    /* JADX INFO: renamed from: t */
    public final Bundle f16056t;

    /* JADX INFO: renamed from: u */
    public final AtomicLong f16057u;

    /* JADX INFO: renamed from: v */
    public final boolean f16058v;

    /* JADX INFO: renamed from: w */
    public final JSONArray f16059w;

    /* JADX INFO: renamed from: x */
    public final com.google.android.gms.ads.internal.client.zzcp f16060x;

    public zzflg(zzflf zzflfVar) {
        this.f16042f = zzflfVar.f16014b;
        this.f16043g = zzflfVar.f16015c;
        this.f16060x = zzflfVar.f16036x;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflfVar.f16013a;
        this.f16041e = zzmVar.f3226U;
        int i2 = zzmVar.f3227s;
        long j2 = zzmVar.f3228t;
        Bundle bundle = zzmVar.f3229u;
        int i3 = zzmVar.f3230v;
        List list = zzmVar.f3231w;
        boolean z = zzmVar.f3232x;
        int i4 = zzmVar.f3233y;
        boolean z2 = true;
        if (!zzmVar.f3234z && !zzflfVar.f16017e) {
            z2 = false;
        }
        boolean z3 = z2;
        com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzflfVar.f16013a;
        String str = zzmVar2.f3206A;
        com.google.android.gms.ads.internal.client.zzft zzftVar = zzmVar2.f3207B;
        Location location = zzmVar2.f3208C;
        String str2 = zzmVar2.f3209D;
        Bundle bundle2 = zzmVar2.f3210E;
        Bundle bundle3 = zzmVar2.f3211F;
        List list2 = zzmVar2.f3212G;
        String str3 = zzmVar2.f3213H;
        String str4 = zzmVar2.f3214I;
        boolean z4 = zzmVar2.f3215J;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar2.f3216K;
        int i5 = zzmVar2.f3217L;
        String str5 = zzmVar2.f3218M;
        List list3 = zzmVar2.f3219N;
        int iM3222u = com.google.android.gms.ads.internal.util.zzs.m3222u(zzmVar2.f3220O);
        com.google.android.gms.ads.internal.client.zzm zzmVar3 = zzflfVar.f16013a;
        com.google.android.gms.ads.internal.client.zzm zzmVar4 = new com.google.android.gms.ads.internal.client.zzm(i2, j2, bundle, i3, list, z, i4, z3, str, zzftVar, location, str2, bundle2, bundle3, list2, str3, str4, z4, zzcVar, i5, str5, list3, iM3222u, zzmVar3.f3221P, zzmVar3.f3222Q, zzmVar3.f3223R, zzmVar3.f3224S, zzmVar3.f3225T);
        this.f16040d = zzmVar4;
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzflfVar.f16016d;
        zzbma zzbmaVar = null;
        if (zzfwVar == null) {
            zzbma zzbmaVar2 = zzflfVar.f16020h;
            zzfwVar = zzbmaVar2 != null ? zzbmaVar2.f9171x : null;
        }
        this.f16037a = zzfwVar;
        ArrayList arrayList = zzflfVar.f16018f;
        this.f16044h = arrayList;
        this.f16045i = zzflfVar.f16019g;
        if (arrayList != null && (zzbmaVar = zzflfVar.f16020h) == null) {
            zzbmaVar = new zzbma(new NativeAdOptions(new NativeAdOptions.Builder()));
        }
        this.f16046j = zzbmaVar;
        this.f16047k = zzflfVar.f16021i;
        this.f16048l = zzflfVar.f16025m;
        this.f16049m = zzflfVar.f16022j;
        this.f16050n = zzflfVar.f16023k;
        this.f16051o = zzflfVar.f16024l;
        this.f16038b = zzflfVar.f16026n;
        this.f16052p = new zzfku(zzflfVar.f16027o);
        this.f16053q = zzflfVar.f16028p;
        this.f16054r = zzflfVar.f16029q;
        this.f16039c = zzflfVar.f16030r;
        this.f16055s = zzflfVar.f16031s;
        this.f16056t = zzflfVar.f16032t;
        long j3 = zzmVar4.f3224S;
        this.f16057u = j3 != 0 ? new AtomicLong(j3) : zzflfVar.f16033u;
        this.f16058v = zzflfVar.f16034v;
        this.f16059w = zzflfVar.f16035w;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6486a() {
        return this.f16043g.matches((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8492d4));
    }
}
