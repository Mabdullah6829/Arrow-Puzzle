package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class zzaz implements Comparator {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzai f22255s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzg f22256t;

    public zzaz(zzai zzaiVar, zzg zzgVar) {
        this.f22255s = zzaiVar;
        this.f22256t = zzgVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzao zzaoVar = (zzao) obj;
        zzao zzaoVar2 = (zzao) obj2;
        if (zzaoVar instanceof zzat) {
            return !(zzaoVar2 instanceof zzat) ? 1 : 0;
        }
        if (zzaoVar2 instanceof zzat) {
            return -1;
        }
        zzai zzaiVar = this.f22255s;
        return zzaiVar == null ? zzaoVar.zzc().compareTo(zzaoVar2.zzc()) : (int) zzh.m10010h(zzaiVar.mo9793c(this.f22256t, Arrays.asList(zzaoVar, zzaoVar2)).mo9581d().doubleValue());
    }
}
