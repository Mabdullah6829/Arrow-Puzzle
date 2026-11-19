package com.google.firebase.sessions;

import android.os.SystemClock;
import p022N.AbstractC0355G;
import p092z0.C6583a;
import p092z0.EnumC6585c;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeProviderImpl implements TimeProvider {
    public static final TimeProviderImpl INSTANCE = new TimeProviderImpl();

    private TimeProviderImpl() {
    }

    @Override // com.google.firebase.sessions.TimeProvider
    public Time currentTime() {
        return new Time(System.currentTimeMillis());
    }

    @Override // com.google.firebase.sessions.TimeProvider
    /* JADX INFO: renamed from: elapsedRealtime-UwyO8pc */
    public long mo12336elapsedRealtimeUwyO8pc() {
        int i2 = C6583a.f24808v;
        return AbstractC0355G.m561o(SystemClock.elapsedRealtime(), EnumC6585c.MILLISECONDS);
    }
}
