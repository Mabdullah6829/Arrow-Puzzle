package p006D0;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0039h;
import p001B.C0084j;
import p004C0.EnumC0136a;
import p008E0.AbstractC0198a;
import p008E0.AbstractC0205h;
import p008E0.InterfaceC0203f;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: D0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0162B extends AbstractC0198a implements InterfaceC0189x, InterfaceC0170e, InterfaceC0203f {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f289w = AtomicReferenceFieldUpdater.newUpdater(C0162B.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: v */
    public int f290v;

    public C0162B(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m257a(Object obj, Object obj2) {
        int i2;
        C0164D[] c0164dArr;
        C0084j c0084j;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f289w;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC6452k.m12177a(obj3, obj)) {
                return false;
            }
            if (AbstractC6452k.m12177a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.f290v;
            if ((i3 & 1) != 0) {
                this.f290v = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.f290v = i4;
            C0164D[] c0164dArr2 = this.f391s;
            while (true) {
                if (c0164dArr2 != null) {
                    for (C0164D c0164d : c0164dArr2) {
                        if (c0164d != null) {
                            AtomicReference atomicReference = c0164d.f293a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (c0084j = AbstractC0163C.f292b)) {
                                    break;
                                }
                                C0084j c0084j2 = AbstractC0163C.f291a;
                                if (obj4 != c0084j2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, c0084j2)) {
                                            ((C0039h) obj4).resumeWith(C6289k.f24318a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, c0084j)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f290v;
                    if (i2 == i4) {
                        this.f290v = i4 + 1;
                        return true;
                    }
                    c0164dArr = this.f391s;
                }
                c0164dArr2 = c0164dArr;
                i4 = i2;
            }
        }
    }

    @Override // p008E0.InterfaceC0203f
    /* JADX INFO: renamed from: b */
    public final InterfaceC0170e mo258b(InterfaceC6353h interfaceC6353h, int i2, EnumC0136a enumC0136a) {
        return AbstractC0163C.m264f(this, interfaceC6353h, i2, enumC0136a);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ce A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x0039, B:50:0x00c6, B:52:0x00ce, B:55:0x00d5, B:56:0x00db, B:58:0x00de, B:68:0x00ff, B:71:0x010f, B:72:0x012b, B:78:0x013b, B:75:0x0132, B:77:0x0138, B:60:0x00e4, B:64:0x00eb, B:21:0x0054, B:24:0x005f, B:49:0x00b7), top: B:102:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00de A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x0039, B:50:0x00c6, B:52:0x00ce, B:55:0x00d5, B:56:0x00db, B:58:0x00de, B:68:0x00ff, B:71:0x010f, B:72:0x012b, B:78:0x013b, B:75:0x0132, B:77:0x0138, B:60:0x00e4, B:64:0x00eb, B:21:0x0054, B:24:0x005f, B:49:0x00b7), top: B:102:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe A[PHI: r4 r5 r8 r10 r11 r12 r13
  0x00fe: PHI (r4v14 java.lang.Object) = (r4v20 java.lang.Object), (r4v22 java.lang.Object) binds: [B:65:0x00fb, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r5v1 int) = (r5v6 int), (r5v0 int) binds: [B:65:0x00fb, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r8v1 int) = (r8v6 int), (r8v0 int) binds: [B:65:0x00fb, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r10v6 A0.X) = (r10v8 A0.X), (r10v11 A0.X) binds: [B:65:0x00fb, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r11v5 D0.D) = (r11v7 D0.D), (r11v10 D0.D) binds: [B:65:0x00fb, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r12v2 D0.f) = (r12v4 D0.f), (r12v6 D0.f) binds: [B:65:0x00fb, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r13v3 D0.B) = (r13v5 D0.B), (r13v8 D0.B) binds: [B:65:0x00fb, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x010e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x010e -> B:50:0x00c6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p006D0.InterfaceC0170e
    public final java.lang.Object collect(p006D0.InterfaceC0171f r18, p062g0.InterfaceC6348c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p006D0.C0162B.collect(D0.f, g0.c):java.lang.Object");
    }

    @Override // p006D0.InterfaceC0171f
    public final Object emit(Object obj, InterfaceC6348c interfaceC6348c) {
        if (obj == null) {
            obj = AbstractC0205h.f407a;
        }
        m257a(null, obj);
        return C6289k.f24318a;
    }
}
