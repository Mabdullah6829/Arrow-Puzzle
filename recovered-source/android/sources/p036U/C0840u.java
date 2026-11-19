package p036U;

import p033S0.C0613g;

/* JADX INFO: renamed from: U.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0840u {

    /* JADX INFO: renamed from: a */
    public final C0613g f2302a;

    /* JADX INFO: renamed from: b */
    public int f2303b;

    /* JADX INFO: renamed from: c */
    public int f2304c;

    public C0840u(C0613g c0613g, int i2) {
        this.f2302a = c0613g;
        this.f2303b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1737a(byte[] bArr, int i2, int i3) {
        this.f2302a.write(bArr, i2, i3);
        this.f2303b -= i3;
        this.f2304c += i3;
    }
}
