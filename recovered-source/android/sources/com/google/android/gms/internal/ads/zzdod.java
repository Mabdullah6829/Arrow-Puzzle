package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzdod implements zzcyd {

    /* JADX INFO: renamed from: a */
    public final Map f12424a;

    /* JADX INFO: renamed from: b */
    public final Map f12425b;

    /* JADX INFO: renamed from: c */
    public final Map f12426c;

    /* JADX INFO: renamed from: d */
    public final zzino f12427d;

    /* JADX INFO: renamed from: e */
    public final zzdql f12428e;

    public zzdod(Map map, Map map2, Map map3, zzino zzinoVar, zzdql zzdqlVar) {
        this.f12424a = map;
        this.f12425b = map2;
        this.f12426c = map3;
        this.f12427d = zzinoVar;
        this.f12428e = zzdqlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    /* JADX INFO: renamed from: a */
    public final zzema mo5870a(int i2, String str) {
        zzema zzemaVarMo5870a;
        zzema zzemaVar = (zzema) this.f12424a.get(str);
        if (zzemaVar != null) {
            return zzemaVar;
        }
        if (i2 != 1) {
            if (i2 != 4) {
                return null;
            }
            zzeog zzeogVar = (zzeog) this.f12426c.get(str);
            if (zzeogVar != null) {
                return new zzemb(zzeogVar, new zzgti() { // from class: com.google.android.gms.internal.ads.zzcyh
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj) {
                        return new zzcyi((List) obj);
                    }
                });
            }
            zzemaVarMo5870a = (zzema) this.f12425b.get(str);
            if (zzemaVarMo5870a == null) {
                return null;
            }
        } else if (this.f12428e.f12657d == null || (zzemaVarMo5870a = ((zzcyd) this.f12427d.zzb()).mo5870a(i2, str)) == null) {
            return null;
        }
        return new zzemb(zzemaVarMo5870a, new zzgti() { // from class: com.google.android.gms.internal.ads.zzcyg
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return new zzcyi((zzcya) obj);
            }
        });
    }
}
