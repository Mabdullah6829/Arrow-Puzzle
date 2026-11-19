package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lb */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4788lb implements InterfaceC3082Jj {
    public static String[] A01 = {"5dk9XJP2wGzKf", "t9Sqq8YLjeTrFPP9jF9lF", "ZSSLQReFK2RnB4Tl20", "6LiPtiUXCvNXZPkDmbiLO", "ML1syn76y5DaiFADQPhnbgz9k8Qidn9e", "l6QdmjZcy6MGH", "", "GeXYkzAGCbUHzEIcx9bq6WN7r3"};
    public static final C4788lb A02 = new C4788lb();
    public final List<C5014pT> A00;

    public C4788lb() {
        this.A00 = Collections.emptyList();
    }

    public C4788lb(C5014pT c5014pT) {
        this.A00 = Collections.singletonList(c5014pT);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final List<C5014pT> A7X(long j2) {
        return j2 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final long A83(int i2) {
        AbstractC21273y.A07(i2 == 0);
        if (A01[5].length() != 13) {
            throw new RuntimeException();
        }
        A01[7] = "BSEyCnkUJKVAglTMpAGc69o360";
        return 0L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final int A84() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final int A8a(long j2) {
        return j2 < 0 ? 0 : -1;
    }
}
