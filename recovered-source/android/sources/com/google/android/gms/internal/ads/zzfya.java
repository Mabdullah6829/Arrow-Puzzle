package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
public final class zzfya {

    /* JADX INFO: renamed from: a */
    public final Context f16794a;

    /* JADX INFO: renamed from: b */
    public final Looper f16795b;

    public zzfya(Context context, Looper looper) {
        this.f16794a = context;
        this.f16795b = looper;
    }

    /* JADX INFO: renamed from: a */
    public final void m6777a(String str) {
        zzfyk zzfykVarM6782D = zzfym.m6782D();
        Context context = this.f16794a;
        String packageName = context.getPackageName();
        zzfykVarM6782D.m8326l();
        ((zzfym) zzfykVarM6782D.f19780t).m6783E(packageName);
        zzfykVarM6782D.m8326l();
        ((zzfym) zzfykVarM6782D.f19780t).m6785G(2);
        zzfyi zzfyiVarM6779D = zzfyj.m6779D();
        zzfyiVarM6779D.m8326l();
        ((zzfyj) zzfyiVarM6779D.f19780t).m6780E(str);
        zzfyiVarM6779D.m8326l();
        ((zzfyj) zzfyiVarM6779D.f19780t).m6781F(2);
        zzfykVarM6782D.m8326l();
        ((zzfym) zzfykVarM6782D.f19780t).m6784F((zzfyj) zzfyiVarM6779D.m8328o());
        zzfyb zzfybVar = new zzfyb(context, this.f16795b, (zzfym) zzfykVarM6782D.m8328o());
        synchronized (zzfybVar.f16798u) {
            try {
                if (!zzfybVar.f16799v) {
                    zzfybVar.f16799v = true;
                    zzfybVar.f16796s.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
