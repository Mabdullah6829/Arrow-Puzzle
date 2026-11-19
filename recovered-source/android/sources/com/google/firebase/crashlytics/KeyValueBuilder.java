package com.google.firebase.crashlytics;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyValueBuilder {
    private final CustomKeysAndValues.Builder builder;

    private KeyValueBuilder(CustomKeysAndValues.Builder builder) {
        this.builder = builder;
    }

    public final CustomKeysAndValues build$com_google_firebase_firebase_crashlytics() {
        CustomKeysAndValues customKeysAndValuesBuild = this.builder.build();
        AbstractC6452k.m12180d(customKeysAndValuesBuild, "build(...)");
        return customKeysAndValuesBuild;
    }

    public final void key(String key, boolean z) {
        AbstractC6452k.m12181e(key, "key");
        this.builder.putBoolean(key, z);
    }

    public final void key(String key, double d) {
        AbstractC6452k.m12181e(key, "key");
        this.builder.putDouble(key, d);
    }

    public KeyValueBuilder() {
        this(new CustomKeysAndValues.Builder());
    }

    public final void key(String key, float f2) {
        AbstractC6452k.m12181e(key, "key");
        this.builder.putFloat(key, f2);
    }

    public final void key(String key, int i2) {
        AbstractC6452k.m12181e(key, "key");
        this.builder.putInt(key, i2);
    }

    public final void key(String key, long j2) {
        AbstractC6452k.m12181e(key, "key");
        this.builder.putLong(key, j2);
    }

    public final void key(String key, String value) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        this.builder.putString(key, value);
    }
}
