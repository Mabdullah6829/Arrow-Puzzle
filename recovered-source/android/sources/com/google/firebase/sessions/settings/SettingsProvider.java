package com.google.firebase.sessions.settings;

import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p092z0.C6583a;

/* JADX INFO: loaded from: classes2.dex */
public interface SettingsProvider {

    public static final class DefaultImpls {
        public static boolean isSettingsStale(SettingsProvider settingsProvider) {
            return false;
        }

        public static Object updateSettings(SettingsProvider settingsProvider, InterfaceC6348c interfaceC6348c) {
            return C6289k.f24318a;
        }
    }

    Double getSamplingRate();

    Boolean getSessionEnabled();

    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    C6583a mo12337getSessionRestartTimeoutFghU774();

    boolean isSettingsStale();

    Object updateSettings(InterfaceC6348c interfaceC6348c);
}
