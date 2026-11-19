package p034T;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: T.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0651G extends AbstractC0722d {

    /* JADX INFO: renamed from: s */
    public final ArrayDeque f1453s;

    /* JADX INFO: renamed from: t */
    public ArrayDeque f1454t;

    /* JADX INFO: renamed from: u */
    public int f1455u;

    /* JADX INFO: renamed from: v */
    public boolean f1456v;

    /* JADX INFO: renamed from: w */
    public static final C0785s2 f1449w = new C0785s2(2);

    /* JADX INFO: renamed from: x */
    public static final C0785s2 f1450x = new C0785s2(3);

    /* JADX INFO: renamed from: y */
    public static final C0785s2 f1451y = new C0785s2(4);

    /* JADX INFO: renamed from: z */
    public static final C0785s2 f1452z = new C0785s2(5);

    /* JADX INFO: renamed from: A */
    public static final C0785s2 f1448A = new C0785s2(6);

    public C0651G() {
        new ArrayDeque(2);
        this.f1453s = new ArrayDeque();
    }

    /* JADX INFO: renamed from: A */
    public final void m1499A() throws IOException {
        boolean z = this.f1456v;
        ArrayDeque arrayDeque = this.f1453s;
        if (!z) {
            ((AbstractC0722d) arrayDeque.remove()).close();
            return;
        }
        this.f1454t.add((AbstractC0722d) arrayDeque.remove());
        AbstractC0722d abstractC0722d = (AbstractC0722d) arrayDeque.peek();
        if (abstractC0722d != null) {
            abstractC0722d.mo1490e();
        }
    }

    /* JADX INFO: renamed from: H */
    public final int m1500H(InterfaceC0648F interfaceC0648F, int i2, Object obj, int i3) throws IOException {
        m1607c(i2);
        ArrayDeque arrayDeque = this.f1453s;
        if (!arrayDeque.isEmpty() && ((AbstractC0722d) arrayDeque.peek()).mo1496p() == 0) {
            m1499A();
        }
        while (i2 > 0 && !arrayDeque.isEmpty()) {
            AbstractC0722d abstractC0722d = (AbstractC0722d) arrayDeque.peek();
            int iMin = Math.min(i2, abstractC0722d.mo1496p());
            i3 = interfaceC0648F.mo1489c(abstractC0722d, iMin, obj, i3);
            i2 -= iMin;
            this.f1455u -= iMin;
            if (((AbstractC0722d) arrayDeque.peek()).mo1496p() == 0) {
                m1499A();
            }
        }
        if (i2 <= 0) {
            return i3;
        }
        throw new AssertionError("Failed executing read operation");
    }

    /* JADX INFO: renamed from: I */
    public final int m1501I(C0785s2 c0785s2, int i2, Object obj, int i3) {
        try {
            return m1500H(c0785s2, i2, obj, i3);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p034T.AbstractC0722d, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            ArrayDeque arrayDeque = this.f1453s;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((AbstractC0722d) arrayDeque.remove()).close();
            }
        }
        if (this.f1454t != null) {
            while (!this.f1454t.isEmpty()) {
                ((AbstractC0722d) this.f1454t.remove()).close();
            }
        }
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: e */
    public final void mo1490e() throws IOException {
        ArrayDeque arrayDeque = this.f1454t;
        ArrayDeque arrayDeque2 = this.f1453s;
        if (arrayDeque == null) {
            this.f1454t = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.f1454t.isEmpty()) {
            ((AbstractC0722d) this.f1454t.remove()).close();
        }
        this.f1456v = true;
        AbstractC0722d abstractC0722d = (AbstractC0722d) arrayDeque2.peek();
        if (abstractC0722d != null) {
            abstractC0722d.mo1490e();
        }
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: h */
    public final boolean mo1502h() {
        Iterator it = this.f1453s.iterator();
        while (it.hasNext()) {
            if (!((AbstractC0722d) it.next()).mo1502h()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T.d] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [T.d] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [T.G] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T.G] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p034T.AbstractC0722d mo1491i(int r8) throws java.io.IOException {
        /*
            r7 = this;
            if (r8 > 0) goto L5
            T.F1 r8 = p034T.AbstractC0653G1.f1458a
            return r8
        L5:
            r7.m1607c(r8)
            int r0 = r7.f1455u
            int r0 = r0 - r8
            r7.f1455u = r0
            r0 = 0
            r1 = r0
        Lf:
            java.util.ArrayDeque r2 = r7.f1453s
            java.lang.Object r3 = r2.peek()
            T.d r3 = (p034T.AbstractC0722d) r3
            int r4 = r3.mo1496p()
            if (r4 <= r8) goto L23
            T.d r8 = r3.mo1491i(r8)
            r3 = 0
            goto L39
        L23:
            boolean r5 = r7.f1456v
            if (r5 == 0) goto L2f
            T.d r3 = r3.mo1491i(r4)
            r7.m1499A()
            goto L35
        L2f:
            java.lang.Object r3 = r2.poll()
            T.d r3 = (p034T.AbstractC0722d) r3
        L35:
            int r8 = r8 - r4
            r6 = r3
            r3 = r8
            r8 = r6
        L39:
            if (r0 != 0) goto L3d
            r0 = r8
            goto L5a
        L3d:
            if (r1 != 0) goto L57
            T.G r1 = new T.G
            r4 = 2
            if (r3 != 0) goto L45
            goto L50
        L45:
            int r2 = r2.size()
            int r2 = r2 + r4
            r4 = 16
            int r4 = java.lang.Math.min(r2, r4)
        L50:
            r1.<init>(r4)
            r1.m1503w(r0)
            r0 = r1
        L57:
            r1.m1503w(r8)
        L5a:
            if (r3 > 0) goto L5d
            return r0
        L5d:
            r8 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: p034T.C0651G.mo1491i(int):T.d");
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: j */
    public final void mo1492j(OutputStream outputStream, int i2) throws IOException {
        m1500H(f1448A, i2, outputStream, 0);
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: l */
    public final void mo1493l(ByteBuffer byteBuffer) {
        m1501I(f1452z, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: n */
    public final void mo1494n(byte[] bArr, int i2, int i3) {
        m1501I(f1451y, i3, bArr, i2);
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: o */
    public final int mo1495o() {
        return m1501I(f1449w, 1, null, 0);
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: p */
    public final int mo1496p() {
        return this.f1455u;
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: r */
    public final void mo1497r() {
        if (!this.f1456v) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.f1453s;
        AbstractC0722d abstractC0722d = (AbstractC0722d) arrayDeque.peek();
        if (abstractC0722d != null) {
            int iMo1496p = abstractC0722d.mo1496p();
            abstractC0722d.mo1497r();
            this.f1455u = (abstractC0722d.mo1496p() - iMo1496p) + this.f1455u;
        }
        while (true) {
            AbstractC0722d abstractC0722d2 = (AbstractC0722d) this.f1454t.pollLast();
            if (abstractC0722d2 == null) {
                return;
            }
            abstractC0722d2.mo1497r();
            arrayDeque.addFirst(abstractC0722d2);
            this.f1455u = abstractC0722d2.mo1496p() + this.f1455u;
        }
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: u */
    public final void mo1498u(int i2) {
        m1501I(f1450x, i2, null, 0);
    }

    /* JADX INFO: renamed from: w */
    public final void m1503w(AbstractC0722d abstractC0722d) throws IOException {
        boolean z = this.f1456v;
        ArrayDeque arrayDeque = this.f1453s;
        boolean z2 = z && arrayDeque.isEmpty();
        if (abstractC0722d instanceof C0651G) {
            C0651G c0651g = (C0651G) abstractC0722d;
            while (!c0651g.f1453s.isEmpty()) {
                arrayDeque.add((AbstractC0722d) c0651g.f1453s.remove());
            }
            this.f1455u += c0651g.f1455u;
            c0651g.f1455u = 0;
            c0651g.close();
        } else {
            arrayDeque.add(abstractC0722d);
            this.f1455u = abstractC0722d.mo1496p() + this.f1455u;
        }
        if (z2) {
            ((AbstractC0722d) arrayDeque.peek()).mo1490e();
        }
    }

    public C0651G(int i2) {
        new ArrayDeque(2);
        this.f1453s = new ArrayDeque(i2);
    }
}
