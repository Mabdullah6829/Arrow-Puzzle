package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zzx extends zzy {

    /* JADX INFO: renamed from: e */
    public final Callable f4707e;

    public /* synthetic */ zzx(Callable callable) {
        super(false, null, null);
        this.f4707e = callable;
    }

    @Override // com.google.android.gms.common.zzy
    /* JADX INFO: renamed from: a */
    public final String mo3673a() {
        try {
            return (String) this.f4707e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
