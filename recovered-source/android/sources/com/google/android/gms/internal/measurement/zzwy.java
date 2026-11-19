package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import p011H.InterfaceC0238B;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwy implements InterfaceC0238B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzws f23055a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0238B f23056b;

    public zzwy(zzws zzwsVar, InterfaceC0238B interfaceC0238B) {
        this.f23055a = zzwsVar;
        this.f23056b = interfaceC0238B;
    }

    @Override // p011H.InterfaceC0238B
    public final ListenableFuture apply(Object obj) {
        zzwq zzwqVarM10686c = zzvy.m10686c();
        zzws zzwsVarM10685b = zzvy.m10685b(zzwqVarM10686c, this.f23055a);
        try {
            ListenableFuture listenableFutureApply = this.f23056b.apply(obj);
            if (listenableFutureApply == null) {
                throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
            }
            zzvy.m10685b(zzwqVarM10686c, zzwsVarM10685b);
            return listenableFutureApply;
        } catch (Throwable th) {
            try {
                zzvu.m10683a(th);
                throw th;
            } catch (Throwable th2) {
                zzvy.m10685b(zzwqVarM10686c, zzwsVarM10685b);
                throw th2;
            }
        }
    }

    public final String toString() {
        InterfaceC0238B interfaceC0238B = this.f23056b;
        StringBuilder sb = new StringBuilder(interfaceC0238B.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(interfaceC0238B);
        sb.append("]");
        return sb.toString();
    }
}
