package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.XE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3907XE {
    public static AdError A00(C3821Vm c3821Vm) {
        if (c3821Vm.A03().isPublicError()) {
            return new AdError(c3821Vm.A03().getErrorCode(), c3821Vm.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
