package p033S0;

import kotlin.jvm.internal.AbstractC6452k;
import p058e0.AbstractC6302j;

/* JADX INFO: renamed from: S0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0630x {

    /* JADX INFO: renamed from: a */
    public final byte[] f1379a;

    /* JADX INFO: renamed from: b */
    public int f1380b;

    /* JADX INFO: renamed from: c */
    public int f1381c;

    /* JADX INFO: renamed from: d */
    public boolean f1382d;

    /* JADX INFO: renamed from: e */
    public final boolean f1383e;

    /* JADX INFO: renamed from: f */
    public C0630x f1384f;

    /* JADX INFO: renamed from: g */
    public C0630x f1385g;

    public C0630x() {
        this.f1379a = new byte[8192];
        this.f1383e = true;
        this.f1382d = false;
    }

    /* JADX INFO: renamed from: a */
    public final C0630x m1472a() {
        C0630x c0630x = this.f1384f;
        if (c0630x == this) {
            c0630x = null;
        }
        C0630x c0630x2 = this.f1385g;
        AbstractC6452k.m12178b(c0630x2);
        c0630x2.f1384f = this.f1384f;
        C0630x c0630x3 = this.f1384f;
        AbstractC6452k.m12178b(c0630x3);
        c0630x3.f1385g = this.f1385g;
        this.f1384f = null;
        this.f1385g = null;
        return c0630x;
    }

    /* JADX INFO: renamed from: b */
    public final void m1473b(C0630x segment) {
        AbstractC6452k.m12181e(segment, "segment");
        segment.f1385g = this;
        segment.f1384f = this.f1384f;
        C0630x c0630x = this.f1384f;
        AbstractC6452k.m12178b(c0630x);
        c0630x.f1385g = segment;
        this.f1384f = segment;
    }

    /* JADX INFO: renamed from: c */
    public final C0630x m1474c() {
        this.f1382d = true;
        return new C0630x(this.f1379a, this.f1380b, this.f1381c, true);
    }

    /* JADX INFO: renamed from: d */
    public final void m1475d(C0630x sink, int i2) {
        AbstractC6452k.m12181e(sink, "sink");
        byte[] bArr = sink.f1379a;
        if (!sink.f1383e) {
            throw new IllegalStateException("only owner can write");
        }
        int i3 = sink.f1381c;
        int i4 = i3 + i2;
        if (i4 > 8192) {
            if (sink.f1382d) {
                throw new IllegalArgumentException();
            }
            int i5 = sink.f1380b;
            if (i4 - i5 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC6302j.m12099u(bArr, 0, bArr, i5, i3);
            sink.f1381c -= sink.f1380b;
            sink.f1380b = 0;
        }
        int i6 = sink.f1381c;
        int i7 = this.f1380b;
        AbstractC6302j.m12099u(this.f1379a, i6, bArr, i7, i7 + i2);
        sink.f1381c += i2;
        this.f1380b += i2;
    }

    public C0630x(byte[] data, int i2, int i3, boolean z) {
        AbstractC6452k.m12181e(data, "data");
        this.f1379a = data;
        this.f1380b = i2;
        this.f1381c = i3;
        this.f1382d = z;
        this.f1383e = false;
    }
}
