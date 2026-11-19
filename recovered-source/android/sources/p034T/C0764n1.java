package p034T;

import java.io.OutputStream;
import java.util.ArrayList;
import p036U.C0840u;
import p049b0.C1887c;

/* JADX INFO: renamed from: T.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0764n1 extends OutputStream {

    /* JADX INFO: renamed from: s */
    public final ArrayList f1965s = new ArrayList();

    /* JADX INFO: renamed from: t */
    public C0840u f1966t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0768o1 f1967u;

    public C0764n1(C0768o1 c0768o1) {
        this.f1967u = c0768o1;
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        C0840u c0840u = this.f1966t;
        if (c0840u == null || c0840u.f2303b <= 0) {
            write(new byte[]{(byte) i2}, 0, 1);
            return;
        }
        c0840u.f2302a.m1387O((byte) i2);
        c0840u.f2303b--;
        c0840u.f2304c++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        C1887c c1887c = this.f1967u.f1981h;
        C0840u c0840u = this.f1966t;
        ArrayList arrayList = this.f1965s;
        if (c0840u == null) {
            c1887c.getClass();
            C0840u c0840uM2717c = C1887c.m2717c(i3);
            this.f1966t = c0840uM2717c;
            arrayList.add(c0840uM2717c);
        }
        while (i3 > 0) {
            int iMin = Math.min(i3, this.f1966t.f2303b);
            if (iMin == 0) {
                int iMax = Math.max(i3, this.f1966t.f2304c * 2);
                c1887c.getClass();
                C0840u c0840uM2717c2 = C1887c.m2717c(iMax);
                this.f1966t = c0840uM2717c2;
                arrayList.add(c0840uM2717c2);
            } else {
                this.f1966t.m1737a(bArr, i2, iMin);
                i2 += iMin;
                i3 -= iMin;
            }
        }
    }
}
