package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdClosedListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zd */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4056Zd extends FrameLayout {
    public static String[] A0E = {"5RNIIKEidNz4CxH4JgV5654XoKm2WCRJ", "1p9zA", "TyFhTVOKfwCiarLUW0", "qGg1KSsP6zNQFhXHIMmjZGXDOHal5qmq", "ysvkaelauuCqE6L7ICudiIGq1Ejo0wOd", "BlsqFJOSCgQfST", "dpiEaUs9Aor9er1WGZ", "tfv9H94"};
    public int A00;
    public AdClosedListener A01;
    public EnumC3390Oi A02;
    public C3391Oj A03;
    public C3392Ok A04;
    public InterfaceC4055Zc A05;
    public final C3388Og A06;
    public final C4494gi A07;
    public final InterfaceC3784VA A08;
    public final InterfaceC3998Yh A09;
    public final InterfaceC3999Yi A0A;
    public final String A0B;
    public final C3332Nm A0C;
    public final InterfaceC4058Zf A0D;

    public abstract void A0O();

    public abstract void A0P();

    public abstract void A0R(C3392Ok c3392Ok, EnumC3390Oi enumC3390Oi);

    public abstract boolean A0S();

    public AbstractC4056Zd(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, String str) {
        this(c4494gi, interfaceC3784VA, str, null, null, null);
    }

    public AbstractC4056Zd(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, String str, C3332Nm c3332Nm, InterfaceC3999Yi interfaceC3999Yi, InterfaceC3998Yh interfaceC3998Yh) {
        super(c4494gi);
        this.A00 = 0;
        this.A02 = EnumC3390Oi.A05;
        this.A04 = null;
        this.A0D = new C3238MF(this);
        this.A07 = c4494gi;
        this.A08 = interfaceC3784VA;
        this.A0A = interfaceC3999Yi;
        this.A09 = interfaceC3998Yh;
        this.A0B = str;
        this.A0C = c3332Nm;
        this.A06 = AbstractC3389Oh.A00(this.A07.A02());
    }

    public static /* synthetic */ int A02(AbstractC4056Zd abstractC4056Zd) {
        int i2 = abstractC4056Zd.A00;
        abstractC4056Zd.A00 = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int A03(AbstractC4056Zd abstractC4056Zd) {
        int i2 = abstractC4056Zd.A00;
        abstractC4056Zd.A00 = i2 - 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        if (this.A03.A0A()) {
            this.A08.AB3(this.A0B, this.A03.A02());
            this.A03.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        this.A04 = null;
        this.A03.A05();
        A0O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(C3392Ok c3392Ok) {
        this.A03.A08(this.A02);
        A0Q(c3392Ok, this.A02);
        C3292N8.A01(this.A07).A0L();
        if (A0S()) {
            A0E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C3392Ok c3392Ok) {
        this.A04 = c3392Ok;
        this.A03.A09(this.A02, this.A00);
        A0R(c3392Ok, this.A02);
    }

    public final void A0M() {
        A0E();
    }

    public final void A0N() {
        this.A03 = new C3391Oj(new C3792VI(this.A0B, this.A08));
        if (this.A0A != null) {
            InterfaceC3999Yi interfaceC3999Yi = this.A0A;
            if (A0E[0].charAt(22) == 'O') {
                throw new RuntimeException();
            }
            A0E[7] = "FLAi4P2";
            interfaceC3999Yi.AFA(true);
        }
        if (this.A05 != null) {
            this.A05.ACs();
        }
        A0F();
    }

    public void A0Q(C3392Ok c3392Ok, EnumC3390Oi enumC3390Oi) {
        if (this.A01 != null) {
            this.A07.A0F().ABV();
            this.A01.onAdClosed();
        }
    }

    public void setAdReportingCallbackListener(InterfaceC4055Zc interfaceC4055Zc) {
        this.A05 = interfaceC4055Zc;
    }

    public void setOnAdClosedListener(AdClosedListener adClosedListener) {
        this.A01 = adClosedListener;
    }
}
