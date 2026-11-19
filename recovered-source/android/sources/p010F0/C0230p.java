package p010F0;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p012H0.C0298a;

/* JADX INFO: renamed from: F0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0230p {
    private volatile AtomicReferenceArray<Object> array;

    public C0230p(int i2) {
        this.array = new AtomicReferenceArray<>(i2);
    }

    /* JADX INFO: renamed from: a */
    public final int m325a() {
        return this.array.length();
    }

    /* JADX INFO: renamed from: b */
    public final Object m326b(int i2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i2 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m327c(int i2, C0298a c0298a) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i2 < length) {
            atomicReferenceArray.set(i2, c0298a);
            return;
        }
        int i3 = i2 + 1;
        int i4 = length * 2;
        if (i3 < i4) {
            i3 = i4;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i3);
        for (int i5 = 0; i5 < length; i5++) {
            atomicReferenceArray2.set(i5, atomicReferenceArray.get(i5));
        }
        atomicReferenceArray2.set(i2, c0298a);
        this.array = atomicReferenceArray2;
    }
}
