package p010F0;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractRunnableC0011L;
import p000A0.C0012M;

/* JADX INFO: renamed from: F0.u */
/* JADX INFO: loaded from: classes.dex */
public class C0235u {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f469b = AtomicIntegerFieldUpdater.newUpdater(C0235u.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    public AbstractRunnableC0011L[] f470a;

    /* JADX INFO: renamed from: a */
    public final void m331a(AbstractRunnableC0011L abstractRunnableC0011L) {
        abstractRunnableC0011L.m13e((C0012M) this);
        AbstractRunnableC0011L[] abstractRunnableC0011LArr = this.f470a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f469b;
        if (abstractRunnableC0011LArr == null) {
            abstractRunnableC0011LArr = new AbstractRunnableC0011L[4];
            this.f470a = abstractRunnableC0011LArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC0011LArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(abstractRunnableC0011LArr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC6452k.m12180d(objArrCopyOf, "copyOf(...)");
            abstractRunnableC0011LArr = (AbstractRunnableC0011L[]) objArrCopyOf;
            this.f470a = abstractRunnableC0011LArr;
        }
        int i2 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i2 + 1);
        abstractRunnableC0011LArr[i2] = abstractRunnableC0011L;
        abstractRunnableC0011L.f9t = i2;
        m333c(i2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final AbstractRunnableC0011L m332b(int i2) {
        int i3;
        int i4;
        Object[] objArr;
        int i5;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f470a;
        AbstractC6452k.m12178b(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f469b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i2 < atomicIntegerFieldUpdater.get(this)) {
            m334d(i2, atomicIntegerFieldUpdater.get(this));
            int i6 = (i2 - 1) / 2;
            if (i2 > 0) {
                AbstractRunnableC0011L abstractRunnableC0011L = objArr2[i2];
                AbstractC6452k.m12178b(abstractRunnableC0011L);
                Object obj2 = objArr2[i6];
                AbstractC6452k.m12178b(obj2);
                if (abstractRunnableC0011L.compareTo(obj2) < 0) {
                    m334d(i2, i6);
                    m333c(i6);
                } else {
                    while (true) {
                        i3 = i2 * 2;
                        i4 = i3 + 1;
                        if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f470a;
                        AbstractC6452k.m12178b(objArr);
                        i5 = i3 + 2;
                        if (i5 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i5];
                            AbstractC6452k.m12178b(comparable3);
                            obj = objArr[i4];
                            AbstractC6452k.m12178b(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i5 = i4;
                            }
                        } else {
                            i5 = i4;
                        }
                        comparable = objArr[i2];
                        AbstractC6452k.m12178b(comparable);
                        comparable2 = objArr[i5];
                        AbstractC6452k.m12178b(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        m334d(i2, i5);
                        i2 = i5;
                    }
                }
            } else {
                while (true) {
                    i3 = i2 * 2;
                    i4 = i3 + 1;
                    if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f470a;
                    AbstractC6452k.m12178b(objArr);
                    i5 = i3 + 2;
                    if (i5 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i5];
                        AbstractC6452k.m12178b(comparable3);
                        obj = objArr[i4];
                        AbstractC6452k.m12178b(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i5 = i4;
                        }
                    } else {
                        i5 = i4;
                    }
                    comparable = objArr[i2];
                    AbstractC6452k.m12178b(comparable);
                    comparable2 = objArr[i5];
                    AbstractC6452k.m12178b(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    m334d(i2, i5);
                    i2 = i5;
                }
            }
        }
        AbstractRunnableC0011L abstractRunnableC0011L2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        AbstractC6452k.m12178b(abstractRunnableC0011L2);
        abstractRunnableC0011L2.m13e(null);
        abstractRunnableC0011L2.f9t = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC0011L2;
    }

    /* JADX INFO: renamed from: c */
    public final void m333c(int i2) {
        while (i2 > 0) {
            AbstractRunnableC0011L[] abstractRunnableC0011LArr = this.f470a;
            AbstractC6452k.m12178b(abstractRunnableC0011LArr);
            int i3 = (i2 - 1) / 2;
            AbstractRunnableC0011L abstractRunnableC0011L = abstractRunnableC0011LArr[i3];
            AbstractC6452k.m12178b(abstractRunnableC0011L);
            AbstractRunnableC0011L abstractRunnableC0011L2 = abstractRunnableC0011LArr[i2];
            AbstractC6452k.m12178b(abstractRunnableC0011L2);
            if (abstractRunnableC0011L.compareTo(abstractRunnableC0011L2) <= 0) {
                return;
            }
            m334d(i2, i3);
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m334d(int i2, int i3) {
        AbstractRunnableC0011L[] abstractRunnableC0011LArr = this.f470a;
        AbstractC6452k.m12178b(abstractRunnableC0011LArr);
        AbstractRunnableC0011L abstractRunnableC0011L = abstractRunnableC0011LArr[i3];
        AbstractC6452k.m12178b(abstractRunnableC0011L);
        AbstractRunnableC0011L abstractRunnableC0011L2 = abstractRunnableC0011LArr[i2];
        AbstractC6452k.m12178b(abstractRunnableC0011L2);
        abstractRunnableC0011LArr[i2] = abstractRunnableC0011L;
        abstractRunnableC0011LArr[i3] = abstractRunnableC0011L2;
        abstractRunnableC0011L.f9t = i2;
        abstractRunnableC0011L2.f9t = i3;
    }
}
