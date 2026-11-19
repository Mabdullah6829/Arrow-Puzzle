package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {

    /* JADX INFO: renamed from: t */
    public static final TelemetryLoggingOptions f4469t = new TelemetryLoggingOptions(new Builder().f4471a);

    /* JADX INFO: renamed from: s */
    public final String f4470s;

    public static class Builder {

        /* JADX INFO: renamed from: a */
        public String f4471a;

        private Builder() {
            throw null;
        }
    }

    public /* synthetic */ TelemetryLoggingOptions(String str) {
        this.f4470s = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TelemetryLoggingOptions) {
            return Objects.m3535a(this.f4470s, ((TelemetryLoggingOptions) obj).f4470s);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4470s});
    }
}
