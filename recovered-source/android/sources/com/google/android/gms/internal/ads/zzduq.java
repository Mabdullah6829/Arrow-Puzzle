package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzduq extends zzbob {

    /* JADX INFO: renamed from: s */
    public final String f13011s;

    /* JADX INFO: renamed from: t */
    public final zzdpw f13012t;

    /* JADX INFO: renamed from: u */
    public final zzdqb f13013u;

    /* JADX INFO: renamed from: v */
    public final zzdzt f13014v;

    public zzduq(String str, zzdpw zzdpwVar, zzdqb zzdqbVar, zzdzt zzdztVar) {
        this.f13011s = str;
        this.f13012t = zzdpwVar;
        this.f13013u = zzdqbVar;
        this.f13014v = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: L */
    public final com.google.android.gms.ads.internal.client.zzdx mo5080L() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8095F7)).booleanValue()) {
            return this.f13012t.f11764f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: Q */
    public final void mo5081Q() {
        this.f13012t.m5989p();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: a */
    public final String mo5082a() {
        return this.f13013u.m5998a();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: b */
    public final List mo5083b() {
        List list;
        zzdqb zzdqbVar = this.f13013u;
        synchronized (zzdqbVar) {
            list = zzdqbVar.f12614e;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: c */
    public final String mo5084c() {
        return this.f13013u.m6000c();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: e */
    public final String mo5085e() {
        String strM6010p;
        zzdqb zzdqbVar = this.f13013u;
        synchronized (zzdqbVar) {
            strM6010p = zzdqbVar.m6010p(FirebaseAnalytics.Param.PRICE);
        }
        return strM6010p;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: f */
    public final zzbme mo5086f() {
        return this.f13013u.m6013s();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: g */
    public final com.google.android.gms.ads.internal.client.zzea mo5087g() {
        return this.f13013u.m6012r();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: k */
    public final IObjectWrapper mo5088k() {
        return new ObjectWrapper(this.f13012t);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6065k4(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        zzdpw zzdpwVar = this.f13012t;
        synchronized (zzdpwVar) {
            zzdpwVar.f12569n.mo5949b(zzdgVar);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final void m6066l4(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        zzdpw zzdpwVar = this.f13012t;
        synchronized (zzdpwVar) {
            zzdpwVar.f12569n.mo5954f(zzdcVar);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final void m6067m4(zzbnz zzbnzVar) {
        zzdpw zzdpwVar = this.f13012t;
        synchronized (zzdpwVar) {
            zzdpwVar.f12569n.mo5963o(zzbnzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: v */
    public final IObjectWrapper mo5089v() {
        IObjectWrapper iObjectWrapper;
        zzdqb zzdqbVar = this.f13013u;
        synchronized (zzdqbVar) {
            iObjectWrapper = zzdqbVar.f12626q;
        }
        return iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: w */
    public final zzbmi mo5090w() {
        zzbmi zzbmiVar;
        zzdpy zzdpyVar = this.f13012t.f12563F;
        synchronized (zzdpyVar) {
            zzbmiVar = zzdpyVar.f12601a;
        }
        return zzbmiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: x */
    public final List mo5091x() {
        List list;
        com.google.android.gms.ads.internal.client.zzew zzewVar;
        List list2;
        zzdqb zzdqbVar = this.f13013u;
        synchronized (zzdqbVar) {
            list = zzdqbVar.f12615f;
        }
        if (!list.isEmpty()) {
            synchronized (zzdqbVar) {
                zzewVar = zzdqbVar.f12616g;
            }
            if (zzewVar != null) {
                zzdqb zzdqbVar2 = this.f13013u;
                synchronized (zzdqbVar2) {
                    list2 = zzdqbVar2.f12615f;
                }
                return list2;
            }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: y2 */
    public final void mo5092y2(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8824we)).booleanValue()) {
            zzdpw zzdpwVar = this.f13012t;
            final zzclb zzclbVarM6005h = zzdpwVar.f12568m.m6005h();
            if (zzclbVarM6005h == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3070c("Video webview is null");
                return;
            }
            try {
                final JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.get(str));
                }
                zzdpwVar.f12567l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpt
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzgwt zzgwtVar = zzdpw.f12557J;
                        zzclbVarM6005h.mo5128a(jSONObject, "onVideoEvent");
                    }
                });
            } catch (JSONException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error reading event signals", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final zzbml zzh() {
        zzbml zzbmlVar;
        zzdqb zzdqbVar = this.f13013u;
        synchronized (zzdqbVar) {
            zzbmlVar = zzdqbVar.f12628s;
        }
        return zzbmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzi() {
        return this.f13013u.m6002e();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzj() {
        return this.f13013u.m6003f();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final double zzk() {
        double d;
        zzdqb zzdqbVar = this.f13013u;
        synchronized (zzdqbVar) {
            d = zzdqbVar.f12627r;
        }
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzl() {
        String strM6010p;
        zzdqb zzdqbVar = this.f13013u;
        synchronized (zzdqbVar) {
            strM6010p = zzdqbVar.m6010p("store");
        }
        return strM6010p;
    }
}
