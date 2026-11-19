package com.google.firebase.sessions.settings;

import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes2.dex */
public interface SettingsCache {
    boolean hasCacheExpired();

    Integer sessionRestartTimeout();

    Double sessionSamplingRate();

    Boolean sessionsEnabled();

    Object updateConfigs(SessionConfigs sessionConfigs, InterfaceC6348c interfaceC6348c);
}
