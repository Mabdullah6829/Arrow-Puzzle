package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepl {

    /* JADX INFO: renamed from: a */
    public final Clock f14534a;

    /* JADX INFO: renamed from: b */
    public final zzepn f14535b;

    /* JADX INFO: renamed from: c */
    public final zzfsm f14536c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f14537d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public final boolean f14538e = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8180K7)).booleanValue();

    /* JADX INFO: renamed from: f */
    public final zzemf f14539f;

    /* JADX INFO: renamed from: g */
    public boolean f14540g;

    /* JADX INFO: renamed from: h */
    public long f14541h;

    /* JADX INFO: renamed from: i */
    public long f14542i;

    public zzepl(Clock clock, zzepn zzepnVar, zzemf zzemfVar, zzfsm zzfsmVar) {
        this.f14534a = clock;
        this.f14535b = zzepnVar;
        this.f14539f = zzemfVar;
        this.f14536c = zzfsmVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6307a(List list) {
        this.f14542i = this.f14534a.mo3639a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfkn zzfknVar = (zzfkn) it.next();
            String str = zzfknVar.f15960w;
            if (!TextUtils.isEmpty(str)) {
                this.f14537d.put(zzfknVar, new zzepk(str, zzfknVar.f15927f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6308b(zzfky zzfkyVar, zzfkn zzfknVar, ListenableFuture listenableFuture, zzfsi zzfsiVar) {
        zzfkq zzfkqVar = zzfkyVar.f16006b.f16002b;
        long jMo3639a = this.f14534a.mo3639a();
        String str = zzfknVar.f15960w;
        if (str != null) {
            this.f14537d.put(zzfknVar, new zzepk(str, zzfknVar.f15927f0, 9, 0L, null));
            zzepj zzepjVar = new zzepj(this, jMo3639a, zzfkqVar, zzfknVar, str, zzfsiVar, zzfkyVar);
            listenableFuture.addListener(new zzhcd(listenableFuture, zzepjVar), zzcfy.f9953h);
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6309c(zzfkn zzfknVar) {
        zzepk zzepkVar = (zzepk) this.f14537d.get(zzfknVar);
        if (zzepkVar == null || this.f14540g) {
            return;
        }
        zzepkVar.f14531c = 8;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized String m6310d() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f14537d.entrySet().iterator();
            while (it.hasNext()) {
                zzepk zzepkVar = (zzepk) ((Map.Entry) it.next()).getValue();
                if (zzepkVar.f14531c != Integer.MAX_VALUE) {
                    arrayList.add(zzepkVar.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }
}
