package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6170E0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6262s0 f24068a;

    /* JADX INFO: renamed from: b */
    public final String f24069b;

    /* JADX INFO: renamed from: c */
    public final Object[] f24070c;

    /* JADX INFO: renamed from: d */
    public final int f24071d;

    public C6170E0(InterfaceC6262s0 interfaceC6262s0, String str, Object[] objArr) {
        this.f24068a = interfaceC6262s0;
        this.f24069b = str;
        this.f24070c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f24071d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 55296) {
                this.f24071d = i2 | (cCharAt2 << i3);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i4 = i5;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m11713a() {
        int i2 = this.f24071d;
        if ((i2 & 1) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }
}
