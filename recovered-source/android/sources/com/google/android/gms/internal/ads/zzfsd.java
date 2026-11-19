package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfsd {

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.util.client.zzx f16385a;

    /* JADX INFO: renamed from: b */
    public final com.google.android.gms.ads.internal.util.client.zzu f16386b;

    /* JADX INFO: renamed from: c */
    public final zzhcq f16387c;

    /* JADX INFO: renamed from: d */
    public final zzfse f16388d;

    /* JADX INFO: renamed from: e */
    public final zzcnn f16389e;

    public zzfsd(com.google.android.gms.ads.internal.util.client.zzx zzxVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzhcq zzhcqVar, zzfse zzfseVar, zzcnn zzcnnVar) {
        this.f16385a = zzxVar;
        this.f16386b = zzuVar;
        this.f16387c = zzhcqVar;
        this.f16388d = zzfseVar;
        this.f16389e = zzcnnVar;
    }

    /* JADX INFO: renamed from: a */
    public final ListenableFuture m6636a(String str) {
        com.google.android.gms.ads.internal.util.client.zzt zztVar = com.google.android.gms.ads.internal.util.client.zzt.f3439t;
        if (str != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8538g)).booleanValue() || !str.isEmpty()) {
                try {
                    return m6637b(str, 1, 0L);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return zzhcf.m7367a(zztVar);
                }
            }
        }
        return zzhcf.m7367a(zztVar);
    }

    /* JADX INFO: renamed from: b */
    public final ListenableFuture m6637b(final String str, final int i2, final long j2) {
        final String strM2450q;
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.f16385a;
        if (i2 > zzxVar.mo3064a()) {
            zzfse zzfseVar = this.f16388d;
            if (zzfseVar == null || !zzxVar.mo3067d()) {
                return zzhcf.m7367a(com.google.android.gms.ads.internal.util.client.zzt.f3440u);
            }
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            zzekq zzekqVar = new zzekq(System.currentTimeMillis(), "", str, 2);
            zzeko zzekoVar = zzfseVar.f16390a;
            zzekoVar.getClass();
            zzekoVar.m6258c(new zzekl(zzekoVar, zzekqVar));
            return zzhcf.m7367a(com.google.android.gms.ads.internal.util.client.zzt.f3441v);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8199L9)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i2));
            String strValueOf = String.valueOf(builderClearQuery.build());
            strM2450q = AbstractC1456a.m2450q(new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length()), strValueOf, "&", encodedQuery);
        } else {
            strM2450q = str;
        }
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfsc
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
                if (zztVar != com.google.android.gms.ads.internal.util.client.zzt.f3440u) {
                    return zzhcf.m7367a(zztVar);
                }
                zzfsd zzfsdVar = this.f16381a;
                com.google.android.gms.ads.internal.util.client.zzx zzxVar2 = zzfsdVar.f16385a;
                long jMo3065b = zzxVar2.mo3065b();
                int i3 = i2;
                if (i3 != 1) {
                    jMo3065b = (long) (zzxVar2.mo3066c() * j2);
                }
                return zzfsdVar.m6637b(str, i3 + 1, jMo3065b);
            }
        };
        zzhcq zzhcqVar = this.f16387c;
        return j2 == 0 ? zzhcf.m7374h(zzhcqVar.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfsb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f16379a.m6638c(strM2450q);
            }
        }), zzhbnVar, zzhcqVar) : zzhcf.m7374h(zzhcqVar.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.zzfsa
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f16377a.m6638c(strM2450q);
            }
        }, j2, TimeUnit.MILLISECONDS), zzhbnVar, zzhcqVar);
    }

    /* JADX INFO: renamed from: c */
    public final com.google.android.gms.ads.internal.util.client.zzt m6638c(String str) {
        zzcnn zzcnnVar;
        zzbio zzbioVar = zzbix.f8498da;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        boolean zBooleanValue = ((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue();
        com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.f16386b;
        if (zBooleanValue && (zzcnnVar = this.f16389e) != null) {
            com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
            if (zztVar.f3703c.m3234H(str) || zztVar.f3703c.m3235I(str)) {
                zzilv zzilvVar = zzcnnVar.f10607c;
                String strEncodeToString = zzilvVar != null ? Base64.encodeToString(zzilvVar.m8099h(), 10) : null;
                HashMap map = new HashMap();
                if (strEncodeToString != null) {
                    map.put((String) zzbaVar.f3098c.m5030a(zzbix.f8515ea), strEncodeToString);
                }
                return zzuVar.m3081a(map, str);
            }
        }
        return zzuVar.m3081a(null, str);
    }
}
