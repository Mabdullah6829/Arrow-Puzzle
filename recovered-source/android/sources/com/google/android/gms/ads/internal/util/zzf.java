package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzgax;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends zzgax {
    @Override // com.google.android.gms.internal.ads.zzgax
    /* JADX INFO: renamed from: a */
    public final void mo3153a(Message message) {
        try {
            super.mo3153a(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
            zzs zzsVar = zztVar.f3703c;
            Context context = zztVar.f3708h.f9893e;
            zzf zzfVar = zzs.f3626l;
            if (context != null) {
                try {
                    if (((Boolean) zzblg.f9124b.m5057c()).booleanValue()) {
                        CrashUtils.m3642a(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdMobHandler.handleMessage", e);
        }
    }
}
