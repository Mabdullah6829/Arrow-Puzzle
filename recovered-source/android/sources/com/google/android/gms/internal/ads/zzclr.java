package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzclr {
    /* JADX INFO: renamed from: a */
    public static final zzclb m5647a(final Context context, final VersionInfoParcel versionInfoParcel, final com.google.android.gms.ads.internal.zza zzaVar, final com.google.android.gms.ads.internal.zzn zznVar, final zzbaw zzbawVar, final zzbhw zzbhwVar, final zzbke zzbkeVar, final zzcnl zzcnlVar, final zzdzt zzdztVar, final zzekz zzekzVar, final zzfkn zzfknVar, final zzfkq zzfkqVar, final zzflk zzflkVar, final String str, final boolean z, final boolean z2) throws zzclq {
        zzbix.m5032a(context);
        try {
            zzguj zzgujVar = new zzguj() { // from class: com.google.android.gms.internal.ads.zzcln
                @Override // com.google.android.gms.internal.ads.zzguj
                public final Object zza() {
                    zzcnl zzcnlVar2 = zzcnlVar;
                    String str2 = str;
                    boolean z3 = z;
                    boolean z4 = z2;
                    zzekz zzekzVar2 = zzekzVar;
                    zzdzt zzdztVar2 = zzdztVar;
                    com.google.android.gms.ads.internal.zzn zznVar2 = zznVar;
                    com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                    zzbhw zzbhwVar2 = zzbhwVar;
                    zzfkn zzfknVar2 = zzfknVar;
                    zzfkq zzfkqVar2 = zzfkqVar;
                    zzflk zzflkVar2 = zzflkVar;
                    zzbaw zzbawVar2 = zzbawVar;
                    zzbke zzbkeVar2 = zzbkeVar;
                    VersionInfoParcel versionInfoParcel2 = versionInfoParcel;
                    Context context2 = context;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i2 = zzcme.f10499u0;
                        zzcnd zzcndVar = new zzcnd(context2);
                        zzcndVar.setBaseContext(context2);
                        zzclx zzclxVar = new zzclx(new zzcme(zzcndVar, zzcnlVar2, str2, z3, zzbawVar2, zzbkeVar2, versionInfoParcel2, zznVar2, zzaVar2, zzbhwVar2, zzfknVar2, zzfkqVar2, zzflkVar2), zzdztVar2);
                        zzclxVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.f3698C.f3706f.mo3238i(zzclxVar, zzbhwVar2, z4, zzekzVar2));
                        zzclxVar.setWebChromeClient(new zzcla(zzclxVar));
                        return zzclxVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return (zzclb) zzgujVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzclq("Webview initialization failed.", th);
        }
    }
}
