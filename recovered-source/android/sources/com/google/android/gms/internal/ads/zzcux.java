package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcux implements zzbex {

    /* JADX INFO: renamed from: s */
    public zzclb f11525s;

    /* JADX INFO: renamed from: t */
    public final Executor f11526t;

    /* JADX INFO: renamed from: u */
    public final zzcuj f11527u;

    /* JADX INFO: renamed from: v */
    public final Clock f11528v;

    /* JADX INFO: renamed from: w */
    public boolean f11529w = false;

    /* JADX INFO: renamed from: x */
    public boolean f11530x = false;

    /* JADX INFO: renamed from: y */
    public final zzcum f11531y = new zzcum();

    public zzcux(Executor executor, zzcuj zzcujVar, Clock clock) {
        this.f11526t = executor;
        this.f11527u = zzcujVar;
        this.f11528v = clock;
    }

    /* JADX INFO: renamed from: a */
    public final void m5842a() {
        try {
            final JSONObject jSONObjectMo5147a = this.f11527u.mo5147a(this.f11531y);
            if (this.f11525s != null) {
                this.f11526t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuw
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        JSONObject jSONObject = jSONObjectMo5147a;
                        String string = jSONObject.toString();
                        String strM2450q = AbstractC1456a.m2450q(new StringBuilder(string.length() + 31), "Calling AFMA_updateActiveView(", string, ")");
                        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3068a(strM2450q);
                        this.f11523s.f11525s.mo5131j(jSONObject, "AFMA_updateActiveView");
                    }
                });
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.m3151l("Failed to call video active view js", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    /* JADX INFO: renamed from: t */
    public final void mo4826t(zzbew zzbewVar) {
        boolean z = this.f11530x ? false : zzbewVar.f7707j;
        zzcum zzcumVar = this.f11531y;
        zzcumVar.f11489a = z;
        zzcumVar.f11491c = this.f11528v.mo3639a();
        zzcumVar.f11493e = zzbewVar;
        if (this.f11529w) {
            m5842a();
        }
    }
}
