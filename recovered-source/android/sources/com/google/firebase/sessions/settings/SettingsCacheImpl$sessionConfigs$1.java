package com.google.firebase.sessions.settings;

import p000A0.InterfaceC0066v;
import p006D0.AbstractC0163C;
import p006D0.InterfaceC0170e;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6375e(m12158c = "com.google.firebase.sessions.settings.SettingsCacheImpl$sessionConfigs$1", m12159f = "SettingsCache.kt", m12160l = {64}, m12161m = "invokeSuspend")
public final class SettingsCacheImpl$sessionConfigs$1 extends AbstractC6379i implements InterfaceC6502p {
    int label;
    final /* synthetic */ SettingsCacheImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCacheImpl$sessionConfigs$1(SettingsCacheImpl settingsCacheImpl, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.this$0 = settingsCacheImpl;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        return new SettingsCacheImpl$sessionConfigs$1(this.this$0, interfaceC6348c);
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
        return ((SettingsCacheImpl$sessionConfigs$1) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
            return obj;
        }
        AbstractC0243G.m377o(obj);
        InterfaceC0170e data = this.this$0.sessionConfigsDataStore.getData();
        this.label = 1;
        Object objM262d = AbstractC0163C.m262d(data, this);
        return objM262d == enumC6363a ? enumC6363a : objM262d;
    }
}
