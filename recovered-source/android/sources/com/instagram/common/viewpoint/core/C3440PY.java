package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.PY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3440PY extends AbstractC3535R7 {
    public static String[] A01 = {"LeWmJ2AEMrGR8tgfwsG9m8UwM76zwmUz", "6Bm", "ck2sw", "Oj1Ntvfg6dck0NxJmQASjzaKZXVqT4Sf", "CtYf7ZmPdO", "plI1JnuA", "RZR4g54lk6KTwqItkRA6ECctcTUw", "cGd5igXf7vOVCpmuGQi5cRxrBgQCM2pW"};
    public final /* synthetic */ C19671J A00;

    public C3440PY(C19671J c19671j) {
        this.A00 = c19671j;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3535R7
    public final void A0L(C23377M c23377m, int i2) {
        int iA25;
        InterfaceC4005Yo interfaceC4005Yo;
        super.A0L(c23377m, i2);
        C4564hr linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager != null && (iA25 = linearLayoutManager.A25()) >= 0) {
            C19671J c19671j = this.A00;
            int scrollPosition = A01[3].charAt(13);
            if (scrollPosition == 48) {
                throw new RuntimeException();
            }
            A01[5] = "JmqJ93Os7fwoNBdh";
            if (c19671j.getAdapter() == null || iA25 >= this.A00.getAdapter().A0B() || (interfaceC4005Yo = (InterfaceC4005Yo) c23377m.A1F(iA25)) == null) {
                return;
            }
            interfaceC4005Yo.AJF();
        }
    }
}
