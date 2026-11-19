package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhmb {

    /* JADX INFO: renamed from: c */
    public static final Logger f18971c = Logger.getLogger(zzhmb.class.getName());

    /* JADX INFO: renamed from: d */
    public static final zzhmb f18972d = new zzhmb();

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f18973a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f18974b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final synchronized void m7555a(zzhea zzheaVar, boolean z) {
        m7557c(zzheaVar, 1, z);
    }

    /* JADX INFO: renamed from: b */
    public final zzhea m7556b(Class cls, String str) throws GeneralSecurityException {
        zzhea zzheaVarM7558d = m7558d(str);
        if (zzheaVarM7558d.zzc().equals(cls)) {
            return zzheaVarM7558d;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzheaVarM7558d.getClass());
        String string = zzheaVarM7558d.zzc().toString();
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2438e(name.length() + 53, 23, strValueOf) + string.length());
        AbstractC0271e0.m413u(sb, "Primitive type ", name, " not supported by key manager of type ", strValueOf);
        throw new GeneralSecurityException(AbstractC0271e0.m403k(sb, ", which only supports: ", string));
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m7557c(zzhea zzheaVar, int i2, boolean z) {
        if (!zzhle.m7504a(i2)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        m7559e(zzheaVar, z);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized zzhea m7558d(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = this.f18973a;
        if (!concurrentHashMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (zzhea) concurrentHashMap.get(str);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m7559e(zzhea zzheaVar, boolean z) {
        try {
            String strZzb = zzheaVar.zzb();
            if (z) {
                ConcurrentHashMap concurrentHashMap = this.f18974b;
                if (concurrentHashMap.containsKey(strZzb) && !((Boolean) concurrentHashMap.get(strZzb)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strZzb));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.f18973a;
            zzhea zzheaVar2 = (zzhea) concurrentHashMap2.get(strZzb);
            if (zzheaVar2 != null && !zzheaVar2.getClass().equals(zzheaVar.getClass())) {
                f18971c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strZzb));
                throw new GeneralSecurityException("typeUrl (" + strZzb + ") is already registered with " + zzheaVar2.getClass().getName() + ", cannot be re-registered with " + zzheaVar.getClass().getName());
            }
            concurrentHashMap2.putIfAbsent(strZzb, zzheaVar);
            this.f18974b.put(strZzb, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }
}
