package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcxn implements zzden, zzddt {

    /* JADX INFO: renamed from: s */
    public final Context f11683s;

    /* JADX INFO: renamed from: t */
    public final zzclb f11684t;

    /* JADX INFO: renamed from: u */
    public final zzfkn f11685u;

    /* JADX INFO: renamed from: v */
    public final VersionInfoParcel f11686v;

    /* JADX INFO: renamed from: w */
    public zzelv f11687w;

    /* JADX INFO: renamed from: x */
    public boolean f11688x;

    /* JADX INFO: renamed from: y */
    public final zzelt f11689y;

    public zzcxn(Context context, zzclb zzclbVar, zzfkn zzfknVar, VersionInfoParcel versionInfoParcel, zzelt zzeltVar) {
        this.f11683s = context;
        this.f11684t = zzclbVar;
        this.f11685u = zzfknVar;
        this.f11686v = versionInfoParcel;
        this.f11689y = zzeltVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5863a() {
        zzclb zzclbVar;
        zzels zzelsVar;
        zzelr zzelrVar;
        try {
            zzfkn zzfknVar = this.f11685u;
            if (zzfknVar.f15909T && (zzclbVar = this.f11684t) != null) {
                Context context = this.f11683s;
                com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
                if (zztVar.f3724x.m6274a(context)) {
                    VersionInfoParcel versionInfoParcel = this.f11686v;
                    int i2 = versionInfoParcel.f3397t;
                    int i3 = versionInfoParcel.f3398u;
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(i3).length());
                    sb.append(i2);
                    sb.append(".");
                    sb.append(i3);
                    String string = sb.toString();
                    zzflj zzfljVar = zzfknVar.f15911V;
                    String str = zzfljVar.m6487a() + (-1) != 1 ? "javascript" : null;
                    if (zzfljVar.m6487a() == 1) {
                        zzelrVar = zzelr.VIDEO;
                        zzelsVar = zzels.DEFINED_BY_JAVASCRIPT;
                    } else {
                        int i4 = zzfknVar.f15924e;
                        zzelr zzelrVar2 = zzelr.HTML_DISPLAY;
                        zzelsVar = i4 == 1 ? zzels.ONE_PIXEL : zzels.BEGIN_TO_RENDER;
                        zzelrVar = zzelrVar2;
                    }
                    zzelv zzelvVarM6275b = zztVar.f3724x.m6275b(zzclbVar.mo5620y(), zzelrVar, zzelsVar, string, str, zzfknVar.f15939l0);
                    this.f11687w = zzelvVarM6275b;
                    if (zzelvVarM6275b != null) {
                        zzfuy zzfuyVar = zzelvVarM6275b.f14182a;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8595j6)).booleanValue()) {
                            zztVar.f3724x.m6278e(zzfuyVar, zzclbVar.mo5620y());
                            ArrayList arrayListMo5617w = zzclbVar.mo5617w();
                            int size = arrayListMo5617w.size();
                            int i5 = 0;
                            while (i5 < size) {
                                Object obj = arrayListMo5617w.get(i5);
                                i5++;
                                com.google.android.gms.ads.internal.zzt.f3698C.f3724x.m6277d(zzfuyVar, (View) obj);
                            }
                        } else {
                            zztVar.f3724x.m6278e(zzfuyVar, zzclbVar.mo5577H());
                        }
                        zzclbVar.mo5601g0(this.f11687w);
                        com.google.android.gms.ads.internal.zzt.f3698C.f3724x.m6276c(zzfuyVar);
                        this.f11688x = true;
                        zzclbVar.mo5129b("onSdkLoaded", new ArrayMap());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzden
    /* JADX INFO: renamed from: c */
    public final synchronized void mo5833c() {
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8612k6)).booleanValue()) {
            zzelt zzeltVar = this.f11689y;
            synchronized (zzeltVar) {
                z = zzeltVar.f14176f != null;
            }
        }
        if (z) {
            this.f11689y.m6280b();
        } else {
            if (this.f11688x) {
                return;
            }
            m5863a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    /* JADX INFO: renamed from: n */
    public final synchronized void mo5838n() {
        boolean z;
        zzclb zzclbVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8612k6)).booleanValue()) {
            zzelt zzeltVar = this.f11689y;
            synchronized (zzeltVar) {
                z = zzeltVar.f14176f != null;
            }
        }
        if (z) {
            this.f11689y.m6281c();
            return;
        }
        if (!this.f11688x) {
            m5863a();
        }
        if (!this.f11685u.f15909T || this.f11687w == null || (zzclbVar = this.f11684t) == null) {
            return;
        }
        zzclbVar.mo5129b("onSdkImpression", new ArrayMap());
    }
}
