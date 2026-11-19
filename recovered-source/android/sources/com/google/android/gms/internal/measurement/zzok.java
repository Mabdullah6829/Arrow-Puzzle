package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
final class zzok implements Comparable {

    /* JADX INFO: renamed from: u */
    public static final AtomicReferenceFieldUpdater f22692u = AtomicReferenceFieldUpdater.newUpdater(zzok.class, Object.class, "t");

    /* JADX INFO: renamed from: s */
    public final String f22693s;

    /* JADX INFO: renamed from: t */
    public volatile Object f22694t;

    public /* synthetic */ zzok(String str, byte[] bArr) {
        this.f22693s = str;
        this.f22694t = bArr;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m10576b(byte[] bArr) {
        byte[][] bArr2;
        int i2 = 0;
        while (true) {
            Object obj = this.f22694t;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i2 >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i2])) {
                        return;
                    } else {
                        i2++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i2 = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22692u;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bArr2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f22693s.compareTo((String) obj);
    }
}
