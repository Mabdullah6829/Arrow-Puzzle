package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzahn;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzy {
    final /* synthetic */ zzad zza;
    private String zzb;
    private boolean zzc;
    private com.google.android.gms.internal.measurement.zzii zzd;
    private BitSet zze;
    private BitSet zzf;
    private Map zzg;
    private Map zzh;

    public /* synthetic */ zzy(zzad zzadVar, String str, com.google.android.gms.internal.measurement.zzii zziiVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte[] bArr) {
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzb = str;
        this.zze = bitSet;
        this.zzf = bitSet2;
        this.zzg = map;
        this.zzh = new ArrayMap();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.zzh.put(num, arrayList);
        }
        this.zzc = false;
        this.zzd = zziiVar;
    }

    public final void zza(@NonNull zzab zzabVar) {
        int iZza = zzabVar.zza();
        if (zzabVar.zzd != null) {
            this.zzf.set(iZza, true);
        }
        Boolean bool = zzabVar.zze;
        if (bool != null) {
            this.zze.set(iZza, bool.booleanValue());
        }
        if (zzabVar.zzf != null) {
            Map map = this.zzg;
            Integer numValueOf = Integer.valueOf(iZza);
            Long l2 = (Long) map.get(numValueOf);
            long jLongValue = zzabVar.zzf.longValue() / 1000;
            if (l2 == null || jLongValue > l2.longValue()) {
                this.zzg.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (zzabVar.zzg != null) {
            Map map2 = this.zzh;
            Integer numValueOf2 = Integer.valueOf(iZza);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.zzh.put(numValueOf2, arrayList);
            }
            if (zzabVar.zzb()) {
                arrayList.clear();
            }
            zzahn.m9791a();
            zzic zzicVar = this.zza.zzu;
            zzal zzalVarZzc = zzicVar.zzc();
            String str = this.zzb;
            zzfx zzfxVar = zzfy.zzaF;
            if (zzalVarZzc.zzp(str, zzfxVar) && zzabVar.zzc()) {
                arrayList.clear();
            }
            zzahn.m9791a();
            if (!zzicVar.zzc().zzp(this.zzb, zzfxVar)) {
                arrayList.add(Long.valueOf(zzabVar.zzg.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(zzabVar.zzg.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    @NonNull
    public final com.google.android.gms.internal.measurement.zzhg zzb(int i2) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.zzhf zzhfVarM10075H = com.google.android.gms.internal.measurement.zzhg.m10075H();
        zzhfVarM10075H.m9552o();
        ((com.google.android.gms.internal.measurement.zzhg) zzhfVarM10075H.f22030t).m10083I(i2);
        boolean z = this.zzc;
        zzhfVarM10075H.m9552o();
        ((com.google.android.gms.internal.measurement.zzhg) zzhfVarM10075H.f22030t).m10086L(z);
        com.google.android.gms.internal.measurement.zzii zziiVar = this.zzd;
        if (zziiVar != null) {
            zzhfVarM10075H.m9552o();
            ((com.google.android.gms.internal.measurement.zzhg) zzhfVarM10075H.f22030t).m10085K(zziiVar);
        }
        com.google.android.gms.internal.measurement.zzih zzihVarM10382I = com.google.android.gms.internal.measurement.zzii.m10382I();
        List listZzp = zzpk.zzp(this.zze);
        zzihVarM10382I.m9552o();
        ((com.google.android.gms.internal.measurement.zzii) zzihVarM10382I.f22030t).m10394M(listZzp);
        List listZzp2 = zzpk.zzp(this.zzf);
        zzihVarM10382I.m9552o();
        ((com.google.android.gms.internal.measurement.zzii) zzihVarM10382I.f22030t).m10392K(listZzp2);
        Map map = this.zzg;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.zzg.keySet()) {
                int iIntValue = num.intValue();
                Long l2 = (Long) this.zzg.get(num);
                if (l2 != null) {
                    com.google.android.gms.internal.measurement.zzhp zzhpVarM10099E = com.google.android.gms.internal.measurement.zzhq.m10099E();
                    zzhpVarM10099E.m9552o();
                    ((com.google.android.gms.internal.measurement.zzhq) zzhpVarM10099E.f22030t).m10104F(iIntValue);
                    long jLongValue = l2.longValue();
                    zzhpVarM10099E.m9552o();
                    ((com.google.android.gms.internal.measurement.zzhq) zzhpVarM10099E.f22030t).m10105G(jLongValue);
                    arrayList2.add((com.google.android.gms.internal.measurement.zzhq) zzhpVarM10099E.m9555r());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzihVarM10382I.m9552o();
            ((com.google.android.gms.internal.measurement.zzii) zzihVarM10382I.f22030t).m10396O(arrayList);
        }
        Map map2 = this.zzh;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.zzh.keySet()) {
                com.google.android.gms.internal.measurement.zzij zzijVarM10400F = com.google.android.gms.internal.measurement.zzik.m10400F();
                int iIntValue2 = num2.intValue();
                zzijVarM10400F.m9552o();
                ((com.google.android.gms.internal.measurement.zzik) zzijVarM10400F.f22030t).m10406G(iIntValue2);
                List list2 = (List) this.zzh.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzijVarM10400F.m9552o();
                    ((com.google.android.gms.internal.measurement.zzik) zzijVarM10400F.f22030t).m10407H(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.zzik) zzijVarM10400F.m9555r());
            }
            list = arrayList3;
        }
        zzihVarM10382I.m9552o();
        ((com.google.android.gms.internal.measurement.zzii) zzihVarM10382I.f22030t).m10398Q(list);
        zzhfVarM10075H.m9552o();
        ((com.google.android.gms.internal.measurement.zzhg) zzhfVarM10075H.f22030t).m10084J((com.google.android.gms.internal.measurement.zzii) zzihVarM10382I.m9555r());
        return (com.google.android.gms.internal.measurement.zzhg) zzhfVarM10075H.m9555r();
    }

    public final /* synthetic */ BitSet zzc() {
        return this.zze;
    }

    public /* synthetic */ zzy(zzad zzadVar, String str, byte[] bArr) {
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzb = str;
        this.zzc = true;
        this.zze = new BitSet();
        this.zzf = new BitSet();
        this.zzg = new ArrayMap();
        this.zzh = new ArrayMap();
    }
}
