package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzheo {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList f18570a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a */
    public static zzhen m7420a(String str) throws GeneralSecurityException {
        for (zzhen zzhenVar : f18570a) {
            if (zzhenVar.zza()) {
                return zzhenVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
