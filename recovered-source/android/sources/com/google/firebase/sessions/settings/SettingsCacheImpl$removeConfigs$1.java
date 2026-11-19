package com.google.firebase.sessions.settings;

import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6375e(m12158c = "com.google.firebase.sessions.settings.SettingsCacheImpl", m12159f = "SettingsCache.kt", m12160l = {107}, m12161m = "removeConfigs$com_google_firebase_firebase_sessions")
public final class SettingsCacheImpl$removeConfigs$1 extends AbstractC6373c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsCacheImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCacheImpl$removeConfigs$1(SettingsCacheImpl settingsCacheImpl, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.this$0 = settingsCacheImpl;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.removeConfigs$com_google_firebase_firebase_sessions(this);
    }
}
