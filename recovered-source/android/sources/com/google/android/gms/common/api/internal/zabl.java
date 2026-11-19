package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zabl {

    /* JADX INFO: renamed from: a */
    public final ApiKey f4304a;

    /* JADX INFO: renamed from: b */
    public final Feature f4305b;

    public /* synthetic */ zabl(ApiKey apiKey, Feature feature) {
        this.f4304a = apiKey;
        this.f4305b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zabl) {
            zabl zablVar = (zabl) obj;
            if (Objects.m3535a(this.f4304a, zablVar.f4304a) && Objects.m3535a(this.f4305b, zablVar.f4305b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4304a, this.f4305b});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.m3536a(this.f4304a, "key");
        toStringHelper.m3536a(this.f4305b, "feature");
        return toStringHelper.toString();
    }
}
