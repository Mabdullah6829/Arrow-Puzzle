package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzidz {

    /* JADX INFO: renamed from: b */
    public static volatile zzidz f19758b;

    /* JADX INFO: renamed from: c */
    public static final zzidz f19759c = new zzidz(0);

    /* JADX INFO: renamed from: a */
    public final Map f19760a;

    public zzidz() {
        this.f19760a = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static zzidz m8304a() {
        zzidz zzidzVar = f19758b;
        if (zzidzVar != null) {
            return zzidzVar;
        }
        synchronized (zzidz.class) {
            try {
                zzidz zzidzVar2 = f19758b;
                if (zzidzVar2 != null) {
                    return zzidzVar2;
                }
                int i2 = zzicy.f19697a;
                zzidz zzidzVarM8320b = zzieh.m8320b();
                f19758b = zzidzVarM8320b;
                return zzidzVarM8320b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzidz(int i2) {
        this.f19760a = Collections.EMPTY_MAP;
    }
}
