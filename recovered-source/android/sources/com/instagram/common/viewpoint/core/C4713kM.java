package com.instagram.common.viewpoint.core;

import android.os.ConditionVariable;
import androidx.core.location.LocationRequestCompat;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4713kM implements InterfaceC3248MP {
    public static byte[] A0B;
    public static String[] A0C = {"", "bCiwVY89t3fNm3gVh5Cta1r1ex617UD6", "2pbQHFWCVx6Uhmp9EyO9uCwpcu4x9Dl0", "32tJ4jyYWOzcf72n5Wgg62", "i6oCPG91V", "KagoX429g1hrk2zqYLocuLLyf0lslURo", "DhZpyS71VRHuUy7Qk1AUkZm91VAyIgrZ", "oeCQOWeJcqbtbEq5qioytyhoePvaJg5Z"};
    public static final HashSet<File> A0D;
    public long A00;
    public long A01;
    public C3245MM A02;
    public boolean A03;
    public final InterfaceC4719kS A04;
    public final C3254MV A05;
    public final C3267Mi A06;
    public final File A07;
    public final HashMap<String, ArrayList<InterfaceC3247MO>> A08;
    public final Random A09;
    public final boolean A0A;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0C;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[6] = "f7QnNjNC08rjnWmNVHuGYagSWe5Lcp9o";
            strArr2[7] = "r0Bisby3rM4igG5oRpf6tXDb0tjiDQ2I";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 43);
            i5++;
        }
    }

    public static void A07() {
        A0B = new byte[]{110, 53, 41, 36, 99, 76, 77, 86, 74, 71, 80, 2, 113, 75, 79, 82, 78, 71, 97, 67, 65, 74, 71, 2, 75, 76, 81, 86, 67, 76, 65, 71, 2, 87, 81, 71, 81, 2, 86, 74, 71, 2, 68, 77, 78, 70, 71, 80, 24, 2, 114, 79, 88, 103, 91, 86, 78, 82, 69, 13, 100, 94, 90, 71, 91, 82, 116, 86, 84, 95, 82, 126, 89, 94, 67, 35, 4, 12, 9, 0, 1, 69, 17, 10, 69, 6, 23, 0, 4, 17, 0, 69, 48, 44, 33, 69, 3, 12, 9, 0, 95, 69, 31, 56, 48, 53, 60, 61, 121, 45, 54, 121, 58, 43, 60, 56, 45, 60, 121, 58, 56, 58, 49, 60, 121, 12, 16, 29, 99, 121, 108, 75, 67, 70, 79, 78, 10, 94, 69, 10, 73, 88, 79, 75, 94, 79, 10, 73, 75, 73, 66, 79, 10, 78, 67, 88, 79, 73, 94, 69, 88, 83, 16, 10, 112, 87, 95, 90, 83, 82, 22, 66, 89, 22, 95, 88, 95, 66, 95, 87, 90, 95, 76, 83, 22, 85, 87, 85, 94, 83, 22, 95, 88, 82, 95, 85, 83, 69, 12, 22, 43, 12, 4, 1, 8, 9, 77, 25, 2, 77, 1, 4, 30, 25, 77, 14, 12, 14, 5, 8, 77, 9, 4, 31, 8, 14, 25, 2, 31, 20, 77, 11, 4, 1, 8, 30, 87, 77, 48, 23, 31, 26, 19, 18, 86, 2, 25, 86, 4, 19, 27, 25, 0, 19, 86, 16, 31, 26, 19, 86, 31, 24, 18, 19, 14, 86, 19, 24, 2, 4, 15, 86, 16, 25, 4, 76, 86, 56, 20, 25, 19, 26, 7, 24, 16, 17, 85, 32, 60, 49, 85, 19, 28, 25, 16, 79, 85, 102, 92, 88, 69, 89, 80, 118, 84, 86, 93, 80, 97, 70, 93, 64, 91, 92, 85, 18, 91, 92, 86, 87, 74, 18, 84, 91, 94, 87, 18, 84, 83, 91, 94, 87, 86};
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0G(File file, boolean z, File[] fileArr, Map<String, C3253MU> map) {
        long j2;
        long j3;
        C3253MU c3253muRemove;
        C4712kL c4712kLA01;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            if (A0C[2].charAt(26) != '8') {
                String[] strArr = A0C;
                strArr[6] = "8aOt5QXsfRNGpIpRxoAxSAZDoaRpec1S";
                strArr[7] = "wFGX3oecQoVuPclALoyOBFGO19d1hLj7";
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    A0G(file2, false, file2.listFiles(), map);
                } else if (z) {
                    boolean zA0A = C3267Mi.A0A(name);
                    if (A0C[0].length() != 2) {
                        String[] strArr2 = A0C;
                        strArr2[3] = "SjNVVRrUmgTFjXqPeyNmbh";
                        strArr2[4] = "SAWP83LvD";
                        if (!zA0A && !name.endsWith(A04(0, 4, 107))) {
                            j2 = -1;
                            j3 = -9223372036854775807L;
                            if (map != null) {
                                c3253muRemove = map.remove(name);
                            } else {
                                c3253muRemove = null;
                            }
                            if (c3253muRemove != null) {
                                j2 = c3253muRemove.A01;
                                j3 = c3253muRemove.A00;
                            }
                            c4712kLA01 = C4712kL.A01(file2, j2, j3, this.A06);
                            if (c4712kLA01 != null) {
                                A0C(c4712kLA01);
                            } else {
                                file2.delete();
                            }
                        }
                    }
                } else {
                    j2 = -1;
                    j3 = -9223372036854775807L;
                    if (map != null) {
                        c3253muRemove = map.remove(name);
                    } else {
                        c3253muRemove = null;
                    }
                    if (c3253muRemove != null) {
                        j2 = c3253muRemove.A01;
                        j3 = c3253muRemove.A00;
                    }
                    c4712kLA01 = C4712kL.A01(file2, j2, j3, this.A06);
                    if (c4712kLA01 != null) {
                        A0C(c4712kLA01);
                    } else {
                        file2.delete();
                    }
                }
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized NavigableSet<C3258MZ> A0I(String str) {
        C3265Mg c3265MgA0C;
        AbstractC21273y.A08(!this.A03);
        c3265MgA0C = this.A06.A0C(str);
        return (c3265MgA0C == null || c3265MgA0C.A09()) ? new TreeSet() : new TreeSet((Collection) c3265MgA0C.A06());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC3248MP
    public final synchronized long A7B(String str, long j2, long j3) {
        long j4;
        long j5 = j2;
        synchronized (this) {
            long j6 = j3 == -1 ? LocationRequestCompat.PASSIVE_INTERVAL : j5 + j3;
            if (j6 < 0) {
                j6 = LocationRequestCompat.PASSIVE_INTERVAL;
            }
            j4 = 0;
            while (j5 < j6) {
                long jA7C = A7C(str, j5, j6 - j5);
                if (jA7C > 0) {
                    j4 += jA7C;
                } else {
                    jA7C = -jA7C;
                }
                j5 += jA7C;
            }
        }
        return j4;
    }

    static {
        A07();
        A0D = new HashSet<>();
    }

    @Deprecated
    public C4713kM(File file, InterfaceC4719kS interfaceC4719kS) {
        this(file, interfaceC4719kS, (byte[]) null, false);
    }

    public C4713kM(File file, InterfaceC4719kS interfaceC4719kS, InterfaceC22155O interfaceC22155O, byte[] bArr, boolean z, boolean z2) {
        C3254MV c3254mv;
        C3267Mi c3267Mi = new C3267Mi(interfaceC22155O, file, bArr, z, z2);
        if (interfaceC22155O != null && !z2) {
            c3254mv = new C3254MV(interfaceC22155O);
        } else {
            c3254mv = null;
        }
        this(file, interfaceC4719kS, c3267Mi, c3254mv);
    }

    public C4713kM(File file, InterfaceC4719kS interfaceC4719kS, C3267Mi c3267Mi, C3254MV c3254mv) {
        if (A0H(file)) {
            this.A07 = file;
            this.A04 = interfaceC4719kS;
            this.A06 = c3267Mi;
            this.A05 = c3254mv;
            this.A08 = new HashMap<>();
            this.A09 = new Random();
            this.A0A = interfaceC4719kS.AIj();
            this.A01 = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new C3274Mp(this, A04(50, 25, 28), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A04(4, 46, 9) + file);
    }

    @Deprecated
    public C4713kM(File file, InterfaceC4719kS interfaceC4719kS, byte[] bArr, boolean z) {
        this(file, interfaceC4719kS, null, bArr, z, true);
    }

    public static long A00(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + A04(0, 4, 107));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException(A04(75, 27, 78) + file2);
    }

    public static long A01(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public static long A02(File[] fileArr) {
        for (File file : fileArr) {
            String fileName = file.getName();
            if (fileName.endsWith(A04(0, 4, 107))) {
                try {
                    return A01(fileName);
                } catch (NumberFormatException unused) {
                    AbstractC21714g.A05(A04(297, 11, 30), A04(277, 20, 94) + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private C4712kL A03(String str, long j2, long j3) {
        C4712kL c4712kLA04;
        C3265Mg c3265MgA0C = this.A06.A0C(str);
        if (c3265MgA0C == null) {
            return C4712kL.A04(str, j2, j3);
        }
        while (true) {
            c4712kLA04 = c3265MgA0C.A04(j2, j3);
            if (!c4712kLA04.A05 || c4712kLA04.A03.length() == c4712kLA04.A01) {
                break;
            }
            A06();
        }
        return c4712kLA04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (!this.A07.exists()) {
            try {
                A0F(this.A07);
            } catch (C3245MM e) {
                this.A02 = e;
                return;
            }
        }
        File file = this.A07;
        String[] strArr = A0C;
        if (strArr[6].charAt(20) == strArr[7].charAt(20)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[1] = "a7bsaZYeTJGewaTpvlEBtyxkDQTMEU8W";
        strArr2[5] = "kn4PmWwOChlyCy8qyQNRjkcz1fm49U24";
        File[] fileArrListFiles = file.listFiles();
        String strA04 = A04(297, 11, 30);
        if (fileArrListFiles == null) {
            String str = A04(200, 38, 70) + this.A07;
            AbstractC21714g.A05(strA04, str);
            this.A02 = new C3245MM(str);
            return;
        }
        this.A01 = A02(fileArrListFiles);
        if (this.A01 == -1) {
            try {
                this.A01 = A00(this.A07);
            } catch (IOException e2) {
                String str2 = A04(102, 28, 114) + this.A07;
                AbstractC21714g.A08(strA04, str2, e2);
                this.A02 = new C3245MM(str2, e2);
                return;
            }
        }
        try {
            this.A06.A0J(this.A01);
            if (this.A05 != null) {
                this.A05.A06(this.A01);
                Map<String, C3253MU> mapA05 = this.A05.A05();
                A0G(this.A07, true, fileArrListFiles, mapA05);
                this.A05.A09(mapA05.keySet());
            } else {
                A0G(this.A07, true, fileArrListFiles, null);
            }
            this.A06.A0H();
            try {
                this.A06.A0I();
            } catch (IOException e3) {
                AbstractC21714g.A08(strA04, A04(308, 25, 25), e3);
            }
        } catch (IOException e4) {
            String str3 = A04(164, 36, 29) + this.A07;
            AbstractC21714g.A08(strA04, str3, e4);
            this.A02 = new C3245MM(str3, e4);
        }
    }

    private void A06() {
        ArrayList arrayList = new ArrayList();
        Iterator<C3265Mg> it = this.A06.A0G().iterator();
        while (it.hasNext()) {
            for (C4712kL c4712kL : it.next().A06()) {
                if (c4712kL.A03.length() != c4712kL.A01) {
                    arrayList.add(c4712kL);
                }
            }
        }
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            String[] strArr = A0C;
            String str = strArr[1];
            String str2 = strArr[5];
            int i3 = str.charAt(29);
            if (i3 != str2.charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[1] = "aqjjwslhzF6rAKukFAflKhlVTVCMUUBi";
            strArr2[5] = "oi6ATHfePUfqMvf6S7GQLdSJgMPLAUWw";
            if (i2 < size) {
                A0A((C3258MZ) arrayList.get(i2));
                i2++;
            } else {
                return;
            }
        }
    }

    private final synchronized void A08() throws C3245MM {
        if (this.A02 != null) {
            throw this.A02;
        }
    }

    private void A09(C3258MZ c3258mz) {
        ArrayList<InterfaceC3247MO> arrayList = this.A08.get(c3258mz.A04);
        if (arrayList != null) {
            for (int i2 = arrayList.size() - 1; i2 >= 0; i2--) {
                arrayList.get(i2).AG3(this, c3258mz);
            }
        }
        this.A04.AG3(this, c3258mz);
    }

    private void A0A(C3258MZ c3258mz) {
        C3265Mg c3265MgA0C = this.A06.A0C(c3258mz.A04);
        if (c3265MgA0C == null || !c3265MgA0C.A0D(c3258mz)) {
            return;
        }
        this.A00 -= c3258mz.A01;
        if (this.A05 != null) {
            String name = c3258mz.A03.getName();
            try {
                this.A05.A07(name);
            } catch (IOException unused) {
                AbstractC21714g.A07(A04(297, 11, 30), A04(238, 39, 93) + name);
            }
        }
        this.A06.A0K(c3265MgA0C.A02);
        A09(c3258mz);
    }

    private void A0C(C4712kL c4712kL) {
        this.A06.A0D(c4712kL.A04).A08(c4712kL);
        this.A00 += c4712kL.A01;
        A0D(c4712kL);
    }

    private void A0D(C4712kL c4712kL) {
        ArrayList<InterfaceC3247MO> arrayList = this.A08.get(c4712kL.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                InterfaceC3247MO interfaceC3247MO = arrayList.get(size);
                int i2 = A0C[0].length();
                if (i2 == 2) {
                    throw new RuntimeException();
                }
                A0C[0] = "Z81vyiSZneiyPRnyPjjjzGlAG4UB";
                interfaceC3247MO.AG2(this, c4712kL);
            }
        }
        this.A04.AG2(this, c4712kL);
    }

    private void A0E(C4712kL c4712kL, C3258MZ c3258mz) {
        ArrayList<InterfaceC3247MO> arrayList = this.A08.get(c4712kL.A04);
        if (arrayList != null) {
            for (int i2 = arrayList.size() - 1; i2 >= 0; i2--) {
                arrayList.get(i2).AG4(this, c4712kL, c3258mz);
            }
        }
        this.A04.AG4(this, c4712kL, c3258mz);
    }

    public static void A0F(File file) throws C3245MM {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = A04(130, 34, 1) + file;
        String message = A04(297, 11, 30);
        AbstractC21714g.A05(message, str);
        throw new C3245MM(str);
    }

    public static synchronized boolean A0H(File file) {
        return A0D.add(file.getAbsoluteFile());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3248MP
    public final synchronized void A4E(String str, C3270Ml c3270Ml) throws C3245MM {
        AbstractC21273y.A08(!this.A03);
        A08();
        this.A06.A0L(str, c3270Ml);
        try {
            this.A06.A0I();
        } catch (IOException e) {
            throw new C3245MM(e);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3248MP
    public final synchronized void A55(File file, long j2) throws C3245MM {
        AbstractC21273y.A08(!this.A03);
        if (file.exists()) {
            if (j2 == 0) {
                file.delete();
                return;
            }
            C4712kL c4712kL = (C4712kL) AbstractC21273y.A01(C4712kL.A02(file, j2, this.A06));
            C3265Mg c3265Mg = (C3265Mg) AbstractC21273y.A01(this.A06.A0C(c4712kL.A04));
            AbstractC21273y.A08(c3265Mg.A0B(c4712kL.A02, c4712kL.A01));
            long jA00 = AbstractC3268Mj.A00(c3265Mg.A03());
            if (jA00 != -1) {
                AbstractC21273y.A08(c4712kL.A02 + c4712kL.A01 <= jA00);
            }
            if (this.A05 != null) {
                try {
                    this.A05.A08(file.getName(), c4712kL.A01, c4712kL.A00);
                    A0C(c4712kL);
                    try {
                        this.A06.A0I();
                        notifyAll();
                        return;
                    } catch (IOException e) {
                        throw new C3245MM(e);
                    }
                } catch (IOException e2) {
                    throw new C3245MM(e2);
                }
            }
            A0C(c4712kL);
            this.A06.A0I();
            notifyAll();
            return;
            throw th;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3248MP
    public final synchronized long A7A() {
        AbstractC21273y.A08(!this.A03);
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3248MP
    @MetaExoPlayerCustomization
    public final synchronized long A7C(String str, long j2, long j3) {
        C3265Mg cachedContent;
        AbstractC21273y.A08(!this.A03);
        if (j3 == -1) {
            j3 = LocationRequestCompat.PASSIVE_INTERVAL;
        }
        cachedContent = this.A06.A0C(str);
        return cachedContent != null ? cachedContent.A02(j2, j3) : -j3;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3248MP
    public final synchronized InterfaceC3269Mk A7S(String str) {
        AbstractC21273y.A08(!this.A03);
        return this.A06.A0E(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3248MP
    public final synchronized void AHg(C3258MZ c3258mz) {
        AbstractC21273y.A08(!this.A03);
        C3265Mg c3265Mg = (C3265Mg) AbstractC21273y.A01(this.A06.A0C(c3258mz.A04));
        c3265Mg.A07(c3258mz.A02);
        this.A06.A0K(c3265Mg.A02);
        notifyAll();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3248MP
    public final synchronized void AIU(String str) {
        AbstractC21273y.A08(!this.A03);
        Iterator<C3258MZ> it = A0I(str).iterator();
        while (it.hasNext()) {
            A0A(it.next());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3248MP
    public final synchronized void AIV(C3258MZ c3258mz) {
        AbstractC21273y.A08(!this.A03);
        A0A(c3258mz);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3248MP
    public final synchronized File AK8(String str, long lastTouchTimestamp, long j2) throws C3245MM {
        C3265Mg c3265MgA0C;
        File file;
        AbstractC21273y.A08(!this.A03);
        A08();
        c3265MgA0C = this.A06.A0C(str);
        AbstractC21273y.A01(c3265MgA0C);
        AbstractC21273y.A08(c3265MgA0C.A0B(lastTouchTimestamp, j2));
        if (!this.A07.exists()) {
            A0F(this.A07);
            A06();
        }
        this.A04.AG5(this, str, lastTouchTimestamp, j2);
        file = new File(this.A07, Integer.toString(this.A09.nextInt(10)));
        if (!file.exists()) {
            A0F(file);
        }
        return C4712kL.A05(file, c3265MgA0C.A01, lastTouchTimestamp, System.currentTimeMillis());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3248MP
    public final synchronized C3258MZ AKA(String str, long j2, long j3, EnumC3246MN enumC3246MN) throws InterruptedException, C3245MM {
        C3258MZ span;
        AbstractC21273y.A08(!this.A03);
        A08();
        while (true) {
            span = AKB(str, j2, j3, enumC3246MN);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3248MP
    public final synchronized C4712kL AKB(String str, long j2, long j3, EnumC3246MN enumC3246MN) throws C3245MM {
        AbstractC21273y.A08(!this.A03);
        A08();
        C4712kL c4712kLA03 = A03(str, j2, j3);
        if (c4712kLA03.A05) {
            C4712kL span = this.A06.A0C(str).A05(c4712kLA03, c4712kLA03.A00, false);
            A0E(c4712kLA03, span);
            return span;
        }
        if (this.A06.A0D(str).A0C(j2, c4712kLA03.A01)) {
            return c4712kLA03;
        }
        return null;
    }
}
