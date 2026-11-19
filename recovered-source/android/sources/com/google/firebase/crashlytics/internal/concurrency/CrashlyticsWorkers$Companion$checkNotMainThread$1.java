package com.google.firebase.crashlytics.internal.concurrency;

import kotlin.jvm.internal.AbstractC6451j;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class CrashlyticsWorkers$Companion$checkNotMainThread$1 extends AbstractC6451j implements InterfaceC6487a {
    public CrashlyticsWorkers$Companion$checkNotMainThread$1(Object obj) {
        super(0, obj, CrashlyticsWorkers.Companion.class, "isNotMainThread", "isNotMainThread()Z", 0);
    }

    @Override // p078p0.InterfaceC6487a
    public final Boolean invoke() {
        return Boolean.valueOf(((CrashlyticsWorkers.Companion) this.receiver).isNotMainThread());
    }
}
