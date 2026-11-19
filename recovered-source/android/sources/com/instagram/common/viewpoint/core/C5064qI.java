package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5064qI implements InterfaceC201424 {
    public static byte[] A0Z;
    public static String[] A0a = {"V6MXy8T8VWr2uYzGQHXNST8x6mkuL2zq", "NPPhtSRrwFXlj8s5Lf5pJApSSy7nWvZn", "Zwnng2X5IOM1TKGeykh69gCIqoxpb9rN", "EKOvtoarjvrGIuXcg3PsyJc7", "ZiMxAAQ9qCUD5Rc2p4Bdqy2u", "SqcuONG3eBJEqSGEKSqUXXYdrjOnl4qF", "9lDPTqOcDpJIt3QmxvZawHsHRg6Gfk5X", "1hwbvE9Xb2ACzfbNO0itJVr"};
    public static final InterfaceC201323<C5064qI> A0b;
    public static final C5064qI A0c;
    public static final String A0d;
    public static final String A0e;
    public static final String A0f;
    public static final String A0g;
    public static final String A0h;
    public static final String A0i;
    public static final String A0j;
    public static final String A0k;
    public static final String A0l;
    public static final String A0m;
    public static final String A0n;
    public static final String A0o;
    public static final String A0p;
    public static final String A0q;
    public static final String A0r;
    public static final String A0s;
    public static final String A0t;
    public static final String A0u;
    public static final String A0v;
    public static final String A0w;
    public static final String A0x;
    public static final String A0y;
    public static final String A0z;
    public static final String A10;
    public static final String A11;
    public static final String A12;
    public static final String A13;
    public static final String A14;
    public static final String A15;
    public static final String A16;
    public static final String A17;
    public static final String A18;
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final long A0M;
    public final ColorInfo A0N;
    public final DrmInitData A0O;
    public final Metadata A0P;
    public final Object A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final List<byte[]> A0X;
    public final byte[] A0Y;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> T A02(T t, T t2) {
        return t != null ? t : t2;
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Z, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0Z = new byte[]{-38, -50, 0, -12, 47, 32, 73, 76, 71, 59, 78, 2, 81, 29, 37, -12, -24, 35, 31};
    }

    static {
        A05();
        A0c = new C20592p().A14();
        A0p = AbstractC22035C.A0h(0);
        A0r = AbstractC22035C.A0h(1);
        A0s = AbstractC22035C.A0h(2);
        A13 = AbstractC22035C.A0h(3);
        A0z = AbstractC22035C.A0h(4);
        A0e = AbstractC22035C.A0h(5);
        A0w = AbstractC22035C.A0h(6);
        A0g = AbstractC22035C.A0h(7);
        A0u = AbstractC22035C.A0h(8);
        A0i = AbstractC22035C.A0h(9);
        A11 = AbstractC22035C.A0h(10);
        A0t = AbstractC22035C.A0h(11);
        A0q = AbstractC22035C.A0h(12);
        A0k = AbstractC22035C.A0h(13);
        A15 = AbstractC22035C.A0h(14);
        A18 = AbstractC22035C.A0h(15);
        A0o = AbstractC22035C.A0h(16);
        A0n = AbstractC22035C.A0h(17);
        A10 = AbstractC22035C.A0h(18);
        A0x = AbstractC22035C.A0h(19);
        A0y = AbstractC22035C.A0h(20);
        A14 = AbstractC22035C.A0h(21);
        A0h = AbstractC22035C.A0h(22);
        A0f = AbstractC22035C.A0h(23);
        A12 = AbstractC22035C.A0h(24);
        A0v = AbstractC22035C.A0h(25);
        A0l = AbstractC22035C.A0h(26);
        A0m = AbstractC22035C.A0h(27);
        A0d = AbstractC22035C.A0h(28);
        A0j = AbstractC22035C.A0h(29);
        A16 = AbstractC22035C.A0h(30);
        A17 = AbstractC22035C.A0h(31);
        A0b = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.qJ
            @Override // com.instagram.common.viewpoint.core.InterfaceC201323
            public final InterfaceC201424 A6f(Bundle bundle) {
                return C5064qI.A00(bundle);
            }
        };
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Language is not normalized")
    public C5064qI(C20592p c20592p) {
        this.A0T = c20592p.A0R;
        this.A0U = c20592p.A0S;
        if (MetaExoPlayerUpgradeConfig.A03(EnumC4663jX.A0k)) {
            this.A0V = AbstractC22035C.A0k(c20592p.A0T);
        } else {
            this.A0V = c20592p.A0T;
        }
        this.A0H = c20592p.A0F;
        this.A0E = c20592p.A0C;
        this.A04 = c20592p.A03;
        this.A0D = c20592p.A0B;
        this.A05 = this.A0D != -1 ? this.A0D : this.A04;
        this.A0R = c20592p.A0P;
        this.A0P = c20592p.A0N;
        this.A0Q = c20592p.A0O;
        this.A0S = c20592p.A0Q;
        this.A0W = c20592p.A0U;
        this.A0B = c20592p.A09;
        this.A0X = c20592p.A0V == null ? Collections.emptyList() : c20592p.A0V;
        this.A0O = c20592p.A0M;
        this.A0M = c20592p.A0K;
        this.A0L = c20592p.A0J;
        this.A0A = c20592p.A08;
        this.A01 = c20592p.A00;
        this.A0F = c20592p.A0D == -1 ? 0 : c20592p.A0D;
        this.A02 = c20592p.A01 == -1.0f ? 1.0f : c20592p.A01;
        this.A0Y = c20592p.A0W;
        this.A0I = c20592p.A0G;
        this.A0N = c20592p.A0L;
        this.A06 = c20592p.A04;
        this.A0G = c20592p.A0E;
        this.A0C = c20592p.A0A;
        this.A08 = c20592p.A06 == -1 ? 0 : c20592p.A06;
        this.A09 = c20592p.A07 != -1 ? c20592p.A07 : 0;
        this.A03 = c20592p.A02;
        this.A0J = c20592p.A0H;
        this.A0K = c20592p.A0I;
        if (c20592p.A05 != 0 || this.A0O == null) {
            this.A07 = c20592p.A05;
        } else {
            this.A07 = 1;
        }
    }

    public static C5064qI A00(Bundle bundle) {
        C20592p c20592p = new C20592p();
        C213344.A02(bundle);
        c20592p.A0y((String) A02(bundle.getString(A0p), A0c.A0T)).A0z((String) A02(bundle.getString(A0r), A0c.A0U)).A10((String) A02(bundle.getString(A0s), A0c.A0V)).A0n(bundle.getInt(A13, A0c.A0H)).A0k(bundle.getInt(A0z, A0c.A0E)).A0a(bundle.getInt(A0e, A0c.A04)).A0j(bundle.getInt(A0w, A0c.A0D)).A0w((String) A02(bundle.getString(A0g), A0c.A0R)).A0v((Metadata) A02((Metadata) bundle.getParcelable(A0u), A0c.A0P)).A0x((String) A02(bundle.getString(A0i), A0c.A0S)).A11((String) A02(bundle.getString(A11), A0c.A0W)).A0h(bundle.getInt(A0t, A0c.A0B));
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(A03(i2));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i2++;
        }
        c20592p.A12(arrayList).A0u((DrmInitData) bundle.getParcelable(A0k)).A0s(bundle.getLong(A15, A0c.A0M)).A0r(bundle.getInt(A18, A0c.A0L)).A0f(bundle.getInt(A0o, A0c.A0A)).A0X(bundle.getFloat(A0n, A0c.A01)).A0l(bundle.getInt(A10, A0c.A0F)).A0Y(bundle.getFloat(A0x, A0c.A02)).A13(bundle.getByteArray(A0y)).A0o(bundle.getInt(A14, A0c.A0I));
        Bundle bundle2 = bundle.getBundle(A0h);
        if (bundle2 != null) {
            ColorInfo colorInfo = (ColorInfo) ColorInfo.A08.A6f(bundle2);
            String[] strArr = A0a;
            if (strArr[0].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0a;
            strArr2[0] = "Hj6q80mEs2TaNtyFDcR9WAdUhRzKpc2R";
            strArr2[2] = "QNxytj5q4fkMiXjNnIzm1WM2l3yCLldD";
            c20592p.A0t(colorInfo);
        }
        c20592p.A0b(bundle.getInt(A0f, A0c.A06)).A0m(bundle.getInt(A12, A0c.A0G)).A0i(bundle.getInt(A0v, A0c.A0C)).A0d(bundle.getInt(A0l, A0c.A08)).A0e(bundle.getInt(A0m, A0c.A09)).A0Z(bundle.getInt(A0d, A0c.A03)).A0p(bundle.getInt(A16, A0c.A0J)).A0q(bundle.getInt(A17, A0c.A0K)).A0c(bundle.getInt(A0j, A0c.A07));
        return c20592p.A14();
    }

    public static String A03(int i2) {
        return A0q + A04(18, 1, 70) + Integer.toString(i2, 36);
    }

    public final int A06() {
        if (this.A0L == -1) {
            return -1;
        }
        int i2 = this.A0A;
        if (A0a[6].charAt(1) != 'l') {
            throw new RuntimeException();
        }
        A0a[7] = "26nMyN52vPpNzMdMA433IJJ";
        if (i2 == -1) {
            return -1;
        }
        return this.A0A * this.A0L;
    }

    public final C20592p A07() {
        return new C20592p(this);
    }

    public final C5064qI A08(int i2) {
        return A07().A0c(i2).A14();
    }

    @Deprecated
    public final C5064qI A09(DrmInitData drmInitData) {
        return A07().A0u(drmInitData).A14();
    }

    public final boolean A0A(C5064qI c5064qI) {
        if (this.A0X.size() != c5064qI.A0X.size()) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!Arrays.equals(this.A0X.get(i2), c5064qI.A0X.get(i2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0100  */
    /* JADX WARN: Code duplicated, block: B:74:0x0115  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:78:0x012d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0159  */
    /* JADX WARN: Code duplicated, block: B:92:0x0179  */
    /* JADX WARN: Code duplicated, block: B:94:0x018d  */
    public final boolean equals(Object obj) {
        boolean zA1E;
        ColorInfo colorInfo;
        String[] strArr;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5064qI c5064qI = (C5064qI) obj;
        if ((this.A00 == 0 || c5064qI.A00 == 0 || this.A00 == c5064qI.A00) && this.A0H == c5064qI.A0H && this.A0E == c5064qI.A0E && this.A04 == c5064qI.A04) {
            int i2 = this.A0D;
            int i3 = c5064qI.A0D;
            String[] strArr2 = A0a;
            if (strArr2[3].length() == strArr2[4].length()) {
                A0a[6] = "jlfxIixvC9PiZTWMdSrmDOSa0xGb4nh5";
                if (i2 == i3 && this.A0B == c5064qI.A0B && this.A0M == c5064qI.A0M && this.A0L == c5064qI.A0L && this.A0A == c5064qI.A0A && this.A0F == c5064qI.A0F && this.A0I == c5064qI.A0I && this.A06 == c5064qI.A06 && this.A0G == c5064qI.A0G && this.A0C == c5064qI.A0C && this.A08 == c5064qI.A08 && this.A09 == c5064qI.A09 && this.A03 == c5064qI.A03 && this.A0J == c5064qI.A0J && this.A0K == c5064qI.A0K && this.A07 == c5064qI.A07 && Float.compare(this.A01, c5064qI.A01) == 0 && Float.compare(this.A02, c5064qI.A02) == 0 && AbstractC22035C.A1E(this.A0T, c5064qI.A0T) && AbstractC22035C.A1E(this.A0U, c5064qI.A0U) && AbstractC22035C.A1E(this.A0R, c5064qI.A0R)) {
                    boolean zA1E2 = AbstractC22035C.A1E(this.A0S, c5064qI.A0S);
                    if (A0a[6].charAt(1) == 'l') {
                        String[] strArr3 = A0a;
                        strArr3[3] = "KdcHRf6dcCFTttKMl2Gj0X4Z";
                        strArr3[4] = "JmF49wuzlqjC0ZeQQsbCJHl9";
                        if (zA1E2) {
                            zA1E = AbstractC22035C.A1E(this.A0W, c5064qI.A0W);
                            if (A0a[7].length() != 23) {
                                String[] strArr4 = A0a;
                                strArr4[5] = "7ZwCaC2vMYJJrC5vSvijmVTemVnn4Sby";
                                strArr4[1] = "7UklpW8WsZGkqbUQfANf7z94bQwnEZcP";
                                if (zA1E) {
                                    if (AbstractC22035C.A1E(this.A0V, c5064qI.A0V)) {
                                        colorInfo = this.A0N;
                                        strArr = A0a;
                                        if (strArr[5].charAt(27) == strArr[1].charAt(27)) {
                                            String[] strArr5 = A0a;
                                            strArr5[0] = "urAfMcmX6a9OGM37lXvKAx1rZiPgX6ke";
                                            strArr5[2] = "a4vLaNQZdGnZx0xGeF61X6h0zX5Eit9g";
                                            if (!AbstractC22035C.A1E(colorInfo, c5064qI.A0N)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                String[] strArr6 = A0a;
                                strArr6[3] = "vKf0Bvu4u38h4hfjS2f6FEBD";
                                strArr6[4] = "OdKyjmg05VE7Ony73IF4GzhY";
                                if (zA1E) {
                                    if (AbstractC22035C.A1E(this.A0V, c5064qI.A0V)) {
                                        colorInfo = this.A0N;
                                        strArr = A0a;
                                        if (strArr[5].charAt(27) == strArr[1].charAt(27)) {
                                            String[] strArr7 = A0a;
                                            strArr7[0] = "urAfMcmX6a9OGM37lXvKAx1rZiPgX6ke";
                                            strArr7[2] = "a4vLaNQZdGnZx0xGeF61X6h0zX5Eit9g";
                                            if (!AbstractC22035C.A1E(colorInfo, c5064qI.A0N)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (zA1E2) {
                        zA1E = AbstractC22035C.A1E(this.A0W, c5064qI.A0W);
                        if (A0a[7].length() != 23) {
                            String[] strArr8 = A0a;
                            strArr8[5] = "7ZwCaC2vMYJJrC5vSvijmVTemVnn4Sby";
                            strArr8[1] = "7UklpW8WsZGkqbUQfANf7z94bQwnEZcP";
                            if (zA1E) {
                                if (AbstractC22035C.A1E(this.A0V, c5064qI.A0V) && Arrays.equals(this.A0Y, c5064qI.A0Y) && AbstractC22035C.A1E(this.A0P, c5064qI.A0P)) {
                                    colorInfo = this.A0N;
                                    strArr = A0a;
                                    if (strArr[5].charAt(27) == strArr[1].charAt(27)) {
                                        String[] strArr9 = A0a;
                                        strArr9[0] = "urAfMcmX6a9OGM37lXvKAx1rZiPgX6ke";
                                        strArr9[2] = "a4vLaNQZdGnZx0xGeF61X6h0zX5Eit9g";
                                        if (!AbstractC22035C.A1E(colorInfo, c5064qI.A0N) && AbstractC22035C.A1E(this.A0O, c5064qI.A0O) && A0A(c5064qI) && AbstractC22035C.A1E(this.A0Q, c5064qI.A0Q)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        } else {
                            String[] strArr10 = A0a;
                            strArr10[3] = "vKf0Bvu4u38h4hfjS2f6FEBD";
                            strArr10[4] = "OdKyjmg05VE7Ony73IF4GzhY";
                            if (zA1E) {
                                if (AbstractC22035C.A1E(this.A0V, c5064qI.A0V)) {
                                    colorInfo = this.A0N;
                                    strArr = A0a;
                                    if (strArr[5].charAt(27) == strArr[1].charAt(27)) {
                                        String[] strArr11 = A0a;
                                        strArr11[0] = "urAfMcmX6a9OGM37lXvKAx1rZiPgX6ke";
                                        strArr11[2] = "a4vLaNQZdGnZx0xGeF61X6h0zX5Eit9g";
                                        if (!AbstractC22035C.A1E(colorInfo, c5064qI.A0N)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        if (this.A00 == 0) {
            int i2 = 17 * 31;
            int result = this.A0T == null ? 0 : this.A0T.hashCode();
            int result2 = (((i2 + result) * 31) + (this.A0U != null ? this.A0U.hashCode() : 0)) * 31;
            int result3 = this.A0V == null ? 0 : this.A0V.hashCode();
            int result4 = (((result2 + result3) * 31) + this.A0H) * 31;
            int result5 = this.A0E;
            int result6 = (((result4 + result5) * 31) + this.A04) * 31;
            int result7 = this.A0D;
            int i3 = (result6 + result7) * 31;
            if (this.A0R == null) {
                iHashCode = 0;
            } else {
                String str = this.A0R;
                String[] strArr = A0a;
                if (strArr[0].charAt(2) == strArr[2].charAt(2)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0a;
                strArr2[3] = "TXy1YAbF7Qkyl7ROldsNtIji";
                strArr2[4] = "lt4q3TmvSSK0Q54eRVJBBfw2";
                iHashCode = str.hashCode();
            }
            int result8 = (i3 + iHashCode) * 31;
            int result9 = this.A0P == null ? 0 : this.A0P.hashCode();
            int result10 = (((result8 + result9) * 31) + (this.A0Q == null ? 0 : this.A0Q.hashCode())) * 31;
            int result11 = this.A0S == null ? 0 : this.A0S.hashCode();
            int result12 = (result10 + result11) * 31;
            int iHashCode2 = this.A0W != null ? this.A0W.hashCode() : 0;
            int result13 = this.A0B;
            int result14 = (((((result12 + iHashCode2) * 31) + result13) * 31) + ((int) this.A0M)) * 31;
            int result15 = this.A0L;
            int result16 = (((result14 + result15) * 31) + this.A0A) * 31;
            int result17 = Float.floatToIntBits(this.A01);
            int result18 = (((result16 + result17) * 31) + this.A0F) * 31;
            int result19 = Float.floatToIntBits(this.A02);
            int result20 = (((result18 + result19) * 31) + this.A0I) * 31;
            int result21 = this.A06;
            int result22 = (((result20 + result21) * 31) + this.A0G) * 31;
            int result23 = this.A0C;
            int result24 = (((result22 + result23) * 31) + this.A08) * 31;
            int result25 = this.A09;
            int result26 = (((result24 + result25) * 31) + this.A03) * 31;
            int result27 = this.A0J;
            int result28 = (((result26 + result27) * 31) + this.A0K) * 31;
            int result29 = this.A07;
            this.A00 = result28 + result29;
        }
        return this.A00;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder().append(A04(5, 7, 96)).append(this.A0T);
        String strA04 = A04(0, 2, 52);
        return sbAppend.append(strA04).append(this.A0U).append(strA04).append(this.A0S).append(strA04).append(this.A0W).append(strA04).append(this.A0R).append(strA04).append(this.A05).append(strA04).append(this.A0V).append(A04(2, 3, 90)).append(this.A0L).append(strA04).append(this.A0A).append(strA04).append(this.A01).append(A04(14, 4, 78)).append(this.A06).append(strA04).append(this.A0G).append(A04(12, 2, C1137R.styleable.ConstraintSet_transitionPathRotate)).toString();
    }
}
