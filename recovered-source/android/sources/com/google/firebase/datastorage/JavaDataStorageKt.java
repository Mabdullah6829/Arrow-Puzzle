package com.google.firebase.datastorage;

import androidx.datastore.preferences.core.Preferences;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaDataStorageKt {
    public static final <T> T getOrDefault(Preferences preferences, Preferences.Key<T> key, T t) {
        AbstractC6452k.m12181e(preferences, "<this>");
        AbstractC6452k.m12181e(key, "key");
        T t2 = (T) preferences.get(key);
        return t2 == null ? t : t2;
    }
}
