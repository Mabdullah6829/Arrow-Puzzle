package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vm */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3821Vm {
    public final AdErrorType A00;
    public final String A01;

    public C3821Vm(int i2, String str) {
        this(AdErrorType.adErrorTypeFromCode(i2), str);
    }

    public C3821Vm(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C3821Vm A00(AdErrorType adErrorType) {
        return new C3821Vm(adErrorType, (String) null);
    }

    public static C3821Vm A01(AdErrorType adErrorType, String str) {
        return new C3821Vm(adErrorType, str);
    }

    public static C3821Vm A02(C3822Vn c3822Vn) {
        return new C3821Vm(c3822Vn.A00(), c3822Vn.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
