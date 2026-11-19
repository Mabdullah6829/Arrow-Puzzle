package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.T0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6199T0 {
    /* JADX INFO: renamed from: a */
    public abstract C6201U0 mo11821a(Object obj);

    /* JADX INFO: renamed from: b */
    public final boolean m11822b(int i2, C6263t c6263t, Object obj) throws InvalidProtocolBufferException {
        int i3 = c6263t.f24263b;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        if (i5 == 0) {
            c6263t.m11994w(0);
            ((C6201U0) obj).m11828f(i4 << 3, Long.valueOf(c6263t.f24262a.mo11925r()));
            return true;
        }
        if (i5 == 1) {
            c6263t.m11994w(1);
            ((C6201U0) obj).m11828f((i4 << 3) | 1, Long.valueOf(c6263t.f24262a.mo11922o()));
            return true;
        }
        if (i5 == 2) {
            ((C6201U0) obj).m11828f((i4 << 3) | 2, c6263t.m11976e());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                return false;
            }
            if (i5 != 5) {
                throw InvalidProtocolBufferException.m11740d();
            }
            c6263t.m11994w(5);
            ((C6201U0) obj).m11828f(5 | (i4 << 3), Integer.valueOf(c6263t.f24262a.mo11921n()));
            return true;
        }
        C6201U0 c6201u0 = new C6201U0();
        int i6 = i4 << 3;
        int i7 = i6 | 4;
        int i8 = i2 + 1;
        if (i8 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c6263t.m11972a() != Integer.MAX_VALUE && m11822b(i8, c6263t, c6201u0)) {
        }
        if (i7 != c6263t.f24263b) {
            throw InvalidProtocolBufferException.m11737a();
        }
        if (c6201u0.f24129e) {
            c6201u0.f24129e = false;
        }
        ((C6201U0) obj).m11828f(i6 | 3, c6201u0);
        return true;
    }
}
