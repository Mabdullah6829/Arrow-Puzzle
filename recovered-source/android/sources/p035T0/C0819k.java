package p035T0;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC6453l;
import kotlin.jvm.internal.C6462u;
import p033S0.C0629w;
import p057d0.C6289k;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: T0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0819k extends AbstractC6453l implements InterfaceC6502p {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C0629w f2148s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C6462u f2149t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C6462u f2150u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C6462u f2151v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0819k(C0629w c0629w, C6462u c6462u, C6462u c6462u2, C6462u c6462u3) {
        super(2);
        this.f2148s = c0629w;
        this.f2149t = c6462u;
        this.f2150u = c6462u2;
        this.f2151v = c6462u3;
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 21589) {
            if (jLongValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            C0629w c0629w = this.f2148s;
            byte bM1463e = c0629w.m1463e();
            boolean z = (bM1463e & 1) == 1;
            boolean z2 = (bM1463e & 2) == 2;
            boolean z3 = (bM1463e & 4) == 4;
            long j2 = z ? 5L : 1L;
            if (z2) {
                j2 += 4;
            }
            if (z3) {
                j2 += 4;
            }
            if (jLongValue < j2) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z) {
                this.f2149t.f24636s = Long.valueOf(((long) c0629w.m1466j()) * 1000);
            }
            if (z2) {
                this.f2150u.f24636s = Long.valueOf(((long) c0629w.m1466j()) * 1000);
            }
            if (z3) {
                this.f2151v.f24636s = Long.valueOf(((long) c0629w.m1466j()) * 1000);
            }
        }
        return C6289k.f24318a;
    }
}
