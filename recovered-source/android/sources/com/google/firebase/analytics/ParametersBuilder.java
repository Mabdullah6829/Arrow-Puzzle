package com.google.firebase.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class ParametersBuilder {
    private final Bundle zza = new Bundle();

    public final Bundle getBundle() {
        return this.zza;
    }

    public final void param(@NonNull String key, double d) {
        AbstractC6452k.m12181e(key, "key");
        this.zza.putDouble(key, d);
    }

    public final void param(@NonNull String key, long j2) {
        AbstractC6452k.m12181e(key, "key");
        this.zza.putLong(key, j2);
    }

    public final void param(@NonNull String key, @NonNull Bundle value) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        this.zza.putBundle(key, value);
    }

    public final void param(@NonNull String key, @NonNull String value) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        this.zza.putString(key, value);
    }

    public final void param(@NonNull String key, @NonNull Bundle[] value) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        this.zza.putParcelableArray(key, value);
    }
}
