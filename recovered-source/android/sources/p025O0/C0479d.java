package p025O0;

import kotlin.jvm.internal.AbstractC6452k;
import p021M0.InterfaceC0339d;
import p029Q0.C0506f;

/* JADX INFO: renamed from: O0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0479d {

    /* JADX INFO: renamed from: e */
    public static final long[] f1005e = new long[0];

    /* JADX INFO: renamed from: a */
    public final InterfaceC0339d f1006a;

    /* JADX INFO: renamed from: b */
    public final C0506f f1007b;

    /* JADX INFO: renamed from: c */
    public long f1008c;

    /* JADX INFO: renamed from: d */
    public final long[] f1009d;

    public C0479d(InterfaceC0339d descriptor, C0506f c0506f) {
        AbstractC6452k.m12181e(descriptor, "descriptor");
        this.f1006a = descriptor;
        this.f1007b = c0506f;
        int iMo499e = descriptor.mo499e();
        if (iMo499e <= 64) {
            this.f1008c = iMo499e != 64 ? (-1) << iMo499e : 0L;
            this.f1009d = f1005e;
            return;
        }
        this.f1008c = 0L;
        int i2 = (iMo499e - 1) >>> 6;
        long[] jArr = new long[i2];
        if ((iMo499e & 63) != 0) {
            jArr[i2 - 1] = (-1) << iMo499e;
        }
        this.f1009d = jArr;
    }
}
