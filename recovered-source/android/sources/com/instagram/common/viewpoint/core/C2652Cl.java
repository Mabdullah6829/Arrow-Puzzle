package com.instagram.common.viewpoint.core;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.widget.C1137R;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2652Cl implements InterfaceC4445fv {
    public static byte[] A07;
    public static String[] A08 = {"QhNFYJC9gEUd0JRpeTZcIYaCPwaofmcY", "H7lFuH2c6lRKE1KzrEc8woYXA3m4qwgD", "VasthUCsKtAfJQ49O69n9k2VDB8sk6Ry", "CLNAbcda3kskZ9l1P61KK9o7E81JDy0P", "FTSbac7VR6oRDuoXxASKkUBG2ay4Jl1O", "oDWQMCtwqliv6oQHoqRk4BTd2HTxQUcC", "maa7C87UpzAlS2qduOc8uqrscl2NkhxH", ""};
    public static final String A09;
    public InterfaceC3689Tc A00;
    public Executor A01;
    public boolean A02;
    public C4450g0 A03;
    public final InterfaceC4455g5 A04 = new C2661Cu();
    public final InterfaceC4460gA A05;
    public final InterfaceC4461gB A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final InterfaceC4444fu A01(AbstractC4457g7 abstractC4457g7) throws C4458g8 {
        C4458g8 c4458g8;
        String strA07 = A07(220, 7, 86);
        HttpURLConnection httpURLConnection = null;
        C2653Cm c2653CmA05 = null;
        boolean z = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection httpURLConnectionA08 = A08(abstractC4457g7.A05(), C3906XD.A04() ? A09() : null);
                A0H(httpURLConnectionA08, abstractC4457g7);
                A0G(httpURLConnectionA08, abstractC4457g7);
                if (this.A06.AAZ()) {
                    this.A06.ABt(httpURLConnectionA08, abstractC4457g7.A06());
                }
                httpURLConnectionA08.connect();
                this.A02 = true;
                Set<String> setA01 = this.A03.A01();
                Set<String> setA02 = this.A03.A02();
                boolean z2 = (setA01 == null || setA01.isEmpty()) ? false : true;
                if (setA02 != null && !setA02.isEmpty()) {
                    z = true;
                }
                if ((httpURLConnectionA08 instanceof HttpsURLConnection) && (z2 || z)) {
                    try {
                        AbstractC4462gC.A03((HttpsURLConnection) httpURLConnectionA08, setA01, setA02);
                    } catch (CertificateException e) {
                        this.A00.ABz(strA07, AbstractC3690Td.A1z, new C3691Te(e));
                    } catch (Exception e2) {
                        this.A00.ABz(strA07, AbstractC3690Td.A1y, new C3691Te(e2));
                    }
                }
                if (httpURLConnectionA08.getDoOutput() && abstractC4457g7.A06() != null) {
                    A00(httpURLConnectionA08, abstractC4457g7.A06());
                }
                C2653Cm c2653CmA06 = httpURLConnectionA08.getDoInput() ? A06(httpURLConnectionA08) : new C2653Cm(httpURLConnectionA08, null);
                if (this.A06.AAZ()) {
                    this.A06.ABu(c2653CmA06);
                }
                if (httpURLConnectionA08 != null) {
                    httpURLConnectionA08.disconnect();
                }
                return c2653CmA06;
            } catch (Throwable th) {
                if (this.A06.AAZ()) {
                    this.A06.ABu(c2653CmA05);
                }
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Exception e3) {
            try {
                try {
                    c2653CmA05 = A05(null);
                    if (A08[7].length() == 19) {
                        throw new RuntimeException();
                    }
                    A08[5] = "6Q02gTcavt1J3D6llCgnQfsLExV7BLlB";
                    if (c2653CmA05 == null || c2653CmA05.A9C() <= 0) {
                        c4458g8 = new C4458g8(e3, c2653CmA05);
                        throw c4458g8;
                    }
                    if (this.A06.AAZ()) {
                        this.A06.ABu(c2653CmA05);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return c2653CmA05;
                } catch (Throwable unused) {
                    if (c2653CmA05 == null || c2653CmA05.A9C() <= 0) {
                        throw new C4458g8(e3, c2653CmA05);
                    }
                    if (this.A06.AAZ()) {
                        this.A06.ABu(c2653CmA05);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return c2653CmA05;
                }
            } catch (Exception unused2) {
                Log.e(getClass().getSimpleName(), A07(C1137R.styleable.ConstraintSet_pivotAnchor, 13, 98), e3);
                if (0 != 0 && c2653CmA05.A9C() > 0) {
                    if (this.A06.AAZ()) {
                        this.A06.ABu(null);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                }
                c4458g8 = new C4458g8(e3, null);
            }
        }
    }

    public static String A07(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{59, 57, 102, 107, 14, 102, 100, 77, 64, 9, 77, 79, 30, 93, 75, 76, 82, 30, 42, 99, 121, 42, 100, 101, 126, 42, 107, 42, 124, 107, 102, 99, 110, 42, 95, 88, 70, 80, 31, 22, 80, 75, 120, 116, 23, 0, 116, 105, 116, 55, 59, 73, 79, 59, 38, 59, 38, 42, 126, 120, 115, 99, 100, 109, 42, 94, 4, 34, 43, 38, 55, 52, 34, 35, 71, 51, 46, 42, 34, 71, 90, 71, 71, 101, 116, 116, 105, 110, 103, 32, 116, 104, 101, 32, 104, 116, 116, 112, 32, 114, 101, 115, 112, 111, 110, 115, 101, 32, 116, 105, 109, 101, 100, 32, 111, 117, 116, 61, 22, 7, 4, 28, 1, 24, 83, 22, 1, 1, 28, 1, 23, 22, 4, 111, 122, 22, 7, 7, 27, 30, 20, 22, 3, 30, 24, 25, 88, 15, 90, 0, 0, 0, 90, 17, 24, 5, 26, 90, 2, 5, 27, 18, 25, 20, 24, 19, 18, 19, 76, 20, 31, 22, 5, 4, 18, 3, 74, 34, 35, 49, 90, 79, 89, 79, 72, 86, 26, 23, 81, 26, 23, 83, 120, 100, 100, 96, 62, 96, 98, 127, 104, 105, 88, 127, 99, 100, 27, 7, 7, 3, 93, 3, 1, 28, 11, 10, 35, 28, 1, 7, 41, 34, 51, 48, 40, 53, 44};
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x011a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0123  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0133  */
    /* JADX WARN: Code duplicated, block: B:55:0x013f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144  */
    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:58:0x0150  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 31
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final InterfaceC4444fu A0J(AbstractC4457g7 abstractC4457g7) throws C4458g8 {
        InterfaceC4444fu interfaceC4444fuA00;
        long length;
        long length2;
        int iA9C;
        int i2 = 0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA01 = abstractC4457g7.A02().A01();
        long jA03 = abstractC4457g7.A02().A03();
        long jCurrentTimeMillis2 = System.currentTimeMillis() + ((long) abstractC4457g7.A02().A04());
        while (true) {
            if (i2 >= iA01 || jCurrentTimeMillis2 <= System.currentTimeMillis()) {
                break;
            }
            try {
                if (this.A06.AAZ()) {
                    String str = (i2 + 1) + A07(37, 4, 97) + iA01 + A07(56, 9, 27) + abstractC4457g7.A05();
                }
                jCurrentTimeMillis = System.currentTimeMillis();
                InterfaceC4444fu interfaceC4444fuA01 = A01(abstractC4457g7);
                if (interfaceC4444fuA01 != null) {
                    this.A00.ABo(jCurrentTimeMillis, System.currentTimeMillis() - jCurrentTimeMillis, interfaceC4444fuA01.A72().length, abstractC4457g7.A04 == null ? 0L : abstractC4457g7.A04.length, interfaceC4444fuA01.A9C(), null);
                    return interfaceC4444fuA01;
                }
                continue;
            } catch (C4458g8 e) {
                if (!A0I(e, jCurrentTimeMillis, abstractC4457g7)) {
                    if (this.A05.ADs(e)) {
                    }
                    interfaceC4444fuA00 = e.A00();
                    InterfaceC3689Tc interfaceC3689Tc = this.A00;
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (A08[1].charAt(0) != 'l') {
                        A08[4] = "ETXEAYq6mx6OG4ZVoxEdED8XICrn9DEf";
                        if (interfaceC4444fuA00 != null) {
                            if (interfaceC4444fuA00.A72() == null) {
                                length = interfaceC4444fuA00.A72().length;
                            }
                        }
                        if (abstractC4457g7.A04 == null) {
                            length2 = 0;
                        } else {
                            length2 = abstractC4457g7.A04.length;
                        }
                        if (interfaceC4444fuA00 == null) {
                            iA9C = 0;
                        } else {
                            iA9C = interfaceC4444fuA00.A9C();
                        }
                        interfaceC3689Tc.ABo(jCurrentTimeMillis, jCurrentTimeMillis3, length, length2, iA9C, e);
                        throw e;
                    }
                    A08[1] = "GUaOJDLzyYCGW5Cxc7undAaXJNT5GVew";
                    if (interfaceC4444fuA00 != null) {
                        if (interfaceC4444fuA00.A72() == null) {
                            length = interfaceC4444fuA00.A72().length;
                        }
                    }
                    if (abstractC4457g7.A04 == null) {
                        length2 = 0;
                    } else {
                        length2 = abstractC4457g7.A04.length;
                    }
                    if (interfaceC4444fuA00 == null) {
                        iA9C = 0;
                    } else {
                        iA9C = interfaceC4444fuA00.A9C();
                    }
                    interfaceC3689Tc.ABo(jCurrentTimeMillis, jCurrentTimeMillis3, length, length2, iA9C, e);
                    throw e;
                    length = 0;
                    if (abstractC4457g7.A04 == null) {
                        length2 = 0;
                    } else {
                        length2 = abstractC4457g7.A04.length;
                    }
                    if (interfaceC4444fuA00 == null) {
                        iA9C = 0;
                    } else {
                        iA9C = interfaceC4444fuA00.A9C();
                    }
                    interfaceC3689Tc.ABo(jCurrentTimeMillis, jCurrentTimeMillis3, length, length2, iA9C, e);
                    throw e;
                }
                int i3 = iA01 - 1;
                if (A08[1].charAt(0) == 'l') {
                    throw new RuntimeException();
                }
                A08[1] = "iDEOxz3pTPjJqVLmMx3mPs9K2XOoyKBI";
                if (i2 < i3) {
                    continue;
                } else {
                    if (this.A05.ADs(e) || i2 >= iA01 - 1) {
                        interfaceC4444fuA00 = e.A00();
                        InterfaceC3689Tc interfaceC3689Tc2 = this.A00;
                        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (A08[1].charAt(0) != 'l') {
                            A08[4] = "ETXEAYq6mx6OG4ZVoxEdED8XICrn9DEf";
                            if (interfaceC4444fuA00 != null) {
                                if (interfaceC4444fuA00.A72() == null) {
                                    length = interfaceC4444fuA00.A72().length;
                                }
                            }
                            if (abstractC4457g7.A04 == null) {
                                length2 = 0;
                            } else {
                                length2 = abstractC4457g7.A04.length;
                            }
                            if (interfaceC4444fuA00 == null) {
                                iA9C = 0;
                            } else {
                                iA9C = interfaceC4444fuA00.A9C();
                            }
                            interfaceC3689Tc2.ABo(jCurrentTimeMillis, jCurrentTimeMillis4, length, length2, iA9C, e);
                            throw e;
                        }
                        A08[1] = "GUaOJDLzyYCGW5Cxc7undAaXJNT5GVew";
                        if (interfaceC4444fuA00 != null) {
                            if (interfaceC4444fuA00.A72() == null) {
                                length = interfaceC4444fuA00.A72().length;
                            }
                        }
                        if (abstractC4457g7.A04 == null) {
                            length2 = 0;
                        } else {
                            length2 = abstractC4457g7.A04.length;
                        }
                        if (interfaceC4444fuA00 == null) {
                            iA9C = 0;
                        } else {
                            iA9C = interfaceC4444fuA00.A9C();
                        }
                        interfaceC3689Tc2.ABo(jCurrentTimeMillis, jCurrentTimeMillis4, length, length2, iA9C, e);
                        throw e;
                        length = 0;
                        if (abstractC4457g7.A04 == null) {
                            length2 = 0;
                        } else {
                            length2 = abstractC4457g7.A04.length;
                        }
                        if (interfaceC4444fuA00 == null) {
                            iA9C = 0;
                        } else {
                            iA9C = interfaceC4444fuA00.A9C();
                        }
                        interfaceC3689Tc2.ABo(jCurrentTimeMillis, jCurrentTimeMillis4, length, length2, iA9C, e);
                        throw e;
                    }
                    if (jA03 > 0) {
                        try {
                            Thread.sleep(jA03);
                        } catch (InterruptedException e2) {
                            this.A00.ABo(jCurrentTimeMillis, System.currentTimeMillis() - jCurrentTimeMillis, 0L, abstractC4457g7.A04 != null ? abstractC4457g7.A04.length : 0L, 0, e2);
                            throw e;
                        }
                    } else {
                        continue;
                    }
                }
            }
            i2++;
        }
        this.A00.ABo(jCurrentTimeMillis, System.currentTimeMillis() - jCurrentTimeMillis, 0L, abstractC4457g7.A04 == null ? 0L : abstractC4457g7.A04.length, 0, new TimeoutException(A07(82, 35, 17)));
        return null;
    }

    static {
        A0A();
        A09 = InterfaceC4445fv.class.getSimpleName();
    }

    public C2652Cl(C4450g0 c4450g0, InterfaceC3689Tc interfaceC3689Tc, Executor executor) {
        A0B();
        this.A03 = c4450g0;
        this.A06 = new C2651Ck(c4450g0.A04());
        final InterfaceC4461gB interfaceC4461gB = this.A06;
        this.A05 = new AbstractC2660Ct(interfaceC4461gB) { // from class: com.facebook.ads.redexgen.X.2i
        };
        this.A01 = executor;
        this.A00 = interfaceC3689Tc;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStreamAGn = null;
        try {
            outputStreamAGn = this.A05.AGn(httpURLConnection);
            if (outputStreamAGn != null) {
                this.A05.AL8(outputStreamAGn, bArr);
            }
            return httpURLConnection.getResponseCode();
        } finally {
            if (outputStreamAGn != null) {
                try {
                    outputStreamAGn.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    private final InterfaceC4444fu A02(AbstractC4457g7 abstractC4457g7) {
        if (this.A03.A04()) {
            A0C(abstractC4457g7);
        }
        InterfaceC4444fu interfaceC4444fuA01 = null;
        try {
            interfaceC4444fuA01 = A01(abstractC4457g7);
            return interfaceC4444fuA01;
        } catch (C4458g8 hre) {
            this.A05.ADs(hre);
            return interfaceC4444fuA01;
        } catch (Exception e) {
            this.A05.ADs(new C4458g8(e, interfaceC4444fuA01));
            return interfaceC4444fuA01;
        }
    }

    private final InterfaceC4444fu A03(String str, C4459g9 c4459g9, C4453g3 c4453g3) {
        return A02(new C2655Co(str, c4459g9, c4453g3));
    }

    private final InterfaceC4444fu A04(String str, String str2, byte[] bArr, C4453g3 c4453g3) {
        return A02(new C2654Cn(str, null, str2, bArr, c4453g3));
    }

    private final C2653Cm A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream errorStream = null;
        byte[] responseBody = null;
        try {
            errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                responseBody = this.A05.AHT(errorStream);
            }
            return new C2653Cm(httpURLConnection, responseBody);
        } finally {
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    private final C2653Cm A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStreamAGm = null;
        byte[] responseBody = null;
        try {
            inputStreamAGm = this.A05.AGm(httpURLConnection);
            if (inputStreamAGm != null) {
                responseBody = this.A05.AHT(inputStreamAGm);
            }
            C2653Cm c2653Cm = new C2653Cm(httpURLConnection, responseBody);
            if (inputStreamAGm != null) {
                try {
                    inputStreamAGm.close();
                } catch (Exception unused) {
                }
            }
            return c2653Cm;
        } catch (Throwable th) {
            String[] strArr = A08;
            if (strArr[3].charAt(2) != strArr[0].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "UXNjV4lzV2ywD4tdDbD0LjxSkhTqZWDx";
            strArr2[0] = "ckNMQEffDKJwLTwRJSWHE7UL6GsW6bMO";
            if (inputStreamAGm != null) {
                try {
                    inputStreamAGm.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str, Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.AGl(str, proxy);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(str + A07(18, 19, 27), e);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(192, 14, 1));
        String proxyAddress = System.getProperty(A07(206, 14, 98));
        int port = -1;
        if (proxyAddress != null) {
            try {
                port = Integer.parseInt(proxyAddress);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        if (!TextUtils.isEmpty(property) && port > 0 && port <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, port));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        if (CookieHandler.getDefault() == null) {
            CookieHandler.setDefault(new CookieManager());
        }
    }

    private void A0C(AbstractC4457g7 abstractC4457g7) {
        StringBuilder sb = new StringBuilder(A07(182, 10, 43));
        boolean zEquals = abstractC4457g7.A03().equals(EnumC4456g6.A06);
        String strA07 = A07(41, 1, C1137R.styleable.ConstraintSet_stateLabels);
        if (zEquals) {
            byte[] bArrA06 = abstractC4457g7.A06();
            if (A08[1].charAt(0) == 'l') {
                throw new RuntimeException();
            }
            A08[4] = "MgpsgMtpOSh21D9UNcI3ZUtvoefc4JIC";
            if (bArrA06 != null) {
                sb.append(A07(7, 5, 124));
                sb.append(new String(abstractC4457g7.A06(), Charset.forName(A07(130, 5, 83))));
                sb.append(strA07);
            }
        }
        for (Map.Entry<String, String> entry : abstractC4457g7.A02().A06().entrySet()) {
            sb.append(A07(2, 5, 87));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 47));
            sb.append(entry.getValue());
            sb.append(strA07);
        }
        sb.append(A07(0, 2, 10));
        sb.append(abstractC4457g7.A05());
        sb.append(strA07);
        String string = sb.toString();
        A0E(string, 1, (string.length() / 4000) + 1);
    }

    private void A0D(AbstractC4457g7 abstractC4457g7, InterfaceC4446fw interfaceC4446fw) {
        this.A04.A6y(this, interfaceC4446fw, this.A01).A04(abstractC4457g7);
        if (this.A03.A04()) {
            A0C(abstractC4457g7);
        }
    }

    private void A0E(String str, int i2, int i3) {
        String str2 = A09 + A07(12, 6, 47) + i2 + A07(65, 1, 96) + i3;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i2 + 1, i3);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, InterfaceC4446fw interfaceC4446fw, C4453g3 c4453g3) {
        C2654Cn req = new C2654Cn(str, null, str2, bArr, c4453g3);
        A0D(req, interfaceC4446fw);
    }

    private void A0G(HttpURLConnection httpURLConnection, AbstractC4457g7 abstractC4457g7) {
        Map<String, String> mapA06 = abstractC4457g7.A02().A06();
        InterfaceC4443ft interfaceC4443ftA05 = abstractC4457g7.A02().A05();
        for (String str : mapA06.keySet()) {
            httpURLConnection.setRequestProperty(str, mapA06.get(str));
        }
        if (interfaceC4443ftA05 != null) {
            Map<String, String> mapA6g = interfaceC4443ftA05.A6g(this.A03.A03());
            for (String str2 : mapA6g.keySet()) {
                httpURLConnection.setRequestProperty(str2, mapA6g.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, AbstractC4457g7 abstractC4457g7) throws IOException {
        C4453g3 c4453g3A02 = abstractC4457g7.A02();
        httpURLConnection.setConnectTimeout(c4453g3A02.A00());
        httpURLConnection.setReadTimeout(c4453g3A02.A02());
        this.A05.AH6(httpURLConnection, abstractC4457g7.A03(), abstractC4457g7.A04());
    }

    private final boolean A0I(Throwable th, long j2, AbstractC4457g7 abstractC4457g7) {
        C4453g3 c4453g3A02 = abstractC4457g7.A02();
        long jCurrentTimeMillis = (System.currentTimeMillis() - j2) + 10;
        if (this.A06.AAZ()) {
            String str = A07(67, 15, C1137R.styleable.ConstraintSet_polarRelativeTo) + jCurrentTimeMillis + A07(42, 7, 69) + c4453g3A02.A00() + A07(49, 7, 10) + c4453g3A02.A02();
        }
        if (this.A02) {
            long jA02 = c4453g3A02.A02();
            if (A08[4].charAt(1) == 'Y') {
                throw new RuntimeException();
            }
            A08[7] = "tgQXMymp9cIZW";
            return jCurrentTimeMillis >= jA02;
        }
        long elapsedTime = c4453g3A02.A00();
        return jCurrentTimeMillis >= elapsedTime;
    }

    public final C4450g0 A0K() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4445fv
    @Deprecated
    public final InterfaceC4444fu AGw(String str, Map<String, String> parameters) {
        return A03(str, new C4459g9(parameters), this.A03.A00());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4445fv
    @Deprecated
    public final InterfaceC4444fu AGx(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 102), bArr, this.A03.A00());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4445fv
    public final void AGy(String str, byte[] bArr, InterfaceC4446fw interfaceC4446fw) {
        A0F(str, A07(135, 47, 102), bArr, interfaceC4446fw, this.A03.A00());
    }
}
