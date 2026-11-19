package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC3989YY implements View.OnClickListener {
    public final /* synthetic */ C3332Nm A00;
    public final /* synthetic */ C3792VI A01;
    public final /* synthetic */ C3990YZ A02;
    public final /* synthetic */ InterfaceC3998Yh A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC3989YY(C3990YZ c3990yz, C3792VI c3792vi, InterfaceC3998Yh interfaceC3998Yh, String str, C3332Nm c3332Nm) {
        this.A02 = c3990yz;
        this.A01 = c3792vi;
        this.A03 = interfaceC3998Yh;
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
            if (this.A02.A02.A0O(this.A02.A03.A02(), true)) {
                this.A03.AAo(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                C3899X6.A0O(new C3899X6(), this.A02.A03, AbstractC3904XB.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
