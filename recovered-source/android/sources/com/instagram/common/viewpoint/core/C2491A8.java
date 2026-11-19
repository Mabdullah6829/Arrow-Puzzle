package com.instagram.common.viewpoint.core;

import android.os.Looper;
import android.util.SparseArray;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.A8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2491A8 implements InterfaceC4968oj {
    public static String[] A09 = {"4o0rkz4sfHeK33SO99B05QXsoRhyQzGZ", "K0gAeF3eD9ckm8sSKGrLnlGwgDvg6cGZ", "7dDhReETm", "uWDgAo3QhNS2SDAVWxvGGUxEzkeXCi8E", "iTLUe92lN", "exEbYNMUNVYj7aZkfWzuIWQ7Xih8easj", "xOp2qsvLijFTZdD02NXuZsLwHYitQrqs", "G4m8GVqXoTOlF678hGe6mWsbCNLG0"};
    public InterfaceC21053b A00;
    public InterfaceC21624X A01;
    public C21684d<InterfaceC238588> A02;
    public boolean A03;
    public final InterfaceC213445 A07;
    public final C5031pl A05 = new C5031pl();
    public final C5029pj A06 = new C5029pj();
    public final C23878A A08 = new C23878A(this.A05);
    public final SparseArray<C238386> A04 = new SparseArray<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.facebook.ads.redexgen.X.86] */
    @RequiresNonNull({"player"})
    private final C238386 A03(final Timeline timeline, final int i2, C4912no c4912no) {
        final C4912no c4912no2 = c4912no;
        if (timeline.A0N()) {
            c4912no2 = null;
        }
        final long jA6J = this.A07.A6J();
        boolean z = timeline.equals(this.A00.A7g()) && i2 == this.A00.A7b();
        final long jA04 = 0;
        if (c4912no2 != null && c4912no2.A00()) {
            if (z && this.A00.A7Y() == c4912no2.A00 && this.A00.A7Z() == c4912no2.A01) {
                jA04 = this.A00.A7e();
            }
        } else if (z) {
            jA04 = this.A00.A7T();
            String[] strArr = A09;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A09[6] = "ZwCTxmE9kC93SnFyqUzyIs0NB6ZXsqqf";
        } else {
            jA04 = timeline.A0N() ? 0L : timeline.A0K(i2, this.A06).A04();
            String[] strArr2 = A09;
            if (strArr2[3].length() == strArr2[1].length()) {
                A09[6] = "IrjjFtfbEX9d6APA3g1gQ2wngpNkMZh7";
            }
        }
        final C4912no c4912noA06 = this.A08.A06();
        final Timeline timelineA7g = this.A00.A7g();
        final int iA7b = this.A00.A7b();
        final long jA7e = this.A00.A7e();
        final long jA9J = this.A00.A9J();
        return new Object(jA6J, timeline, i2, c4912no2, jA04, timelineA7g, iA7b, c4912noA06, jA7e, jA9J) { // from class: com.facebook.ads.redexgen.X.86
            public final int A00;
            public final int A01;
            public final long A02;
            public final long A03;
            public final long A04;
            public final long A05;
            public final Timeline A06;
            public final Timeline A07;
            public final C4912no A08;
            public final C4912no A09;

            {
                this.A04 = jA6J;
                this.A07 = timeline;
                this.A01 = i2;
                this.A09 = c4912no2;
                this.A03 = jA04;
                this.A06 = timelineA7g;
                this.A00 = iA7b;
                this.A08 = c4912noA06;
                this.A02 = jA7e;
                this.A05 = jA9J;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C238386 c238386 = (C238386) obj;
                if (this.A04 == c238386.A04 && this.A01 == c238386.A01 && this.A03 == c238386.A03 && this.A00 == c238386.A00 && this.A02 == c238386.A02 && this.A05 == c238386.A05 && AbstractC2617CB.A01(this.A07, c238386.A07) && AbstractC2617CB.A01(this.A09, c238386.A09) && AbstractC2617CB.A01(this.A06, c238386.A06) && AbstractC2617CB.A01(this.A08, c238386.A08)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return AbstractC2617CB.A00(Long.valueOf(this.A04), this.A07, Integer.valueOf(this.A01), this.A09, Long.valueOf(this.A03), this.A06, Integer.valueOf(this.A00), this.A08, Long.valueOf(this.A02), Long.valueOf(this.A05));
            }
        };
    }

    public C2491A8(InterfaceC213445 interfaceC213445) {
        this.A07 = (InterfaceC213445) AbstractC21273y.A01(interfaceC213445);
        this.A02 = new C21684d<>(AbstractC22035C.A0d(), interfaceC213445, new InterfaceC21664b() { // from class: com.facebook.ads.redexgen.X.og
        });
    }

    private final C238386 A00() {
        return A04(this.A08.A06());
    }

    private C238386 A01(int i2, C4912no c4912no) {
        AbstractC21273y.A01(this.A00);
        boolean z = true;
        if (c4912no != null) {
            if (this.A08.A05(c4912no) == null) {
                z = false;
            }
            if (z) {
                return A04(c4912no);
            }
            return A03(Timeline.A02, i2, c4912no);
        }
        Timeline timelineA7g = this.A00.A7g();
        if (i2 >= timelineA7g.A07()) {
            z = false;
        }
        if (!z) {
            timelineA7g = Timeline.A02;
        }
        return A03(timelineA7g, i2, null);
    }

    private C238386 A02(C5045pz c5045pz) {
        if (c5045pz instanceof C2496AD) {
            C2496AD c2496ad = (C2496AD) c5045pz;
            if (c2496ad.A05 != null) {
                return A04(new C4912no(c2496ad.A05));
            }
        }
        return A00();
    }

    private C238386 A04(C4912no c4912no) {
        Timeline timelineA05;
        AbstractC21273y.A01(this.A00);
        if (c4912no == null) {
            timelineA05 = null;
        } else {
            timelineA05 = this.A08.A05(c4912no);
        }
        if (c4912no == null || timelineA05 == null) {
            int windowIndex = this.A00.A7b();
            Timeline knownTimeline = this.A00.A7g();
            if (!(windowIndex < knownTimeline.A07())) {
                knownTimeline = Timeline.A02;
            }
            return A03(knownTimeline, windowIndex, null);
        }
        return A03(timelineA05, timelineA05.A0J(c4912no.A04, this.A05).A00, c4912no);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4a != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<com.facebook.ads.androidx.media3.exoplayer.analytics.AnalyticsListener> */
    private final void A05(C238386 c238386, int i2, InterfaceC21654a<InterfaceC238588> interfaceC21654a) {
        this.A04.put(i2, c238386);
        this.A02.A0A(i2, interfaceC21654a);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4968oj
    public final void ACe() {
        if (!this.A03) {
            final C238386 c238386A00 = A00();
            this.A03 = true;
            A05(c238386A00, -1, new InterfaceC21654a() { // from class: com.facebook.ads.redexgen.X.oe
            });
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC20983U
    public final void ADZ(final C5012pR c5012pR) {
        final C238386 c238386A00 = A00();
        A05(c238386A00, 27, new InterfaceC21654a() { // from class: com.facebook.ads.redexgen.X.oc
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC20983U
    public final void ADa(final List<C5014pT> list) {
        final C238386 c238386A00 = A00();
        A05(c238386A00, 27, new InterfaceC21654a() { // from class: com.facebook.ads.redexgen.X.oR
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2676D9
    public final void ADk(int i2, C4912no c4912no, final C2659Cs c2659Cs) {
        final C238386 c238386A01 = A01(i2, c4912no);
        A05(c238386A01, PointerIconCompat.TYPE_WAIT, new InterfaceC21654a() { // from class: com.facebook.ads.redexgen.X.oh
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2676D9
    public final void AEb(int i2, C4912no c4912no, final C2657Cq c2657Cq, final C2659Cs c2659Cs) {
        final C238386 c238386A01 = A01(i2, c4912no);
        A05(c238386A01, 1002, new InterfaceC21654a() { // from class: com.facebook.ads.redexgen.X.od
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2676D9
    public final void AEd(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) int i2, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C4912no c4912no, final C2657Cq c2657Cq, final C2659Cs c2659Cs, Object obj, Object obj2) {
        final C238386 c238386A01 = A01(i2, c4912no);
        A05(c238386A01, 1001, new InterfaceC21654a() { // from class: com.facebook.ads.redexgen.X.oT
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2676D9
    public final void AEg(int i2, C4912no c4912no, final C2657Cq c2657Cq, final C2659Cs c2659Cs, final IOException iOException, final boolean z) {
        final C238386 c238386A01 = A01(i2, c4912no);
        A05(c238386A01, PointerIconCompat.TYPE_HELP, new InterfaceC21654a() { // from class: com.facebook.ads.redexgen.X.oi
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC20983U
    public final void AFI(final C5043px c5043px) {
        final C238386 c238386A00 = A00();
        A05(c238386A00, 12, new InterfaceC21654a() { // from class: com.facebook.ads.redexgen.X.ob
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC20983U
    public final void AFK(final C5045pz c5045pz) {
        final C238386 c238386A02 = A02(c5045pz);
        A05(c238386A02, 10, new InterfaceC21654a() { // from class: com.facebook.ads.redexgen.X.of
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC20983U
    public final void AFM(final boolean z, final int i2) {
        final C238386 c238386A00 = A00();
        A05(c238386A00, -1, new InterfaceC21654a() { // from class: com.facebook.ads.redexgen.X.oa
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC20983U
    public final void AFt() {
        final C238386 c238386A00 = A00();
        A05(c238386A00, -1, new InterfaceC21654a() { // from class: com.facebook.ads.redexgen.X.oS
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC20983U
    public final void AGA(Timeline timeline, final int i2) {
        this.A08.A07((InterfaceC21053b) AbstractC21273y.A01(this.A00));
        final C238386 c238386A00 = A00();
        A05(c238386A00, 0, new InterfaceC21654a() { // from class: com.facebook.ads.redexgen.X.oY
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC20983U
    public final void AGE(final C5019pY c5019pY) {
        final C238386 c238386A00 = A00();
        A05(c238386A00, 2, new InterfaceC21654a() { // from class: com.facebook.ads.redexgen.X.oW
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4968oj
    public final void AJf(final InterfaceC21053b interfaceC21053b, Looper looper) {
        AbstractC21273y.A08(this.A00 == null || this.A08.A03.isEmpty());
        this.A00 = (InterfaceC21053b) AbstractC21273y.A01(interfaceC21053b);
        this.A01 = this.A07.A5P(looper, null);
        this.A02 = this.A02.A07(looper, new InterfaceC21664b() { // from class: com.facebook.ads.redexgen.X.oZ
        });
    }
}
