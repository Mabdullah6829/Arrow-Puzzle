package com.google.firebase.sessions;

import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6375e(m12158c = "com.google.firebase.sessions.InstallationId$Companion", m12159f = "InstallationId.kt", m12160l = {31, 39}, m12161m = "create")
public final class InstallationId$Companion$create$1 extends AbstractC6373c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InstallationId.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallationId$Companion$create$1(InstallationId.Companion companion, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.this$0 = companion;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.create(null, this);
    }
}
