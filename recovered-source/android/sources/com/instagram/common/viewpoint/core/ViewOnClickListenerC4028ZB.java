package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4028ZB implements View.OnClickListener {
    public final /* synthetic */ C3332Nm A00;
    public final /* synthetic */ C3792VI A01;
    public final /* synthetic */ InterfaceC3998Yh A02;
    public final /* synthetic */ C4029ZC A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC4028ZB(C4029ZC c4029zc, C3792VI c3792vi, InterfaceC3998Yh interfaceC3998Yh, String str, C3332Nm c3332Nm) {
        this.A03 = c4029zc;
        this.A01 = c3792vi;
        this.A02 = interfaceC3998Yh;
        this.A04 = str;
        this.A00 = c3332Nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A01.A04(EnumC3791VH.A0A, null);
            if (this.A03.A01.A0O(this.A03.A02.A02(), true)) {
                this.A02.AAo(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                C3899X6.A0O(new C3899X6(), this.A03.A02, AbstractC3904XB.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
