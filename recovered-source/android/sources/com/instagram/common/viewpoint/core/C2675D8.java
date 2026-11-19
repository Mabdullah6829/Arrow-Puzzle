package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.D8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2675D8 {
    public final int A00;
    public final C4912no A01;
    public final long A02;
    public final CopyOnWriteArrayList<C2674D7> A03;

    public C2675D8() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public C2675D8(CopyOnWriteArrayList<C2674D7> copyOnWriteArrayList, int i2, C4912no c4912no, long j2) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i2;
        this.A01 = c4912no;
        this.A02 = j2;
    }

    private long A00(long j2) {
        long jA0P = AbstractC22035C.A0P(j2);
        if (jA0P == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + jA0P;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    private final void A01(final C2657Cq c2657Cq, final C2659Cs c2659Cs, final int i2) {
        for (C2674D7 c2674d7 : this.A03) {
            final InterfaceC2676D9 interfaceC2676D9 = c2674d7.A01;
            AbstractC22035C.A1B(c2674d7.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D4
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final C2675D8 A02(int i2, C4912no c4912no, long j2) {
        return new C2675D8(this.A03, i2, c4912no, j2);
    }

    public final void A03(int i2, C5064qI c5064qI, int i3, Object obj, long j2) {
        A0C(new C2659Cs(1, i2, c5064qI, i3, obj, A00(j2), -9223372036854775807L));
    }

    public final void A04(Handler handler, InterfaceC2676D9 interfaceC2676D9) {
        AbstractC21273y.A01(handler);
        AbstractC21273y.A01(interfaceC2676D9);
        this.A03.add(new C2674D7(handler, interfaceC2676D9));
    }

    public final void A05(C2657Cq c2657Cq, int i2, int i3, C5064qI c5064qI, int i4, Object obj, long j2, long j3) {
        A09(c2657Cq, new C2659Cs(i2, i3, c5064qI, i4, obj, A00(j2), A00(j3)));
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    public final void A06(C2657Cq c2657Cq, int i2, int i3, C5064qI c5064qI, int i4, Object obj, long j2, long j3, int i5) {
        A01(c2657Cq, new C2659Cs(i2, i3, c5064qI, i4, obj, A00(j2), A00(j3)), i5);
    }

    public final void A07(C2657Cq c2657Cq, int i2, int i3, C5064qI c5064qI, int i4, Object obj, long j2, long j3, IOException iOException, boolean z) {
        A0A(c2657Cq, new C2659Cs(i2, i3, c5064qI, i4, obj, A00(j2), A00(j3)), iOException, z);
    }

    public final void A08(@MetaExoPlayerCustomization C2657Cq c2657Cq, @MetaExoPlayerCustomization int i2, int i3, C5064qI c5064qI, int i4, Object obj, long j2, long j3, Object obj2, Object obj3) {
        A0B(c2657Cq, new C2659Cs(i2, i3, c5064qI, i4, obj, A00(j2), A00(j3)), obj2, obj3);
    }

    public final void A09(final C2657Cq c2657Cq, final C2659Cs c2659Cs) {
        for (C2674D7 c2674d7 : this.A03) {
            final InterfaceC2676D9 listener = c2674d7.A01;
            AbstractC22035C.A1B(c2674d7.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D5
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0E(listener, c2657Cq, c2659Cs);
                }
            });
        }
    }

    public final void A0A(final C2657Cq c2657Cq, final C2659Cs c2659Cs, final IOException iOException, final boolean z) {
        for (C2674D7 c2674d7 : this.A03) {
            final InterfaceC2676D9 interfaceC2676D9 = c2674d7.A01;
            AbstractC22035C.A1B(c2674d7.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D0
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0F(interfaceC2676D9, c2657Cq, c2659Cs, iOException, z);
                }
            });
        }
    }

    public final void A0B(@MetaExoPlayerCustomization final C2657Cq c2657Cq, @MetaExoPlayerCustomization final C2659Cs c2659Cs, final Object obj, final Object obj2) {
        for (C2674D7 c2674d7 : this.A03) {
            final InterfaceC2676D9 interfaceC2676D9 = c2674d7.A01;
            AbstractC22035C.A1B(c2674d7.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D1
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0G(interfaceC2676D9, c2657Cq, c2659Cs, obj, obj2);
                }
            });
        }
    }

    public final void A0C(final C2659Cs c2659Cs) {
        for (C2674D7 c2674d7 : this.A03) {
            final InterfaceC2676D9 listener = c2674d7.A01;
            AbstractC22035C.A1B(c2674d7.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D2
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0H(listener, c2659Cs);
                }
            });
        }
    }

    public final void A0D(InterfaceC2676D9 interfaceC2676D9) {
        for (C2674D7 listenerAndHandler : this.A03) {
            if (listenerAndHandler.A01 == interfaceC2676D9) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final /* synthetic */ void A0E(InterfaceC2676D9 interfaceC2676D9, C2657Cq c2657Cq, C2659Cs c2659Cs) {
        interfaceC2676D9.AEb(this.A00, this.A01, c2657Cq, c2659Cs);
    }

    public final /* synthetic */ void A0F(InterfaceC2676D9 interfaceC2676D9, C2657Cq c2657Cq, C2659Cs c2659Cs, IOException iOException, boolean z) {
        interfaceC2676D9.AEg(this.A00, this.A01, c2657Cq, c2659Cs, iOException, z);
    }

    public final /* synthetic */ void A0G(InterfaceC2676D9 interfaceC2676D9, C2657Cq c2657Cq, C2659Cs c2659Cs, Object obj, Object obj2) {
        interfaceC2676D9.AEd(this.A00, this.A01, c2657Cq, c2659Cs, obj, obj2);
    }

    public final /* synthetic */ void A0H(InterfaceC2676D9 interfaceC2676D9, C2659Cs c2659Cs) {
        interfaceC2676D9.ADk(this.A00, this.A01, c2659Cs);
    }
}
