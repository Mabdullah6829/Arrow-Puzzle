package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.androidx.media3.exoplayer.offline.Download;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.C2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class HandlerC2609C2 extends Handler {
    public static byte[] A0D;
    public static String[] A0E = {"iNmXvBj9FTihCrbZiC4S7zhCL1s9H33W", "EvGedAo1NbwIZrU2eJLjABwCKULHNO", "OhLMnivBPD1ct3YE1XOZQ5ppblACA0SV", "Bbpc8NZfeBPLrlsLcOoRpsaFZoo07Ukk", "cYMMpvUaIb0CtoOD5hU2j4Ih7c76pz", "QlCwnx", "3GDIv0eUOBpBneHy6OJWPXV1MBWevv42", "cGd21R9dzjO1"};
    public boolean A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final InterfaceC2625CJ A09;
    public final InterfaceC4920nw A0A;
    public final ArrayList<C2591Bk> A0B;
    public final HashMap<String, C4924o0> A0C;

    public static String A08(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 73);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0D = new byte[]{-42, -54, -9, 34, 42, 33, 31, 34, 20, 23, 0, 20, 33, 20, 26, 24, 37, -61, -34, -26, -23, -30, -31, -99, -15, -20, -99, -23, -20, -34, -31, -99, -31, -20, -12, -21, -23, -20, -34, -31, -73, -99, -109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -71, -68, -82, -79, 109, -79, -68, -60, -69, -71, -68, -82, -79, -64, 123, -99, -72, -64, -61, -68, -69, 119, -53, -58, 119, -61, -58, -72, -69, 119, -64, -59, -69, -68, -49, -123, -87, -60, -52, -49, -56, -57, -125, -41, -46, -125, -43, -56, -48, -46, -39, -56, -125, -55, -43, -46, -48, -125, -57, -60, -41, -60, -59, -60, -42, -56, -109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -65, -78, -70, -68, -61, -78, 109, -69, -68, -69, -78, -59, -74, -64, -63, -78, -69, -63, 109, -79, -68, -60, -69, -71, -68, -82, -79, -121, 109, -12, 15, 23, 26, 19, 18, -50, 34, 29, -50, 33, 19, 34, -50, 27, 15, 28, 35, 15, 26, -50, 33, 34, 29, 30, -50, 32, 19, 15, 33, 29, 28, -113, -86, -78, -75, -82, -83, 105, -67, -72, 105, -68, -82, -67, 105, -74, -86, -73, -66, -86, -75, 105, -68, -67, -72, -71, 105, -69, -82, -86, -68, -72, -73, -125, 105, -67, -40, -32, -29, -36, -37, -105, -21, -26, -105, -20, -25, -37, -40, -21, -36, -105, -32, -27, -37, -36, -17, -91, -13, 0, 18, 10, -65, 5, 0, 8, 11, 4, 3, -39, -65};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0Q(DownloadRequest downloadRequest, int i2) {
        C2591Bk c2591BkA06 = A06(downloadRequest.A02, true);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c2591BkA06 != null) {
            A03(C2612C5.A00(c2591BkA06, downloadRequest, i2, jCurrentTimeMillis));
        } else {
            A03(new C2591Bk(downloadRequest, i2 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i2, 0));
        }
        A0B();
    }

    static {
        A0D();
    }

    public HandlerC2609C2(HandlerThread handlerThread, InterfaceC4920nw interfaceC4920nw, InterfaceC2625CJ interfaceC2625CJ, Handler handler, int i2, int i3, boolean z) {
        super(handlerThread.getLooper());
        this.A08 = handlerThread;
        this.A0A = interfaceC4920nw;
        this.A09 = interfaceC2625CJ;
        this.A07 = handler;
        this.A02 = i2;
        this.A03 = i3;
        this.A05 = z;
        this.A0B = new ArrayList<>();
        this.A0C = new HashMap<>();
    }

    public static int A00(C2591Bk c2591Bk, C2591Bk c2591Bk2) {
        return AbstractC22035C.A08(c2591Bk.A05, c2591Bk2.A05);
    }

    private int A02(String str) {
        for (int i2 = 0; i2 < i; i2++) {
            DownloadRequest downloadRequest = this.A0B.get(i2).A07;
            String[] strArr = A0E;
            String str2 = strArr[4];
            String str3 = strArr[2];
            int length = str2.length();
            int i3 = str3.length();
            if (length == i3) {
                throw new RuntimeException();
            }
            A0E[6] = "id4WW5MNYn317aHfBDbhwYGK6MIHb4Bm";
            if (downloadRequest.A02.equals(str)) {
                return i2;
            }
        }
        return -1;
    }

    private C2591Bk A03(C2591Bk c2591Bk) {
        AbstractC21273y.A08((c2591Bk.A02 == 3 || c2591Bk.A02 == 4) ? false : true);
        int iA02 = A02(c2591Bk.A07.A02);
        if (iA02 == -1) {
            this.A0B.add(c2591Bk);
            Collections.sort(this.A0B, new C2608C1());
        } else {
            boolean z = c2591Bk.A05 != this.A0B.get(iA02).A05;
            this.A0B.set(iA02, c2591Bk);
            if (z) {
                Collections.sort(this.A0B, new C2608C1());
            }
        }
        try {
            this.A0A.AHF(c2591Bk);
        } catch (IOException e) {
            AbstractC21714g.A08(A08(2, 15, 106), A08(223, 23, 46), e);
        }
        this.A07.obtainMessage(2, new C2607C0(c2591Bk, false, new ArrayList(this.A0B), null)).sendToTarget();
        return c2591Bk;
    }

    private C2591Bk A04(C2591Bk c2591Bk, int i2, int i3) {
        AbstractC21273y.A08((i2 == 3 || i2 == 4) ? false : true);
        return A03(A05(c2591Bk, i2, i3));
    }

    public static C2591Bk A05(C2591Bk c2591Bk, int i2, int i3) {
        return new C2591Bk(c2591Bk.A07, i2, c2591Bk.A05, System.currentTimeMillis(), c2591Bk.A04, i3, 0, c2591Bk.A00);
    }

    private C2591Bk A06(String str, boolean z) {
        int iA02 = A02(str);
        if (iA02 != -1) {
            return this.A0B.get(iA02);
        }
        if (z) {
            try {
                return this.A0A.A7q(str);
            } catch (IOException e) {
                AbstractC21714g.A08(A08(2, 15, 106), A08(17, 25, 52) + str, e);
                return null;
            }
        }
        return null;
    }

    private C4924o0 A07(C4924o0 c4924o0, C2591Bk c2591Bk) {
        if (c4924o0 == null) {
            if (A0U() && this.A01 < this.A02) {
                C2591Bk c2591BkA04 = A04(c2591Bk, 2, 0);
                C4924o0 c4924o1 = new C4924o0(c2591BkA04.A07, this.A09.A5M(c2591BkA04.A07), c2591BkA04.A00, false, this.A03, this);
                this.A0C.put(c2591BkA04.A07.A02, c4924o1);
                int i2 = this.A01;
                this.A01 = i2 + 1;
                if (i2 == 0) {
                    sendEmptyMessageDelayed(11, 5000L);
                }
                c4924o1.start();
                return c4924o1;
            }
            return null;
        }
        AbstractC21273y.A08(!c4924o0.A06);
        c4924o0.A05(false);
        return c4924o0;
    }

    private void A09() {
        Iterator<C4924o0> it = this.A0C.values().iterator();
        while (it.hasNext()) {
            it.next().A05(true);
        }
        try {
            this.A0A.AJO();
        } catch (IOException e) {
            AbstractC21714g.A08(A08(2, 15, 106), A08(223, 23, 46), e);
        }
        this.A0B.clear();
        this.A08.quit();
        synchronized (this) {
            this.A00 = true;
            notifyAll();
        }
    }

    private void A0A() {
        int i2;
        String strA08 = A08(2, 15, 106);
        ArrayList arrayList = new ArrayList();
        try {
            C4927o4 c4927o4A7r = this.A0A.A7r(3, 4);
            while (c4927o4A7r.A01()) {
                try {
                    arrayList.add(c4927o4A7r.A00());
                } catch (Throwable th) {
                    if (c4927o4A7r != null) {
                        try {
                            c4927o4A7r.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (c4927o4A7r != null) {
                c4927o4A7r.close();
            }
            while (true) {
                int size = arrayList.size();
                if (A0E[6].charAt(14) != 'H') {
                    break;
                }
                String[] strArr = A0E;
                strArr[1] = "XqOejHHacjjZLx98zpLnY1LZJhfsrk";
                strArr[7] = "zG4BgrMO4aUj";
                if (i2 < size) {
                    ArrayList<C2591Bk> arrayList2 = this.A0B;
                    C2591Bk c2591Bk = (C2591Bk) arrayList.get(i2);
                    String[] strArr2 = A0E;
                    if (strArr2[4].length() == strArr2[2].length()) {
                        break;
                    }
                    A0E[3] = "KT3y83B5rUupwCjllTydcOADIPFLf4ae";
                    arrayList2.add(A05(c2591Bk, 5, 0));
                    i2++;
                } else {
                    List<Download> terminalDownloads = this.A0B;
                    Collections.sort(terminalDownloads, new C2608C1());
                    try {
                        this.A0A.AJp();
                    } catch (IOException e) {
                        AbstractC21714g.A08(strA08, A08(223, 23, 46), e);
                    }
                    ArrayList arrayList3 = new ArrayList(this.A0B);
                    for (int i3 = 0; i3 < this.A0B.size(); i3++) {
                        this.A07.obtainMessage(2, new C2607C0(this.A0B.get(i3), false, arrayList3, null)).sendToTarget();
                    }
                    A0B();
                    return;
                }
            }
        } catch (IOException unused) {
            AbstractC21714g.A05(strA08, A08(42, 25, 4));
        }
        for (int i4 = 0; i4 < this.A0B.size(); i4++) {
            this.A0B.set(i4, A05(this.A0B.get(i4), 5, 0));
        }
        i2 = 0;
        throw new RuntimeException();
    }

    private void A0B() {
        int i2 = 0;
        for (int i3 = 0; i3 < accumulatingDownloadTaskCount; i3++) {
            C2591Bk download = this.A0B.get(i3);
            C4924o0 c4924o0A07 = this.A0C.get(download.A07.A02);
            int accumulatingDownloadTaskCount = download.A02;
            switch (accumulatingDownloadTaskCount) {
                case 0:
                    c4924o0A07 = A07(c4924o0A07, download);
                    break;
                case 1:
                    A0M(c4924o0A07);
                    break;
                case 2:
                    AbstractC21273y.A01(c4924o0A07);
                    A0P(c4924o0A07, download, i2);
                    break;
                case 3:
                case 4:
                case 6:
                default:
                    throw new IllegalStateException();
                case 5:
                case 7:
                    A0O(c4924o0A07, download);
                    break;
            }
            if (c4924o0A07 != null && !c4924o0A07.A06) {
                i2++;
            }
        }
    }

    private void A0C() {
        for (int i2 = 0; i2 < i; i2++) {
            C2591Bk c2591Bk = this.A0B.get(i2);
            if (c2591Bk.A02 == 2) {
                try {
                    this.A0A.AHF(c2591Bk);
                } catch (IOException e) {
                    AbstractC21714g.A08(A08(2, 15, 106), A08(223, 23, 46), e);
                }
            }
        }
        sendEmptyMessageDelayed(11, 5000L);
    }

    private void A0E(int i2) {
        this.A04 = i2;
        C4927o4 c4927o4A7r = null;
        try {
            try {
                this.A0A.AJO();
                c4927o4A7r = this.A0A.A7r(0, 1, 2, 5, 7);
                while (c4927o4A7r.A01()) {
                    this.A0B.add(c4927o4A7r.A00());
                }
            } catch (IOException e) {
                AbstractC21714g.A08(A08(2, 15, 106), A08(67, 21, 14), e);
                this.A0B.clear();
            }
            AbstractC22035C.A10(c4927o4A7r);
            this.A07.obtainMessage(0, new ArrayList(this.A0B)).sendToTarget();
            A0B();
        } catch (Throwable th) {
            AbstractC22035C.A10(c4927o4A7r);
            throw th;
        }
    }

    private void A0F(int i2) {
        this.A02 = i2;
        A0B();
    }

    private void A0G(int i2) {
        this.A03 = i2;
    }

    private void A0H(int i2) {
        this.A04 = i2;
        A0B();
    }

    private void A0I(C2591Bk c2591Bk) {
        if (c2591Bk.A02 == 7) {
            int i2 = c2591Bk.A03 == 0 ? 0 : 1;
            int state = c2591Bk.A03;
            A04(c2591Bk, i2, state);
            A0B();
            return;
        }
        this.A0B.remove(A02(c2591Bk.A07.A02));
        try {
            this.A0A.AIR(c2591Bk.A07.A02);
        } catch (IOException unused) {
            String strA08 = A08(2, 15, 106);
            String[] strArr = A0E;
            String str = strArr[1];
            String str2 = strArr[7];
            int length = str.length();
            int removeIndex = str2.length();
            if (length == removeIndex) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[4] = "0mOws7zeqclkbY70VWtV8amCVjdjwc";
            strArr2[2] = "5byiBwQrvMTmrLaxdcHCyvzuNe0iHvcw";
            AbstractC21714g.A05(strA08, A08(88, 30, 26));
        }
        this.A07.obtainMessage(2, new C2607C0(c2591Bk, true, new ArrayList(this.A0B), null)).sendToTarget();
    }

    private void A0J(C2591Bk c2591Bk, int i2) {
        if (i2 == 0) {
            if (c2591Bk.A02 == 1) {
                A04(c2591Bk, 0, 0);
                return;
            }
            return;
        }
        int i3 = c2591Bk.A03;
        if (A0E[6].charAt(14) != 'H') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[4] = "qDoL4xVSTO8RDQU7ZVoZcH2BhkCOc4";
        strArr[2] = "ugBXxeG19GlyVlR2WcoXaVyqVtSsbrKH";
        if (i2 == i3) {
            return;
        }
        int i4 = c2591Bk.A02;
        if (i4 == 0 || i4 == 2) {
            i4 = 1;
        }
        A03(new C2591Bk(c2591Bk.A07, i4, c2591Bk.A05, System.currentTimeMillis(), c2591Bk.A04, i2, 0, c2591Bk.A00));
    }

    private void A0K(C2591Bk c2591Bk, Exception exc) {
        int i2;
        DownloadRequest downloadRequest = c2591Bk.A07;
        int i3 = exc == null ? 3 : 4;
        long j2 = c2591Bk.A05;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j3 = c2591Bk.A04;
        int i4 = c2591Bk.A03;
        if (exc == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        C2591Bk c2591Bk2 = new C2591Bk(downloadRequest, i3, j2, jCurrentTimeMillis, j3, i4, i2, c2591Bk.A00);
        this.A0B.remove(A02(c2591Bk2.A07.A02));
        try {
            this.A0A.AHF(c2591Bk2);
        } catch (IOException e) {
            AbstractC21714g.A08(A08(2, 15, 106), A08(223, 23, 46), e);
        }
        this.A07.obtainMessage(2, new C2607C0(c2591Bk2, false, new ArrayList(this.A0B), exc)).sendToTarget();
    }

    private void A0L(C4924o0 c4924o0) {
        String str = c4924o0.A04.A02;
        this.A0C.remove(str);
        boolean z = c4924o0.A06;
        if (z) {
            this.A06 = false;
        } else {
            int i2 = this.A01 - 1;
            this.A01 = i2;
            if (i2 == 0) {
                removeMessages(11);
            }
        }
        if (c4924o0.A08) {
            A0B();
            return;
        }
        Exception finalException = c4924o0.A01;
        if (finalException != null) {
            StringBuilder sb = new StringBuilder();
            String downloadId = A08(246, 13, 86);
            StringBuilder sbAppend = sb.append(downloadId).append(c4924o0.A04);
            String downloadId2 = A08(0, 2, 97);
            String string = sbAppend.append(downloadId2).append(z).toString();
            String downloadId3 = A08(2, 15, 106);
            AbstractC21714g.A08(downloadId3, string, finalException);
        }
        C2591Bk c2591BkA06 = A06(str, false);
        if (A0E[3].charAt(4) != '8') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[4] = "ylCSlCHYxJLig8GFragBjcnbyuXWai";
        strArr[2] = "OMWcFhgpmCCD5KtgAO70M2kgxcAld7fK";
        C2591Bk c2591Bk = (C2591Bk) AbstractC21273y.A01(c2591BkA06);
        switch (c2591Bk.A02) {
            case 2:
                AbstractC21273y.A08(!z);
                A0K(c2591Bk, finalException);
                break;
            case 3:
            case 4:
            case 6:
            default:
                throw new IllegalStateException();
            case 5:
            case 7:
                AbstractC21273y.A08(z);
                A0I(c2591Bk);
                break;
        }
        A0B();
    }

    private void A0M(C4924o0 c4924o0) {
        if (c4924o0 == null) {
            return;
        }
        AbstractC21273y.A08(!c4924o0.A06);
        c4924o0.A05(false);
    }

    private void A0N(C4924o0 c4924o0, long j2) {
        C2591Bk c2591Bk = (C2591Bk) AbstractC21273y.A01(A06(c4924o0.A04.A02, false));
        if (j2 == c2591Bk.A04 || j2 == -1) {
            return;
        }
        A03(new C2591Bk(c2591Bk.A07, c2591Bk.A02, c2591Bk.A05, System.currentTimeMillis(), j2, c2591Bk.A03, c2591Bk.A01, c2591Bk.A00));
    }

    private void A0O(C4924o0 c4924o0, C2591Bk c2591Bk) {
        if (c4924o0 == null) {
            boolean z = this.A06;
            if (A0E[3].charAt(4) != '8') {
                throw new RuntimeException();
            }
            A0E[0] = "e4XXQnURg6mIpThj5jyh4wOBvzx0EgPt";
            if (z) {
                return;
            }
            C4924o0 c4924o1 = new C4924o0(c2591Bk.A07, this.A09.A5M(c2591Bk.A07), c2591Bk.A00, true, this.A03, this);
            this.A0C.put(c2591Bk.A07.A02, c4924o1);
            this.A06 = true;
            c4924o1.start();
            return;
        }
        if (!c4924o0.A06) {
            c4924o0.A05(false);
        }
    }

    private void A0P(C4924o0 c4924o0, C2591Bk c2591Bk, int i2) {
        AbstractC21273y.A08(!c4924o0.A06);
        if (!A0U() || i2 >= this.A02) {
            A04(c2591Bk, 0, 0);
            c4924o0.A05(false);
        }
    }

    private void A0R(String str) {
        C2591Bk c2591BkA06 = A06(str, true);
        if (c2591BkA06 == null) {
            AbstractC21714g.A05(A08(2, 15, 106), A08(C1137R.styleable.ConstraintSet_polarRelativeTo, 39, 4) + str);
        } else {
            A04(c2591BkA06, 5, 0);
            A0B();
        }
    }

    private void A0S(String str, int i2) {
        String strA08 = A08(2, 15, 106);
        if (str == null) {
            for (int i3 = 0; i3 < this.A0B.size(); i3++) {
                A0J(this.A0B.get(i3), i2);
            }
            try {
                this.A0A.AJq(i2);
            } catch (IOException e) {
                AbstractC21714g.A08(strA08, A08(157, 32, 101), e);
            }
        } else {
            C2591Bk c2591BkA06 = A06(str, false);
            if (c2591BkA06 != null) {
                A0J(c2591BkA06, i2);
            } else {
                try {
                    this.A0A.AJr(str, i2);
                } catch (IOException e2) {
                    AbstractC21714g.A08(strA08, A08(189, 34, 0) + str, e2);
                }
            }
        }
        A0B();
    }

    private void A0T(boolean z) {
        this.A05 = z;
        A0B();
    }

    private boolean A0U() {
        if (!this.A05) {
            int i2 = this.A04;
            if (A0E[6].charAt(14) != 'H') {
                throw new RuntimeException();
            }
            A0E[5] = "cfwXoVsCs";
            if (i2 == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        boolean z = true;
        try {
            switch (message.what) {
                case 0:
                    A0E(message.arg1);
                    break;
                case 1:
                    A0T(message.arg1 != 0);
                    break;
                case 2:
                    A0H(message.arg1);
                    break;
                case 3:
                    A0S((String) message.obj, message.arg1);
                    break;
                case 4:
                    A0F(message.arg1);
                    break;
                case 5:
                    A0G(message.arg1);
                    break;
                case 6:
                    A0Q((DownloadRequest) message.obj, message.arg1);
                    break;
                case 7:
                    A0R((String) message.obj);
                    break;
                case 8:
                    A0A();
                    break;
                case 9:
                    A0L((C4924o0) message.obj);
                    z = false;
                    break;
                case 10:
                    A0N((C4924o0) message.obj, AbstractC22035C.A0N(message.arg1, message.arg2));
                    return;
                case 11:
                    A0C();
                    return;
                case 12:
                    A09();
                    return;
                default:
                    throw new IllegalStateException();
            }
            this.A07.obtainMessage(1, z ? 1 : 0, this.A0C.size()).sendToTarget();
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
