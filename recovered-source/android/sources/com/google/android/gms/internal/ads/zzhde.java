package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes2.dex */
final class zzhde extends zzhbw implements RunnableFuture {

    /* JADX INFO: renamed from: z */
    public volatile zzhcm f18541z;

    public zzhde(Callable callable) {
        this.f18541z = new zzhdd(this, callable);
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    /* JADX INFO: renamed from: e */
    public final void mo6897e() {
        zzhcm zzhcmVar;
        if (m7323k() && (zzhcmVar = this.f18541z) != null) {
            zzhcmVar.m7382g();
        }
        this.f18541z = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    /* JADX INFO: renamed from: f */
    public final String mo6898f() {
        zzhcm zzhcmVar = this.f18541z;
        if (zzhcmVar == null) {
            return super.mo6898f();
        }
        String string = zzhcmVar.toString();
        return AbstractC1456a.m2450q(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzhcm zzhcmVar = this.f18541z;
        if (zzhcmVar != null) {
            zzhcmVar.run();
        }
        this.f18541z = null;
    }
}
