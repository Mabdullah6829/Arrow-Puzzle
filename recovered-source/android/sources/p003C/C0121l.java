package p003C;

import java.util.Arrays;
import p011H.AbstractC0243G;

/* JADX INFO: renamed from: C.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C0121l extends AbstractC0110a {

    /* JADX INFO: renamed from: d */
    public final C0127r f181d;

    public C0121l() {
        super(4);
        this.f181d = C0127r.f191s;
    }

    /* JADX INFO: renamed from: d */
    public final C0106A m207d() {
        C0106A c0106a;
        Object[] objArrCopyOf = this.f157a;
        int i2 = this.f158b;
        C0127r c0127r = this.f181d;
        if (i2 == 0) {
            c0106a = AbstractC0122m.m208s(c0127r);
        } else {
            AbstractC0243G.m368f(i2, objArrCopyOf);
            Arrays.sort(objArrCopyOf, 0, i2, c0127r);
            int i3 = 1;
            for (int i4 = 1; i4 < i2; i4++) {
                Object obj = objArrCopyOf[i4];
                if (c0127r.compare(obj, objArrCopyOf[i3 - 1]) != 0) {
                    objArrCopyOf[i3] = obj;
                    i3++;
                }
            }
            Arrays.fill(objArrCopyOf, i3, i2, (Object) null);
            if (i3 < objArrCopyOf.length / 2) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            }
            c0106a = new C0106A(AbstractC0116g.m191m(i3, objArrCopyOf), c0127r);
        }
        this.f158b = c0106a.f155y.size();
        this.f159c = true;
        return c0106a;
    }
}
