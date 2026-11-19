package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwp implements NativeMediationAdRequest {

    /* JADX INFO: renamed from: a */
    public final Set f9466a;

    /* JADX INFO: renamed from: b */
    public final boolean f9467b;

    /* JADX INFO: renamed from: c */
    public final int f9468c;

    /* JADX INFO: renamed from: d */
    public final zzbma f9469d;

    /* JADX INFO: renamed from: f */
    public final boolean f9471f;

    /* JADX INFO: renamed from: e */
    public final ArrayList f9470e = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final HashMap f9472g = new HashMap();

    public zzbwp(HashSet hashSet, boolean z, int i2, zzbma zzbmaVar, List list, boolean z2) {
        this.f9466a = hashSet;
        this.f9467b = z;
        this.f9468c = i2;
        this.f9469d = zzbmaVar;
        this.f9471f = z2;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] strArrSplit = str.split(":", 3);
                    if (strArrSplit.length == 3) {
                        String str2 = strArrSplit[2];
                        if ("true".equals(str2)) {
                            this.f9472g.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(str2)) {
                            this.f9472g.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f9470e.add(str);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    /* JADX INFO: renamed from: a */
    public final NativeAdOptions mo3300a() {
        Parcelable.Creator<zzbma> creator = zzbma.CREATOR;
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        zzbma zzbmaVar = this.f9469d;
        if (zzbmaVar == null) {
            return new NativeAdOptions(builder);
        }
        int i2 = zzbmaVar.f9166s;
        int i3 = 2;
        if (i2 == 2) {
            builder.f3771e = zzbmaVar.f9170w;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    builder.f3772f = zzbmaVar.f9172y;
                    builder.f3768b = zzbmaVar.f9173z;
                    int i4 = zzbmaVar.f9163A;
                    builder.f3773g = zzbmaVar.f9164B;
                    builder.f3774h = i4;
                    int i5 = zzbmaVar.f9165C;
                    if (i5 == 0) {
                        i3 = 1;
                    } else if (i5 == 2) {
                        i3 = 3;
                    } else if (i5 != 1) {
                        i3 = 1;
                    }
                    builder.f3775i = i3;
                }
            }
            com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzbmaVar.f9171x;
            if (zzfwVar != null) {
                builder.f3770d = new VideoOptions(zzfwVar);
            }
            builder.f3771e = zzbmaVar.f9170w;
        }
        builder.f3767a = zzbmaVar.f9167t;
        builder.f3769c = zzbmaVar.f9169v;
        return new NativeAdOptions(builder);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    /* JADX INFO: renamed from: b */
    public final int mo3279b() {
        return this.f9468c;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    /* JADX INFO: renamed from: c */
    public final boolean mo3301c() {
        return this.f9470e.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    /* JADX INFO: renamed from: d */
    public final boolean mo3280d() {
        return this.f9471f;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    /* JADX INFO: renamed from: e */
    public final boolean mo3281e() {
        return this.f9467b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    /* JADX INFO: renamed from: f */
    public final Set mo3282f() {
        return this.f9466a;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    /* JADX INFO: renamed from: g */
    public final com.google.android.gms.ads.formats.NativeAdOptions mo3302g() {
        Parcelable.Creator<zzbma> creator = zzbma.CREATOR;
        com.google.android.gms.ads.formats.NativeAdOptions.Builder builder = new com.google.android.gms.ads.formats.NativeAdOptions.Builder();
        zzbma zzbmaVar = this.f9469d;
        if (zzbmaVar == null) {
            return new com.google.android.gms.ads.formats.NativeAdOptions(builder);
        }
        int i2 = zzbmaVar.f9166s;
        if (i2 == 2) {
            builder.f3008f = zzbmaVar.f9170w;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    builder.f3009g = zzbmaVar.f9172y;
                    builder.f3005c = zzbmaVar.f9173z;
                }
            }
            com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzbmaVar.f9171x;
            if (zzfwVar != null) {
                builder.f3007e = new VideoOptions(zzfwVar);
            }
            builder.f3008f = zzbmaVar.f9170w;
        }
        builder.f3003a = zzbmaVar.f9167t;
        builder.f3004b = zzbmaVar.f9168u;
        builder.f3006d = zzbmaVar.f9169v;
        return new com.google.android.gms.ads.formats.NativeAdOptions(builder);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zza() {
        return this.f9470e.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final HashMap zzb() {
        return this.f9472g;
    }
}
