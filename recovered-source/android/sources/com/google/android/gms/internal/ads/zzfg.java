package com.google.android.gms.internal.ads;

import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
final class zzfg implements zzdz {

    /* JADX INFO: renamed from: a */
    public Message f15609a;

    private zzfg() {
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m6435a() {
        Message message = this.f15609a;
        message.getClass();
        message.sendToTarget();
        this.f15609a = null;
        zzfh.m6440j(this);
    }
}
