package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdnx implements zzden, com.google.android.gms.ads.internal.overlay.zzr, zzddt {

    /* JADX INFO: renamed from: s */
    public final Context f12394s;

    /* JADX INFO: renamed from: t */
    public final zzclb f12395t;

    /* JADX INFO: renamed from: u */
    public final zzfkn f12396u;

    /* JADX INFO: renamed from: v */
    public final VersionInfoParcel f12397v;

    /* JADX INFO: renamed from: w */
    public final zzelt f12398w;

    /* JADX INFO: renamed from: x */
    public zzelv f12399x;

    public zzdnx(Context context, zzclb zzclbVar, zzfkn zzfknVar, VersionInfoParcel versionInfoParcel, zzelt zzeltVar) {
        this.f12394s = context;
        this.f12395t = zzclbVar;
        this.f12396u = zzfknVar;
        this.f12397v = versionInfoParcel;
        this.f12398w = zzeltVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: B1 */
    public final void mo3015B1() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: G0 */
    public final void mo3016G0() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: K1 */
    public final void mo3017K1() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: U2 */
    public final void mo3018U2() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: W1 */
    public final void mo3019W1() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5942a() {
        zzfvg zzfvgVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8612k6)).booleanValue()) {
            return false;
        }
        zzelt zzeltVar = this.f12398w;
        synchronized (zzeltVar) {
            zzfvgVar = zzeltVar.f14176f;
        }
        return zzfvgVar != null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: a3 */
    public final void mo3020a3() {
    }

    @Override // com.google.android.gms.internal.ads.zzden
    /* JADX INFO: renamed from: c */
    public final void mo5833c() {
        zzclb zzclbVar;
        zzels zzelsVar;
        zzelr zzelrVar;
        zzfkn zzfknVar = this.f12396u;
        if (!zzfknVar.f15909T || (zzclbVar = this.f12395t) == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zzelp zzelpVar = zztVar.f3724x;
        zzelp zzelpVar2 = zztVar.f3724x;
        if (zzelpVar.m6274a(this.f12394s)) {
            if (m5942a()) {
                this.f12398w.m6280b();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.f12397v;
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
                zzelsVar = zzfknVar.f15914Y == 2 ? zzels.UNSPECIFIED : zzels.BEGIN_TO_RENDER;
                zzelrVar = zzelr.HTML_DISPLAY;
            }
            zzelv zzelvVarM6275b = zztVar.f3724x.m6275b(zzclbVar.mo5620y(), zzelrVar, zzelsVar, string, str, zzfknVar.f15939l0);
            this.f12399x = zzelvVarM6275b;
            if (zzelvVarM6275b != null) {
                zzfuy zzfuyVar = zzelvVarM6275b.f14182a;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8595j6)).booleanValue()) {
                    zzelpVar2.m6278e(zzfuyVar, zzclbVar.mo5620y());
                    ArrayList arrayListMo5617w = zzclbVar.mo5617w();
                    int size = arrayListMo5617w.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayListMo5617w.get(i4);
                        i4++;
                        com.google.android.gms.ads.internal.zzt.f3698C.f3724x.m6277d(zzfuyVar, (View) obj);
                    }
                } else {
                    zzelpVar2.m6278e(zzfuyVar, zzclbVar.mo5577H());
                }
                zzclbVar.mo5601g0(this.f12399x);
                com.google.android.gms.ads.internal.zzt.f3698C.f3724x.m6276c(zzfuyVar);
                zzclbVar.mo5129b("onSdkLoaded", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: c1 */
    public final void mo3021c1(int i2) {
        this.f12399x = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: d2 */
    public final void mo3022d2() {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    /* JADX INFO: renamed from: n */
    public final void mo5838n() {
        zzclb zzclbVar;
        if (m5942a()) {
            this.f12398w.m6281c();
        } else {
            if (this.f12399x == null || (zzclbVar = this.f12395t) == null) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8663n6)).booleanValue()) {
                zzclbVar.mo5129b("onSdkImpression", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: s1 */
    public final void mo3023s1() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: u0 */
    public final void mo3024u0() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzclb zzclbVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8663n6)).booleanValue() || (zzclbVar = this.f12395t) == null) {
            return;
        }
        if (this.f12399x != null || m5942a()) {
            if (this.f12399x != null) {
                zzclbVar.mo5129b("onSdkImpression", new ArrayMap());
            } else {
                this.f12398w.m6281c();
            }
        }
    }
}
