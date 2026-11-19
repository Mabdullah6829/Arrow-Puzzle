package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
final class zzgir extends zzgji {
    @Override // com.google.android.gms.internal.ads.zzgji
    /* JADX INFO: renamed from: a */
    public final void mo7017a(Method method, zzaxt zzaxtVar) {
        synchronized (zzaxtVar) {
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4572H0("E");
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4587P(0L);
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4614j0("D");
        }
        Object[] objArr = (Object[]) method.invoke("", null);
        objArr.getClass();
        synchronized (zzaxtVar) {
            String str = (String) objArr[0];
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4572H0(str);
            long jLongValue = ((Long) objArr[1]).longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4587P(jLongValue);
            String str2 = (String) objArr[2];
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4614j0(str2);
        }
    }
}
