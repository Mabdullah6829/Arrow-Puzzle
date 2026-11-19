package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4582iB implements InterfaceC3394Om {
    public final SharedPreferences A00;

    public C4582iB(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3394Om
    public final C4583iC A6I() {
        return new C4583iC(this.A00.edit());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3394Om
    public final long A8Q(String str, long j2) {
        return this.A00.getLong(str, j2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3394Om
    public final String A9E(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
