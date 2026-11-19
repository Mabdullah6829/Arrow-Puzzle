package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ApiKey<O extends Api.ApiOptions> {

    /* JADX INFO: renamed from: a */
    public final int f4215a;

    /* JADX INFO: renamed from: b */
    public final Api f4216b;

    /* JADX INFO: renamed from: c */
    public final Api.ApiOptions f4217c;

    /* JADX INFO: renamed from: d */
    public final String f4218d;

    public ApiKey(Api api, Api.ApiOptions apiOptions, String str) {
        this.f4216b = api;
        this.f4217c = apiOptions;
        this.f4218d = str;
        this.f4215a = Arrays.hashCode(new Object[]{api, apiOptions, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return Objects.m3535a(this.f4216b, apiKey.f4216b) && Objects.m3535a(this.f4217c, apiKey.f4217c) && Objects.m3535a(this.f4218d, apiKey.f4218d);
    }

    public final int hashCode() {
        return this.f4215a;
    }
}
