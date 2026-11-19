package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzs extends zzai {

    /* JADX INFO: renamed from: u */
    public final boolean f22853u;

    /* JADX INFO: renamed from: v */
    public final boolean f22854v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzt f22855w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z, boolean z2) {
        super("log");
        this.f22855w = zztVar;
        this.f22853u = z;
        this.f22854v = z2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095 A[LOOP:0: B:23:0x008b->B:25:0x0095, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.zzai
    /* JADX INFO: renamed from: c */
    public final zzao mo9793c(zzg zzgVar, List list) {
        int i2;
        int i3;
        String strZzc;
        ArrayList arrayList;
        zzh.m10004b("log", 1, list);
        int size = list.size();
        zzat zzatVar = zzao.f22237k;
        zzt zztVar = this.f22855w;
        if (size == 1) {
            zztVar.f22876u.zza(3, zzgVar.f22494b.m9808b(zzgVar, (zzao) list.get(0)).zzc(), Collections.EMPTY_LIST, this.f22853u, this.f22854v);
            return zzatVar;
        }
        zzao zzaoVar = (zzao) list.get(0);
        zzaw zzawVar = zzgVar.f22494b;
        zzaw zzawVar2 = zzgVar.f22494b;
        int iM10009g = zzh.m10009g(zzawVar.m9808b(zzgVar, zzaoVar).mo9581d().doubleValue());
        if (iM10009g != 2) {
            i2 = 3;
            if (iM10009g == 3) {
                i3 = 1;
            } else if (iM10009g == 5) {
                i3 = 5;
            } else if (iM10009g == 6) {
                i3 = 2;
            }
            strZzc = zzawVar2.m9808b(zzgVar, (zzao) list.get(1)).zzc();
            if (list.size() == 2) {
                zztVar.f22876u.zza(i3, strZzc, Collections.EMPTY_LIST, this.f22853u, this.f22854v);
                return zzatVar;
            }
            arrayList = new ArrayList();
            for (int i4 = 2; i4 < Math.min(list.size(), 5); i4++) {
                arrayList.add(zzawVar2.m9808b(zzgVar, (zzao) list.get(i4)).zzc());
            }
            zztVar.f22876u.zza(i3, strZzc, arrayList, this.f22853u, this.f22854v);
            return zzatVar;
        }
        i2 = 4;
        i3 = i2;
        strZzc = zzawVar2.m9808b(zzgVar, (zzao) list.get(1)).zzc();
        if (list.size() == 2) {
            zztVar.f22876u.zza(i3, strZzc, Collections.EMPTY_LIST, this.f22853u, this.f22854v);
            return zzatVar;
        }
        arrayList = new ArrayList();
        while (i4 < Math.min(list.size(), 5)) {
            arrayList.add(zzawVar2.m9808b(zzgVar, (zzao) list.get(i4)).zzc());
        }
        zztVar.f22876u.zza(i3, strZzc, arrayList, this.f22853u, this.f22854v);
        return zzatVar;
    }
}
