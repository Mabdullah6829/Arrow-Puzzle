package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhmx {

    /* JADX INFO: renamed from: b */
    public static final zzhmx f18994b = new zzhmx();

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f18995a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final void m7566a(zzhmw zzhmwVar, Class cls) throws GeneralSecurityException {
        zzhmw zzhmwVar2 = (zzhmw) this.f18995a.putIfAbsent(cls, zzhmwVar);
        if (zzhmwVar2 != null && !zzhmwVar2.equals(zzhmwVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
    }
}
