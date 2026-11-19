package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdzw implements zzfpt {

    /* JADX INFO: renamed from: t */
    public final zzdzo f13431t;

    /* JADX INFO: renamed from: u */
    public final Clock f13432u;

    /* JADX INFO: renamed from: s */
    public final HashMap f13430s = new HashMap();

    /* JADX INFO: renamed from: v */
    public final HashMap f13433v = new HashMap();

    public zzdzw(zzdzo zzdzoVar, Set set, Clock clock) {
        this.f13431t = zzdzoVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdzv zzdzvVar = (zzdzv) it.next();
            HashMap map = this.f13433v;
            zzdzvVar.getClass();
            map.put(zzfpm.RENDERER, zzdzvVar);
        }
        this.f13432u = clock;
    }

    /* JADX INFO: renamed from: a */
    public final void m6113a(zzfpm zzfpmVar, boolean z) {
        zzdzv zzdzvVar = (zzdzv) this.f13433v.get(zzfpmVar);
        if (zzdzvVar == null) {
            return;
        }
        String str = true != z ? "f." : "s.";
        zzfpm zzfpmVar2 = zzdzvVar.f13429b;
        HashMap map = this.f13430s;
        if (map.containsKey(zzfpmVar2)) {
            long jMo3639a = this.f13432u.mo3639a() - ((Long) map.get(zzfpmVar2)).longValue();
            String str2 = zzdzvVar.f13428a;
            ConcurrentHashMap concurrentHashMap = this.f13431t.f13407a;
            StringBuilder sb = new StringBuilder(String.valueOf(jMo3639a).length() + 2);
            sb.append(str);
            sb.append(jMo3639a);
            concurrentHashMap.put("label.".concat(str2), sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    /* JADX INFO: renamed from: e */
    public final void mo6090e(zzfpm zzfpmVar, String str) {
        HashMap map = this.f13430s;
        if (map.containsKey(zzfpmVar)) {
            long jMo3639a = this.f13432u.mo3639a() - ((Long) map.get(zzfpmVar)).longValue();
            this.f13431t.f13407a.put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jMo3639a))));
        }
        if (this.f13433v.containsKey(zzfpmVar)) {
            m6113a(zzfpmVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    /* JADX INFO: renamed from: r */
    public final void mo6092r(zzfpm zzfpmVar, String str) {
        this.f13430s.put(zzfpmVar, Long.valueOf(this.f13432u.mo3639a()));
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    /* JADX INFO: renamed from: t */
    public final void mo6093t(zzfpm zzfpmVar, String str, Throwable th) {
        HashMap map = this.f13430s;
        if (map.containsKey(zzfpmVar)) {
            long jMo3639a = this.f13432u.mo3639a() - ((Long) map.get(zzfpmVar)).longValue();
            this.f13431t.f13407a.put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jMo3639a))));
        }
        if (this.f13433v.containsKey(zzfpmVar)) {
            m6113a(zzfpmVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    /* JADX INFO: renamed from: g */
    public final void mo6091g(String str) {
    }
}
