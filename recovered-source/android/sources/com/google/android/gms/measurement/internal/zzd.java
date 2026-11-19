package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd extends zzf {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzd(zzic zzicVar) {
        super(zzicVar);
        this.zzb = new ArrayMap();
        this.zza = new ArrayMap();
    }

    @WorkerThread
    private final void zzh(long j2, zzlu zzluVar) {
        if (zzluVar == null) {
            this.zzu.zzaW().zzk().zza("Not logging ad exposure. No active activity");
            return;
        }
        if (j2 < 1000) {
            this.zzu.zzaW().zzk().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j2);
        zzpp.zzay(zzluVar, bundle, true);
        this.zzu.zzj().zzE("am", "_xa", bundle);
    }

    @WorkerThread
    private final void zzi(String str, long j2, zzlu zzluVar) {
        if (zzluVar == null) {
            this.zzu.zzaW().zzk().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j2 < 1000) {
            this.zzu.zzaW().zzk().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j2);
        zzpp.zzay(zzluVar, bundle, true);
        this.zzu.zzj().zzE("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final void zzf(long j2) {
        Map map = this.zza;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j2));
        }
        if (map.isEmpty()) {
            return;
        }
        this.zzc = j2;
    }

    public final void zza(String str, long j2) {
        if (str == null || str.length() == 0) {
            AbstractC1456a.m2452s(this.zzu, "Ad unit id must be a non-empty string");
        } else {
            this.zzu.zzaX().zzj(new zza(this, str, j2));
        }
    }

    public final void zzb(String str, long j2) {
        if (str == null || str.length() == 0) {
            AbstractC1456a.m2452s(this.zzu, "Ad unit id must be a non-empty string");
        } else {
            this.zzu.zzaX().zzj(new zzb(this, str, j2));
        }
    }

    @WorkerThread
    public final void zzc(long j2) {
        zzlu zzluVarZzh = this.zzu.zzs().zzh(false);
        Map map = this.zza;
        for (String str : map.keySet()) {
            zzi(str, j2 - ((Long) map.get(str)).longValue(), zzluVarZzh);
        }
        if (!map.isEmpty()) {
            zzh(j2 - this.zzc, zzluVarZzh);
        }
        zzf(j2);
    }

    public final /* synthetic */ void zzd(String str, long j2) {
        zzg();
        Preconditions.m3541e(str);
        Map map = this.zzb;
        if (map.isEmpty()) {
            this.zzc = j2;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            AbstractC1456a.m2459z(this.zzu, "Too many ads visible");
        } else {
            map.put(str, 1);
            this.zza.put(str, Long.valueOf(j2));
        }
    }

    public final /* synthetic */ void zze(String str, long j2) {
        zzg();
        Preconditions.m3541e(str);
        Map map = this.zzb;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            this.zzu.zzaW().zzb().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzlu zzluVarZzh = this.zzu.zzs().zzh(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            map.put(str, Integer.valueOf(iIntValue));
            return;
        }
        map.remove(str);
        Map map2 = this.zza;
        Long l2 = (Long) map2.get(str);
        if (l2 == null) {
            AbstractC1456a.m2452s(this.zzu, "First ad unit exposure time was never set");
        } else {
            long jLongValue = j2 - l2.longValue();
            map2.remove(str);
            zzi(str, jLongValue, zzluVarZzh);
        }
        if (map.isEmpty()) {
            long j3 = this.zzc;
            if (j3 == 0) {
                AbstractC1456a.m2452s(this.zzu, "First ad exposure time was never set");
            } else {
                zzh(j2 - j3, zzluVarZzh);
                this.zzc = 0L;
            }
        }
    }
}
