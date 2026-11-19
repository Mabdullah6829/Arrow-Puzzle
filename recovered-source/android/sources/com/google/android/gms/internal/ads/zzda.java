package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzda {

    /* JADX INFO: renamed from: a */
    public static final zzgyn f11856a;

    static {
        zzgyl zzgylVar = zzgyl.f18354s;
        zzcz zzczVar = new zzgti() { // from class: com.google.android.gms.internal.ads.zzcz
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzgyn zzgynVar = zzda.f11856a;
                return Integer.valueOf(((zzcy) obj).f11758p);
            }
        };
        zzgylVar.getClass();
        f11856a = new zzgvo(zzczVar, zzgylVar);
        zzgzi zzgziVar = zzgwt.f18303t;
        new zzda(zzgyo.f18355w);
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzda(List list) {
        zzgzi zzgziVar = zzgwt.f18303t;
        Object[] array = (list == null ? zzgxt.m7250a(((zzgwt) list).listIterator(0)) : list).toArray();
        int length = array.length;
        zzgym.m7263a(length, array);
        Arrays.sort(array, f11856a);
        zzgwt.m7222v(length, array);
    }
}
