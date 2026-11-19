package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInOptions implements Api.ApiOptions.Optional {

    /* JADX INFO: renamed from: s */
    public static final SignInOptions f23179s = new SignInOptions();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignInOptions)) {
            return false;
        }
        ((SignInOptions) obj).getClass();
        return Objects.m3535a(null, null) && Objects.m3535a(null, null) && Objects.m3535a(null, null) && Objects.m3535a(null, null) && Objects.m3535a(null, null);
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, bool, null, bool, bool, null, null, null, null});
    }
}
