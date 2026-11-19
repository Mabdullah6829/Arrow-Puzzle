package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdro {

    /* JADX INFO: renamed from: a */
    public final zzdwq f12739a;

    /* JADX INFO: renamed from: b */
    public final zzdvf f12740b;

    /* JADX INFO: renamed from: c */
    public final zzcux f12741c;

    /* JADX INFO: renamed from: d */
    public final zzdov f12742d;

    public zzdro(zzdwq zzdwqVar, zzdvf zzdvfVar, zzcux zzcuxVar, zzdov zzdovVar) {
        this.f12739a = zzdwqVar;
        this.f12740b = zzdvfVar;
        this.f12741c = zzcuxVar;
        this.f12742d = zzdovVar;
    }

    /* JADX INFO: renamed from: a */
    public final View m6040a() throws zzclq {
        zzclb zzclbVarM6077a = this.f12739a.m6077a(com.google.android.gms.ads.internal.client.zzr.m2981w(), null, null);
        zzclbVarM6077a.mo5577H().setVisibility(8);
        zzclbVarM6077a.mo5616v0("/sendMessageToSdk", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrn
            @Override // com.google.android.gms.internal.ads.zzbpx
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo5095a(Object obj, Map map) {
                this.f12738a.f12740b.m6071d(map);
            }
        });
        zzclbVarM6077a.mo5616v0("/adMuted", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdri
            @Override // com.google.android.gms.internal.ads.zzbpx
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo5095a(Object obj, Map map) {
                this.f12732a.f12742d.m5974z();
            }
        });
        WeakReference weakReference = new WeakReference(zzclbVarM6077a);
        zzbpx zzbpxVar = new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrj
            @Override // com.google.android.gms.internal.ads.zzbpx
            /* JADX INFO: renamed from: a */
            public final void mo5095a(Object obj, final Map map) {
                zzclb zzclbVar = (zzclb) obj;
                zzclm zzclmVarMo5582K = zzclbVar.mo5582K();
                final zzdro zzdroVar = this.f12733a;
                zzclmVarMo5582K.f10450y = new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdrm
                    @Override // com.google.android.gms.internal.ads.zzcmx
                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ void mo3001a(int i2, String str, String str2, boolean z) {
                        HashMap map2 = new HashMap();
                        map2.put("messageType", "htmlLoaded");
                        map2.put("id", (String) map.get("id"));
                        zzdroVar.f12740b.m6071d(map2);
                    }
                };
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzclbVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzclbVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        };
        zzdvf zzdvfVar = this.f12740b;
        zzdvfVar.m6069b("/loadHtml", new zzdve(zzdvfVar, weakReference, "/loadHtml", zzbpxVar));
        zzdvfVar.m6069b("/showOverlay", new zzdve(zzdvfVar, new WeakReference(zzclbVarM6077a), "/showOverlay", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrk
            @Override // com.google.android.gms.internal.ads.zzbpx
            /* JADX INFO: renamed from: a */
            public final void mo5095a(Object obj, Map map) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3072e("Showing native ads overlay.");
                ((zzclb) obj).mo5577H().setVisibility(0);
                this.f12734a.f12741c.f11530x = true;
            }
        }));
        zzdvfVar.m6069b("/hideOverlay", new zzdve(zzdvfVar, new WeakReference(zzclbVarM6077a), "/hideOverlay", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrl
            @Override // com.google.android.gms.internal.ads.zzbpx
            /* JADX INFO: renamed from: a */
            public final void mo5095a(Object obj, Map map) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3072e("Hiding native ads overlay.");
                ((zzclb) obj).mo5577H().setVisibility(8);
                this.f12735a.f12741c.f11530x = false;
            }
        }));
        return zzclbVarM6077a.mo5577H();
    }
}
