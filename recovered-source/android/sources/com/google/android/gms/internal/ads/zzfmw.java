package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import androidx.core.location.LocationRequestCompat;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzfmw implements zzfmv {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f16126a;

    /* JADX INFO: renamed from: b */
    public final zzfnc f16127b;

    /* JADX INFO: renamed from: c */
    public final zzfmy f16128c = new zzfmy();

    public zzfmw(zzfnc zzfncVar) {
        this.f16126a = new ConcurrentHashMap(zzfncVar.f16151w);
        this.f16127b = zzfncVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m6540a(zzfnf zzfnfVar, zzfne zzfneVar) {
        boolean z;
        try {
            ConcurrentHashMap concurrentHashMap = this.f16126a;
            zzfmu zzfmuVar = (zzfmu) concurrentHashMap.get(zzfnfVar);
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            zzfneVar.f16158d = System.currentTimeMillis();
            if (zzfmuVar == null) {
                zzfnc zzfncVar = this.f16127b;
                zzfmu zzfmuVar2 = new zzfmu(zzfncVar.f16151w, zzfncVar.f16152x * 1000);
                if (concurrentHashMap.size() == zzfncVar.f16150v) {
                    int i2 = zzfncVar.f16146B;
                    int i3 = i2 - 1;
                    zzfnf zzfnfVar2 = null;
                    if (i2 == 0) {
                        throw null;
                    }
                    long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
                    if (i3 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((zzfmu) entry.getValue()).f16125d.f16177a < j2) {
                                j2 = ((zzfmu) entry.getValue()).f16125d.f16177a;
                                zzfnfVar2 = (zzfnf) entry.getKey();
                            }
                        }
                        if (zzfnfVar2 != null) {
                            concurrentHashMap.remove(zzfnfVar2);
                        }
                    } else if (i3 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((zzfmu) entry2.getValue()).f16125d.f16179c < j2) {
                                j2 = ((zzfmu) entry2.getValue()).f16125d.f16179c;
                                zzfnfVar2 = (zzfnf) entry2.getKey();
                            }
                        }
                        if (zzfnfVar2 != null) {
                            concurrentHashMap.remove(zzfnfVar2);
                        }
                    } else if (i3 == 2) {
                        int i4 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((zzfmu) entry3.getValue()).f16125d.f16180d < i4) {
                                i4 = ((zzfmu) entry3.getValue()).f16125d.f16180d;
                                zzfnfVar2 = (zzfnf) entry3.getKey();
                            }
                        }
                        if (zzfnfVar2 != null) {
                            concurrentHashMap.remove(zzfnfVar2);
                        }
                    }
                    zzfmy zzfmyVar = this.f16128c;
                    zzfmyVar.f16133c++;
                    zzfmyVar.f16131a.f16130t = true;
                }
                concurrentHashMap.put(zzfnfVar, zzfmuVar2);
                zzfmy zzfmyVar2 = this.f16128c;
                zzfmyVar2.f16132b++;
                zzfmyVar2.f16131a.f16129s = true;
                zzfmuVar = zzfmuVar2;
            }
            zzfnt zzfntVar = zzfmuVar.f16125d;
            zzfntVar.getClass();
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            zzfntVar.f16179c = System.currentTimeMillis();
            zzfntVar.f16180d++;
            zzfmuVar.m6539a();
            LinkedList linkedList = zzfmuVar.f16122a;
            if (linkedList.size() == zzfmuVar.f16123b) {
                z = false;
            } else {
                linkedList.add(zzfneVar);
                z = true;
            }
            zzfmy zzfmyVar3 = this.f16128c;
            zzfmyVar3.f16136f++;
            zzfmx zzfmxVar = zzfmyVar3.f16131a;
            zzfmx zzfmxVarClone = zzfmxVar.clone();
            zzfmxVar.f16129s = false;
            zzfmxVar.f16130t = false;
            zzfns zzfnsVar = zzfmuVar.f16125d.f16178b;
            zzfns zzfnsVarClone = zzfnsVar.clone();
            zzfnsVar.f16175s = false;
            zzfnsVar.f16176t = 0;
            zzbic.zzb.zzc zzcVarM4952E = zzbic.zzb.m4952E();
            zzbic.zzb.zza.C6589zza c6589zzaM4955F = zzbic.zzb.zza.m4955F();
            zzbic.zzb.zzd zzdVar = zzbic.zzb.zzd.UNSPECIFIED;
            c6589zzaM4955F.getClass();
            c6589zzaM4955F.m8326l();
            ((zzbic.zzb.zza) c6589zzaM4955F.f19780t).m4957G();
            zzbic.zzb.zzg.zza zzaVarM4965F = zzbic.zzb.zzg.m4965F();
            boolean z2 = zzfmxVarClone.f16129s;
            zzaVarM4965F.m8326l();
            ((zzbic.zzb.zzg) zzaVarM4965F.f19780t).m4967G(z2);
            boolean z3 = zzfmxVarClone.f16130t;
            zzaVarM4965F.m8326l();
            ((zzbic.zzb.zzg) zzaVarM4965F.f19780t).m4968H(z3);
            int i5 = zzfnsVarClone.f16176t;
            zzaVarM4965F.m8326l();
            ((zzbic.zzb.zzg) zzaVarM4965F.f19780t).m4966D(i5);
            c6589zzaM4955F.m8326l();
            ((zzbic.zzb.zza) c6589zzaM4955F.f19780t).m4956D((zzbic.zzb.zzg) zzaVarM4965F.m8328o());
            zzcVarM4952E.m8326l();
            ((zzbic.zzb) zzcVarM4952E.f19780t).m4953F((zzbic.zzb.zza) c6589zzaM4955F.m8328o());
            zzfneVar.f16155a.zza().f11813f.mo5879X((zzbic.zzb) zzcVarM4952E.m8328o());
            m6541b();
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final void m6541b() {
        Parcelable.Creator<zzfnc> creator = zzfnc.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8613k7)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzfnc zzfncVar = this.f16127b;
            sb.append(zzfncVar.f16149u);
            sb.append(" PoolCollection");
            StringBuilder sb2 = new StringBuilder("\n\tPool does not exist: ");
            zzfmy zzfmyVar = this.f16128c;
            sb2.append(zzfmyVar.f16134d);
            sb2.append("\n\tNew pools created: ");
            sb2.append(zzfmyVar.f16132b);
            sb2.append("\n\tPools removed: ");
            sb2.append(zzfmyVar.f16133c);
            sb2.append("\n\tEntries added: ");
            sb2.append(zzfmyVar.f16136f);
            sb2.append("\n\tNo entries retrieved: ");
            sb2.append(zzfmyVar.f16135e);
            sb2.append("\n");
            sb.append(sb2.toString());
            int i2 = 0;
            for (Map.Entry entry : this.f16126a.entrySet()) {
                i2++;
                sb.append(i2);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfnf) entry.getKey()).hashCode());
                sb.append("    ");
                int i3 = 0;
                while (true) {
                    zzfmu zzfmuVar = (zzfmu) entry.getValue();
                    zzfmuVar.m6539a();
                    if (i3 >= zzfmuVar.f16122a.size()) {
                        break;
                    }
                    sb.append("[O]");
                    i3++;
                }
                zzfmu zzfmuVar2 = (zzfmu) entry.getValue();
                zzfmuVar2.m6539a();
                for (int size = zzfmuVar2.f16122a.size(); size < zzfncVar.f16151w; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                zzfnt zzfntVar = ((zzfmu) entry.getValue()).f16125d;
                sb.append("Created: " + zzfntVar.f16177a + " Last accessed: " + zzfntVar.f16179c + " Accesses: " + zzfntVar.f16180d + "\nEntries retrieved: Valid: " + zzfntVar.f16181e + " Stale: " + zzfntVar.f16182f);
                sb.append("\n");
            }
            while (i2 < zzfncVar.f16150v) {
                i2++;
                sb.append(i2);
                sb.append(".\n");
            }
            String string = sb.toString();
            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a(string);
        }
    }
}
