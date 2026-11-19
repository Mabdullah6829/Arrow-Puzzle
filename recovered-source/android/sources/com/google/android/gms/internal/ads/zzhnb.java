package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhnb {

    /* JADX INFO: renamed from: b */
    public static final zzhnb f19001b = new zzhnb();

    /* JADX INFO: renamed from: a */
    public final AtomicReference f19002a = new AtomicReference(new zzhnw(new zzhnt(0)));

    /* JADX INFO: renamed from: a */
    public final synchronized void m7569a(zzhns zzhnsVar) {
        AtomicReference atomicReference = this.f19002a;
        zzhnt zzhntVar = new zzhnt((zzhnw) atomicReference.get());
        zzhntVar.m7586a(zzhnsVar);
        atomicReference.set(new zzhnw(zzhntVar));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7570b(zzhny zzhnyVar) {
        AtomicReference atomicReference = this.f19002a;
        zzhnt zzhntVar = new zzhnt((zzhnw) atomicReference.get());
        HashMap map = zzhntVar.f19023b;
        Class clsZza = zzhnyVar.zza();
        if (map.containsKey(clsZza)) {
            zzhny zzhnyVar2 = (zzhny) map.get(clsZza);
            if (!zzhnyVar2.equals(zzhnyVar) || !zzhnyVar.equals(zzhnyVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZza.toString()));
            }
        } else {
            map.put(clsZza, zzhnyVar);
        }
        atomicReference.set(new zzhnw(zzhntVar));
    }
}
