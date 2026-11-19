package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.constraintlayout.widget.C1137R;
import androidx.core.location.LocationRequestCompat;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1b */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C19851b extends AbstractC2497AE implements Handler.Callback {
    public static byte[] A0H;
    public static String[] A0I = {"58lW15hp88fFpLaSxErp", "56QScXrV6I", "DwEmmtKo2ODeTiA17rxauXwet98Z4", "A4aLtxZMLOPLaVE6SeDzXnpOLTGefetw", "FhOKuZuvLBWd8lghoK1mwxVLtzQRZ", "h1d8vpIJ83Cnf8DVjx4Ui7av1xQxYsFL", "y1YT0hSXczs7bGZDGpuR", "alxZNjekiwxoo3ZSsAAxphzspQJfVEZr"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public C5064qI A05;
    public InterfaceC4803lq A06;
    public C24058S A07;
    public AbstractC24028P A08;
    public AbstractC24028P A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C23146z A0E;
    public final InterfaceC2754EP A0F;
    public final InterfaceC2757ES A0G;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[2] = "1YRuRVntTKbD5w1SSS8awuyRss3tM";
            strArr2[4] = "HmFGzdsys3t1iPkkAdwtO8Q44Z9aJ";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ C1137R.styleable.ConstraintSet_transitionPathRotate);
            i5++;
        }
    }

    public static void A09() {
        A0H = new byte[]{89, 127, 104, 126, 99, 126, 102, 111, 42, 110, 111, 105, 101, 110, 99, 100, 109, 42, 108, 107, 99, 102, 111, 110, 36, 42, 121, 126, 120, 111, 107, 103, 76, 101, 120, 103, 107, 126, 55, 57, 8, 21, 25, 63, 8, 3, 9, 8, 31, 8, 31};
    }

    static {
        A09();
    }

    public C19851b(InterfaceC2757ES interfaceC2757ES, Looper looper, InterfaceC2754EP interfaceC2754EP) {
        super(3);
        this.A0G = (InterfaceC2757ES) AbstractC21273y.A01(interfaceC2757ES);
        this.A0D = looper == null ? null : AbstractC22035C.A0c(looper, this);
        this.A0F = interfaceC2754EP;
        this.A0E = new C23146z();
        this.A02 = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    private long A00() {
        if (this.A01 == -1) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        AbstractC21273y.A01(this.A09);
        return this.A01 >= this.A09.A84() ? LocationRequestCompat.PASSIVE_INTERVAL : this.A09.A83(this.A01);
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    private long A01(long j2) {
        int iA8a = this.A09.A8a(j2);
        if (iA8a != 0) {
            int nextEventTimeIndex = this.A09.A84();
            if (nextEventTimeIndex != 0) {
                String[] strArr = A0I;
                String str = strArr[6];
                String str2 = strArr[0];
                int length = str.length();
                int nextEventTimeIndex2 = str2.length();
                if (length != nextEventTimeIndex2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[2] = "dWbBH4lKinuUlTA8CpNFonpmnzuPl";
                strArr2[4] = "MDue3s6tkJ65MZJ0TxYFZvpfeIb1w";
                if (iA8a == -1) {
                    AbstractC24028P abstractC24028P = this.A09;
                    if (A0I[1].length() != 10) {
                        int nextEventTimeIndex3 = this.A09.A84();
                        return abstractC24028P.A83(nextEventTimeIndex3 - 1);
                    }
                    A0I[3] = "us0wUp64B7rq5nQeuQUWAOSOIfPFOl8I";
                    int nextEventTimeIndex4 = this.A09.A84();
                    return abstractC24028P.A83(nextEventTimeIndex4 - 1);
                }
                int nextEventTimeIndex5 = iA8a - 1;
                return this.A09.A83(nextEventTimeIndex5);
            }
        }
        return ((AbstractC4984oz) this.A09).A01;
    }

    @SideEffectFree
    private long A02(long j2) {
        boolean z = true;
        AbstractC21273y.A08(j2 != -9223372036854775807L);
        if (this.A04 == -9223372036854775807L) {
            z = false;
        }
        AbstractC21273y.A08(z);
        return j2 - this.A04;
    }

    private void A04() {
        A0B(new C5012pR(MetaExoPlayerCustomizedCollections.A01(), A02(this.A03)));
    }

    private void A05() {
        this.A0C = true;
        this.A06 = this.A0F.A5K((C5064qI) AbstractC21273y.A01(this.A05));
    }

    private void A06() {
        this.A07 = null;
        this.A01 = -1;
        if (this.A09 != null) {
            this.A09.A0B();
            this.A09 = null;
        }
        if (this.A08 != null) {
            this.A08.A0B();
            this.A08 = null;
        }
    }

    private void A07() {
        A06();
        ((InterfaceC4803lq) AbstractC21273y.A01(this.A06)).AHb();
        this.A06 = null;
        this.A00 = 0;
    }

    private void A08() {
        A07();
        A05();
    }

    private void A0A(C5012pR c5012pR) {
        this.A0G.ADa(c5012pR.A01);
        this.A0G.ADZ(c5012pR);
    }

    private void A0B(C5012pR c5012pR) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(0, c5012pR).sendToTarget();
        } else {
            A0A(c5012pR);
        }
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Method to propagate any SubtitleDecoder Error upwards")
    private void A0C(C2756ER c2756er) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(1, c2756er).sendToTarget();
        }
    }

    private void A0D(C4796lj c4796lj) {
        AbstractC21714g.A08(A03(39, 12, 23), A03(0, 39, 112) + this.A05, c4796lj);
        A0C(new C2756ER(this.A05, c4796lj));
        A04();
        A08();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2497AE
    public final void A1Z() {
        this.A05 = null;
        this.A02 = -9223372036854775807L;
        A04();
        this.A04 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        A07();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2497AE
    public final void A1a(long j2, boolean z) {
        this.A03 = j2;
        A04();
        this.A0A = false;
        this.A0B = false;
        this.A02 = -9223372036854775807L;
        if (this.A00 != 0) {
            A08();
        } else {
            A06();
            ((InterfaceC4803lq) AbstractC21273y.A01(this.A06)).flush();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2497AE
    public final void A1c(C5064qI[] c5064qIArr, long j2, long j3) {
        this.A04 = j3;
        this.A05 = c5064qIArr[0];
        if (this.A06 != null) {
            this.A00 = 1;
        } else {
            A05();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final boolean AAP() {
        return this.A0B;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final boolean AAe() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final void AIX(long j2, long j3) throws C225461 {
        this.A03 = j2;
        if (AAN() && this.A02 != -9223372036854775807L && j2 >= this.A02) {
            A06();
            this.A0B = true;
        }
        if (this.A0B) {
            return;
        }
        if (this.A08 == null) {
            ((InterfaceC4803lq) AbstractC21273y.A01(this.A06)).AJh(j2);
            try {
                this.A08 = ((InterfaceC4803lq) AbstractC21273y.A01(this.A06)).A5t();
            } catch (C4796lj e) {
                A0D(e);
                return;
            }
        }
        if (A9A() != 2) {
            return;
        }
        boolean z = false;
        if (this.A09 != null) {
            long jA00 = A00();
            while (jA00 <= j2) {
                this.A01++;
                jA00 = A00();
                z = true;
            }
        }
        if (this.A08 != null) {
            AbstractC24028P abstractC24028P = this.A08;
            boolean textRendererNeedsUpdate = abstractC24028P.A05();
            if (textRendererNeedsUpdate) {
                if (!z && A00() == LocationRequestCompat.PASSIVE_INTERVAL) {
                    if (this.A00 == 2) {
                        A08();
                    } else {
                        A06();
                        this.A0B = true;
                    }
                }
            } else if (((AbstractC4984oz) abstractC24028P).A01 <= j2) {
                AbstractC24028P abstractC24028P2 = this.A09;
                if (A0I[1].length() != 10) {
                    String[] strArr = A0I;
                    strArr[6] = "SM2l9fwyY7vSK8U9dCan";
                    strArr[0] = "PLBzRsO91bLUZoRphjDr";
                    if (abstractC24028P2 != null) {
                        this.A09.A0B();
                    }
                } else {
                    A0I[1] = "uDUYlaOON0";
                    if (abstractC24028P2 != null) {
                        this.A09.A0B();
                    }
                }
                this.A01 = abstractC24028P.A8a(j2);
                this.A09 = abstractC24028P;
                this.A08 = null;
                z = true;
            }
        }
        if (z) {
            AbstractC21273y.A01(this.A09);
            A0B(new C5012pR(this.A09.A7X(j2), A02(A01(j2))));
        }
        int i2 = this.A00;
        if (A0I[3].charAt(23) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[6] = "ML0YoWWFYnm1pIYkMDlj";
        strArr2[0] = "WzY2c9YM67lXJGPj7nnt";
        if (i2 == 2) {
            return;
        }
        while (true) {
            try {
                boolean textRendererNeedsUpdate2 = this.A0A;
                if (!textRendererNeedsUpdate2) {
                    C24058S c24058sA5r = this.A07;
                    if (c24058sA5r == null) {
                        c24058sA5r = ((InterfaceC4803lq) AbstractC21273y.A01(this.A06)).A5r();
                        if (c24058sA5r != null) {
                            this.A07 = c24058sA5r;
                        } else {
                            return;
                        }
                    }
                    if (this.A00 == 1) {
                        c24058sA5r.A02(4);
                        ((InterfaceC4803lq) AbstractC21273y.A01(this.A06)).AHJ(c24058sA5r);
                        this.A07 = null;
                        this.A00 = 2;
                        return;
                    }
                    int iA1R = A1R(this.A0E, c24058sA5r, 0);
                    if (iA1R == -4) {
                        boolean textRendererNeedsUpdate3 = c24058sA5r.A05();
                        if (textRendererNeedsUpdate3) {
                            this.A0A = true;
                            this.A0C = false;
                        } else {
                            C5064qI c5064qI = this.A0E.A00;
                            if (c5064qI != null) {
                                c24058sA5r.A00 = c5064qI.A0M;
                                c24058sA5r.A0B();
                                boolean z2 = this.A0C;
                                boolean textRendererNeedsUpdate4 = c24058sA5r.A07();
                                this.A0C = (textRendererNeedsUpdate4 ? false : true) & z2;
                            } else {
                                return;
                            }
                        }
                        boolean textRendererNeedsUpdate5 = this.A0C;
                        if (!textRendererNeedsUpdate5) {
                            ((InterfaceC4803lq) AbstractC21273y.A01(this.A06)).AHJ(c24058sA5r);
                            this.A07 = null;
                        }
                    } else if (iA1R == -3) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (C4796lj e2) {
                A0D(e2);
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC23667p
    public final int AKM(C5064qI c5064qI) {
        if (this.A0F.AKN(c5064qI)) {
            return AbstractC23597i.A00(4);
        }
        if (AbstractC20873J.A0E(c5064qI.A0W)) {
            return AbstractC23597i.A00(1);
        }
        return AbstractC23597i.A00(0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo, com.instagram.common.viewpoint.core.InterfaceC23667p
    public final String getName() {
        return A03(39, 12, 23);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A0A((C5012pR) message.obj);
                return true;
            case 1:
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
