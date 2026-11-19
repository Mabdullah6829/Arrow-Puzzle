package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2493AA extends AbstractC5069qP implements InterfaceC4977os {
    public static byte[] A0N;
    public static String[] A0O = {"ryR4HSm2zR8tip5OkgYwdb0JWy9e3v2W", "Fm5MoQAoRuRRmRXPK4I4CJ8bYaju2JW1", "syIAGKVT8Ewa7Rni6nktnCNdH4Ja85Gc", "ScHbfbbxkU", "HZJXjhizoNO31MnMnm7FxQnRU8I8lePN", "YCsl9os6nHqs6yB8LR1hlQvfR5oCt3rk", "Ml6mHBX1GsWDWNWH2EtCrt2HpilhtHKz", "59SI8zfcXXU2xe69nRlPKARsr0343GFe"};
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public C5070qQ A06;
    public C5064qI A07;
    public C5064qI A08;
    public C22716I A09;
    public C22716I A0A;
    public InterfaceC2664Cx A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C2495AC A0E;
    public final SurfaceHolderCallbackC4971om A0F;
    public final InterfaceC4968oj A0G;
    public final CopyOnWriteArraySet<InterfaceC24278p> A0H;
    public final CopyOnWriteArraySet<InterfaceC20983U> A0I;
    public final CopyOnWriteArraySet<InterfaceC2586Bf> A0J;
    public final CopyOnWriteArraySet<InterfaceC2878GQ> A0K;
    public final CopyOnWriteArraySet<InterfaceC4970ol> A0L;
    public final InterfaceC4973oo[] A0M;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C2493AA(Context context, InterfaceC23707t interfaceC23707t, AbstractC2787Ew abstractC2787Ew, InterfaceC231974 interfaceC231974, InterfaceC2797F6 interfaceC2797F6, InterfaceC2489A6 interfaceC2489A6, InterfaceC4715kO<InterfaceC213445, InterfaceC4968oj> interfaceC4715kO, InterfaceC213445 interfaceC213445) {
        this.A0F = new SurfaceHolderCallbackC4971om(this);
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0H = new CopyOnWriteArraySet<>();
        Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        this.A0D = new Handler(looperMyLooper);
        this.A0M = interfaceC23707t.A5Y(this.A0D, this.A0F, this.A0F, this.A0F, this.A0F, interfaceC2489A6);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A06 = C5070qQ.A07;
        this.A02 = 1;
        this.A0E = A06(this.A0M, abstractC2787Ew, interfaceC231974, interfaceC2797F6, interfaceC213445);
        this.A0G = interfaceC4715kO.A4B(interfaceC213445);
        this.A0G.AJf(this.A0E, looperMyLooper);
        this.A0I = new CopyOnWriteArraySet<>();
    }

    public static String A07(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0N = new byte[]{-41, -19, -15, -12, -16, -23, -55, -4, -13, -44, -16, -27, -3, -23, -10, 12, 46, 43, 31, 26, 28, 30, 13, 30, 49, 45, 46, 43, 30, 5, 34, 44, 45, 30, 39, 30, 43, -39, 26, 37, 43, 30, 26, 29, 50, -39, 46, 39, 44, 30, 45, -39, 40, 43, -39, 43, 30, 41, 37, 26, 28, 30, 29, -25};
    }

    static {
        A0E();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kO != com.google.common.base.Function<com.facebook.ads.androidx.media3.common.util.Clock, com.facebook.ads.androidx.media3.exoplayer.analytics.AnalyticsCollector> */
    public C2493AA(Context context, InterfaceC23707t interfaceC23707t, AbstractC2787Ew abstractC2787Ew, InterfaceC231974 interfaceC231974, InterfaceC2797F6 interfaceC2797F6, InterfaceC2489A6 interfaceC2489A6, InterfaceC4715kO<InterfaceC213445, InterfaceC4968oj> interfaceC4715kO) {
        this(context, interfaceC23707t, abstractC2787Ew, interfaceC231974, interfaceC2797F6, interfaceC2489A6, interfaceC4715kO, InterfaceC213445.A00);
    }

    @Deprecated
    public C2493AA(InterfaceC23707t interfaceC23707t, AbstractC2787Ew abstractC2787Ew, InterfaceC231974 interfaceC231974, InterfaceC2797F6 interfaceC2797F6, InterfaceC2489A6 interfaceC2489A6) {
        this(null, interfaceC23707t, abstractC2787Ew, interfaceC231974, interfaceC2797F6, interfaceC2489A6, new InterfaceC4715kO() { // from class: com.facebook.ads.redexgen.X.or
            @Override // com.instagram.common.viewpoint.core.InterfaceC4715kO
            public final Object A4B(Object obj) {
                return new C2491A8((InterfaceC213445) obj);
            }
        });
    }

    private final C2495AC A06(InterfaceC4973oo[] interfaceC4973ooArr, AbstractC2787Ew abstractC2787Ew, InterfaceC231974 interfaceC231974, InterfaceC2797F6 interfaceC2797F6, InterfaceC213445 interfaceC213445) {
        return new C2495AC(interfaceC4973ooArr, abstractC2787Ew, interfaceC231974, interfaceC2797F6, interfaceC213445);
    }

    private void A0D() {
        if (this.A05 != null) {
            if (this.A05.getSurfaceTextureListener() != this.A0F) {
                Log.w(A07(0, 15, 71), A07(15, 49, 124));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        if (this.A04 != null) {
            this.A04.removeCallback(this.A0F);
            String[] strArr = A0O;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0O;
            strArr2[6] = "1mt3T64XRkFMJTK0AHNCLCnfNjMbTppi";
            strArr2[3] = "rnp4JtgfYQ";
            this.A04 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(Surface surface, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC4973oo interfaceC4973oo : this.A0M) {
            if (interfaceC4973oo.A9N() == 2) {
                arrayList.add(this.A0E.A0L(interfaceC4973oo).A07(1).A08(surface).A06());
            }
        }
        if (this.A03 != null && this.A03 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C23547d) it.next()).A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0C) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0C = z;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC5069qP
    public final void A0H(int i2, long j2) {
        this.A0G.ACe();
        this.A0E.A0H(i2, j2);
    }

    public final int A0I() {
        return this.A01;
    }

    public final C5064qI A0J() {
        return this.A07;
    }

    public final C5064qI A0K() {
        return this.A08;
    }

    public final void A0L() {
        this.A0E.A0M();
        A0D();
        if (this.A03 != null) {
            if (this.A0C) {
                this.A03.release();
            }
            this.A03 = null;
        }
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
            this.A0B = null;
        }
    }

    public final void A0M(float f2) {
        float fA00 = AbstractC22035C.A00(f2, 0.0f, 1.0f);
        if (this.A00 == fA00) {
            return;
        }
        this.A00 = fA00;
        for (InterfaceC4973oo interfaceC4973oo : this.A0M) {
            if (interfaceC4973oo.A9N() == 1) {
                this.A0E.A0L(interfaceC4973oo).A07(2).A08(Float.valueOf(fA00)).A06();
            }
        }
    }

    public final void A0N(Surface surface) {
        A0D();
        A0F(surface, false);
    }

    public final void A0O(InterfaceC20983U interfaceC20983U) {
        this.A0E.A0O(interfaceC20983U);
        this.A0I.add(interfaceC20983U);
    }

    public final void A0P(InterfaceC4970ol interfaceC4970ol) {
        this.A0L.add(interfaceC4970ol);
    }

    public final void A0Q(InterfaceC2664Cx interfaceC2664Cx) {
        A0R(interfaceC2664Cx, true, true);
    }

    public final void A0R(InterfaceC2664Cx interfaceC2664Cx, boolean z, boolean z2) {
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
        }
        this.A0B = interfaceC2664Cx;
        interfaceC2664Cx.A3z(this.A0D, this.A0G);
        this.A0E.A0P(interfaceC2664Cx, z, z2);
    }

    public final void A0S(boolean z) {
        this.A0E.A0Q(z);
    }

    public final boolean A0T() {
        return this.A0E.A0R();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final long A77() {
        return this.A0E.A77();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final long A7T() {
        return this.A0E.A7T();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final int A7Y() {
        return this.A0E.A7Y();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final int A7Z() {
        return this.A0E.A7Z();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final int A7b() {
        return this.A0E.A7b();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final int A7c() {
        return this.A0E.A7c();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final long A7e() {
        return this.A0E.A7e();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final Timeline A7g() {
        return this.A0E.A7g();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final int A7h() {
        return this.A0E.A7h();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final long A7s() {
        return this.A0E.A7s();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final long A9J() {
        return this.A0E.A9J();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final boolean AAd() {
        return this.A0E.AAd();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21053b
    public final void AKG(boolean z) {
        this.A0E.AKG(z);
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
            this.A0B = null;
            if (z) {
                this.A0B = null;
            }
        }
    }
}
