package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzboz implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        try {
            zzgcv.m6890f(zzclbVar.getContext()).m6891g();
            zzgcw.m6893f(zzclbVar.getContext()).m6894g();
            zzgcx.m6895a(zzclbVar.getContext()).m6896b();
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("DefaultGmsgHandlers.ResetPaid", e);
        }
    }
}
