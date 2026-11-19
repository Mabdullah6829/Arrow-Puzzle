package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwv implements zzzf {

    /* JADX INFO: renamed from: s */
    public final zzgwt f21241s;

    /* JADX INFO: renamed from: t */
    public long f21242t;

    public zzwv(List list, List list2) {
        zzgzi zzgziVar = zzgwt.f18303t;
        zzgwq zzgwqVar = new zzgwq();
        zzgtr.m7128a(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgwqVar.m7203c(new zzwu((zzzf) list.get(i2), (List) list2.get(i2)));
        }
        this.f21241s = zzgwqVar.m7214f();
        this.f21242t = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* JADX INFO: renamed from: a */
    public final boolean mo9004a() {
        int i2 = 0;
        while (true) {
            zzgwt zzgwtVar = this.f21241s;
            if (i2 >= ((zzgyo) zzgwtVar).f18357v) {
                return false;
            }
            if (((zzwu) ((zzgyo) zzgwtVar).get(i2)).mo9004a()) {
                return true;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* JADX INFO: renamed from: b */
    public final void mo9005b(long j2) {
        int i2 = 0;
        while (true) {
            zzgwt zzgwtVar = this.f21241s;
            if (i2 >= ((zzgyo) zzgwtVar).f18357v) {
                return;
            }
            ((zzwu) ((zzgyo) zzgwtVar).get(i2)).mo9005b(j2);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* JADX INFO: renamed from: i */
    public final boolean mo9006i(zzmc zzmcVar) {
        boolean zMo9006i;
        boolean z = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            int i2 = 0;
            zMo9006i = false;
            while (true) {
                zzgyo zzgyoVar = (zzgyo) this.f21241s;
                if (i2 >= zzgyoVar.f18357v) {
                    break;
                }
                long jZzc2 = ((zzwu) zzgyoVar.get(i2)).f21239s.zzc();
                boolean z2 = jZzc2 != Long.MIN_VALUE && jZzc2 <= zzmcVar.f20363a;
                if (jZzc2 == jZzc || z2) {
                    zMo9006i |= ((zzwu) zzgyoVar.get(i2)).f21239s.mo9006i(zzmcVar);
                }
                i2++;
            }
            z |= zMo9006i;
        } while (zMo9006i);
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final long zzb() {
        int i2 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zzgwt zzgwtVar = this.f21241s;
            if (i2 >= ((zzgyo) zzgwtVar).f18357v) {
                break;
            }
            zzwu zzwuVar = (zzwu) ((zzgyo) zzgwtVar).get(i2);
            long jZzb = zzwuVar.zzb();
            zzgwt zzgwtVar2 = zzwuVar.f21240t;
            if ((zzgwtVar2.contains(1) || zzgwtVar2.contains(2) || zzgwtVar2.contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
            i2++;
        }
        if (jMin != LocationRequestCompat.PASSIVE_INTERVAL) {
            this.f21242t = jMin;
            return jMin;
        }
        if (jMin2 == LocationRequestCompat.PASSIVE_INTERVAL) {
            return Long.MIN_VALUE;
        }
        long j2 = this.f21242t;
        return j2 != -9223372036854775807L ? j2 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final long zzc() {
        int i2 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zzgwt zzgwtVar = this.f21241s;
            if (i2 >= ((zzgyo) zzgwtVar).f18357v) {
                break;
            }
            long jZzc = ((zzwu) ((zzgyo) zzgwtVar).get(i2)).zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
            i2++;
        }
        if (jMin == LocationRequestCompat.PASSIVE_INTERVAL) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
