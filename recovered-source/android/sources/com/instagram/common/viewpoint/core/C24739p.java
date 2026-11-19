package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import androidx.core.location.LocationRequestCompat;
import androidx.work.WorkRequest;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9p */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C24739p implements InterfaceC4913np, InterfaceC2924HA, InterfaceC2809FI<C4911nn>, InterfaceC2813FM, InterfaceC2692DP {
    public static byte[] A0e;
    public static String[] A0f = {"o2fAJH6DTExx5HfWJCXs", "", "TsjJo55j6Kq128TfeQrvBtnORCvXohBg", "QpymssT", "p1Azi7mByqrjPk9ZTQVOCdIp8WANOiZ", "P8K3es9juVbjT7QsA9zjw4fZ7CWDxkC3", "f2TCNbDOQ", "8xae32DDfRwM"};
    public static final C5064qI A0g;
    public static final Map<String, String> A0h;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public InterfaceC4914nq A06;
    public C2687DK A07;
    public InterfaceC2948HY A08;
    public IcyHeaders A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public C2686DJ[] A0K;
    public C4898na[] A0L;
    public final long A0M;
    public final Uri A0N;
    public final Handler A0O;
    public final C213748 A0P;
    public final InterfaceC5000pF A0Q;
    public final C2484A1 A0R;
    public final InterfaceC2489A6 A0S;
    public final C2675D8 A0T;
    public final InterfaceC2680DD A0U;
    public final InterfaceC2685DI A0V;
    public final InterfaceC2791F0 A0W;
    public final InterfaceC2806FF A0X;
    public final C4869n7 A0Y;
    public final Runnable A0Z;
    public final Runnable A0a;
    public final String A0b;
    public final boolean A0c;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"})
    public final boolean A0d;

    public static String A0B(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0e, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0I() {
        A0e = new byte[]{-76, -81, -55, -33, -109, -77, -53, -38, -57, -86, -57, -38, -57, -29, 6, -8, -5, -4, 9, -47, -25, 9, 6, -2, 9, -4, 10, 10, 0, 13, -4, -28, -4, -5, 0, -8, -25, -4, 9, 0, 6, -5, -62, -27, -41, -38, -33, -28, -35, -106, -36, -33, -28, -33, -23, -34, -37, -38, -106, -40, -37, -36, -27, -24, -37, -106, -26, -24, -37, -26, -41, -24, -41, -22, -33, -27, -28, -106, -33, -23, -106, -39, -27, -29, -26, -30, -37, -22, -37, -92, -49, -14, -28, -25, -20, -15, -22, -93, -23, -20, -15, -20, -10, -21, -24, -25, -93, -27, -24, -23, -14, -11, -24, -93, -13, -11, -24, -13, -28, -11, -28, -9, -20, -14, -15, -93, -20, -10, -93, -26, -14, -16, -13, -17, -24, -9, -24, -79, -93, -40, -43, -52, -67, -93, -12, 3, 3, -1, -4, -10, -12, 7, -4, 2, 1, -62, 11, -64, -4, -10, 12, -6, -12, 10, 47, 54, 45, 45};
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final long AJ9(InterfaceC4876nE[] interfaceC4876nEArr, boolean[] zArr, InterfaceC2696DT[] interfaceC2696DTArr, boolean[] zArr2, long j2) {
        long jAJ8 = j2;
        A0E();
        C4894nW c4894nW = this.A07.A00;
        boolean[] zArr3 = this.A07.A01;
        int i2 = this.A01;
        int i3 = 0;
        while (true) {
            int i4 = 0;
            if (i3 >= interfaceC4876nEArr.length) {
                boolean z = !this.A0J ? jAJ8 == 0 : i2 != 0;
                for (int i5 = 0; i5 < interfaceC4876nEArr.length; i5++) {
                    InterfaceC2696DT interfaceC2696DT = interfaceC2696DTArr[i5];
                    if (A0f[0].length() != 20) {
                        break;
                    }
                    String[] strArr = A0f;
                    strArr[6] = "NEStfGRt7";
                    strArr[7] = "7J9sRP18njyY";
                    if (interfaceC2696DT == null && interfaceC4876nEArr[i5] != null) {
                        InterfaceC4876nE interfaceC4876nE = interfaceC4876nEArr[i5];
                        AbstractC21273y.A08(interfaceC4876nE.length() == 1);
                        AbstractC21273y.A08(interfaceC4876nE.A8H(0) == 0);
                        int iA04 = c4894nW.A04(interfaceC4876nE.A9L());
                        AbstractC21273y.A08(!zArr3[iA04]);
                        this.A01++;
                        zArr3[iA04] = true;
                        interfaceC2696DTArr[i5] = new C4910nm(this, iA04);
                        zArr2[i5] = true;
                        if (!z) {
                            C4898na c4898na = this.A0L[iA04];
                            z = (c4898na.A0f(jAJ8, true) || c4898na.A0O() == 0) ? false : true;
                        }
                    }
                }
                if (this.A01 == 0) {
                    this.A0F = false;
                    this.A0E = false;
                    if (this.A0Y.A0E()) {
                        C4898na[] c4898naArr = this.A0L;
                        int length = c4898naArr.length;
                        while (i4 < length) {
                            c4898naArr[i4].A0V();
                            i4++;
                        }
                        this.A0Y.A09();
                    } else {
                        C4898na[] c4898naArr2 = this.A0L;
                        int length2 = c4898naArr2.length;
                        while (i4 < length2) {
                            c4898naArr2[i4].A0Z();
                            i4++;
                        }
                    }
                } else if (z) {
                    jAJ8 = AJ8(jAJ8, false);
                    for (int i6 = 0; i6 < interfaceC2696DTArr.length; i6++) {
                        if (interfaceC2696DTArr[i6] != null) {
                            zArr2[i6] = true;
                        }
                    }
                }
                this.A0J = true;
                return jAJ8;
            }
            if (interfaceC2696DTArr[i3] != null) {
                if (interfaceC4876nEArr[i3] != null) {
                    boolean z2 = zArr[i3];
                    String[] strArr2 = A0f;
                    if (strArr2[2].charAt(7) != strArr2[5].charAt(7)) {
                        break;
                    }
                    A0f[0] = "eW7kSByjGiBvUls6sdXN";
                    if (!z2) {
                        int i7 = ((C4910nm) interfaceC2696DTArr[i3]).A00;
                        AbstractC21273y.A08(zArr3[i7]);
                        this.A01--;
                        zArr3[i7] = false;
                        interfaceC2696DTArr[i3] = null;
                    }
                } else {
                    int i8 = ((C4910nm) interfaceC2696DTArr[i3]).A00;
                    AbstractC21273y.A08(zArr3[i8]);
                    this.A01--;
                    zArr3[i8] = false;
                    interfaceC2696DTArr[i3] = null;
                }
            }
            i3++;
        }
        throw new RuntimeException();
    }

    static {
        A0I();
        A0h = A0D();
        A0g = new C20592p().A0y(A0B(161, 3, 77)).A11(A0B(144, 17, 79)).A14();
    }

    public C24739p(Uri uri, InterfaceC5000pF interfaceC5000pF, InterfaceC2680DD interfaceC2680DD, InterfaceC2489A6 interfaceC2489A6, C2484A1 c2484a1, InterfaceC2806FF interfaceC2806FF, C2675D8 c2675d8, InterfaceC2685DI interfaceC2685DI, InterfaceC2791F0 interfaceC2791F0, String str, int i2, InterfaceExecutorC2828Fb interfaceExecutorC2828Fb) {
        C4869n7 c4869n7;
        this.A0N = uri;
        this.A0Q = interfaceC5000pF;
        this.A0S = interfaceC2489A6;
        this.A0R = c2484a1;
        this.A0X = interfaceC2806FF;
        this.A0T = c2675d8;
        this.A0V = interfaceC2685DI;
        this.A0W = interfaceC2791F0;
        this.A0b = str;
        this.A0M = i2;
        if (interfaceExecutorC2828Fb != null) {
            c4869n7 = new C4869n7(interfaceExecutorC2828Fb);
        } else {
            c4869n7 = new C4869n7(A0B(13, 29, 83));
        }
        this.A0Y = c4869n7;
        this.A0U = interfaceC2680DD;
        this.A0P = new C213748();
        this.A0Z = new Runnable() { // from class: com.facebook.ads.redexgen.X.DG
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0F();
            }
        };
        this.A0a = new Runnable() { // from class: com.facebook.ads.redexgen.X.DH
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0b();
            }
        };
        this.A0O = AbstractC22035C.A0Y();
        this.A0K = new C2686DJ[0];
        this.A0L = new C4898na[0];
        this.A05 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A00 = 1;
        this.A0d = MetaExoPlayerUpgradeConfig.A03(EnumC4663jX.A0e) || MetaExoPlayerUpgradeConfig.A03(EnumC4663jX.A1j);
        this.A0c = MetaExoPlayerUpgradeConfig.A03(EnumC4663jX.A0g);
    }

    private int A00() {
        int i2 = 0;
        for (C4898na c4898na : this.A0L) {
            int extractedSamplesCount = c4898na.A0P();
            i2 += extractedSamplesCount;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    public long A03(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i2 = 0; i2 < this.A0L.length; i2++) {
            if (z) {
                jMax = Math.max(jMax, this.A0L[i2].A0T());
            } else {
                Object objA01 = AbstractC21273y.A01(this.A07);
                String[] strArr = A0f;
                if (strArr[6].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0f;
                strArr2[6] = "FDopTuaFs";
                strArr2[7] = "ze95XzERDUjm";
                if (((C2687DK) objA01).A01[i2]) {
                    jMax = Math.max(jMax, this.A0L[i2].A0T());
                }
            }
        }
        return jMax;
    }

    private C4898na A06(C2686DJ c2686dj) {
        int length = this.A0L.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (c2686dj.equals(this.A0K[i2])) {
                return this.A0L[i2];
            }
        }
        C4898na c4898naA0B = C4898na.A0B(this.A0W, this.A0S, this.A0R);
        c4898naA0B.A0d(this);
        int trackCount = length + 1;
        C2686DJ[] c2686djArr = (C2686DJ[]) Arrays.copyOf(this.A0K, trackCount);
        c2686djArr[length] = c2686dj;
        this.A0K = (C2686DJ[]) AbstractC22035C.A1H(c2686djArr);
        int trackCount2 = length + 1;
        C4898na[] c4898naArr = (C4898na[]) Arrays.copyOf(this.A0L, trackCount2);
        c4898naArr[length] = c4898naA0B;
        this.A0L = (C4898na[]) AbstractC22035C.A1H(c4898naArr);
        return c4898naA0B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2809FI
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final C2810FJ AEf(C4911nn c4911nn, long j2, long j3, IOException iOException, int i2) {
        C2810FJ c2810fjA01;
        C2499AG c2499ag = c4911nn.A08;
        C2657Cq c2657Cq = new C2657Cq(c4911nn.A05, c4911nn.A01, c2499ag.A01(), c2499ag.A02(), j2, j3, c2499ag.A00());
        long jA8u = this.A0X.A8u(new C2805FE(c2657Cq, new C2659Cs(1, -1, null, 0, null, AbstractC22035C.A0P(c4911nn.A00), AbstractC22035C.A0P(this.A03)), iOException, i2));
        if (jA8u == -9223372036854775807L) {
            c2810fjA01 = C4869n7.A06;
        } else {
            int iA00 = A00();
            boolean z = iA00 > this.A02;
            if (A0U(c4911nn, iA00)) {
                c2810fjA01 = C4869n7.A01(z, jA8u);
            } else {
                c2810fjA01 = C4869n7.A05;
            }
        }
        this.A0T.A07(c2657Cq, 1, -1, null, 0, null, c4911nn.A00, this.A03, iOException, !c2810fjA01.A02());
        return c2810fjA01;
    }

    public static Map<String, String> A0D() {
        HashMap map = new HashMap();
        map.put(A0B(1, 12, 34), A0B(0, 1, 63));
        Map<String, String> headers = Collections.unmodifiableMap(map);
        return headers;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void A0E() {
        AbstractC21273y.A08(this.A0G);
        AbstractC21273y.A01(this.A07);
        AbstractC21273y.A01(this.A08);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        Metadata metadataA05;
        if (this.A0H || this.A0G) {
            return;
        }
        boolean z = this.A0I;
        String[] strArr = A0f;
        if (strArr[1].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[2] = "grMxxjGjFdBhxw9MDZtvFg4OZy35nlzN";
        strArr2[5] = "E38rNlujzeckGRbn7d7aukKxtTtuF9Uw";
        if (!z || this.A08 == null) {
            return;
        }
        for (C4898na c4898na : this.A0L) {
            if (c4898na.A0U() == null) {
                return;
            }
        }
        this.A0P.A02();
        int length = this.A0L.length;
        C5027pg[] c5027pgArr = new C5027pg[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            C5064qI c5064qIA14 = (C5064qI) AbstractC21273y.A01(this.A0L[i2].A0U());
            String str = c5064qIA14.A0W;
            boolean zA0C = AbstractC20873J.A0C(str);
            boolean z2 = zA0C || AbstractC20873J.A0F(str);
            zArr[i2] = z2;
            this.A0A |= z2;
            IcyHeaders icyHeaders = this.A09;
            if (icyHeaders != null) {
                if (zA0C || this.A0K[i2].A01) {
                    Metadata metadata = c5064qIA14.A0P;
                    if (metadata == null) {
                        metadataA05 = new Metadata(icyHeaders);
                    } else {
                        metadataA05 = metadata.A05(icyHeaders);
                    }
                    C20592p c20592pA0v = c5064qIA14.A07().A0v(metadataA05);
                    if (A0f[0].length() != 20) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A0f;
                    strArr3[2] = "WsODqr3j7Qd6qKAaI5Z8JETVOkriGcMH";
                    strArr3[5] = "rCf1buyjz0YjJBdswvkAeWhqIr4TjJn3";
                    c5064qIA14 = c20592pA0v.A14();
                }
                if (zA0C) {
                    int trackCount = c5064qIA14.A04;
                    if (trackCount == -1) {
                        int trackCount2 = c5064qIA14.A0D;
                        if (trackCount2 == -1) {
                            int trackCount3 = icyHeaders.A00;
                            if (trackCount3 != -1) {
                                C20592p c20592pA07 = c5064qIA14.A07();
                                int trackCount4 = icyHeaders.A00;
                                c5064qIA14 = c20592pA07.A0a(trackCount4).A14();
                            }
                        }
                    }
                }
            }
            c5027pgArr[i2] = new C5027pg(c5064qIA14);
        }
        this.A07 = new C2687DK(new C4894nW(c5027pgArr), zArr);
        this.A0G = true;
        ((InterfaceC4914nq) AbstractC21273y.A01(this.A06)).AFS(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G() {
        this.A0O.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.DF
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0c();
            }
        });
    }

    private void A0H() {
        C4911nn c4911nn = new C4911nn(this, this.A0N, this.A0Q, this.A0U, this, this.A0P);
        if (this.A0G) {
            AbstractC21273y.A08(A0S());
            if (this.A03 != -9223372036854775807L && this.A05 >= this.A03) {
                this.A0D = true;
                this.A05 = -9223372036854775807L;
                return;
            }
            c4911nn.A04(((InterfaceC2948HY) AbstractC21273y.A01(this.A08)).A91(this.A05).A00.A00, this.A05);
            for (C4898na c4898na : this.A0L) {
                c4898na.A0b(this.A05);
            }
            this.A05 = -9223372036854775807L;
        }
        this.A02 = A00();
        this.A0T.A06(new C2657Cq(c4911nn.A05, c4911nn.A01, this.A0Y.A08(c4911nn, this, this.A0X.A8Z(this.A00))), 1, -1, null, 0, null, c4911nn.A00, this.A03, 0);
    }

    private final void A0J() throws IOException {
        this.A0Y.A0B(this.A0X.A8Z(this.A00));
    }

    private void A0K(int i2) {
        A0E();
        boolean[] zArr = this.A07.A03;
        if (!zArr[i2]) {
            C5064qI c5064qIA08 = this.A07.A00.A05(i2).A08(0);
            this.A0T.A03(AbstractC20873J.A01(c5064qIA08.A0W), c5064qIA08, 0, null, this.A04);
            zArr[i2] = true;
        }
    }

    private void A0L(int i2) {
        A0E();
        boolean[] zArr = this.A07.A02;
        if (this.A0F && zArr[i2]) {
            if (this.A0L[i2].A0g(false)) {
                return;
            }
            this.A05 = 0L;
            this.A0F = false;
            this.A0E = true;
            this.A04 = 0L;
            this.A02 = 0;
            for (C4898na c4898na : this.A0L) {
                c4898na.A0Z();
            }
            ((InterfaceC4914nq) AbstractC21273y.A01(this.A06)).ADV(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2809FI
    /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public final void AEe(C4911nn c4911nn, long j2, long j3) {
        long largestQueuedTimestampUs;
        if (this.A03 == -9223372036854775807L && this.A08 != null) {
            boolean zAAj = this.A08.AAj();
            long jA03 = A03(true);
            String[] strArr = A0f;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0f;
            strArr2[6] = "VBgm4XD5c";
            strArr2[7] = "eM9hzsMViOdm";
            if (jA03 == Long.MIN_VALUE) {
                largestQueuedTimestampUs = 0;
            } else {
                largestQueuedTimestampUs = WorkRequest.MIN_BACKOFF_MILLIS + jA03;
            }
            this.A03 = largestQueuedTimestampUs;
            this.A0V.AG0(this.A03, zAAj, this.A0C);
        }
        C2499AG c2499ag = c4911nn.A08;
        this.A0T.A08(new C2657Cq(c4911nn.A05, c4911nn.A01, c2499ag.A01(), c2499ag.A02(), j2, j3, c2499ag.A00()), 1, -1, null, 0, null, c4911nn.A00, this.A03, c4911nn, null);
        this.A0D = true;
        ((InterfaceC4914nq) AbstractC21273y.A01(this.A06)).ADV(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2809FI
    /* JADX INFO: renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final void AEi(C4911nn c4911nn, long j2, long j3, int i2) {
        C2657Cq c2657Cq;
        C2499AG dataSource = c4911nn.A08;
        if (i2 == 0) {
            c2657Cq = new C2657Cq(c4911nn.A05, c4911nn.A01, j2);
        } else {
            c2657Cq = new C2657Cq(c4911nn.A05, c4911nn.A01, dataSource.A01(), dataSource.A02(), j2, j3, dataSource.A00());
        }
        this.A0T.A06(c2657Cq, 1, -1, null, 0, null, c4911nn.A00, this.A03, i2);
        String[] strArr = A0f;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[6] = "RSQzFltms";
        strArr2[7] = "MablvJN0SXK9";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2809FI
    /* JADX INFO: renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final void AEc(C4911nn c4911nn, long j2, long j3, boolean z) {
        C2499AG dataSource = c4911nn.A08;
        this.A0T.A05(new C2657Cq(c4911nn.A05, c4911nn.A01, dataSource.A01(), dataSource.A02(), j2, j3, dataSource.A00()), 1, -1, null, 0, null, c4911nn.A00, this.A03);
        if (!z) {
            for (C4898na c4898na : this.A0L) {
                c4898na.A0Z();
            }
            if (this.A01 > 0) {
                ((InterfaceC4914nq) AbstractC21273y.A01(this.A06)).ADV(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0R, reason: merged with bridge method [inline-methods] */
    public void A0e(InterfaceC2948HY interfaceC2948HY) {
        this.A08 = interfaceC2948HY;
        this.A03 = interfaceC2948HY.A7t();
        this.A0C = !this.A0B && interfaceC2948HY.A7t() == -9223372036854775807L;
        this.A00 = this.A0C ? 7 : 1;
        this.A0V.AG0(this.A03, interfaceC2948HY.AAj(), this.A0C);
        if (!this.A0G) {
            A0F();
        }
    }

    private boolean A0S() {
        return this.A05 != -9223372036854775807L;
    }

    private boolean A0T() {
        return this.A0E || A0S();
    }

    private boolean A0U(C4911nn c4911nn, int i2) {
        if (this.A0B || (this.A08 != null && this.A08.A7t() != -9223372036854775807L)) {
            this.A02 = i2;
            return true;
        }
        if (this.A0G && !A0T()) {
            this.A0F = true;
            return false;
        }
        this.A0E = this.A0G;
        this.A04 = 0L;
        this.A02 = 0;
        for (C4898na c4898na : this.A0L) {
            c4898na.A0Z();
        }
        c4911nn.A04(0L, 0L);
        return true;
    }

    private boolean A0V(boolean[] zArr, long j2) {
        int length = this.A0L.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (!this.A0L[i2].A0f(j2, false) && (zArr[i2] || !this.A0A)) {
                return false;
            }
        }
        return true;
    }

    public final int A0X(int i2, long j2) {
        if (A0T()) {
            return 0;
        }
        A0K(i2);
        C4898na c4898na = this.A0L[i2];
        int iA0Q = c4898na.A0Q(j2, this.A0D);
        c4898na.A0a(iA0Q);
        if (iA0Q == 0) {
            A0L(i2);
        }
        return iA0Q;
    }

    public final int A0Y(int i2, C23146z c23146z, C4985p0 c4985p0, int i3) {
        if (A0T()) {
            return -3;
        }
        A0K(i2);
        int result = this.A0L[i2].A0R(c23146z, c4985p0, i3, this.A0D);
        if (result == -3) {
            A0L(i2);
        }
        return result;
    }

    public final InterfaceC2953Hd A0Z() {
        return A06(new C2686DJ(0, true));
    }

    public final void A0a() {
        if (this.A0G) {
            for (C4898na c4898na : this.A0L) {
                c4898na.A0X();
            }
        }
        this.A0Y.A0C(this);
        this.A0O.removeCallbacksAndMessages(null);
        this.A06 = null;
        this.A0H = true;
    }

    public final /* synthetic */ void A0b() {
        if (!this.A0H) {
            ((InterfaceC4914nq) AbstractC21273y.A01(this.A06)).ADV(this);
        }
    }

    public final /* synthetic */ void A0c() {
        this.A0B = true;
    }

    public final void A0d(int i2) throws IOException {
        this.A0L[i2].A0W();
        A0J();
    }

    public final boolean A0f(int i2) {
        return !A0T() && this.A0L[i2].A0g(this.A0D);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2700DX
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4s(long j2) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final boolean A5C(long j2) {
        if (this.A0D || this.A0Y.A0D() || this.A0F) {
            return false;
        }
        if (this.A0G && this.A01 == 0) {
            return false;
        }
        boolean zA04 = this.A0P.A04();
        boolean continuedLoading = this.A0Y.A0E();
        if (!continuedLoading) {
            A0H();
            return true;
        }
        return zA04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final void A60(long j2, boolean z) {
        A0E();
        if (A0S()) {
            return;
        }
        boolean[] zArr = this.A07.A01;
        int length = this.A0L.length;
        for (int i2 = 0; i2 < length; i2++) {
            C4898na[] c4898naArr = this.A0L;
            String[] strArr = A0f;
            String str = strArr[6];
            String str2 = strArr[7];
            int trackCount = str.length();
            if (trackCount == str2.length()) {
                throw new RuntimeException();
            }
            A0f[0] = "xFMIvf7swbs88yH1ASsn";
            c4898naArr[i2].A0c(j2, z, zArr[i2]);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2924HA
    public final void A6O() {
        this.A0I = true;
        this.A0O.post(this.A0Z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final long A6r(long j2, C23717u c23717u) {
        A0E();
        if (!this.A08.AAj()) {
            return 0L;
        }
        C2947HX c2947hxA91 = this.A08.A91(j2);
        long j3 = c2947hxA91.A00.A01;
        String[] strArr = A0f;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[2] = "A6SKS5Ejxr3dBguC5asmpR7Eo1U8ekaX";
        strArr2[5] = "H67kjT3j1V6FB1MougrbLEHHMAKkStlF";
        return c23717u.A00(j2, j3, c2947hxA91.A01.A01);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2700DX
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Added in D9949576 for unstall buffer")
    public final long A76(long j2) {
        if (this.A0d && !this.A0G) {
            return 0L;
        }
        if (this.A0D) {
            return this.A03 - j2;
        }
        return A78() - j2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final long A78() {
        C4898na[] c4898naArr;
        int length;
        int trackCount;
        A0E();
        if (this.A0D || this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        boolean zA0S = A0S();
        String[] strArr = A0f;
        if (strArr[1].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0f[0] = "YocKG9EsUqAPXBELOuFE";
        if (zA0S) {
            return this.A05;
        }
        long jA03 = LocationRequestCompat.PASSIVE_INTERVAL;
        if (this.A0A) {
            int length2 = this.A0L.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (this.A07.A02[i2]) {
                    C2687DK c2687dk = this.A07;
                    if (A0f[3].length() == 29) {
                        throw new RuntimeException();
                    }
                    A0f[0] = "CWn0xvSWDOv6yRiyH00v";
                    if (c2687dk.A01[i2]) {
                        C4898na[] c4898naArr2 = this.A0L;
                        String[] strArr2 = A0f;
                        String str = strArr2[2];
                        String str2 = strArr2[5];
                        int iCharAt = str.charAt(7);
                        int trackCount2 = str2.charAt(7);
                        if (iCharAt != trackCount2) {
                            if (!c4898naArr2[i2].A0e()) {
                                c4898naArr = this.A0L;
                                String[] strArr3 = A0f;
                                String str3 = strArr3[6];
                                String str4 = strArr3[7];
                                length = str3.length();
                                trackCount = str4.length();
                                if (length != trackCount) {
                                    String[] strArr4 = A0f;
                                    strArr4[2] = "XlyJfiuja8URoHVDmmAk9tswNdXWeReZ";
                                    strArr4[5] = "M3k0l25jfFhaASrq1DtlqcrTUVRM508s";
                                    jA03 = Math.min(jA03, c4898naArr[i2].A0T());
                                } else {
                                    jA03 = Math.min(jA03, c4898naArr[i2].A0T());
                                }
                            }
                        } else {
                            String[] strArr5 = A0f;
                            strArr5[6] = "r97slta5r";
                            strArr5[7] = "NJT5wUbHJHvk";
                            if (!c4898naArr2[i2].A0e()) {
                                c4898naArr = this.A0L;
                                String[] strArr6 = A0f;
                                String str5 = strArr6[6];
                                String str6 = strArr6[7];
                                length = str5.length();
                                trackCount = str6.length();
                                if (length != trackCount) {
                                    String[] strArr7 = A0f;
                                    strArr7[2] = "XlyJfiuja8URoHVDmmAk9tswNdXWeReZ";
                                    strArr7[5] = "M3k0l25jfFhaASrq1DtlqcrTUVRM508s";
                                    jA03 = Math.min(jA03, c4898naArr[i2].A0T());
                                } else {
                                    jA03 = Math.min(jA03, c4898naArr[i2].A0T());
                                }
                            }
                        }
                    }
                }
            }
        }
        if (jA03 == LocationRequestCompat.PASSIVE_INTERVAL) {
            jA03 = A03(false);
        }
        if (jA03 == Long.MIN_VALUE) {
            return this.A04;
        }
        return jA03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final long A8b() {
        return A78();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final C4894nW A9M() {
        A0E();
        return this.A07.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final void ACS() throws IOException {
        A0J();
        if (this.A0D && !this.A0G) {
            if (this.A0c) {
                throw C20883K.A01(A0B(90, 54, 63) + (this.A0N != null ? this.A0N.toString() : A0B(164, 4, 125)), null);
            }
            throw C20883K.A01(A0B(42, 48, 50), null);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2813FM
    public final void AEj() {
        for (C4898na c4898na : this.A0L) {
            c4898na.A0Y();
        }
        this.A0U.AHb();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2692DP
    public final void AGL(C5064qI c5064qI) {
        this.A0O.post(this.A0Z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final void AH5(InterfaceC4914nq interfaceC4914nq, long j2) {
        this.A06 = interfaceC4914nq;
        this.A0P.A04();
        A0H();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final long AHQ() {
        if (!this.A0E) {
            return -9223372036854775807L;
        }
        boolean z = this.A0D;
        if (A0f[0].length() == 20) {
            String[] strArr = A0f;
            strArr[1] = "";
            strArr[4] = "OLDtf0M6xpFiQAaUF2mFzXoKXa03XjZ";
            if (z || A00() > this.A02) {
                this.A0E = false;
                long j2 = this.A04;
                if (A0f[0].length() == 20) {
                    String[] strArr2 = A0f;
                    strArr2[6] = "30bUCuPdV";
                    strArr2[7] = "qvk1tPvPLdJz";
                    return j2;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final void AHW(long j2) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2924HA
    public final void AJ7(final InterfaceC2948HY interfaceC2948HY) {
        this.A0O.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.DE
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0e(interfaceC2948HY);
            }
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final long AJ8(@MetaExoPlayerCustomization long j2, boolean z) {
        A0E();
        boolean[] zArr = this.A07.A02;
        if (!this.A08.AAj()) {
            j2 = 0;
        }
        int i2 = 0;
        this.A0E = false;
        this.A04 = j2;
        if (A0S()) {
            this.A05 = j2;
            return j2;
        }
        if (this.A00 != 7 && A0V(zArr, j2)) {
            return j2;
        }
        this.A0F = false;
        this.A05 = j2;
        this.A0D = false;
        if (this.A0Y.A0E()) {
            C4898na[] c4898naArr = this.A0L;
            int length = c4898naArr.length;
            while (i2 < length) {
                c4898naArr[i2].A0V();
                String[] strArr = A0f;
                if (strArr[6].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0f;
                strArr2[2] = "OrOS7Vhjp4VBbz175mMxq2SuFvjpl5bQ";
                strArr2[5] = "EAKZg7yj0ctHJiN4FHg90oFZJxg2ecfG";
                i2++;
            }
            this.A0Y.A09();
            return j2;
        }
        this.A0Y.A0A();
        C4898na[] c4898naArr2 = this.A0L;
        int length2 = c4898naArr2.length;
        while (i2 < length2) {
            c4898naArr2[i2].A0Z();
            String[] strArr3 = A0f;
            if (strArr3[2].charAt(7) != strArr3[5].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0f;
            strArr4[6] = "p5drqiHAR";
            strArr4[7] = "h8TdfbRbJweW";
            i2++;
        }
        return j2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2700DX
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AJc(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2924HA
    public final InterfaceC2953Hd AKS(int i2, int i3) {
        return A06(new C2686DJ(i2, false));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2700DX
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AKb(byte b) {
    }
}
