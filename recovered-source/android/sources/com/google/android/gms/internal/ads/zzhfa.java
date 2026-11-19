package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhfa {
    /* JADX INFO: renamed from: a */
    public static zzheq m7424a(byte[] bArr) {
        try {
            zzidz zzidzVar = zzidz.f19758b;
            int i2 = zzicy.f19697a;
            zzhte zzhteVarM7799G = zzhte.m7799G(bArr, zzidz.f19759c);
            zzhne zzhneVar = zzhne.f19005b;
            zzibk zzibkVarM7597b = zzhok.m7597b(zzhteVarM7799G.m7803D());
            zzhoa zzhoaVar = new zzhoa(zzhteVarM7799G, zzibkVarM7597b);
            zzhoh zzhohVar = (zzhoh) zzhneVar.f19006a.get();
            zzhohVar.getClass();
            return !zzhohVar.f19056d.containsKey(new zzhof(zzhoa.class, zzibkVarM7597b)) ? new zzhmn(zzhoaVar) : zzhneVar.m7577g(zzhoaVar);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }
}
