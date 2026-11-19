package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewj implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final Context f15030a;

    /* JADX INFO: renamed from: b */
    public final Bundle f15031b;

    /* JADX INFO: renamed from: c */
    public final String f15032c;

    /* JADX INFO: renamed from: d */
    public final String f15033d;

    /* JADX INFO: renamed from: e */
    public final com.google.android.gms.ads.internal.util.zzg f15034e;

    /* JADX INFO: renamed from: f */
    public final String f15035f;

    /* JADX INFO: renamed from: g */
    public final zzdae f15036g;

    public zzewj(Context context, Bundle bundle, String str, String str2, com.google.android.gms.ads.internal.util.zzj zzjVar, String str3, zzdae zzdaeVar) {
        this.f15030a = context;
        this.f15031b = bundle;
        this.f15032c = str;
        this.f15033d = str2;
        this.f15034e = zzjVar;
        this.f15035f = str3;
        this.f15036g = zzdaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBundle("quality_signals", this.f15031b);
        bundle.putString("seq_num", this.f15032c);
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.f15034e;
        if (!zzgVar.mo3172s()) {
            bundle.putString("session_id", this.f15033d);
        }
        bundle.putBoolean("client_purpose_one", !zzgVar.mo3172s());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8043C6)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                bundle.putString("_app_id", com.google.android.gms.ads.internal.util.zzs.m3197P(this.f15030a));
            } catch (RemoteException | RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AppStatsSignal_AppId", e);
            }
        }
        String str = this.f15035f;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            zzdae zzdaeVar = this.f15036g;
            Long l2 = (Long) zzdaeVar.f11872d.get(str);
            bundle2.putLong("dload", l2 == null ? -1L : l2.longValue());
            Integer num = (Integer) zzdaeVar.f11870b.get(str);
            bundle2.putInt("pcc", num == null ? 0 : num.intValue());
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8550gb)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
            if (zztVar.f3708h.f9900l.get() > 0) {
                bundle.putInt("nrwv", zztVar.f3708h.f9900l.get());
            }
        }
    }
}
