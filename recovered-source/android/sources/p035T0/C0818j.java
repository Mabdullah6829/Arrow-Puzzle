package p035T0;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC6453l;
import kotlin.jvm.internal.C6459r;
import kotlin.jvm.internal.C6461t;
import p033S0.C0629w;
import p057d0.C6289k;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: T0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0818j extends AbstractC6453l implements InterfaceC6502p {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C6459r f2142s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ long f2143t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C6461t f2144u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0629w f2145v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C6461t f2146w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C6461t f2147x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0818j(C6459r c6459r, long j2, C6461t c6461t, C0629w c0629w, C6461t c6461t2, C6461t c6461t3) {
        super(2);
        this.f2142s = c6459r;
        this.f2143t = j2;
        this.f2144u = c6461t;
        this.f2145v = c0629w;
        this.f2146w = c6461t2;
        this.f2147x = c6461t3;
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 1) {
            C6459r c6459r = this.f2142s;
            if (c6459r.f24633s) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            c6459r.f24633s = true;
            if (jLongValue < this.f2143t) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            C6461t c6461t = this.f2144u;
            long jM1467l = c6461t.f24635s;
            C0629w c0629w = this.f2145v;
            if (jM1467l == 4294967295L) {
                jM1467l = c0629w.m1467l();
            }
            c6461t.f24635s = jM1467l;
            C6461t c6461t2 = this.f2146w;
            c6461t2.f24635s = c6461t2.f24635s == 4294967295L ? c0629w.m1467l() : 0L;
            C6461t c6461t3 = this.f2147x;
            c6461t3.f24635s = c6461t3.f24635s == 4294967295L ? c0629w.m1467l() : 0L;
        }
        return C6289k.f24318a;
    }
}
