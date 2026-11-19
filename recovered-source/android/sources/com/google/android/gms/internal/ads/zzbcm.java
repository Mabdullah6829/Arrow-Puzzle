package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcm extends zzbdm {

    /* JADX INFO: renamed from: i */
    public static final zzbdn f7610i = new zzbdn();

    /* JADX INFO: renamed from: h */
    public final Context f7611h;

    public zzbcm(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2, Context context) {
        super(zzbbzVar, "00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", zzaxtVar, i2, 29);
        this.f7611h = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        zzaxt zzaxtVar = this.f7657d;
        zzaxtVar.m8326l();
        ((zzayt) zzaxtVar.f19780t).m4566D("E");
        Context context = this.f7611h;
        AtomicReference atomicReferenceM4756a = f7610i.m4756a(context.getPackageName());
        if (atomicReferenceM4756a.get() == null) {
            synchronized (atomicReferenceM4756a) {
                try {
                    if (atomicReferenceM4756a.get() == null) {
                        atomicReferenceM4756a.set((String) this.f7658e.invoke(null, context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String str = (String) atomicReferenceM4756a.get();
        zzaxt zzaxtVar2 = this.f7657d;
        synchronized (zzaxtVar2) {
            String strEncodeToString = Base64.encodeToString(str.getBytes(), 11);
            zzaxtVar2.m8326l();
            ((zzayt) zzaxtVar2.f19780t).m4566D(strEncodeToString);
        }
    }
}
