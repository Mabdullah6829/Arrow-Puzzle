package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfpb {

    /* JADX INFO: renamed from: a */
    public final zzfpm f16225a;

    /* JADX INFO: renamed from: b */
    public final List f16226b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzfpk f16227c;

    public /* synthetic */ zzfpb(zzfpk zzfpkVar, zzfpm zzfpmVar, List list) {
        this.f16227c = zzfpkVar;
        this.f16225a = zzfpmVar;
        this.f16226b = list;
    }

    /* JADX INFO: renamed from: a */
    public final zzfpj m6551a(Callable callable) {
        zzgzi zzgziVar = zzgwt.f18303t;
        List list = this.f16226b;
        list.getClass();
        zzhce zzhceVar = new zzhce(zzgwt.m7220t(list), true);
        ListenableFuture listenableFutureM7366a = zzhceVar.m7366a(zzcfy.f9953h, new Callable() { // from class: com.google.android.gms.internal.ads.zzfpa
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return null;
            }
        });
        zzfpk zzfpkVar = this.f16227c;
        return new zzfpj(zzfpkVar, this.f16225a, null, listenableFutureM7366a, list, zzhceVar.m7366a(zzfpkVar.f16242a, callable));
    }
}
