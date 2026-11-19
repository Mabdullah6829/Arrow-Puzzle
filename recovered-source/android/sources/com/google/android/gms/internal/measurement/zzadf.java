package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadf {

    /* JADX INFO: renamed from: b */
    public static volatile zzadf f22012b;

    /* JADX INFO: renamed from: c */
    public static final zzadf f22013c = new zzadf(0);

    /* JADX INFO: renamed from: a */
    public final Map f22014a;

    public zzadf() {
        this.f22014a = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static zzadf m9535a() {
        zzadf zzadfVar = f22012b;
        if (zzadfVar != null) {
            return zzadfVar;
        }
        synchronized (zzadf.class) {
            try {
                zzadf zzadfVar2 = f22012b;
                if (zzadfVar2 != null) {
                    return zzadfVar2;
                }
                int i2 = zzacf.f21956a;
                zzadf zzadfVarM9548b = zzadn.m9548b();
                f22012b = zzadfVarM9548b;
                return zzadfVarM9548b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzadf(int i2) {
        this.f22014a = Collections.EMPTY_MAP;
    }
}
