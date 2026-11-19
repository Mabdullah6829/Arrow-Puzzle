package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawt {

    /* JADX INFO: renamed from: a */
    public Object f7184a;

    /* JADX INFO: renamed from: b */
    public long f7185b;

    /* JADX INFO: renamed from: c */
    public double f7186c;

    /* JADX INFO: renamed from: d */
    public zzavx f7187d;

    /* JADX INFO: renamed from: e */
    public ArrayList f7188e;

    /* JADX INFO: renamed from: f */
    public zzawl f7189f;

    /* JADX INFO: renamed from: g */
    public int f7190g = 1;

    private zzawt() {
    }

    /* JADX INFO: renamed from: a */
    public static zzawt m4466a(Object obj) {
        zzawt zzawtVar = new zzawt();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iM3770b = AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        zzawtVar.m4483r();
        zzawtVar.f7190g = (i9 % 1937477084) ^ iM3770b;
        zzawtVar.f7184a = obj;
        return zzawtVar;
    }

    /* JADX INFO: renamed from: b */
    public static zzawt m4467b(long j2) {
        zzawt zzawtVar = new zzawt();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iM3770b = AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        zzawtVar.m4483r();
        zzawtVar.f7190g = (i9 % 327254586) ^ iM3770b;
        zzawtVar.f7185b = j2;
        return zzawtVar;
    }

    /* JADX INFO: renamed from: c */
    public static zzawt m4468c(double d) {
        zzawt zzawtVar = new zzawt();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iM3770b = AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        zzawtVar.m4483r();
        zzawtVar.f7190g = (i9 % 1605908235) ^ iM3770b;
        zzawtVar.f7186c = d;
        return zzawtVar;
    }

    /* JADX INFO: renamed from: d */
    public static zzawt m4469d(zzavx zzavxVar) {
        zzawt zzawtVar = new zzawt();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iM3770b = AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        zzawtVar.m4483r();
        zzawtVar.f7190g = (i9 % 1402586708) ^ iM3770b;
        zzawtVar.f7187d = zzavxVar;
        return zzawtVar;
    }

    /* JADX INFO: renamed from: e */
    public static zzawt m4470e(ArrayList arrayList) {
        zzawt zzawtVar = new zzawt();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iM3770b = AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        zzawtVar.m4483r();
        zzawtVar.f7190g = (i9 % 324763920) ^ iM3770b;
        zzawtVar.f7188e = arrayList;
        return zzawtVar;
    }

    /* JADX INFO: renamed from: f */
    public static zzawt m4471f(zzawl zzawlVar) {
        zzawt zzawtVar = new zzawt();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iM3770b = AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        zzawtVar.m4483r();
        zzawtVar.f7190g = (i9 % 474613996) ^ iM3770b;
        zzawtVar.f7189f = zzawlVar;
        return zzawtVar;
    }

    /* JADX INFO: renamed from: g */
    public static zzawt m4472g(Object obj) {
        if (obj instanceof Long) {
            return m4467b(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return m4467b(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return m4467b(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return m4468c(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return m4468c(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return m4467b(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return m4467b(((Byte) obj).byteValue());
        }
        if (obj instanceof zzavx) {
            return m4469d((zzavx) obj);
        }
        if (obj instanceof String) {
            zzavx zzavxVar = zzavx.f7094b;
            return m4469d(zzavx.m4445e(((String) obj).getBytes(Charset.forName(zzavv.m4444a("Hn2H4l0=")))));
        }
        if (!(obj instanceof ArrayList)) {
            return m4466a(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(m4472g(arrayList2.get(i2)));
        }
        return m4470e(arrayList);
    }

    /* JADX INFO: renamed from: j */
    public static zzawt m4473j(zzawt zzawtVar) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        int i7 = iArr[4];
        int i8 = iArr[5];
        int i9 = iArr[6];
        int i10 = iArr[7];
        int iM3770b = AbstractC5152f.m3770b((i4 & (~i3)) | i5, (i3 & i6) | i7, i8, i9);
        int i11 = i10 % 552812661;
        try {
            int i12 = zzawtVar.f7190g;
            int i13 = (i11 ^ iM3770b) + i12;
            if (i12 == 0) {
                throw null;
            }
            switch (i13) {
                case 0:
                    return new zzawt();
                case 1:
                    return m4466a(zzawtVar.m4477l());
                case 2:
                    return m4467b(zzawtVar.m4478m());
                case 3:
                    return m4469d(zzawtVar.m4479n());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = (ArrayList) zzawtVar.m4480o();
                    int size = arrayList2.size();
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        arrayList.add(m4473j((zzawt) obj));
                    }
                    return m4470e(arrayList);
                case 5:
                    return m4471f(zzawtVar.m4481p());
                case 6:
                    return m4468c(zzawtVar.m4482q());
                default:
                    throw new AssertionError(zzavv.m4444a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
            }
        } catch (zzawq e) {
            throw new AssertionError(zzavv.m4444a("CEiv6BFfPnitUE+D"), e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final Object m4474h() throws zzawq {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        int i7 = iArr[4];
        int i8 = iArr[5];
        int i9 = iArr[6];
        int i10 = iArr[7];
        int iM3770b = AbstractC5152f.m3770b((i4 & (~i3)) | i5, (i3 & i6) | i7, i8, i9);
        int i11 = this.f7190g;
        int i12 = ((i10 % 473891334) ^ iM3770b) + i11;
        if (i11 == 0) {
            throw null;
        }
        switch (i12) {
            case 0:
            case 5:
                throw new zzawq();
            case 1:
                return m4477l();
            case 2:
                return Long.valueOf(m4478m());
            case 3:
                return m4479n().m4447a();
            case 4:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) m4480o();
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    arrayList.add(((zzawt) obj).m4474h());
                }
                return arrayList;
            case 6:
                return Double.valueOf(m4482q());
            default:
                throw new AssertionError(zzavv.m4444a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01f4, code lost:
    
        if (r18.equals(java.lang.Object.class) != false) goto L150;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4475i(java.lang.Class r18) throws com.google.android.gms.internal.ads.zzawq {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawt.m4475i(java.lang.Class):java.lang.Object");
    }

    /* JADX INFO: renamed from: k */
    public final void m4476k(ByteArrayOutputStream byteArrayOutputStream) throws IOException, zzawq {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        int i2 = 0;
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        long j10 = (((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + j8;
        long j11 = j9 % 297598514;
        int i3 = this.f7190g;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        switch (i4) {
            case 0:
            case 1:
            case 5:
                throw new zzawq();
            case 2:
                zzavt.m4443b(m4478m(), new zzaws(byteArrayOutputStream), true);
                return;
            case 3:
                byte[] bArr = m4479n().f7096a;
                zzavt.m4443b(((long) bArr.length) * (j10 ^ j11), new zzaws(byteArrayOutputStream), true);
                byteArrayOutputStream.write(bArr);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) m4480o();
                zzavt.m4443b(arrayList.size(), new zzaws(byteArrayOutputStream), true);
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((zzawt) obj).m4476k(byteArrayOutputStream);
                }
                return;
            case 6:
                double dM4482q = m4482q();
                zzaws zzawsVar = new zzaws(byteArrayOutputStream);
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(dM4482q);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.putLong(jDoubleToRawLongBits);
                byte[] bArrArray = byteBufferAllocate.array();
                int length = bArrArray.length;
                while (i2 < length) {
                    zzawsVar.f7183a.write(bArrArray[i2]);
                    i2++;
                }
                int length2 = byteBufferAllocate.array().length;
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: l */
    public final Object m4477l() throws zzawq {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        m4484s((iArr[7] % 235745791) ^ AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8));
        return this.f7184a;
    }

    /* JADX INFO: renamed from: m */
    public final long m4478m() throws zzawq {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        m4484s((iArr[7] % 733327814) ^ AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8));
        return this.f7185b;
    }

    /* JADX INFO: renamed from: n */
    public final zzavx m4479n() throws zzawq {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        m4484s((iArr[7] % 1140384172) ^ AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8));
        return this.f7187d;
    }

    /* JADX INFO: renamed from: o */
    public final List m4480o() throws zzawq {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        m4484s((iArr[7] % 1250801052) ^ AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8));
        return this.f7188e;
    }

    /* JADX INFO: renamed from: p */
    public final zzawl m4481p() throws zzawq {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        m4484s((iArr[7] % 395191309) ^ AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8));
        return this.f7189f;
    }

    /* JADX INFO: renamed from: q */
    public final double m4482q() throws zzawq {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        m4484s((iArr[7] % 846930886) ^ AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8));
        return this.f7186c;
    }

    /* JADX INFO: renamed from: r */
    public final void m4483r() {
        this.f7190g = 1;
        this.f7185b = 0L;
        this.f7184a = null;
        this.f7187d = null;
        this.f7188e = null;
        this.f7189f = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m4484s(int i2) throws zzawq {
        if (i2 != this.f7190g) {
            throw new zzawq();
        }
    }
}
