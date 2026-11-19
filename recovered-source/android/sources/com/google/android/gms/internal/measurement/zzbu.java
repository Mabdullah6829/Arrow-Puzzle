package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
public final class zzbu {

    /* JADX INFO: renamed from: b */
    public static volatile zzbu f22331b;

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList f22332a = new CopyOnWriteArrayList();

    private zzbu() {
    }

    /* JADX INFO: renamed from: a */
    public static zzbu m9823a() {
        if (f22331b == null) {
            synchronized (zzbu.class) {
                try {
                    if (f22331b == null) {
                        f22331b = new zzbu();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22331b;
    }
}
