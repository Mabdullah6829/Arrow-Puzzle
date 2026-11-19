package com.google.android.gms.internal.measurement;

import java.util.Collections;
import p001B.InterfaceC0082h;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzpt implements InterfaceC0082h {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f22745s;

    public /* synthetic */ zzpt(String str) {
        this.f22745s = str;
    }

    @Override // p001B.InterfaceC0082h
    public final Object apply(Object obj) {
        zznu zznuVar = (zznu) obj;
        zzvb zzvbVar = zzpu.f22746a;
        zznr zznrVarM10564B = zznr.m10564B();
        String str = this.f22745s;
        zznq zznqVar = (zznq) zznuVar.m10569A(str, zznrVarM10564B).m9572r();
        if (!Collections.unmodifiableList(((zznr) zznqVar.f22030t).m10565A()).contains("")) {
            zznqVar.m9552o();
            ((zznr) zznqVar.f22030t).m10566C("");
        }
        zznt zzntVar = (zznt) zznuVar.m9572r();
        zznqVar.m9552o();
        ((zznr) zznqVar.f22030t).m10567D("");
        zznr zznrVar = (zznr) zznqVar.m9555r();
        zzntVar.m9552o();
        ((zznu) zzntVar.f22030t).m10570C().put(str, zznrVar);
        return (zznu) zzntVar.m9555r();
    }
}
