package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgwm {
    /* JADX INFO: renamed from: a */
    public static int m7200a(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: b */
    public static int m7201b(Object obj) {
        return m7200a(obj == null ? 0 : obj.hashCode());
    }
}
