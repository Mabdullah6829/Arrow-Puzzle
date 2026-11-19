package p010F0;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p001B.C0084j;

/* JADX INFO: renamed from: F0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0226l {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f452e = AtomicReferenceFieldUpdater.newUpdater(C0226l.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f453f = AtomicLongFieldUpdater.newUpdater(C0226l.class, "_state$volatile");

    /* JADX INFO: renamed from: g */
    public static final C0084j f454g = new C0084j("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    public final int f455a;

    /* JADX INFO: renamed from: b */
    public final boolean f456b;

    /* JADX INFO: renamed from: c */
    public final int f457c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f458d;

    public C0226l(int i2, boolean z) {
        this.f455a = i2;
        this.f456b = z;
        int i3 = i2 - 1;
        this.f457c = i3;
        this.f458d = new AtomicReferenceArray(i2);
        if (i3 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i2 & i3) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m321a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f453f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j2) != 0) {
                return (2305843009213693952L & j2) != 0 ? 2 : 1;
            }
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i4 = this.f457c;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            boolean z = this.f456b;
            AtomicReferenceArray atomicReferenceArray = this.f458d;
            if (z || atomicReferenceArray.get(i3 & i4) == null) {
                if (f453f.compareAndSet(this, j2, ((-1152921503533105153L) & j2) | (((long) ((i3 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i3 & i4, obj);
                    C0226l c0226lM323c = this;
                    while ((atomicLongFieldUpdater.get(c0226lM323c) & 1152921504606846976L) != 0) {
                        c0226lM323c = c0226lM323c.m323c();
                        AtomicReferenceArray atomicReferenceArray2 = c0226lM323c.f458d;
                        int i5 = c0226lM323c.f457c & i3;
                        Object obj2 = atomicReferenceArray2.get(i5);
                        if ((obj2 instanceof C0225k) && ((C0225k) obj2).f451a == i3) {
                            atomicReferenceArray2.set(i5, obj);
                        } else {
                            c0226lM323c = null;
                        }
                        if (c0226lM323c == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i6 = this.f455a;
                if (i6 < 1024 || ((i3 - i2) & 1073741823) > (i6 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m322b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        do {
            atomicLongFieldUpdater = f453f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, 2305843009213693952L | j2));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final C0226l m323c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        C0226l c0226l;
        while (true) {
            atomicLongFieldUpdater = f453f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                c0226l = this;
                break;
            }
            long j3 = 1152921504606846976L | j2;
            c0226l = this;
            if (atomicLongFieldUpdater.compareAndSet(c0226l, j2, j3)) {
                j2 = j3;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f452e;
            C0226l c0226l2 = (C0226l) atomicReferenceFieldUpdater.get(this);
            if (c0226l2 != null) {
                return c0226l2;
            }
            C0226l c0226l3 = new C0226l(c0226l.f455a * 2, c0226l.f456b);
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i4 = c0226l.f457c;
                int i5 = i2 & i4;
                if (i5 == (i4 & i3)) {
                    break;
                }
                Object c0225k = c0226l.f458d.get(i5);
                if (c0225k == null) {
                    c0225k = new C0225k(i2);
                }
                c0226l3.f458d.set(c0226l3.f457c & i2, c0225k);
                i2++;
            }
            atomicLongFieldUpdater.set(c0226l3, (-1152921504606846977L) & j2);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0226l3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m324d() {
        C0226l c0226lM323c = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f453f;
            long j2 = atomicLongFieldUpdater.get(c0226lM323c);
            if ((j2 & 1152921504606846976L) != 0) {
                return f454g;
            }
            int i2 = (int) (j2 & 1073741823);
            int i3 = c0226lM323c.f457c;
            int i4 = i2 & i3;
            if ((((int) ((1152921503533105152L & j2) >> 30)) & i3) != i4) {
                AtomicReferenceArray atomicReferenceArray = c0226lM323c.f458d;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = c0226lM323c.f456b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof C0225k)) {
                    long j3 = (i2 + 1) & 1073741823;
                    if (f453f.compareAndSet(c0226lM323c, j2, (j2 & (-1073741824)) | j3)) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    c0226lM323c = this;
                    if (z) {
                        while (true) {
                            long j4 = atomicLongFieldUpdater.get(c0226lM323c);
                            int i5 = (int) (j4 & 1073741823);
                            if ((j4 & 1152921504606846976L) != 0) {
                                c0226lM323c = c0226lM323c.m323c();
                            } else {
                                C0226l c0226l = c0226lM323c;
                                if (f453f.compareAndSet(c0226l, j4, (j4 & (-1073741824)) | j3)) {
                                    c0226l.f458d.set(i5 & c0226l.f457c, null);
                                    c0226lM323c = null;
                                } else {
                                    c0226lM323c = c0226l;
                                }
                            }
                            if (c0226lM323c == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
