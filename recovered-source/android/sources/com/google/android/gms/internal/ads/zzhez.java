package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhez {
    /* JADX INFO: renamed from: a */
    public static zzhek m7423a(String str) {
        try {
            try {
                byte[] bArrM8099h = new zzhdy(new ByteArrayInputStream(str.getBytes(zzhdy.f18544b))).m7404a().m8099h();
                try {
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhtk zzhtkVarM7819H = zzhtk.m7819H(bArrM8099h, zzidz.f19759c);
                    for (zzhtj zzhtjVar : zzhtkVarM7819H.m7823E()) {
                        if (zzhtjVar.m7811E().m7792F() == zzhta.UNKNOWN_KEYMATERIAL || zzhtjVar.m7811E().m7792F() == zzhta.SYMMETRIC || zzhtjVar.m7811E().m7792F() == zzhta.ASYMMETRIC_PRIVATE) {
                            throw new GeneralSecurityException("keyset contains key material of type " + zzhtjVar.m7811E().m7792F().name() + " for type url " + zzhtjVar.m7811E().m7790D());
                        }
                    }
                    return zzhek.m7410a(zzhtkVarM7819H);
                } catch (zzifh unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (zzifh unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }
}
