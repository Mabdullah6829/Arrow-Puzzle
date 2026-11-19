package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Pair;
import androidx.constraintlayout.widget.C1137R;
import androidx.core.location.LocationRequestCompat;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.facebook.ads.androidx.media3.extractor.mp4.Mp4Extractor;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4816m3 implements InterfaceC2923H9, InterfaceC2948HY {
    public static byte[] A0Q;
    public static String[] A0R = {"uzhMW", "LbToze1ZyMStOzMPMggUyU89k761Fydj", "roznHbdGo", "zeOiwqyw9G80TO", "hwgMtT9WWej", "AZ5CtgA3jsgDmrh", "c4g75mNjYzBkznfgxB8HcDFPfSogi", "Prtl1ARtkjOsoD"};
    public static final InterfaceC2927HD A0S;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0A;
    public long A0B;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0C;
    public C21864v A0D;
    public InterfaceC2924HA A0E;
    public MotionPhotoMetadata A0F;
    public C3051JE[] A0G;
    public long[][] A0H;
    public final int A0I;
    public final C21864v A0J;
    public final C21864v A0K;
    public final C21864v A0L;
    public final C21864v A0M;
    public final C3058JL A0N;
    public final ArrayDeque<C4827mE> A0O;
    public final List<Metadata.Entry> A0P;

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:35:0x0107  */
    /* JADX WARN: Code duplicated, block: B:37:0x010b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0121 A[LOOP:1: B:39:0x011d->B:41:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x013b  */
    /* JADX WARN: Code duplicated, block: B:49:0x016a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0178  */
    /* JADX WARN: Code duplicated, block: B:53:0x018b  */
    /* JADX WARN: Code duplicated, block: B:56:0x019f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private int A03(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        long j2;
        int i2;
        int i3;
        byte[] bArrA0l;
        int i4;
        int i5;
        int iA0C;
        long jA8n = interfaceC4855ms.A8n();
        if (this.A08 == -1) {
            this.A08 = A01(jA8n);
            if (this.A08 == -1) {
                return -1;
            }
        }
        C3051JE c3051je = this.A0G[this.A08];
        InterfaceC2953Hd interfaceC2953Hd = c3051je.A01;
        int i6 = c3051je.A00;
        long j3 = c3051je.A04.A06[i6];
        int i7 = c3051je.A04.A05[i6];
        C2954He c2954He = c3051je.A02;
        long j4 = (j3 - jA8n) + ((long) this.A05);
        if (j4 < 0 || j4 >= 262144) {
            c2945hv.A00 = j3;
            return 1;
        }
        int i8 = c3051je.A03.A02;
        if (A0R[2].length() != 19) {
            A0R[6] = "rX6gisAdcV7LBeXwmOhQV8Eb98OXk";
            if (i8 == 1) {
                j4 += 8;
                if (A0R[6].length() == 29) {
                    String[] strArr = A0R;
                    strArr[3] = "KKgaKTwS1RwNPE";
                    strArr[7] = "5hDvshmtbzc6vz";
                    i7 -= 8;
                    interfaceC4855ms.AK3((int) j4);
                    if (c3051je.A03.A01 != 0) {
                        bArrA0l = this.A0K.A0l();
                        bArrA0l[0] = 0;
                        bArrA0l[1] = 0;
                        bArrA0l[2] = 0;
                        i4 = c3051je.A03.A01;
                        i5 = 4 - c3051je.A03.A01;
                        while (this.A06 < i7) {
                            if (this.A07 == 0) {
                                interfaceC4855ms.readFully(bArrA0l, i5, i4);
                                this.A05 += i4;
                                this.A0K.A0f(0);
                                iA0C = this.A0K.A0C();
                                if (iA0C >= 0) {
                                    throw C20883K.A01(A09(48, 18, C1137R.styleable.ConstraintSet_polarRelativeTo), null);
                                }
                                this.A07 = iA0C;
                                this.A0L.A0f(0);
                                interfaceC2953Hd.AIr(this.A0L, 4);
                                this.A06 += 4;
                                i7 += i5;
                            } else {
                                int iAIp = interfaceC2953Hd.AIp(interfaceC4855ms, this.A07, false);
                                this.A05 += iAIp;
                                this.A06 += iAIp;
                                this.A07 -= iAIp;
                            }
                        }
                    } else {
                        if (A09(66, 9, 68).equals(c3051je.A03.A07.A0W)) {
                            if (this.A06 == 0) {
                                AbstractC2908Gu.A07(i7, this.A0M);
                                interfaceC2953Hd.AIr(this.A0M, 7);
                                this.A06 += 7;
                            }
                            i7 += 7;
                        } else if (c2954He != null) {
                            c2954He.A03(interfaceC4855ms);
                        }
                        while (this.A06 < i7) {
                            int iAIp2 = interfaceC2953Hd.AIp(interfaceC4855ms, i7 - this.A06, false);
                            this.A05 += iAIp2;
                            this.A06 += iAIp2;
                            this.A07 -= iAIp2;
                        }
                    }
                    j2 = c3051je.A04.A07[i6];
                    i2 = c3051je.A04.A04[i6];
                    if (A0R[4].length() == 11) {
                        String[] strArr2 = A0R;
                        strArr2[5] = "dniiMzQMBKOANx9";
                        strArr2[0] = "Fj7cY";
                        if (c2954He != null) {
                            i3 = 0;
                            c2954He.A04(interfaceC2953Hd, j2, i2, i7, 0, null);
                            if (i6 + 1 == c3051je.A04.A01) {
                                c2954He.A05(interfaceC2953Hd, null);
                            }
                        } else {
                            i3 = 0;
                            interfaceC2953Hd.AIu(j2, i2, i7, 0, null);
                        }
                        c3051je.A00++;
                        this.A08 = -1;
                        this.A05 = i3;
                        this.A06 = i3;
                        this.A07 = i3;
                        return i3;
                    }
                }
            } else {
                interfaceC4855ms.AK3((int) j4);
                if (c3051je.A03.A01 != 0) {
                    bArrA0l = this.A0K.A0l();
                    bArrA0l[0] = 0;
                    bArrA0l[1] = 0;
                    bArrA0l[2] = 0;
                    i4 = c3051je.A03.A01;
                    i5 = 4 - c3051je.A03.A01;
                    while (this.A06 < i7) {
                        if (this.A07 == 0) {
                            interfaceC4855ms.readFully(bArrA0l, i5, i4);
                            this.A05 += i4;
                            this.A0K.A0f(0);
                            iA0C = this.A0K.A0C();
                            if (iA0C >= 0) {
                                throw C20883K.A01(A09(48, 18, C1137R.styleable.ConstraintSet_polarRelativeTo), null);
                            }
                            this.A07 = iA0C;
                            this.A0L.A0f(0);
                            interfaceC2953Hd.AIr(this.A0L, 4);
                            this.A06 += 4;
                            i7 += i5;
                        } else {
                            int iAIp3 = interfaceC2953Hd.AIp(interfaceC4855ms, this.A07, false);
                            this.A05 += iAIp3;
                            this.A06 += iAIp3;
                            this.A07 -= iAIp3;
                        }
                    }
                } else {
                    if (A09(66, 9, 68).equals(c3051je.A03.A07.A0W)) {
                        if (this.A06 == 0) {
                            AbstractC2908Gu.A07(i7, this.A0M);
                            interfaceC2953Hd.AIr(this.A0M, 7);
                            this.A06 += 7;
                        }
                        i7 += 7;
                    } else if (c2954He != null) {
                        c2954He.A03(interfaceC4855ms);
                    }
                    while (this.A06 < i7) {
                        int iAIp4 = interfaceC2953Hd.AIp(interfaceC4855ms, i7 - this.A06, false);
                        this.A05 += iAIp4;
                        this.A06 += iAIp4;
                        this.A07 -= iAIp4;
                    }
                }
                j2 = c3051je.A04.A07[i6];
                i2 = c3051je.A04.A04[i6];
                if (A0R[4].length() == 11) {
                    String[] strArr3 = A0R;
                    strArr3[5] = "dniiMzQMBKOANx9";
                    strArr3[0] = "Fj7cY";
                    if (c2954He != null) {
                        i3 = 0;
                        c2954He.A04(interfaceC2953Hd, j2, i2, i7, 0, null);
                        if (i6 + 1 == c3051je.A04.A01) {
                            c2954He.A05(interfaceC2953Hd, null);
                        }
                    } else {
                        i3 = 0;
                        interfaceC2953Hd.AIu(j2, i2, i7, 0, null);
                    }
                    c3051je.A00++;
                    this.A08 = -1;
                    this.A05 = i3;
                    this.A06 = i3;
                    this.A07 = i3;
                    return i3;
                }
            }
        }
        throw new RuntimeException();
    }

    public static String A09(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Q, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0Q = new byte[]{-47, 4, -1, -3, -80, 3, -7, 10, -11, -80, -4, -11, 3, 3, -80, 4, -8, -15, -2, -80, -8, -11, -15, -12, -11, 2, -80, -4, -11, -2, -9, 4, -8, -80, -72, 5, -2, 3, 5, 0, 0, -1, 2, 4, -11, -12, -71, -66, 18, 55, 63, 42, 53, 50, 45, -23, 23, 10, 21, -23, 53, 46, 55, 48, 61, 49, -8, 12, -5, 0, 6, -58, -8, -6, -53, 49, 69, 52, 57, 63, -1, 68, 66, 69, 53, -3, 56, 52};
    }

    static {
        A0C();
        A0S = new InterfaceC2927HD() { // from class: com.facebook.ads.redexgen.X.m4
            @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
            public final InterfaceC2923H9[] A5N() {
                return C4816m3.A0M();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
            public final /* synthetic */ InterfaceC2923H9[] A5O(Uri uri, Map map) {
                return AbstractC2926HC.A01(this, uri, map);
            }
        };
    }

    public C4816m3() {
        this(0);
    }

    public C4816m3(int i2) {
        this.A0I = i2;
        this.A04 = (i2 & 4) != 0 ? 3 : 0;
        this.A0N = new C3058JL();
        this.A0P = new ArrayList();
        this.A0J = new C21864v(16);
        this.A0O = new ArrayDeque<>();
        this.A0L = new C21864v(AbstractC2942HS.A03);
        this.A0K = new C21864v(4);
        this.A0M = new C21864v();
        this.A08 = -1;
        this.A0E = InterfaceC2924HA.A00;
        this.A0G = new C3051JE[0];
    }

    public static int A00(int i2) {
        switch (i2) {
            case 1751476579:
                return 2;
            case 1903435808:
                if (A0R[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0R[1] = "rbgKKZbH0NS3XFJda55b1nN6iCZjcLPR";
                return 1;
            default:
                if (A0R[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0R[4] = "05jGjYjRxbz";
                return 0;
        }
    }

    private int A01(long j2) {
        long j3 = LocationRequestCompat.PASSIVE_INTERVAL;
        int preferredTrackIndex = 1;
        int i2 = -1;
        long sampleOffset = LocationRequestCompat.PASSIVE_INTERVAL;
        long j4 = LocationRequestCompat.PASSIVE_INTERVAL;
        int i3 = 1;
        int trackIndex = -1;
        int i4 = 0;
        while (true) {
            C3051JE[] c3051jeArr = this.A0G;
            String[] strArr = A0R;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0R[6] = "Fcko3uaud46cO6nUcug7HhLZFNYBY";
            if (i4 >= c3051jeArr.length) {
                if (j4 == LocationRequestCompat.PASSIVE_INTERVAL || i3 == 0) {
                    return i2;
                }
                long j5 = 10485760 + j4;
                if (A0R[1].charAt(1) == 'b') {
                    A0R[1] = "AbIM1W3wiFJMRqsWOI3P0CqvLybO2M00";
                    if (sampleOffset < j5) {
                        return i2;
                    }
                } else if (sampleOffset < j5) {
                    return i2;
                }
                return trackIndex;
            }
            C3051JE c3051je = this.A0G[i4];
            int i5 = c3051je.A00;
            if (i5 != c3051je.A04.A01) {
                long j6 = c3051je.A04.A06[i5];
                long minAccumulatedBytes = ((long[][]) AbstractC22035C.A0f(this.A0H))[i4][i5];
                long j7 = j6 - j2;
                int i6 = (j7 < 0 || j7 >= 262144) ? 1 : 0;
                if ((i6 == 0 && preferredTrackIndex != 0) || (i6 == preferredTrackIndex && j7 < j3)) {
                    preferredTrackIndex = i6;
                    j3 = j7;
                    i2 = i4;
                    if (A0R[6].length() != 29) {
                        String[] strArr2 = A0R;
                        strArr2[5] = "nNk7RawiIyahd9Y";
                        strArr2[0] = "017pL";
                        sampleOffset = minAccumulatedBytes;
                    } else {
                        A0R[1] = "1bC0in6G1ApWSL3PegJBmoVzHl6EE3tw";
                        sampleOffset = minAccumulatedBytes;
                    }
                }
                if (minAccumulatedBytes < j4) {
                    j4 = minAccumulatedBytes;
                    i3 = i6;
                    trackIndex = i4;
                }
            }
            i4++;
        }
    }

    public static int A02(C21864v c21864v) {
        c21864v.A0f(8);
        int majorBrand = A00(c21864v.A0C());
        if (majorBrand != 0) {
            return majorBrand;
        }
        c21864v.A0g(4);
        while (c21864v.A07() > 0) {
            int majorBrand2 = A00(c21864v.A0C());
            if (majorBrand2 != 0) {
                return majorBrand2;
            }
        }
        return 0;
    }

    private int A04(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        int iA07 = this.A0N.A07(interfaceC4855ms, c2945hv, this.A0P);
        if (iA07 == 1 && c2945hv.A00 == 0) {
            A0A();
        }
        return iA07;
    }

    public static int A05(C3064JR c3064jr, long j2) {
        int iA00 = c3064jr.A00(j2);
        if (iA00 == -1) {
            return c3064jr.A01(j2);
        }
        return iA00;
    }

    public static long A06(C3064JR c3064jr, long j2, long j3) {
        int iA05 = A05(c3064jr, j2);
        if (iA05 == -1) {
            return j3;
        }
        return Math.min(c3064jr.A06[iA05], j3);
    }

    private final C2947HX A07(long j2, int i2) {
        long jA06;
        long j3;
        int mainTrackIndex;
        if (this.A0G.length == 0) {
            return new C2947HX(C2949HZ.A04);
        }
        long j4 = -9223372036854775807L;
        long jA07 = -1;
        int i3 = i2 != -1 ? i2 : this.A03;
        if (i3 != -1) {
            C3064JR c3064jr = this.A0G[i3].A04;
            int iA05 = A05(c3064jr, j2);
            if (iA05 == -1) {
                return new C2947HX(C2949HZ.A04);
            }
            j3 = c3064jr.A07[iA05];
            jA06 = c3064jr.A06[iA05];
            if (A0R[6].length() != 29) {
                throw new RuntimeException();
            }
            A0R[1] = "zbT5rN6sguJCvWwII8HLCHwSkH7sQNQT";
            if (j3 < j2 && iA05 < c3064jr.A01 - 1 && (mainTrackIndex = c3064jr.A01(j2)) != -1 && mainTrackIndex != iA05) {
                j4 = c3064jr.A07[mainTrackIndex];
                jA07 = c3064jr.A06[mainTrackIndex];
            }
        } else {
            jA06 = LocationRequestCompat.PASSIVE_INTERVAL;
            if (A0R[4].length() != 11) {
                j3 = j2;
            } else {
                A0R[2] = "SenK5aC";
                j3 = j2;
            }
        }
        if (i2 == -1) {
            for (int i4 = 0; i4 < this.A0G.length; i4++) {
                if (i4 != this.A03) {
                    C3064JR sampleTable = this.A0G[i4].A04;
                    jA06 = A06(sampleTable, j3, jA06);
                    if (j4 != -9223372036854775807L) {
                        jA07 = A06(sampleTable, j4, jA07);
                    }
                }
            }
        }
        C2949HZ c2949hz = new C2949HZ(j3, jA06);
        if (j4 == -9223372036854775807L) {
            return new C2947HX(c2949hz);
        }
        return new C2947HX(c2949hz, new C2949HZ(j4, jA07));
    }

    public static /* synthetic */ C3061JO A08(C3061JO c3061jo) {
        return c3061jo;
    }

    private void A0A() {
        this.A04 = 0;
        this.A00 = 0;
    }

    private void A0B() {
        if (this.A02 == 2 && (this.A0I & 2) != 0) {
            this.A0E.AKS(0, 4).A6e(new C20592p().A0v(this.A0F == null ? null : new Metadata(this.A0F)).A14());
            this.A0E.A6O();
            this.A0E.AJ7(new C4850mn(-9223372036854775807L));
        }
    }

    private void A0D(long j2) throws C20883K {
        while (!this.A0O.isEmpty() && this.A0O.peek().A00 == j2) {
            C4827mE c4827mEPop = this.A0O.pop();
            if (((AbstractC3031Iu) c4827mEPop).A00 == 1836019574) {
                A0G(c4827mEPop);
                this.A0O.clear();
                this.A04 = 2;
            } else if (!this.A0O.isEmpty()) {
                C4827mE containerAtom = this.A0O.peek();
                containerAtom.A08(c4827mEPop);
            }
        }
        if (this.A04 != 2) {
            A0A();
        }
    }

    private void A0E(long j2) {
        if (this.A01 == 1836086884) {
            this.A0F = new MotionPhotoMetadata(0L, j2, -9223372036854775807L, j2 + ((long) this.A00), this.A09 - ((long) this.A00));
        }
    }

    private void A0F(InterfaceC4855ms interfaceC4855ms) throws IOException {
        this.A0M.A0d(8);
        interfaceC4855ms.AGt(this.A0M.A0l(), 0, 8);
        AbstractC3037J0.A0Q(this.A0M);
        interfaceC4855ms.AK3(this.A0M.A09());
        interfaceC4855ms.AIl();
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Adding average bitrate calculation logic")
    private void A0G(C4827mE c4827mE) throws C20883K {
        int i2;
        int size = -1;
        long jMax = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        List<Mp4Extractor.Mp4Track> tracks = new ArrayList<>();
        Metadata udtaMetaMetadata = null;
        Metadata metadata = null;
        boolean z = this.A02 == 1;
        C2934HK c2934hk = new C2934HK();
        C4826mD c4826mDA07 = c4827mE.A07(1969517665);
        if (c4826mDA07 != null) {
            Pair<Metadata, Metadata> pairA0A = AbstractC3037J0.A0A(c4826mDA07);
            udtaMetaMetadata = (Metadata) pairA0A.first;
            metadata = (Metadata) pairA0A.second;
            if (udtaMetaMetadata != null) {
                c2934hk.A05(udtaMetaMetadata);
            }
        }
        Metadata metadataA0F = null;
        C4827mE c4827mEA06 = c4827mE.A06(1835365473);
        if (c4827mEA06 != null) {
            metadataA0F = AbstractC3037J0.A0F(c4827mEA06);
        }
        List<C3064JR> listA0O = AbstractC3037J0.A0O(c4827mE, c2934hk, -9223372036854775807L, null, (this.A0I & 1) != 0, z, new InterfaceC4715kO() { // from class: com.facebook.ads.redexgen.X.m5
            @Override // com.instagram.common.viewpoint.core.InterfaceC4715kO
            public final Object A4B(Object obj) {
                return C4816m3.A08((C3061JO) obj);
            }
        });
        int trackCount = listA0O.size();
        for (int i3 = 0; i3 < trackCount; i3++) {
            C3064JR c3064jr = listA0O.get(i3);
            int trackCount2 = c3064jr.A01;
            if (trackCount2 == 0) {
                int i4 = A0R[1].charAt(1);
                if (i4 != 98) {
                    throw new RuntimeException();
                }
                A0R[1] = "ibvFTefsgA7pkzOq8AzNcMz9gVb8PR75";
            } else {
                C3061JO track = c3064jr.A03;
                InterfaceC2924HA interfaceC2924HA = this.A0E;
                int trackCount3 = track.A03;
                C3051JE c3051je = new C3051JE(track, c3064jr, interfaceC2924HA.AKS(i3, trackCount3));
                long j4 = track.A04 != -9223372036854775807L ? track.A04 : c3064jr.A02;
                jMax = Math.max(jMax, j4);
                if (1 == track.A03) {
                    j3 = j4;
                } else if (2 == track.A03) {
                    j2 = j4;
                }
                if (A09(75, 13, 125).equals(track.A07.A0W)) {
                    int i5 = c3064jr.A00;
                    if (A0R[6].length() != 29) {
                        throw new RuntimeException();
                    }
                    A0R[6] = "30Puiqoz9JCJMsN9BhlLDaWtr32u3";
                    i2 = i5 * 16;
                } else {
                    i2 = c3064jr.A00 + 30;
                }
                C20592p formatBuilder = track.A07.A07();
                formatBuilder.A0h(i2);
                if (track.A03 == 2 && j4 > 0 && c3064jr.A01 > 1) {
                    formatBuilder.A0X(c3064jr.A01 / (j4 / 1000000.0f));
                }
                if (jMax > 0 && c3064jr.A01 > 0) {
                    int i6 = c3064jr.A05.length;
                    if (i6 == c3064jr.A01) {
                        long j5 = 0;
                        for (int i7 = 0; i7 < sampleIndex; i7++) {
                            int sampleIndex = c3064jr.A05[i7];
                            j5 += (long) sampleIndex;
                        }
                        formatBuilder.A0a((int) ((8000000 * j5) / jMax));
                    }
                }
                int i8 = track.A03;
                AbstractC3048JB.A0D(i8, c2934hk, formatBuilder);
                int i9 = track.A03;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata;
                metadataArr[1] = this.A0P.isEmpty() ? null : new Metadata(this.A0P);
                AbstractC3048JB.A0C(i9, udtaMetaMetadata, metadataA0F, formatBuilder, metadataArr);
                c3051je.A01.A6e(formatBuilder.A14());
                int i10 = track.A03;
                if (i10 == 2 && size == -1) {
                    size = tracks.size();
                }
                tracks.add(c3051je);
            }
        }
        this.A03 = size;
        this.A0B = jMax;
        this.A0C = j2;
        this.A0A = j3;
        this.A0G = (C3051JE[]) tracks.toArray(new C3051JE[0]);
        this.A0H = A0N(this.A0G);
        this.A0E.A6O();
        this.A0E.AJ7(this);
    }

    private void A0H(C3051JE c3051je, long j2) {
        C3064JR c3064jr = c3051je.A04;
        int sampleIndex = c3064jr.A00(j2);
        if (sampleIndex == -1) {
            sampleIndex = c3064jr.A01(j2);
        }
        c3051je.A00 = sampleIndex;
        if (A0R[2].length() == 19) {
            throw new RuntimeException();
        }
        A0R[2] = "DxqZc2lJMNLNZhW19Xb8kO";
    }

    public static boolean A0I(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1701082227 || i2 == 1835365473;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    public static boolean A0J(int i2) {
        if (i2 != 1835296868 && i2 != 1836476516) {
            if (A0R[4].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A0R;
            strArr[3] = "UHuXZ9PGVGxrhu";
            strArr[7] = "Sv1JTBT1egKeuo";
            if (i2 != 1751411826 && i2 != 1937011556 && i2 != 1937011827 && i2 != 1937011571 && i2 != 1668576371 && i2 != 1701606260 && i2 != 1937011555 && i2 != 1937011578 && i2 != 1937013298) {
                if (A0R[2].length() != 19) {
                    A0R[6] = "0EWWhWMRQ7MgS85x4CKboIorprSqD";
                    if (i2 != 1937007471) {
                        if (i2 == 1668232756 && i2 != 1953196132 && i2 != 1718909296 && i2 != 1969517665 && i2 != 1801812339 && i2 != 1768715124) {
                            return false;
                        }
                    }
                } else if (i2 != 1937007471) {
                    if (i2 == 1668232756) {
                    }
                }
            }
        }
        return true;
    }

    private boolean A0K(InterfaceC4855ms interfaceC4855ms) throws IOException {
        C4827mE containerAtom;
        if (this.A00 == 0) {
            if (!interfaceC4855ms.AHR(this.A0J.A0l(), 0, 8, true)) {
                A0B();
                return false;
            }
            this.A00 = 8;
            this.A0J.A0f(0);
            this.A09 = this.A0J.A0Q();
            this.A01 = this.A0J.A0C();
        }
        if (this.A09 == 1) {
            if (A0R[2].length() == 19) {
                throw new RuntimeException();
            }
            A0R[2] = "uEfPCG8cZZkUCN4sq";
            interfaceC4855ms.readFully(this.A0J.A0l(), 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A09 = this.A0J.A0R();
        } else if (this.A09 == 0) {
            long jA8O = interfaceC4855ms.A8O();
            if (jA8O == -1 && (containerAtom = this.A0O.peek()) != null) {
                jA8O = containerAtom.A00;
            }
            if (jA8O != -1) {
                this.A09 = (jA8O - interfaceC4855ms.A8n()) + ((long) this.A00);
            }
        }
        if (this.A09 >= this.A00) {
            if (A0I(this.A01)) {
                long jA8n = (interfaceC4855ms.A8n() + this.A09) - ((long) this.A00);
                if (this.A09 != this.A00 && this.A01 == 1835365473) {
                    A0F(interfaceC4855ms);
                }
                this.A0O.push(new C4827mE(this.A01, jA8n));
                if (this.A09 == this.A00) {
                    A0D(jA8n);
                } else {
                    A0A();
                }
            } else if (A0J(this.A01)) {
                AbstractC21273y.A08(this.A00 == 8);
                AbstractC21273y.A08(this.A09 <= 2147483647L);
                C21864v c21864v = new C21864v((int) this.A09);
                C21864v atomData = this.A0J;
                System.arraycopy(atomData.A0l(), 0, c21864v.A0l(), 0, 8);
                this.A0D = c21864v;
                this.A04 = 1;
            } else {
                A0E(interfaceC4855ms.A8n() - ((long) this.A00));
                this.A0D = null;
                this.A04 = 1;
            }
            return true;
        }
        throw C20883K.A00(A09(0, 48, 61));
    }

    private boolean A0L(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        long j2 = this.A09 - ((long) this.A00);
        long atomEndPosition = interfaceC4855ms.A8n() + j2;
        boolean z = false;
        C21864v c21864v = this.A0D;
        if (c21864v != null) {
            interfaceC4855ms.readFully(c21864v.A0l(), this.A00, (int) j2);
            if (this.A01 == 1718909296) {
                this.A02 = A02(c21864v);
            } else if (!this.A0O.isEmpty()) {
                this.A0O.peek().A09(new C4826mD(this.A01, c21864v));
            }
        } else if (j2 < 262144) {
            interfaceC4855ms.AK3((int) j2);
        } else {
            long atomPayloadSize = interfaceC4855ms.A8n();
            c2945hv.A00 = atomPayloadSize + j2;
            z = true;
        }
        A0D(atomEndPosition);
        return z && this.A04 != 2;
    }

    public static /* synthetic */ InterfaceC2923H9[] A0M() {
        return new InterfaceC2923H9[]{new C4816m3()};
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:48:0x006f A[SYNTHETIC] */
    public static long[][] A0N(C3051JE[] c3051jeArr) {
        long[][] jArr = new long[c3051jeArr.length][];
        int[] iArr = new int[c3051jeArr.length];
        long[] jArr2 = new long[c3051jeArr.length];
        boolean[] tracksFinished = new boolean[c3051jeArr.length];
        for (int i2 = 0; i2 < c3051jeArr.length; i2++) {
            jArr[i2] = new long[c3051jeArr[i2].A04.A01];
            jArr2[i2] = c3051jeArr[i2].A04.A07[0];
        }
        long j2 = 0;
        if (A0R[2].length() == 19) {
            throw new RuntimeException();
        }
        A0R[1] = "qbCXFrWy43oBbJoUYfYqc11BUuHVPZxe";
        int i3 = 0;
        while (i3 < c3051jeArr.length) {
            long j3 = LocationRequestCompat.PASSIVE_INTERVAL;
            int i4 = -1;
            for (int minTimeTrackIndex = 0; minTimeTrackIndex < c3051jeArr.length; minTimeTrackIndex++) {
                boolean z = tracksFinished[minTimeTrackIndex];
                if (A0R[6].length() != 29) {
                    A0R[2] = "AIMWoJADevTWezna7TxcWd";
                    if (!z) {
                        if (jArr2[minTimeTrackIndex] <= j3) {
                            i4 = minTimeTrackIndex;
                            j3 = jArr2[minTimeTrackIndex];
                        }
                    }
                } else {
                    String[] strArr = A0R;
                    strArr[3] = "DkVrMcHnnNdNTj";
                    strArr[7] = "McjqbXJyC3Esle";
                    if (!z) {
                        if (jArr2[minTimeTrackIndex] <= j3) {
                            i4 = minTimeTrackIndex;
                            j3 = jArr2[minTimeTrackIndex];
                        }
                    }
                }
            }
            int i5 = iArr[i4];
            jArr[i4][i5] = j2;
            j2 += (long) c3051jeArr[i4].A04.A05[i5];
            int i6 = i5 + 1;
            iArr[i4] = i6;
            if (i6 < jArr[i4].length) {
                C3051JE c3051je = c3051jeArr[i4];
                if (A0R[1].charAt(1) != 'b') {
                    jArr2[i4] = c3051je.A04.A07[i6];
                } else {
                    String[] strArr2 = A0R;
                    strArr2[5] = "FttiEMkEmxvjjK7";
                    strArr2[0] = "cOA5C";
                    jArr2[i4] = c3051je.A04.A07[i6];
                }
            } else {
                tracksFinished[i4] = true;
                i3++;
            }
        }
        return jArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final long A7t() {
        return this.A0B;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final C2947HX A91(long j2) {
        return A07(j2, -1);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AAC(InterfaceC2924HA interfaceC2924HA) {
        this.A0E = interfaceC2924HA;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final boolean AAj() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final int AHL(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        while (true) {
            switch (this.A04) {
                case 0:
                    if (!A0K(interfaceC4855ms)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    if (A0L(interfaceC4855ms, c2945hv)) {
                        return 1;
                    }
                    break;
                case 2:
                    return A03(interfaceC4855ms, c2945hv);
                case 3:
                    return A04(interfaceC4855ms, c2945hv);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AJ6(long j2, long j3) {
        this.A0O.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        if (j2 == 0) {
            int i2 = this.A04;
            String[] strArr = A0R;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0R;
            strArr2[3] = "BBO5nGzNDCjhdG";
            strArr2[7] = "Qq9RZt6cBQ724Z";
            if (i2 != 3) {
                A0A();
                return;
            } else {
                this.A0N.A08();
                this.A0P.clear();
                return;
            }
        }
        for (C3051JE c3051je : this.A0G) {
            A0H(c3051je, j3);
            if (c3051je.A02 != null) {
                c3051je.A02.A02();
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final boolean AK5(InterfaceC4855ms interfaceC4855ms) throws IOException {
        return AbstractC3059JM.A02(interfaceC4855ms, (this.A0I & 2) != 0);
    }
}
