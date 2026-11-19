package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcl extends zzbdm {
    public zzbcl(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2) {
        super(zzbbzVar, "2JfLKOCWe20PaEte0oViJ9E/+ELRHfLHNO4trOuu7IQ3kQ71vgp9bwF5/QP32+2T", "LVYC8EvnYnoIGxefzdW+bkgnD7TMgzMx712oMyZcYTg=", zzaxtVar, i2, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() throws InvocationTargetException {
        zzaxt zzaxtVar = this.f7657d;
        zzaxtVar.m8326l();
        ((zzayt) zzaxtVar.f19780t).m4624t0(3);
        try {
            int i2 = 1;
            if (true == ((Boolean) this.f7658e.invoke(null, this.f7654a.f7547a)).booleanValue()) {
                i2 = 2;
            }
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4624t0(i2);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
