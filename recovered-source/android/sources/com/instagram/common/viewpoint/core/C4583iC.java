package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4583iC implements InterfaceC3393Ol {
    public final SharedPreferences.Editor A00;

    public C4583iC(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C4583iC A00(String str, long j2) {
        this.A00.putLong(str, j2);
        return this;
    }

    public final C4583iC A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
