package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesl extends com.google.android.gms.ads.internal.client.zzbp {

    /* JADX INFO: renamed from: s */
    public final Context f14795s;

    /* JADX INFO: renamed from: t */
    public final zzcnq f14796t;

    /* JADX INFO: renamed from: u */
    public final zzflf f14797u;

    /* JADX INFO: renamed from: v */
    public final zzdqk f14798v;

    /* JADX INFO: renamed from: w */
    public com.google.android.gms.ads.internal.client.zzbh f14799w;

    public zzesl(zzcnq zzcnqVar, Context context, String str) {
        zzflf zzflfVar = new zzflf();
        this.f14797u = zzflfVar;
        this.f14798v = new zzdqk();
        this.f14796t = zzcnqVar;
        zzflfVar.f16015c = str;
        this.f14795s = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: C2 */
    public final void mo2828C2(zzbnw zzbnwVar) {
        this.f14798v.f12648c = zzbnwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: N1 */
    public final void mo2833N1(AdManagerAdViewOptions adManagerAdViewOptions) {
        zzflf zzflfVar = this.f14797u;
        zzflfVar.f16022j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            zzflfVar.f16017e = adManagerAdViewOptions.f2995s;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: R3 */
    public final void mo2834R3(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        this.f14797u.f16036x = zzcpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: S2 */
    public final void mo2835S2(zzbnt zzbntVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.f14798v.f12649d = zzbntVar;
        this.f14797u.f16014b = zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: U3 */
    public final void mo2829U3(String str, zzbnp zzbnpVar, zzbnm zzbnmVar) {
        zzdqk zzdqkVar = this.f14798v;
        zzdqkVar.f12651f.put(str, zzbnpVar);
        if (zzbnmVar != null) {
            zzdqkVar.f12652g.put(str, zzbnmVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.client.zzbn mo2830a() {
        zzdqk zzdqkVar = this.f14798v;
        zzdqkVar.getClass();
        zzdql zzdqlVar = new zzdql(zzdqkVar);
        ArrayList arrayList = new ArrayList();
        if (zzdqlVar.f12656c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (zzdqlVar.f12654a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (zzdqlVar.f12655b != null) {
            arrayList.add(Integer.toString(2));
        }
        SimpleArrayMap simpleArrayMap = zzdqlVar.f12659f;
        if (!simpleArrayMap.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (zzdqlVar.f12658e != null) {
            arrayList.add(Integer.toString(7));
        }
        zzflf zzflfVar = this.f14797u;
        zzflfVar.f16018f = arrayList;
        ArrayList arrayList2 = new ArrayList(simpleArrayMap.size());
        for (int i2 = 0; i2 < simpleArrayMap.size(); i2++) {
            arrayList2.add((String) simpleArrayMap.keyAt(i2));
        }
        zzflfVar.f16019g = arrayList2;
        if (zzflfVar.f16014b == null) {
            zzflfVar.f16014b = com.google.android.gms.ads.internal.client.zzr.m2981w();
        }
        return new zzesm(this.f14795s, this.f14796t, zzflfVar, zzdqlVar, this.f14799w);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: i2 */
    public final void mo2836i2(PublisherAdViewOptions publisherAdViewOptions) {
        zzflf zzflfVar = this.f14797u;
        zzflfVar.f16023k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            zzflfVar.f16017e = publisherAdViewOptions.f3010s;
            zzflfVar.f16024l = publisherAdViewOptions.f3011t;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: m3 */
    public final void mo2837m3(zzbsr zzbsrVar) {
        this.f14798v.f12650e = zzbsrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: r0 */
    public final void mo2838r0(zzbng zzbngVar) {
        this.f14798v.f12647b = zzbngVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: r2 */
    public final void mo2839r2(zzbnj zzbnjVar) {
        this.f14798v.f12646a = zzbnjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: t0 */
    public final void mo2831t0(zzbma zzbmaVar) {
        this.f14797u.f16020h = zzbmaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: u2 */
    public final void mo2832u2(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.f14799w = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: y3 */
    public final void mo2840y3(zzbsi zzbsiVar) {
        zzflf zzflfVar = this.f14797u;
        zzflfVar.f16026n = zzbsiVar;
        zzflfVar.f16016d = new com.google.android.gms.ads.internal.client.zzfw(false, true, false);
    }
}
