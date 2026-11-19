package p033S0;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: S0.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0631y {

    /* JADX INFO: renamed from: a */
    public static final C0630x f1386a = new C0630x(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b */
    public static final int f1387b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference[] f1388c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f1387b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i2 = 0; i2 < iHighestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference();
        }
        f1388c = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: a */
    public static final void m1476a(C0630x segment) {
        AbstractC6452k.m12181e(segment, "segment");
        if (segment.f1384f != null || segment.f1385g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f1382d) {
            return;
        }
        AtomicReference atomicReference = f1388c[(int) (Thread.currentThread().getId() & (((long) f1387b) - 1))];
        C0630x c0630x = f1386a;
        C0630x c0630x2 = (C0630x) atomicReference.getAndSet(c0630x);
        if (c0630x2 == c0630x) {
            return;
        }
        int i2 = c0630x2 != null ? c0630x2.f1381c : 0;
        if (i2 >= 65536) {
            atomicReference.set(c0630x2);
            return;
        }
        segment.f1384f = c0630x2;
        segment.f1380b = 0;
        segment.f1381c = i2 + 8192;
        atomicReference.set(segment);
    }

    /* JADX INFO: renamed from: b */
    public static final C0630x m1477b() {
        AtomicReference atomicReference = f1388c[(int) (Thread.currentThread().getId() & (((long) f1387b) - 1))];
        C0630x c0630x = f1386a;
        C0630x c0630x2 = (C0630x) atomicReference.getAndSet(c0630x);
        if (c0630x2 == c0630x) {
            return new C0630x();
        }
        if (c0630x2 == null) {
            atomicReference.set(null);
            return new C0630x();
        }
        atomicReference.set(c0630x2.f1384f);
        c0630x2.f1384f = null;
        c0630x2.f1381c = 0;
        return c0630x2;
    }
}
