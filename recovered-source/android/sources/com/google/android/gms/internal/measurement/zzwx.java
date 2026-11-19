package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.InterfaceC0237A;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwx implements InterfaceC0237A {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzws f23053s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC0237A f23054t;

    public zzwx(zzws zzwsVar, InterfaceC0237A interfaceC0237A) {
        this.f23053s = zzwsVar;
        this.f23054t = interfaceC0237A;
    }

    @Override // p011H.InterfaceC0237A
    public final ListenableFuture call() {
        zzwq zzwqVarM10686c = zzvy.m10686c();
        zzws zzwsVarM10685b = zzvy.m10685b(zzwqVarM10686c, this.f23053s);
        try {
            ListenableFuture listenableFutureCall = this.f23054t.call();
            zzvy.m10685b(zzwqVarM10686c, zzwsVarM10685b);
            AbstractC6452k.m12180d(listenableFutureCall, "wrapInTrace(...)");
            return listenableFutureCall;
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
        InterfaceC0237A interfaceC0237A = this.f23054t;
        StringBuilder sb = new StringBuilder(interfaceC0237A.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(interfaceC0237A);
        sb.append("]");
        return sb.toString();
    }
}
