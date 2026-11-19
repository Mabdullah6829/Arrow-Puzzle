package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzhbl extends zzhay.zzf {

    /* JADX INFO: renamed from: B */
    public static final zzhbi f18495B;

    /* JADX INFO: renamed from: C */
    public static final zzhcn f18496C = new zzhcn(zzhbl.class);

    /* JADX INFO: renamed from: A */
    public volatile int f18497A;

    /* JADX INFO: renamed from: z */
    public volatile Set f18498z;

    static {
        Throwable th;
        zzhbi zzhbkVar;
        try {
            zzhbkVar = new zzhbj();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzhbkVar = new zzhbk();
        }
        Throwable th3 = th;
        f18495B = zzhbkVar;
        if (th3 != null) {
            f18496C.m7383a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }
}
