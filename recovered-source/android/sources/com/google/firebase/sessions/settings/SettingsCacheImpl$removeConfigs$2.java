package com.google.firebase.sessions.settings;

import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6375e(m12158c = "com.google.firebase.sessions.settings.SettingsCacheImpl$removeConfigs$2", m12159f = "SettingsCache.kt", m12160l = {}, m12161m = "invokeSuspend")
public final class SettingsCacheImpl$removeConfigs$2 extends AbstractC6379i implements InterfaceC6502p {
    int label;

    public SettingsCacheImpl$removeConfigs$2(InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        return new SettingsCacheImpl$removeConfigs$2(interfaceC6348c);
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(SessionConfigs sessionConfigs, InterfaceC6348c interfaceC6348c) {
        return ((SettingsCacheImpl$removeConfigs$2) create(sessionConfigs, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0243G.m377o(obj);
        return SessionConfigsSerializer.INSTANCE.getDefaultValue();
    }
}
