package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ge */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2892Ge extends FrameLayout implements InterfaceC3999Yi {
    public static byte[] A0L;
    public static String[] A0M = {"2u2dP7fJh3RTJE0f5j", "V84xfC9vRBWBw28ag3Wa", "AJ9OWsf0IOCB9JkMwpi03POlIdxFWB0O", "t4KHUJW6pNylT", "agpCzVGtSfjd9ImL9ArnGOWeGltiI7KT", "yQxi0n265GvpKMbNVeZVKXQg4YYx4N", "9gQlnw56", "rIoCFSW2UJYE3I7OlTOsSCWVSaoSra"};
    public static final RelativeLayout.LayoutParams A0N;
    public int A00;
    public int A01;
    public int A02;
    public C4175bY A03;
    public AbstractC3020Ij A04;
    public C4362ea A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C4661jT A0A;
    public final InterfaceC3574Rk A0B;
    public final C3648Sx A0C;
    public final C4494gi A0D;
    public final InterfaceC3784VA A0E;
    public final C3792VI A0F;
    public final ViewOnSystemUiVisibilityChangeListenerC3952Xx A0G;
    public final AbstractC3992Yb A0H;
    public final InterfaceC3998Yh A0I;
    public final InterfaceC4047ZU A0J;
    public final ArrayList<C4311dk> A0K;

    public static String A0D(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 100);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0I() {
        A0L = new byte[]{-103, -24, -33, -103, -1, 34, -34};
    }

    static {
        A0I();
        A0N = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C2892Ge(C4494gi c4494gi, InterfaceC4047ZU interfaceC4047ZU, InterfaceC3784VA interfaceC3784VA, C4661jT c4661jT, C3648Sx c3648Sx, InterfaceC3998Yh interfaceC3998Yh) {
        FrameLayout.LayoutParams layoutParams;
        super(c4494gi);
        this.A0K = new ArrayList<>();
        this.A09 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = true;
        this.A02 = 1;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B = new C2896Gi(this);
        this.A0D = c4494gi;
        this.A0J = interfaceC4047ZU;
        this.A0E = interfaceC3784VA;
        this.A0A = c4661jT;
        this.A0C = c3648Sx;
        this.A0I = interfaceC3998Yh;
        this.A0F = new C3792VI(this.A0A.A27(0).A2E(), this.A0E);
        this.A0G = new ViewOnSystemUiVisibilityChangeListenerC3952Xx(this);
        this.A0G.A05(EnumC3951Xw.A02);
        this.A05 = new C4362ea(this.A0D, this.A0J, this.A0A.A1G(), interfaceC3998Yh);
        this.A0H = A07();
        if (this.A0A.A1c()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(AbstractC3924XV.A0u, AbstractC3924XV.A0r, 0, 0);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, this.A0H.getToolbarHeight());
        }
        addView(this.A0H, layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        if (r4.A1L() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        r6.A0H.setToolbarActionMode(0);
        r6.A0D.A0F().A4x();
        r6.A04.A1G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
    
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
    
        if (r4.A1L() != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00() {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C2892Ge.A00():int");
    }

    private int A01(int i2) {
        if (this.A0A.A2I()) {
            C4661jT c4661jT = this.A0A;
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "SFVCTE3Hv2F6eV4jkYzgVN3BuZvLlt";
            strArr2[7] = "be2ILDbetBMqGPrAeiZBpkZxeTc1wp";
            if (i2 < c4661jT.A2B().size() && i2 >= 0) {
                return this.A0A.A2B().get(i2).intValue();
            }
        }
        return this.A0A.A0p();
    }

    public static /* synthetic */ int A03(C2892Ge c2892Ge, int i2) {
        int i3 = c2892Ge.A01 + i2;
        c2892Ge.A01 = i3;
        return i3;
    }

    private AbstractC3992Yb A07() {
        AbstractC3992Yb c3437pu;
        if (!this.A0A.A1c()) {
            c3437pu = new FullScreenAdToolbar(this.A0D, this.A0I, this.A0F, 2, -1, false);
        } else {
            c3437pu = new C3437PU(this.A0D, this.A0A.A27(this.A00), 2);
        }
        c3437pu.setFullscreen(true);
        c3437pu.setToolbarListener(new C2893Gf(this));
        return c3437pu;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c1  */
    private AbstractC3020Ij A0C(boolean z, int i2) {
        boolean z2;
        C2895Gh c2895Gh = new C2895Gh(this, i2);
        AbstractC4669jd abstractC4669jdA27 = this.A0A.A27(this.A00);
        if (abstractC4669jdA27.A2T()) {
            this.A0H.setOnClickListener(new ViewOnClickListenerC4312dl(this));
        }
        if (this.A0A.A2F()) {
            int i3 = this.A00;
            String[] strArr = A0M;
            if (strArr[2].charAt(19) == strArr[4].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[0] = "c3gdOFv01Kz0ZnyucW";
            strArr2[1] = "uUEmXxf6IoafQfC48jcO";
            if (i3 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        boolean z3 = this.A0A.A2E() && this.A00 > 0;
        String strA29 = this.A0A.A29();
        if (A0b(abstractC4669jdA27)) {
            int iA01 = A01(this.A00);
            if (iA01 == 0) {
                setUnskippableSecondsComplete(true);
            }
            this.A0D.A0F().AJt(EnumC3228M5.A06);
            this.A0D.A0F().AJL(this.A00);
            this.A0D.A0F().A4v(strA29);
            return new C22345h(this.A0D, this.A0J, this.A00, this.A0E, abstractC4669jdA27, this.A0I, this.A0H, this.A0F, z2, z3, c2895Gh, iA01, this.A0A.A23());
        }
        if (abstractC4669jdA27.A29().A0T()) {
            this.A0D.A0F().AJt(EnumC3228M5.A07);
            this.A0D.A0F().AJL(this.A00);
            this.A0D.A0F().A4v(strA29);
            if (this.A0A.A1c()) {
                return new C219655(this.A0D, this.A0E, this.A0H, abstractC4669jdA27, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, i2, z2, z3, c2895Gh, A01(this.A00), this.A0A.A23());
            }
            return new C22065F(this.A0D, this.A0E, this.A0H, abstractC4669jdA27, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, i2, z2, z3, c2895Gh, A01(this.A00), this.A0A.A23());
        }
        this.A0D.A0F().AJt(EnumC3228M5.A07);
        this.A0D.A0F().AJL(this.A00);
        this.A0D.A0F().A4v(strA29);
        return new C22195S(this.A0D, this.A0E, abstractC4669jdA27, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, this.A0H, this.A0A.A0p(), i2, this.A0A.A22(), z, this.A0A.A24(), this.A0A.A2I(), z2, z3, c2895Gh, A01(this.A00), this.A0A.A23());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        int iA00 = A00();
        if (iA00 != 0) {
            this.A0D.A0F().A4y(iA00);
        }
    }

    private void A0F() {
        if (this.A00 > 0 && !TextUtils.isEmpty(this.A0A.A27(this.A00 - 1).A2E())) {
            InterfaceC3784VA interfaceC3784VA = this.A0E;
            String strA2E = this.A0A.A27(this.A00 - 1).A2E();
            C4150b9 c4150b9A03 = new C4150b9().A03(this.A04 != null ? this.A04.getAdViewabilityChecker() : null);
            AbstractC3020Ij abstractC3020Ij = this.A04;
            String[] strArr = A0M;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "pDlFeLBfyToKKboIUgGc0hC9I32LVeJD";
            strArr2[4] = "3B6yIVnUpbF0PBycHqRFA1bh2UEjPzxQ";
            interfaceC3784VA.AB7(strA2E, c4150b9A03.A02(abstractC3020Ij != null ? this.A04.getTouchDataRecorder() : null).A05());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G() {
        if (this.A0H.getToolbarActionMode() == 8) {
            AbstractC3992Yb abstractC3992Yb = this.A0H;
            String[] strArr = A0M;
            if (strArr[2].charAt(19) == strArr[4].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "ALooRHp0AOPErSNB2N5ax0GYeQeSWGkg";
            strArr2[4] = "Jojrpwo5bfgl2L1NDhbRQaPRUafbLI0W";
            abstractC3992Yb.setToolbarActionMode(2);
        }
        int i2 = this.A00 - 1;
        if (this.A0A.A2J(i2)) {
            AbstractC4669jd abstractC4669jdA27 = this.A0A.A27(i2);
            AbstractC3992Yb abstractC3992Yb2 = this.A0H;
            String[] strArr3 = A0M;
            String str = strArr3[2];
            String str2 = strArr3[4];
            int iCharAt = str.charAt(19);
            int index = str2.charAt(19);
            if (iCharAt == index) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0M;
            strArr4[0] = "SYmrADrPyc9xENaNAh";
            strArr4[1] = "82lRVJ32R9K27GgHKLOx";
            abstractC3992Yb2.setProgressSpinnerInvisible(!abstractC4669jdA27.A2S());
            abstractC4669jdA27.A2K(false);
            abstractC4669jdA27.A29().A0M(-1);
        }
    }

    private void A0H() {
        this.A0D.A0F().A4w();
        this.A07 = true;
        this.A03 = new C4175bY(this.A0D, this.A0A, this.A0E, this.A0I, this.A0H.getToolbarHeight(), this.A02);
        C4311dk c4311dk = null;
        for (C4311dk c4311dk2 : this.A0K) {
            if (c4311dk2.A00 == C4311dk.A06) {
                c4311dk = c4311dk2;
                break;
            }
        }
        if (c4311dk != null) {
            A0N(this.A03, c4311dk);
        } else {
            boolean zIsEmpty = this.A0K.isEmpty();
            String[] strArr = A0M;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "8vyvfMLKM55zirtuKFzVGEL0IOO7sZ";
            strArr2[7] = "ODibu6eYSRbNQzGgUnvrLUj83p1fS4";
            if (!zIsEmpty) {
                A0N(this.A03, this.A0K.get(0));
            }
        }
        A0W(true);
        if (this.A0H instanceof FullScreenAdToolbar) {
            ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(null);
        }
        if (this.A04 != null) {
            AbstractC3966YB.A0J(this.A04);
            this.A04.A1E();
            this.A04 = null;
        }
        AbstractC3966YB.A0J(this.A03);
        AbstractC3966YB.A0G(1102, this.A03);
        addView(this.A03, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void A0J() {
        this.A0G.A05(EnumC3951Xw.A03);
    }

    private synchronized void A0K() {
        this.A0I.A4j(this.A0J.A6l());
        this.A05.A06();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(float f2) {
        float seenCurrentPosMS;
        float fA01 = A01(this.A00 - 1);
        float seenCurrentPosMS2 = (this.A0A.A2I() ? 0 : this.A01) + f2;
        if (fA01 > 0.0f) {
            seenCurrentPosMS = seenCurrentPosMS2 / fA01;
        } else {
            seenCurrentPosMS = 1.0f;
        }
        if (this.A06 && this.A0A.A2I()) {
            this.A06 = false;
            this.A0H.setProgressImmediate(0.0f);
        }
        float unskippableSeconds = 100.0f * seenCurrentPosMS;
        this.A0H.setProgress(unskippableSeconds);
        if (seenCurrentPosMS >= 1.0f && !this.A09) {
            setUnskippableSecondsComplete(true);
            this.A0H.setToolbarActionMode(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(int i2) {
        this.A0D.A0F().A4t(i2);
        setUnskippableSecondsComplete(true);
        A0K();
        A0F();
        this.A0D.A0F().AB0();
        this.A0I.A4j(this.A0J.A7w());
    }

    private void A0N(ViewGroup viewGroup, C4311dk c4311dk) {
        if (c4311dk.A00 == C4311dk.A06 && c4311dk.A03 != null) {
            AbstractC4194br.A00(this.A0D, viewGroup, c4311dk.A03);
        } else {
            int i2 = c4311dk.A01;
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "6Qw2GncBlIK9qwoUetngT0jkAnHCQL";
            strArr2[7] = "iVxLMdIUnWJTFKOlNtOcmcGRsmSn6x";
            AbstractC3966YB.A0N(viewGroup, i2);
        }
        this.A0H.setFullscreen(c4311dk.A05);
        this.A0H.A0D(c4311dk.A02, c4311dk.A04);
    }

    private void A0O(AbstractC4669jd abstractC4669jd) {
        if (this.A0H instanceof FullScreenAdToolbar) {
            if (A0b(abstractC4669jd) && this.A02 == 2) {
                ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(abstractC4669jd.A2C());
            } else {
                ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(null);
            }
        }
    }

    private final void A0P(C3568Re c3568Re) {
        c3568Re.A0A(this.A0B);
        int i2 = c3568Re.A05().getResources().getConfiguration().orientation;
        this.A02 = i2;
        A0X(this.A0A.A2D(), i2);
        A0J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    public void A0W(boolean z) {
        boolean z2;
        if (!A0Z() || A0Y()) {
            z2 = false;
        } else {
            boolean zA0a = A0a();
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "abX2oERzf98UggHhJlwc5xOu8ehA434Q";
            strArr2[4] = "mcfqurarHSiAo6r6yfyhrMyo3UPU5OrE";
            if (zA0a) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        boolean willShowCombinedEndCards = A0Y();
        if (!willShowCombinedEndCards && !z2) {
            setUnskippableSecondsComplete(true);
            if (z) {
                this.A0H.setToolbarActionMessage(A0D(0, 0, 85));
            }
            AbstractC3992Yb abstractC3992Yb = this.A0H;
            String[] strArr3 = A0M;
            if (strArr3[6].length() == strArr3[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0M;
            strArr4[0] = "6hDdRvQvhZI2wvmWyf";
            strArr4[1] = "dfELTL2TgrvtcbRt37j2";
            abstractC3992Yb.setToolbarActionMode(0);
            return;
        }
        AbstractC3992Yb abstractC3992Yb2 = this.A0H;
        String[] strArr5 = A0M;
        if (strArr5[0].length() != strArr5[1].length()) {
            String[] strArr6 = A0M;
            strArr6[2] = "JMDiVFyp4yY8WixxdBAiYWzIdfNljSYZ";
            strArr6[4] = "DEcXsd0kn675y00aYcKTg0COR2JcG3d3";
            abstractC3992Yb2.setToolbarActionMode(1);
            return;
        }
        String[] strArr7 = A0M;
        strArr7[6] = "uCb48oA3";
        strArr7[3] = "eCwSqnipc7icS";
        abstractC3992Yb2.setToolbarActionMode(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(boolean z, int i2) {
        if (this.A04 != null) {
            this.A04.A1E();
            this.A04.removeAllViews();
            AbstractC3966YB.A0J(this.A04);
        }
        if (this.A0A.A1c()) {
            AbstractC3966YB.A0J(this.A0H);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(AbstractC3924XV.A0u, AbstractC3924XV.A0r, 0, 0);
            addView(this.A0H, layoutParams);
        }
        if (!A0Y()) {
            setUnskippableSecondsComplete(true);
            if (A0Z()) {
                A0H();
                return;
            }
            A0M(1);
            String[] strArr = A0M;
            if (strArr[6].length() != strArr[3].length()) {
                String[] strArr2 = A0M;
                strArr2[5] = "b6hirdpqFqEpTGRF7TvzfLNB23PEQW";
                strArr2[7] = "Y5Eb3FssofDa3ImZpKtnPvm2BrdUNN";
                return;
            }
        } else {
            if (this.A0A.A2I()) {
                setUnskippableSecondsComplete(false);
                this.A0H.setProgressImmediate(0.0f);
            }
            InterfaceC3652T1 interfaceC3652T1A01 = this.A0D.A01();
            AbstractC4669jd abstractC4669jdA27 = this.A0A.A27(this.A00);
            String[] strArr3 = A0M;
            if (strArr3[6].length() != strArr3[3].length()) {
                String[] strArr4 = A0M;
                strArr4[0] = "SeXhCWKDArfU2xbUHE";
                strArr4[1] = "icHjaKCGoPIgSTYVXjnx";
                boolean isLoaded = interfaceC3652T1A01.AAM(abstractC4669jdA27.A2E(), this.A0A.A28());
                if (!isLoaded) {
                    this.A0D.A0F().A4u();
                    A0M(2);
                    return;
                }
                AbstractC3020Ij abstractC3020IjA0C = A0C(z, i2);
                this.A04 = abstractC3020IjA0C;
                AbstractC3020Ij abstractC3020Ij = this.A04;
                boolean isLoaded2 = this.A09;
                abstractC3020Ij.A1I(isLoaded2);
                setupToolbarForAd(abstractC3020IjA0C);
                addView(this.A04, 0, A0N);
                this.A00++;
                this.A04.A1H();
                return;
            }
        }
        throw new RuntimeException();
    }

    private boolean A0Y() {
        return this.A00 < this.A0A.A23();
    }

    private boolean A0Z() {
        return this.A0A.A22() == 2;
    }

    private final boolean A0a() {
        return this.A07;
    }

    public static boolean A0b(AbstractC4669jd abstractC4669jd) {
        return TextUtils.isEmpty(abstractC4669jd.A29().A0H().A09());
    }

    public final void A0d() {
        A0X(false, this.A02);
    }

    public final boolean A0e() {
        boolean z = this.A00 < this.A0A.A23() && this.A0A.A2G();
        if (z) {
            this.A0D.A0F().AC1();
        }
        return z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AAu(Intent intent, Bundle bundle, C3568Re c3568Re) {
        this.A0I.A45(this, A0N);
        A0P(c3568Re);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AFA(boolean z) {
        if (this.A04 != null) {
            this.A04.A1J(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AFi(boolean z) {
        if (this.A04 != null) {
            this.A04.A1K(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AIv(Bundle bundle) {
    }

    public AbstractC3020Ij getContentView() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public String getCurrentClientToken() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        if (this.A04 != null) {
            this.A04.onConfigurationChanged(configuration);
        }
        if (this.A04 instanceof C22345h) {
            A0N(this.A04, this.A04.getFullScreenAdStyle());
            A0O(this.A04.getAdDataBundle());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A1E();
            this.A04 = null;
        }
        this.A0D.A01().A4z(this.A0A.A28());
        this.A0G.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC3998Yh interfaceC3998Yh) {
    }

    public void setServerSideRewardHandler(C4362ea c4362ea) {
        this.A05 = c4362ea;
    }

    public void setUnskippableSecondsComplete(boolean z) {
        this.A09 = z;
        if (this.A04 != null) {
            this.A04.A1I(this.A09);
        }
    }

    private void setupToolbarForAd(AbstractC3020Ij abstractC3020Ij) {
        if (this.A0H == null) {
            return;
        }
        this.A06 = true;
        AbstractC4669jd abstractC4669jdA27 = this.A0A.A27(this.A00);
        int iA01 = A01(this.A00);
        if (this.A0H instanceof FullScreenAdToolbar) {
            ((FullScreenAdToolbar) this.A0H).A0G(this.A0D, abstractC4669jdA27.A22());
            ((FullScreenAdToolbar) this.A0H).A0F(abstractC4669jdA27.A2C(), abstractC4669jdA27.A2E(), iA01);
        } else if (this.A0H instanceof C3437PU) {
            ((C3437PU) this.A0H).setInitialUnskippableSeconds(iA01);
        }
        C4311dk fullScreenAdStyle = abstractC3020Ij.getFullScreenAdStyle();
        A0N(abstractC3020Ij, fullScreenAdStyle);
        this.A0K.add(fullScreenAdStyle);
        this.A0H.setToolbarActionMessage(A0D(4, 3, 90) + (this.A00 + 1) + A0D(0, 4, 21) + this.A0A.A23());
        if (this.A08) {
            this.A0H.setToolbarActionMode(1);
        }
        A0O(abstractC4669jdA27);
    }
}
