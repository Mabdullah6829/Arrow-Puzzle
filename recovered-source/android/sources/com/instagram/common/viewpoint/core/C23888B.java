package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Log;
import androidx.core.location.LocationRequestCompat;
import com.facebook.ads.AdError;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8B */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23888B implements InterfaceC5000pF {
    public static byte[] A0M;
    public static String[] A0N = {"gtbAICrdQ5OiLd8QtlGJkysA4GOuQAyl", "NB4BeTTq5ijHDPStUBIG2cd4hjVw3Rms", "uuMr3aWTfRr6VJnGuPPVK2CIrmsp3XMP", "Eb6am5ksZvZ5Hz0HFQHbX0NWivmHdCO7", "qnDH", "QayiUw4ouBPhcoxDO7fR8OixzHh3DuJf", "V84YazX1IDZHbq2m95FMlzDl0u9g04ST", "S22pIk311xlkEmMZRooVtOw4dNPxaWRF"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public InterfaceC5000pF A06;
    public C22355i A07;
    public C22355i A08;

    @MetaExoPlayerCustomization
    public C3244ML A09;
    public C3258MZ A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC5000pF A0D;
    public final InterfaceC5000pF A0E;
    public final InterfaceC5000pF A0F;
    public final InterfaceC3248MP A0G;
    public final InterfaceC3251MS A0H;
    public final InterfaceC3257MY A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0M, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b = bArrCopyOfRange[i5];
            if (A0N[4].length() == 12) {
                throw new RuntimeException();
            }
            A0N[4] = "VXYuEglycDYgl";
            bArrCopyOfRange[i5] = (byte) ((b ^ i4) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0M = new byte[]{25, 59, 57, 50, 63, 30, 59, 46, 59, 9, 53, 47, 40, 57, 63, 22, 58, 32, 57, 49, 59, 114, 33, 117, 32, 37, 49, 52, 33, 48, 117, 39, 48, 49, 60, 39, 48, 54, 33, 48, 49, 117, 0, 7, 28, 123, 117, 1, 61, 60, 38, 117, 56, 60, 50, 61, 33, 117, 54, 52, 32, 38, 48, 117, 39, 48, 57, 52, 33, 60, 35, 48, 117, 0, 7, 28, 38, 117, 50, 48, 33, 117, 39, 48, 38, 58, 57, 35, 48, 49, 117, 60, 59, 54, 58, 39, 39, 48, 54, 33, 57, 44, 123, 95, 94, 115, 81, 83, 88, 85, 84, 114, 73, 68, 85, 67, 98, 85, 81, 84};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    @MetaExoPlayerCustomization("usage of fbDataSpecExtension and the check for isInitSegment")
    public final long AGi(C22355i c22355i) throws IOException {
        try {
            String strA4l = this.A0I.A4l(c22355i);
            C22355i c22355iA09 = c22355i.A04().A08(strA4l).A09();
            this.A08 = c22355iA09;
            this.A05 = A01(this.A0G, strA4l, c22355iA09.A06);
            this.A03 = c22355i.A04;
            this.A09 = new C3244ML(c22355i.A07);
            this.A0B = A00(c22355i) != -1;
            boolean z = this.A0B;
            if (this.A0B) {
                this.A00 = -1L;
            } else {
                this.A00 = AbstractC3268Mj.A00(this.A0G.A7S(strA4l));
                if (this.A00 != -1) {
                    this.A00 -= c22355i.A04;
                    if (this.A00 < 0) {
                        throw new C22285b(AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            }
            boolean z2 = c22355i.A07.A08 <= 0 && c22355i.A07.A07 <= 0;
            if (c22355i.A03 != -1) {
                this.A00 = this.A00 == -1 ? c22355i.A03 : Math.min(this.A00, c22355i.A03);
            }
            if (this.A00 > 0 || this.A00 == -1) {
                A06(c22355iA09, false, z2);
            }
            return c22355i.A03 != -1 ? c22355i.A03 : this.A00;
        } catch (Throwable th) {
            A09(th);
            throw th;
        }
    }

    static {
        A05();
    }

    public C23888B(InterfaceC3248MP interfaceC3248MP, InterfaceC5000pF interfaceC5000pF, InterfaceC5000pF interfaceC5000pF2, InterfaceC22235W interfaceC22235W, InterfaceC3257MY interfaceC3257MY, int i2, AbstractC21073d abstractC21073d, int i3, InterfaceC3251MS interfaceC3251MS) {
        this.A0G = interfaceC3248MP;
        this.A0D = interfaceC5000pF2;
        this.A0I = interfaceC3257MY == null ? InterfaceC3257MY.A00 : interfaceC3257MY;
        this.A0J = (i2 & 1) != 0;
        this.A0L = (i2 & 2) != 0;
        this.A0K = (i2 & 4) != 0;
        if (interfaceC5000pF != null) {
            interfaceC5000pF = abstractC21073d != null ? new C2500AH(interfaceC5000pF, abstractC21073d, i3) : interfaceC5000pF;
            this.A0F = interfaceC5000pF;
            this.A0E = interfaceC22235W != null ? new C2498AF(interfaceC5000pF, interfaceC22235W) : null;
        } else {
            this.A0F = C2501AI.A02;
            this.A0E = null;
        }
        this.A0H = interfaceC3251MS;
    }

    private int A00(C22355i c22355i) {
        if (this.A0L && this.A0C) {
            return 0;
        }
        if (this.A0K && c22355i.A03 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(InterfaceC3248MP interfaceC3248MP, String str, Uri redirectedUri) {
        Uri redirectedUri2 = AbstractC3268Mj.A01(interfaceC3248MP.A7S(str));
        return redirectedUri2 != null ? redirectedUri2 : redirectedUri;
    }

    private void A03() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.close();
            this.A07 = null;
            this.A06 = null;
            if (A0N[5].charAt(3) == 'i') {
                String[] strArr = A0N;
                strArr[2] = "vHGwoIowQcJHPzt2zHibHrQYTuNv4ZzT";
                strArr[1] = "k7MJrtNgTHKuOTKhmFADSg5K1rHaIFar";
                if (this.A0A != null) {
                    InterfaceC3248MP interfaceC3248MP = this.A0G;
                    if (A0N[6].charAt(29) == '4') {
                        String[] strArr2 = A0N;
                        strArr2[2] = "npCyc8crYVBLSlKGvChDlZdzdxvHOR7S";
                        strArr2[1] = "yWpl1AKn1flVHx0rOJ2JJIdMQnxjFkRn";
                        interfaceC3248MP.AHg(this.A0A);
                        this.A0A = null;
                        return;
                    }
                } else {
                    return;
                }
            }
            throw new RuntimeException();
        } catch (Throwable th) {
            this.A07 = null;
            this.A06 = null;
            if (this.A0A != null) {
                this.A0G.AHg(this.A0A);
                this.A0A = null;
            }
            throw th;
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A7A();
            throw new NullPointerException(A02(103, 17, 44));
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    @MetaExoPlayerCustomization("Parameter isInitSegment and all ot is usages. Setting mFbDataSpecExtension in nextDataSpec. Call to maybeUpdateRedirectedUriMetadata at the end")
    private void A06(C22355i c22355i, boolean z, boolean z2) throws Throwable {
        C3258MZ c3258mzAKA;
        long jMin;
        C22355i c22355iA09;
        InterfaceC5000pF interfaceC5000pF;
        long j2;
        Uri uri;
        long j3;
        String str = (String) AbstractC22035C.A0f(c22355i.A08);
        EnumC3246MN enumC3246MN = z2 ? EnumC3246MN.A03 : EnumC3246MN.A06;
        if (this.A0B) {
            c3258mzAKA = null;
        } else if (this.A0J) {
            try {
                c3258mzAKA = this.A0G.AKA(str, this.A03, this.A00, enumC3246MN);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            str = str;
            c3258mzAKA = this.A0G.AKB(str, this.A03, this.A00, enumC3246MN);
        }
        if (c3258mzAKA == null) {
            interfaceC5000pF = this.A0F;
            c22355iA09 = c22355i.A04().A04(this.A03).A03(this.A00).A07(this.A09).A09();
        } else {
            boolean z3 = c3258mzAKA.A05;
            String[] strArr = A0N;
            if (strArr[0].charAt(4) == strArr[7].charAt(4)) {
                A0N[5] = "u32inRltH66jjh9yXIb3cYFcwSkjtAHW";
                if (z3) {
                    Uri uriFromFile = Uri.fromFile((File) AbstractC22035C.A0f(c3258mzAKA.A03));
                    long j4 = c3258mzAKA.A02;
                    long j5 = this.A03 - j4;
                    long jMin2 = c3258mzAKA.A01 - j5;
                    if (this.A00 != -1) {
                        jMin2 = Math.min(jMin2, this.A00);
                    }
                    c22355iA09 = c22355i.A04().A06(uriFromFile).A05(j4).A04(j5).A03(jMin2).A07(this.A09).A09();
                    interfaceC5000pF = this.A0D;
                } else {
                    if (c3258mzAKA.A04()) {
                        jMin = this.A00;
                    } else {
                        jMin = c3258mzAKA.A01;
                        if (this.A00 != -1) {
                            jMin = Math.min(jMin, this.A00);
                        }
                    }
                    c22355iA09 = c22355i.A04().A04(this.A03).A03(jMin).A07(this.A09).A09();
                    if (this.A0E != null) {
                        interfaceC5000pF = this.A0E;
                    } else {
                        interfaceC5000pF = this.A0F;
                        this.A0G.AHg(c3258mzAKA);
                        c3258mzAKA = null;
                    }
                }
            }
            throw new RuntimeException();
        }
        boolean z4 = this.A0B;
        if (A0N[5].charAt(3) == 'i') {
            String[] strArr2 = A0N;
            strArr2[0] = "KvC0Ia1A4x1eGi9X8aRBDgkMlzCJszIJ";
            strArr2[7] = "nNrFIIpUFsn1fqvNydhqNDEn907tEQAg";
            if (!z4 && interfaceC5000pF == this.A0F) {
                j2 = this.A03 + 102400;
            } else {
                j2 = LocationRequestCompat.PASSIVE_INTERVAL;
            }
            this.A01 = j2;
            if (z) {
                AbstractC21273y.A08(A0A());
                InterfaceC5000pF interfaceC5000pF2 = this.A0F;
                if (A0N[3].charAt(26) == 'u') {
                    Throwable e = new RuntimeException();
                    throw e;
                }
                A0N[5] = "8XoiTPgLcR8ApVu7jrAIE2ygde6TsOz1";
                if (interfaceC5000pF == interfaceC5000pF2) {
                    return;
                }
                try {
                    A03();
                } catch (Throwable th) {
                    if (((C3258MZ) AbstractC22035C.A0f(c3258mzAKA)).A03()) {
                        this.A0G.AHg(c3258mzAKA);
                    }
                    throw th;
                }
            }
            if (c3258mzAKA != null && c3258mzAKA.A03()) {
                this.A0A = c3258mzAKA;
            }
            this.A06 = interfaceC5000pF;
            this.A07 = c22355iA09;
            this.A02 = 0L;
            long jAGi = interfaceC5000pF.AGi(c22355iA09);
            C3270Ml c3270Ml = new C3270Ml();
            if (c22355iA09.A03 == -1) {
                if (A0N[4].length() != 12) {
                    A0N[3] = "AihO48tXyqmUqd3oId9EAGnNfKcJ6kuS";
                    if (jAGi != -1) {
                        this.A00 = jAGi;
                        j3 = this.A03 + this.A00;
                        if (A0N[5].charAt(3) != 'i') {
                            throw new RuntimeException();
                        }
                        A0N[3] = "iUSWGyHOgLgD9ZjfpDxtLA9tGfi2lrY2";
                        C3270Ml.A00(c3270Ml, j3);
                    }
                } else if (jAGi != -1) {
                    this.A00 = jAGi;
                    j3 = this.A03 + this.A00;
                    if (A0N[5].charAt(3) != 'i') {
                        throw new RuntimeException();
                    }
                    A0N[3] = "iUSWGyHOgLgD9ZjfpDxtLA9tGfi2lrY2";
                    C3270Ml.A00(c3270Ml, j3);
                }
            }
            if (A0C()) {
                this.A05 = interfaceC5000pF.A9P();
                boolean isRedirected = !c22355i.A06.equals(this.A05);
                if (A0N[4].length() != 12) {
                    A0N[4] = "aty3owKlrPhsH";
                    if (isRedirected) {
                        uri = this.A05;
                    } else {
                        uri = null;
                    }
                    C3270Ml.A01(c3270Ml, uri);
                }
            }
            if (A0D()) {
                this.A0G.A4E(str, c3270Ml);
            }
            A08(str, this.A05);
            return;
        }
        throw new RuntimeException();
    }

    private void A07(String str) throws IOException {
        this.A00 = 0L;
        if (A0D()) {
            C3270Ml c3270Ml = new C3270Ml();
            C3270Ml.A00(c3270Ml, this.A03);
            this.A0G.A4E(str, c3270Ml);
        }
    }

    @MetaExoPlayerCustomization
    private void A08(String str, Uri uri) {
        if (!A0D()) {
            return;
        }
        C3270Ml c3270Ml = new C3270Ml();
        if (!uri.equals(this.A05)) {
            Uri uri2 = this.A05;
            if (A0N[6].charAt(29) != '4') {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "HwBuIJEC6JIKumxqgSDJ0pUKIwQFYzQv";
            strArr[7] = "1FgFIXgVQckXZ73NbznNhujKeCbi6Slt";
            C3270Ml.A01(c3270Ml, uri2);
        } else {
            C3270Ml.A01(c3270Ml, null);
        }
        try {
            this.A0G.A4E(str, c3270Ml);
        } catch (C3245MM e) {
            String message = A02(15, 88, 73);
            Log.w(A02(0, 15, 70), message, e);
        }
    }

    private void A09(Throwable th) {
        if (A0B() || (th instanceof C3245MM)) {
            this.A0C = true;
        }
    }

    private boolean A0A() {
        return this.A06 == this.A0F;
    }

    private boolean A0B() {
        return this.A06 == this.A0D;
    }

    private boolean A0C() {
        return !A0B();
    }

    private boolean A0D() {
        return this.A06 == this.A0E;
    }

    public final InterfaceC3248MP A0E() {
        return this.A0G;
    }

    public final InterfaceC3257MY A0F() {
        return this.A0I;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final void A43(InterfaceC22465t interfaceC22465t) {
        AbstractC21273y.A01(interfaceC22465t);
        this.A0D.A43(interfaceC22465t);
        this.A0F.A43(interfaceC22465t);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final Map<String, List<String>> A8t() {
        if (A0C()) {
            return this.A0F.A8t();
        }
        return Collections.emptyMap();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final Uri A9P() {
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final void close() throws IOException {
        this.A08 = null;
        this.A05 = null;
        this.A03 = 0L;
        A04();
        try {
            A03();
        } catch (Throwable e) {
            A09(e);
            throw e;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC20482c
    public final int read(byte[] bArr, int i2, int i3) throws Throwable {
        if (i3 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        C22355i currentDataSpec = (C22355i) AbstractC21273y.A01(this.A08);
        C22355i c22355i = (C22355i) AbstractC21273y.A01(this.A07);
        try {
            if (this.A03 >= this.A01) {
                A06(currentDataSpec, true, false);
            }
            try {
                int bytesRead = ((InterfaceC5000pF) AbstractC21273y.A01(this.A06)).read(bArr, i2, i3);
                if (bytesRead != -1) {
                    if (A0B()) {
                        this.A04 += (long) bytesRead;
                    }
                    this.A03 += (long) bytesRead;
                    this.A02 += (long) bytesRead;
                    if (this.A00 != -1) {
                        this.A00 -= (long) bytesRead;
                    }
                } else if (A0C() && (c22355i.A03 == -1 || this.A02 < c22355i.A03)) {
                    A07((String) AbstractC22035C.A0f(currentDataSpec.A08));
                } else if (this.A00 > 0 || this.A00 == -1) {
                    A03();
                    A06(currentDataSpec, false, false);
                    return read(bArr, i2, i3);
                }
                return bytesRead;
            } catch (Throwable th) {
                e = th;
                A09(e);
                throw e;
            }
        } catch (Throwable th2) {
            e = th2;
        }
    }
}
