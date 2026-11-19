package com.google.android.gms.internal.ads;

import java.io.FileInputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzicw implements zzigh {
    static {
        zzidz zzidzVar = zzidz.f19758b;
        int i2 = zzicy.f19697a;
    }

    /* JADX INFO: renamed from: c */
    public static final void m8105c(zziep zziepVar) throws zzifh {
        if (!zziep.m8330A(zziepVar, true)) {
            throw new zzifh(new zzihc().getMessage());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zziep mo8106a(FileInputStream fileInputStream, zzidz zzidzVar) throws zzifh {
        zzidp zzidpVarM8198e = zzidp.m8198e(fileInputStream);
        zziep zziepVarM8334r = zziep.m8334r(((zziek) this).f19781a, zzidpVarM8198e, zzidzVar);
        zzidpVarM8198e.mo8170k(0);
        m8105c(zziepVarM8334r);
        return zziepVarM8334r;
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zziep mo8107b(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        zzidp zzidpVarMo8140u = zzidlVar.mo8140u();
        zziep zziepVarM8334r = zziep.m8334r(((zziek) this).f19781a, zzidpVarMo8140u, zzidzVar);
        zzidpVarMo8140u.mo8170k(0);
        m8105c(zziepVarM8334r);
        return zziepVarM8334r;
    }
}
