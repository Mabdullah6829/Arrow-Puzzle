package com.google.android.gms.internal.measurement;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabg extends zzabh {

    /* JADX INFO: renamed from: c */
    public final zzabf f21912c;

    public zzabg(zzza zzzaVar, int i2, zzabf zzabfVar) {
        super(zzzaVar, i2);
        this.f21912c = zzabfVar;
        StringBuilder sb = new StringBuilder("%");
        zzzaVar.m10743d(sb);
        sb.append(true != zzzaVar.m10742c() ? 't' : 'T');
        sb.append(zzabfVar.f21911s);
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    /* JADX INFO: renamed from: a */
    public final void mo9326a(zzyy zzyyVar, Object obj) {
        StringBuilder sb = zzyyVar.f23120e;
        boolean z = obj instanceof Date;
        zzabf zzabfVar = this.f21912c;
        if (!z && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            char c = zzabfVar.f21911s;
            StringBuilder sb2 = new StringBuilder(String.valueOf(c).length() + 2);
            sb2.append("%t");
            sb2.append(c);
            zzyy.m10736b(sb, obj, sb2.toString());
            return;
        }
        StringBuilder sb3 = new StringBuilder("%");
        zzza zzzaVar = this.f21914b;
        zzzaVar.m10743d(sb3);
        sb3.append(true != zzzaVar.m10742c() ? 't' : 'T');
        sb3.append(zzabfVar.f21911s);
        sb.append(String.format(zzzh.f23146a, sb3.toString(), obj));
    }
}
