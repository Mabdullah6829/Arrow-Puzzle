package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg {

    /* JADX INFO: renamed from: a */
    public static final UUID f16874a;

    /* JADX INFO: renamed from: b */
    public static final UUID f16875b;

    /* JADX INFO: renamed from: c */
    public static final UUID f16876c;

    /* JADX INFO: renamed from: d */
    public static final UUID f16877d;

    /* JADX INFO: renamed from: e */
    public static final UUID f16878e;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            IBinder.getSuggestedMaxIpcSizeBytes();
        }
        f16874a = new UUID(0L, 0L);
        f16875b = new UUID(1186680826959645954L, -5988876978535335093L);
        f16876c = new UUID(-2129748144642739255L, 8654423357094679310L);
        f16877d = new UUID(-1301668207276963122L, -6645017420763422227L);
        f16878e = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
