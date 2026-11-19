package com.google.firebase.sessions.settings;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.AbstractC0355G;
import p062g0.InterfaceC6348c;
import p092z0.C6583a;
import p092z0.EnumC6585c;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalOverrideSettings implements SettingsProvider {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String SAMPLING_RATE = "firebase_sessions_sampling_rate";

    @Deprecated
    public static final String SESSIONS_ENABLED = "firebase_sessions_enabled";

    @Deprecated
    public static final String SESSION_RESTART_TIMEOUT = "firebase_sessions_sessions_restart_timeout";
    private final Bundle metadata;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        private Companion() {
        }
    }

    public LocalOverrideSettings(Context appContext) {
        AbstractC6452k.m12181e(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.metadata = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Double getSamplingRate() {
        if (this.metadata.containsKey(SAMPLING_RATE)) {
            return Double.valueOf(this.metadata.getDouble(SAMPLING_RATE));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Boolean getSessionEnabled() {
        if (this.metadata.containsKey(SESSIONS_ENABLED)) {
            return Boolean.valueOf(this.metadata.getBoolean(SESSIONS_ENABLED));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774, reason: not valid java name */
    public C6583a mo12337getSessionRestartTimeoutFghU774() {
        if (this.metadata.containsKey(SESSION_RESTART_TIMEOUT)) {
            return new C6583a(AbstractC0355G.m560n(this.metadata.getInt(SESSION_RESTART_TIMEOUT), EnumC6585c.SECONDS));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return SettingsProvider.DefaultImpls.isSettingsStale(this);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Object updateSettings(InterfaceC6348c interfaceC6348c) {
        return SettingsProvider.DefaultImpls.updateSettings(this, interfaceC6348c);
    }
}
