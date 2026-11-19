package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabj extends zzabh {

    /* JADX INFO: renamed from: d */
    public static final Map f21915d;

    /* JADX INFO: renamed from: c */
    public final zzyz f21916c;

    static {
        EnumMap enumMap = new EnumMap(zzyz.class);
        for (zzyz zzyzVar : zzyz.values()) {
            zzabj[] zzabjVarArr = new zzabj[10];
            for (int i2 = 0; i2 < 10; i2++) {
                zzabjVarArr[i2] = new zzabj(i2, zzyzVar, zzza.f23132e);
            }
            enumMap.put(zzyzVar, zzabjVarArr);
        }
        f21915d = Collections.unmodifiableMap(enumMap);
    }

    public zzabj(int i2, zzyz zzyzVar, zzza zzzaVar) {
        super(zzzaVar, i2);
        zzabr.m9334a(zzyzVar, "format char");
        this.f21916c = zzyzVar;
        if (zzzaVar.m10740a()) {
            return;
        }
        int i3 = zzyzVar.f23125s;
        i3 = zzzaVar.m10742c() ? i3 & 65503 : i3;
        StringBuilder sb = new StringBuilder("%");
        zzzaVar.m10743d(sb);
        sb.append((char) i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    /* JADX INFO: renamed from: a */
    public final void mo9326a(zzyy zzyyVar, Object obj) {
        zzyyVar.m10737a(obj, this.f21916c, this.f21914b);
    }
}
