package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.AbstractC6451j;
import p014I0.C0315d;
import p014I0.InterfaceC0312a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzgsu extends AbstractC6451j implements InterfaceC6502p {

    /* JADX INFO: renamed from: s */
    public static final zzgsu f18159s = new zzgsu();

    public zzgsu() {
        super(2, zzgsw.class, "lockWithoutOwner", "lockWithoutOwner(Lkotlinx/coroutines/sync/Mutex;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(Object obj, Object obj2) {
        Object objM462d = ((C0315d) ((InterfaceC0312a) obj)).m462d((InterfaceC6348c) obj2);
        return objM462d == EnumC6363a.f24419s ? objM462d : C6289k.f24318a;
    }
}
