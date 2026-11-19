package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2495AC extends AbstractC5069qP implements InterfaceC4977os {
    public static byte[] A0m;
    public static String[] A0n = {"elvUyEpYiUQqaqvwUQo90L33x5mfGGF5", "x3rc7jsIv6nSbJc9JPlcAze5yGxzQZsd", "UU9CG9klJf", "SZBoHO9Iw1qJ", "kHgqOkYqcJ", "2J3DKpzV", "imAdJlgwdHrtl5IWv7XQyaTS97", "KGY40HmMWVqKFUFEVN2bB10ght87eGPu"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public C5070qQ A09;
    public C5048q2 A0A;
    public C5048q2 A0B;
    public C5048q2 A0C;
    public C5043px A0D;
    public C5041pv A0E;
    public C5017pW A0F;
    public C5012pR A0G;
    public C21904z A0H;
    public C2496AD A0I;
    public C23507Z A0J;
    public C23717u A0K;
    public InterfaceC2664Cx A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final C5041pv A0T;
    public final long A0U;
    public final long A0V;
    public final long A0W;
    public final Handler A0X;
    public final Looper A0Y;
    public final InterfaceC21053b A0Z;
    public final C5031pl A0a;
    public final InterfaceC213445 A0b;
    public final C213748 A0c;
    public final C4975oq A0d;
    public final C2494AB A0e;
    public final InterfaceC4968oj A0f;
    public final AbstractC2787Ew A0g;
    public final C2788Ex A0h;
    public final CopyOnWriteArraySet<InterfaceC22856W> A0i;
    public final CopyOnWriteArraySet<InterfaceC20983U> A0j;
    public final boolean A0k;
    public final InterfaceC4973oo[] A0l;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0m, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0m = new byte[]{102, 29, 74, 119, 96, 95, 99, 110, 118, 106, 125, 70, 98, 127, 99, 0, 61, 42, 21, 41, 36, 60, 32, 55, 9, 44, 39, 106, 119, 107, 125, 107, 116, 70, 97, 102, 123, 47, 71, 123, 118, 110, 114, 101, 55, 126, 100, 55, 118, 116, 116, 114, 100, 100, 114, 115, 55, 120, 121, 55, 99, 127, 114, 55, 96, 101, 120, 121, 112, 55, 99, 127, 101, 114, 118, 115, 57, 29, 84, 98, 101, 101, 114, 121, 99, 55, 99, 127, 101, 114, 118, 115, 45, 55, 48, 50, 100, 48, 29, 82, 111, 103, 114, 116, 99, 114, 115, 55, 99, 127, 101, 114, 118, 115, 45, 55, 48, 50, 100, 48, 29, 68, 114, 114, 55, 127, 99, 99, 103, 100, 45, 56, 56, 114, 111, 120, 103, 123, 118, 110, 114, 101, 57, 115, 114, 97, 56, 126, 100, 100, 98, 114, 100, 56, 103, 123, 118, 110, 114, 101, 58, 118, 116, 116, 114, 100, 100, 114, 115, 58, 120, 121, 58, 96, 101, 120, 121, 112, 58, 99, 127, 101, 114, 118, 115, 20, 35, 42, 35, 39, 53, 35, 102, 122, 86, 43, 80, 99, 98, 92, 96, 109, 117, 105, 126, 95, 120, 109, 120, 105, 79, 100, 109, 98, 107, 105, 104, 93, 75, 75, 69, 122, 65, 14, 71, 73, 64, 65, 92, 75, 74, 14, 76, 75, 77, 79, 91, 93, 75, 14, 79, 64, 14, 79, 74, 14, 71, 93, 14, 94, 66, 79, 87, 71, 64, 73};
    }

    static {
        A06();
    }

    public C2495AC(InterfaceC4973oo[] interfaceC4973ooArr, AbstractC2787Ew abstractC2787Ew, InterfaceC231974 interfaceC231974, InterfaceC2797F6 interfaceC2797F6, InterfaceC213445 interfaceC213445) {
        this(interfaceC4973ooArr, abstractC2787Ew, interfaceC231974, interfaceC2797F6, interfaceC213445, false, false, false, false, false, false, 0L, false, 0, false, false, false, false, false, false, false, null);
    }

    public C2495AC(@MetaExoPlayerCustomization("qe_android_video_exoplayer2.update_loading_priority_exo2 is consistently false. We do not need to port this in the upgrade") InterfaceC4973oo[] interfaceC4973ooArr, @MetaExoPlayerCustomization("Introduced in D13513334 and also used in loop playing for IG: D38285740") AbstractC2787Ew abstractC2787Ew, @MetaExoPlayerCustomization("Currently used to load chunks while seeking on pause D13827150") InterfaceC231974 interfaceC231974, @MetaExoPlayerCustomization("D40987428 Brought in for clippingmediasource") InterfaceC2797F6 interfaceC2797F6, @MetaExoPlayerCustomization("D45597293 for Oculus - allowing the start renderer offset to not be 0; Eventually changed in Exo: https://github.com/google/ExoPlayer/commit/9f352434c72da527d1fa7963447c3cf680db884f") InterfaceC213445 interfaceC213445, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j2, boolean z7, int i2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, InterfaceC21053b interfaceC21053b) {
        InterfaceC21053b interfaceC21053b2 = interfaceC21053b;
        Log.i(A04(2, 13, 30), A04(33, 5, 30) + Integer.toHexString(System.identityHashCode(this)) + A04(0, 2, 87) + A04(15, 18, 84) + A04(194, 3, 26) + AbstractC22035C.A04 + A04(193, 1, 54));
        this.A0c = new C213748();
        try {
            this.A0M = z13;
            AbstractC21273y.A08(interfaceC4973ooArr.length > 0);
            this.A0l = (InterfaceC4973oo[]) AbstractC21273y.A01(interfaceC4973ooArr);
            this.A0g = (AbstractC2787Ew) AbstractC21273y.A01(abstractC2787Ew);
            this.A0Q = false;
            this.A00 = 1.0f;
            this.A05 = 0;
            this.A0A = C5048q2.A0Z;
            this.A0B = C5048q2.A0Z;
            this.A0C = C5048q2.A0Z;
            this.A0S = false;
            this.A0V = 0L;
            this.A09 = C5070qQ.A07;
            this.A0W = 0L;
            this.A0j = new CopyOnWriteArraySet<>();
            this.A0U = 0L;
            InterfaceC4968oj analyticsCollector = InterfaceC4968oj.A00;
            this.A0f = analyticsCollector;
            this.A0K = C23717u.A03;
            this.A06 = 1;
            this.A0d = new C4975oq();
            this.A0h = new C2788Ex(new C23697s[interfaceC4973ooArr.length], new InterfaceC4876nE[interfaceC4973ooArr.length], C5019pY.A03, null);
            this.A0a = new C5031pl();
            this.A0T = new C20933P().A03(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).A01(29, abstractC2787Ew.A0Y()).A04();
            this.A0E = new C20933P().A02(this.A0T).A00(4).A00(10).A04();
            this.A0G = C5012pR.A03;
            this.A0D = C5043px.A06;
            this.A0Y = Looper.myLooper();
            final Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
            this.A0X = new Handler(looperMyLooper) { // from class: com.facebook.ads.redexgen.X.6c
                @Override // android.os.Handler
                public final void handleMessage(Message msg) throws Throwable {
                    if (AbstractC3863WU.A02(this)) {
                        return;
                    }
                    try {
                        this.A00.A0N(msg);
                    } catch (Throwable th) {
                        AbstractC3863WU.A00(th, this);
                    }
                }
            };
            this.A0b = interfaceC213445;
            this.A0Z = interfaceC21053b2 == null ? this : interfaceC21053b2;
            this.A0J = new C23507Z(Timeline.A02, 0L, C4894nW.A06, this.A0h);
            this.A0e = new C2494AB(interfaceC4973ooArr, abstractC2787Ew, this.A0h, interfaceC231974, interfaceC2797F6, this.A0Q, this.A05, this.A0S, this.A0X, interfaceC213445, z, z2, z3, z4, z5, z6, j2, z7, i2, z8, z9, z10, z11, z12, z14, C24018O.A03);
            this.A0F = C5017pW.A06;
            this.A0H = C21904z.A03;
            this.A0i = new CopyOnWriteArraySet<>();
        } finally {
            this.A0c.A04();
        }
    }

    private long A00(long j2) {
        long jA01 = AbstractC20442Y.A01(j2);
        if (!this.A0J.A05.A00()) {
            this.A0J.A03.A0J(this.A0J.A05.A04, this.A0a);
            long positionMs = this.A0a.A0B();
            return jA01 + positionMs;
        }
        return jA01;
    }

    private long A01(Timeline timeline, C4912no c4912no, long j2) {
        timeline.A0J(c4912no.A04, this.A0a);
        return j2 + this.A0a.A0C();
    }

    private C23507Z A02(boolean z, boolean z2, int i2) {
        C2788Ex c2788Ex;
        if (z) {
            this.A02 = 0;
            this.A01 = 0;
            this.A08 = 0L;
            this.A07 = 0L;
        } else {
            this.A02 = A7h();
            this.A01 = A7c();
            this.A08 = A7e();
            this.A07 = A0J();
        }
        Timeline timeline = z2 ? Timeline.A02 : this.A0J.A03;
        C4912no c4912no = this.A0J.A05;
        long j2 = this.A0J.A02;
        long j3 = this.A0J.A01;
        C4894nW c4894nW = z2 ? C4894nW.A06 : this.A0J.A06;
        if (z2) {
            c2788Ex = this.A0h;
        } else {
            C23507Z c23507z = this.A0J;
            String[] strArr = A0n;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0n;
            strArr2[3] = "Omd19LzmWdt3";
            strArr2[5] = "slTdP4Xe";
            c2788Ex = c23507z.A07;
        }
        return new C23507Z(timeline, c4912no, j2, j3, i2, false, c4894nW, c2788Ex, this.A0J.A05, this.A0J.A02, 0L, this.A0J.A02);
    }

    private C23547d A03(InterfaceC23537c interfaceC23537c) {
        int iA7h = A7h();
        C2494AB c2494ab = this.A0e;
        Timeline timeline = this.A0J.A03;
        if (iA7h == -1) {
            iA7h = 0;
        }
        return new C23547d(c2494ab, interfaceC23537c, timeline, iA7h, this.A0b, this.A0e.A1B());
    }

    private void A05() {
        if (!this.A0M) {
            return;
        }
        this.A0c.A01();
        if (Thread.currentThread() != A0K().getThread()) {
            String strA0n = AbstractC22035C.A0n(A04(38, 147, 6), Thread.currentThread().getName(), A0K().getThread().getName());
            if (!this.A0k) {
                Log.w(A04(2, 13, 30), strA0n, this.A0N ? null : new IllegalStateException());
                if (A0n[6].length() == 12) {
                    throw new RuntimeException();
                }
                A0n[6] = "OHv4LuNWT";
                this.A0N = true;
                return;
            }
            throw new IllegalStateException(strA0n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    private void A07(C23507Z c23507z, int i2, boolean z, int i3) {
        int i4;
        C23507Z c23507zA06 = c23507z;
        this.A03 -= i2;
        if (this.A03 == 0) {
            if (c23507zA06.A02 == -9223372036854775807L) {
                c23507zA06 = c23507zA06.A06(c23507zA06.A05, 0L, c23507zA06.A01, c23507zA06.A0D);
            }
            C23507Z playbackInfo = this.A0J;
            if (playbackInfo.A03.A0N()) {
                boolean z2 = this.A0O;
                String[] strArr = A0n;
                if (strArr[3].length() == strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0n[6] = "E7I7Mej0S3DTzUCwep";
                if (z2) {
                    if (c23507zA06.A03.A0N()) {
                        this.A01 = 0;
                        this.A02 = 0;
                        this.A08 = 0L;
                        this.A07 = 0L;
                    }
                }
            } else if (c23507zA06.A03.A0N()) {
                this.A01 = 0;
                this.A02 = 0;
                this.A08 = 0L;
                this.A07 = 0L;
            }
            if (this.A0O) {
                i4 = 0;
            } else {
                i4 = 2;
            }
            boolean z3 = this.A0P;
            this.A0O = false;
            this.A0P = false;
            A08(c23507zA06, z, i3, i4, z3);
        }
    }

    private void A08(C23507Z c23507z, boolean z, int i2, int i3, boolean z2) {
        Iterator<InterfaceC20983U> it;
        boolean isLoadingChanged = this.A0J.A03 != c23507z.A03;
        int i4 = this.A0J.A00;
        String[] strArr = A0n;
        if (strArr[2].length() == strArr[4].length()) {
            String[] strArr2 = A0n;
            strArr2[7] = "RJsywmu9iXbSHAOSoooup4iB6ctJ9GEd";
            strArr2[0] = "je0JKUsqzBp1pj8TVGEWBsFZVePcLGnq";
            boolean z3 = i4 != c23507z.A00;
            boolean playbackStateChanged = this.A0J.A0A;
            boolean timelineChanged = c23507z.A0A;
            boolean z4 = playbackStateChanged != timelineChanged;
            boolean z5 = this.A0J.A07 != c23507z.A07;
            this.A0J = c23507z;
            if (isLoadingChanged || i3 == 0) {
                Iterator<InterfaceC20983U> it2 = this.A0j.iterator();
                while (timelineChanged) {
                    InterfaceC20983U next = it2.next();
                    Timeline timeline = this.A0J.A03;
                    String[] strArr3 = A0n;
                    if (strArr3[7].charAt(29) != strArr3[0].charAt(29)) {
                        throw new RuntimeException();
                    }
                    A0n[6] = "RAQE2IWZazAhX";
                    next.AGA(timeline, i3);
                }
            }
            if (z) {
                Iterator<InterfaceC20983U> it3 = this.A0j.iterator();
                while (timelineChanged) {
                    it3.next();
                }
            }
            if (z5) {
                this.A0g.A0c(this.A0J.A07.A02);
                Iterator<InterfaceC20983U> it4 = this.A0j.iterator();
                while (timelineChanged) {
                    it4.next().AGE(this.A0J.A07.A01);
                }
            }
            if (z4) {
                Iterator<InterfaceC20983U> it5 = this.A0j.iterator();
                while (true) {
                    boolean zHasNext = it5.hasNext();
                    String[] strArr4 = A0n;
                    if (strArr4[2].length() == strArr4[4].length()) {
                        A0n[6] = "XRa";
                        if (!zHasNext) {
                            break;
                        } else {
                            it5.next();
                        }
                    }
                }
            }
            if (z3) {
                CopyOnWriteArraySet<InterfaceC20983U> copyOnWriteArraySet = this.A0j;
                if (A0n[1].charAt(28) != 'y') {
                    String[] strArr5 = A0n;
                    strArr5[3] = "HK22odgNy2pi";
                    strArr5[5] = "HFqBrVui";
                    it = copyOnWriteArraySet.iterator();
                } else {
                    it = copyOnWriteArraySet.iterator();
                }
                while (playbackStateChanged) {
                    InterfaceC20983U next2 = it.next();
                    boolean trackSelectorResultChanged = this.A0R;
                    next2.AFM(trackSelectorResultChanged, this.A0J.A00);
                }
            }
            if (z2) {
                Iterator<InterfaceC20983U> it6 = this.A0j.iterator();
                while (timelineChanged) {
                    it6.next().AFt();
                }
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    @MetaExoPlayerCustomization("D31846300; Custom MediaSessionEventListener")
    private final void A09(boolean z, boolean z2) {
        if (this.A0Q != z) {
            this.A0Q = z;
            this.A04++;
            this.A0e.A1G(z);
            C23507Z c23507z = this.A0J;
            if (!z) {
                this.A0R = z;
                for (InterfaceC20983U interfaceC20983U : this.A0j) {
                    if (0 != 0) {
                        throw new NullPointerException(A04(197, 20, 29));
                    }
                    interfaceC20983U.AFM(z, c23507z.A00);
                }
            }
        }
    }

    private boolean A0A() {
        return this.A0J.A03.A0N() || this.A03 > 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC5069qP
    public final void A0H(int i2, long j2) {
        long jA00;
        Timeline timeline = this.A0J.A03;
        if (i2 >= 0) {
            boolean zA0N = timeline.A0N();
            if (A0n[6].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0n;
            strArr[3] = "u5DgO7GwYyET";
            strArr[5] = "hfn3fs8A";
            if (zA0N || i2 < timeline.A07()) {
                this.A0P = true;
                this.A03++;
                if (AAd()) {
                    Log.w(A04(2, 13, 30), A04(217, 39, 63));
                    this.A0X.obtainMessage(0, 1, -1, this.A0J).sendToTarget();
                    return;
                }
                this.A02 = i2;
                if (timeline.A0N()) {
                    this.A08 = j2 == -9223372036854775807L ? 0L : j2;
                    this.A01 = 0;
                } else {
                    if (j2 == -9223372036854775807L) {
                        jA00 = timeline.A0K(i2, super.A00).A05();
                    } else {
                        jA00 = AbstractC20442Y.A00(j2);
                    }
                    Pair<Object, Long> pairA0D = timeline.A0D(super.A00, this.A0a, i2, jA00);
                    this.A08 = AbstractC20442Y.A01(jA00);
                    this.A01 = timeline.A0A(pairA0D.first);
                }
                this.A0e.A1D(timeline, i2, AbstractC20442Y.A00(j2));
                Iterator<InterfaceC20983U> it = this.A0j.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return;
            }
        }
        throw new C20602q(timeline, i2, j2);
    }

    public final long A0I() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0J.A04.A03 != this.A0J.A05.A03) {
            return this.A0J.A03.A0K(A7h(), super.A00).A06();
        }
        long jA0D = this.A0J.A0B;
        if (this.A0J.A04.A00()) {
            C5031pl c5031plA0J = this.A0J.A03.A0J(this.A0J.A04.A04, this.A0a);
            jA0D = c5031plA0J.A0D(this.A0J.A04.A00);
            if (jA0D == Long.MIN_VALUE) {
                jA0D = c5031plA0J.A01;
            }
        }
        long contentBufferedPositionUs = A01(this.A0J.A03, this.A0J.A04, jA0D);
        return AbstractC22035C.A0P(contentBufferedPositionUs);
    }

    public final long A0J() {
        if (A0A()) {
            long j2 = this.A07;
            String[] strArr = A0n;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            A0n[1] = "SWSNQbytnn5JxmoGO3rxXNMtbmar9O4q";
            return j2;
        }
        C23507Z c23507z = this.A0J;
        if (A0n[1].charAt(28) == 'y') {
            throw new RuntimeException();
        }
        A0n[1] = "VYQpOR71WpATH6H66c6IUhHHWo1qZbHI";
        return AbstractC20442Y.A01(c23507z.A0C);
    }

    public final Looper A0K() {
        return this.A0Y;
    }

    public final C23547d A0L(InterfaceC23537c interfaceC23537c) {
        A05();
        return A03(interfaceC23537c);
    }

    public final void A0M() {
        StringBuilder sbAppend = new StringBuilder().append(A04(ModuleDescriptor.MODULE_VERSION, 8, 87)).append(Integer.toHexString(System.identityHashCode(this))).append(A04(0, 2, 87)).append(A04(15, 18, 84));
        String strA04 = A04(194, 3, 26);
        Log.i(A04(2, 13, 30), sbAppend.append(strA04).append(AbstractC22035C.A04).append(strA04).append(C207535.A00()).append(A04(193, 1, 54)).toString());
        this.A0L = null;
        this.A0e.A1C();
        this.A0X.removeCallbacksAndMessages(null);
        this.A0J = A02(false, false, 1);
        this.A0G = C5012pR.A03;
    }

    public final void A0N(Message message) {
        switch (message.what) {
            case 0:
                A07((C23507Z) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                C5043px c5043px = (C5043px) message.obj;
                C5043px c5043px2 = this.A0D;
                String[] strArr = A0n;
                if (strArr[2].length() == strArr[4].length()) {
                    String[] strArr2 = A0n;
                    strArr2[2] = "M5Fz4bo4aU";
                    strArr2[4] = "jAP48pK2xI";
                    if (!c5043px2.equals(c5043px)) {
                        this.A0D = c5043px;
                        Iterator<InterfaceC20983U> it = this.A0j.iterator();
                        while (it.hasNext()) {
                            it.next().AFI(c5043px);
                        }
                        return;
                    }
                    return;
                }
                break;
            case 2:
                C2496AD c2496ad = (C2496AD) message.obj;
                this.A0I = c2496ad;
                CopyOnWriteArraySet<InterfaceC20983U> copyOnWriteArraySet = this.A0j;
                String[] strArr3 = A0n;
                if (strArr3[7].charAt(29) != strArr3[0].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0n;
                strArr4[3] = "qauhWK691fBn";
                strArr4[5] = "FsOQ1ovS";
                Iterator<InterfaceC20983U> it2 = copyOnWriteArraySet.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    String[] strArr5 = A0n;
                    if (strArr5[3].length() != strArr5[5].length()) {
                        A0n[6] = "DbAY1NxOkLRBmNTAZlCZyxXxDbYRxJk";
                        if (!zHasNext) {
                            return;
                        }
                    } else if (!zHasNext) {
                        return;
                    }
                    it2.next().AFK(c2496ad);
                }
                break;
            case 3:
                this.A04--;
                if (this.A04 == 0) {
                    this.A0R = ((Boolean) message.obj).booleanValue();
                    CopyOnWriteArraySet<InterfaceC20983U> copyOnWriteArraySet2 = this.A0j;
                    if (A0n[1].charAt(28) == 'y') {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0n;
                    strArr6[3] = "yizDUJeCRugc";
                    strArr6[5] = "UffiDbl9";
                    for (InterfaceC20983U interfaceC20983U : copyOnWriteArraySet2) {
                        if (this.A0R) {
                            interfaceC20983U.AFM(this.A0R, this.A0J.A00);
                        }
                    }
                    return;
                }
                return;
            case 4:
                Iterator<InterfaceC20983U> it3 = this.A0j.iterator();
                while (it3.hasNext()) {
                    it3.next();
                }
                return;
            case 5:
                CopyOnWriteArraySet<InterfaceC20983U> copyOnWriteArraySet3 = this.A0j;
                String[] strArr7 = A0n;
                if (strArr7[7].charAt(29) == strArr7[0].charAt(29)) {
                    String[] strArr8 = A0n;
                    strArr8[3] = "QQxFLYRHq8rv";
                    strArr8[5] = "zDzShVZM";
                    Iterator<InterfaceC20983U> it4 = copyOnWriteArraySet3.iterator();
                    while (it4.hasNext()) {
                        it4.next();
                    }
                    return;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        throw new RuntimeException();
    }

    public final void A0O(InterfaceC20983U interfaceC20983U) {
        this.A0j.add(interfaceC20983U);
    }

    public final void A0P(InterfaceC2664Cx interfaceC2664Cx, boolean z, boolean z2) {
        this.A0I = null;
        this.A0L = interfaceC2664Cx;
        C23507Z c23507zA02 = A02(z, z2, 2);
        this.A0O = true;
        this.A03++;
        this.A0e.A1F(interfaceC2664Cx, z, z2);
        A08(c23507zA02, false, 4, 1, false);
    }

    public final void A0Q(boolean z) {
        A09(z, false);
    }

    public final boolean A0R() {
        return this.A0Q;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final long A77() {
        if (AAd()) {
            if (this.A0J.A04.equals(this.A0J.A05)) {
                return AbstractC20442Y.A01(this.A0J.A0B);
            }
            return A7s();
        }
        return A0I();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final long A7T() {
        if (AAd()) {
            this.A0J.A03.A0J(this.A0J.A05.A04, this.A0a);
            return this.A0a.A0B() + AbstractC20442Y.A01(this.A0J.A01);
        }
        return A7e();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final int A7Y() {
        if (AAd()) {
            return this.A0J.A05.A00;
        }
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final int A7Z() {
        if (AAd()) {
            return this.A0J.A05.A01;
        }
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    @MetaExoPlayerCustomization("getCurrentWindowIndex needs to be upgraded to getCurrentWindowIndexInternal")
    public final int A7b() {
        A05();
        int iA7h = A7h();
        if (iA7h == -1) {
            return 0;
        }
        return iA7h;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final int A7c() {
        if (A0A()) {
            return this.A01;
        }
        Timeline timeline = this.A0J.A03;
        C4912no c4912no = this.A0J.A05;
        String[] strArr = A0n;
        if (strArr[3].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A0n[1] = "6o1scJ9TwXJl7WSt7vZ9WMBcl2tfzHGN";
        return timeline.A0A(c4912no.A04);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final long A7e() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0J.A05.A00()) {
            return AbstractC20442Y.A01(this.A0J.A0C);
        }
        return A00(this.A0J.A0C);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final Timeline A7g() {
        return this.A0J.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final int A7h() {
        if (A0A()) {
            int i2 = this.A02;
            String[] strArr = A0n;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0n;
            strArr2[3] = "0i1iYNlUg7j9";
            strArr2[5] = "Koyujpdg";
            return i2;
        }
        return this.A0J.A03.A0J(this.A0J.A05.A04, this.A0a).A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final long A7s() {
        Timeline timeline = this.A0J.A03;
        if (timeline.A0N()) {
            return -9223372036854775807L;
        }
        if (AAd()) {
            C4912no c4912no = this.A0J.A05;
            timeline.A0J(c4912no.A04, this.A0a);
            return AbstractC20442Y.A01(this.A0a.A0E(c4912no.A00, c4912no.A01));
        }
        return timeline.A0K(A7h(), super.A00).A06();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final long A9J() {
        return Math.max(0L, AbstractC20442Y.A01(this.A0J.A0D));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final boolean AAd() {
        return !A0A() && this.A0J.A05.A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final void AKG(boolean z) {
        if (z) {
            this.A0I = null;
            this.A0L = null;
        }
        C23507Z c23507zA02 = A02(z, z, 1);
        this.A03++;
        this.A0e.A1H(z);
        A08(c23507zA02, false, 4, 1, false);
        this.A0G = new C5012pR(MetaExoPlayerCustomizedCollections.A01(), c23507zA02.A0C);
    }
}
