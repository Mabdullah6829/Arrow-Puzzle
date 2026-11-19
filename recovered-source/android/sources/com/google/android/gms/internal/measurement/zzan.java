package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzan extends zzai implements zzak {

    /* JADX INFO: renamed from: u */
    public final ArrayList f22234u;

    /* JADX INFO: renamed from: v */
    public final ArrayList f22235v;

    /* JADX INFO: renamed from: w */
    public final zzg f22236w;

    public zzan(zzan zzanVar) {
        super(zzanVar.f22198s);
        ArrayList arrayList = new ArrayList(zzanVar.f22234u.size());
        this.f22234u = arrayList;
        arrayList.addAll(zzanVar.f22234u);
        ArrayList arrayList2 = new ArrayList(zzanVar.f22235v.size());
        this.f22235v = arrayList2;
        arrayList2.addAll(zzanVar.f22235v);
        this.f22236w = zzanVar.f22236w;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    /* JADX INFO: renamed from: c */
    public final zzao mo9793c(zzg zzgVar, List list) {
        zzat zzatVar;
        zzg zzgVarM9952c = this.f22236w.m9952c();
        zzaw zzawVar = zzgVarM9952c.f22494b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f22234u;
            int size = arrayList.size();
            zzatVar = zzao.f22237k;
            if (i3 >= size) {
                break;
            }
            if (i3 < list.size()) {
                zzgVarM9952c.m9955f((String) arrayList.get(i3), zzgVar.f22494b.m9808b(zzgVar, (zzao) list.get(i3)));
            } else {
                zzgVarM9952c.m9955f((String) arrayList.get(i3), zzatVar);
            }
            i3++;
        }
        ArrayList arrayList2 = this.f22235v;
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj = arrayList2.get(i2);
            i2++;
            zzao zzaoVar = (zzao) obj;
            zzao zzaoVarM9808b = zzawVar.m9808b(zzgVarM9952c, zzaoVar);
            if (zzaoVarM9808b instanceof zzap) {
                zzaoVarM9808b = zzawVar.m9808b(zzgVarM9952c, zzaoVar);
            }
            if (zzaoVarM9808b instanceof zzag) {
                return ((zzag) zzaoVarM9808b).f22119s;
            }
        }
        return zzatVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: r */
    public final zzao mo9588r() {
        return new zzan(this);
    }

    public zzan(String str, ArrayList arrayList, List list, zzg zzgVar) {
        super(str);
        this.f22234u = new ArrayList();
        this.f22236w = zzgVar;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                this.f22234u.add(((zzao) obj).zzc());
            }
        }
        this.f22235v = new ArrayList(list);
    }
}
