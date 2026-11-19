package com.google.firebase.crashlytics;

import com.google.firebase.Firebase;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseCrashlyticsKt {
    public static final FirebaseCrashlytics getCrashlytics(Firebase firebase) {
        AbstractC6452k.m12181e(firebase, "<this>");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        AbstractC6452k.m12180d(firebaseCrashlytics, "getInstance(...)");
        return firebaseCrashlytics;
    }

    public static final void recordException(FirebaseCrashlytics firebaseCrashlytics, Throwable throwable, InterfaceC6498l init) {
        AbstractC6452k.m12181e(firebaseCrashlytics, "<this>");
        AbstractC6452k.m12181e(throwable, "throwable");
        AbstractC6452k.m12181e(init, "init");
        KeyValueBuilder keyValueBuilder = new KeyValueBuilder();
        init.invoke(keyValueBuilder);
        firebaseCrashlytics.recordException(throwable, keyValueBuilder.build$com_google_firebase_firebase_crashlytics());
    }

    public static final void setCustomKeys(FirebaseCrashlytics firebaseCrashlytics, InterfaceC6498l init) {
        AbstractC6452k.m12181e(firebaseCrashlytics, "<this>");
        AbstractC6452k.m12181e(init, "init");
        KeyValueBuilder keyValueBuilder = new KeyValueBuilder();
        init.invoke(keyValueBuilder);
        firebaseCrashlytics.setCustomKeys(keyValueBuilder.build$com_google_firebase_firebase_crashlytics());
    }
}
