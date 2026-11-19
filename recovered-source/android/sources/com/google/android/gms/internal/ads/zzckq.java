package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzckq extends zzcha {

    /* JADX INFO: renamed from: u */
    public final zzchv f10372u;

    /* JADX INFO: renamed from: v */
    public zzckr f10373v;

    /* JADX INFO: renamed from: w */
    public zzchi f10374w;

    /* JADX INFO: renamed from: x */
    public boolean f10375x;

    /* JADX INFO: renamed from: y */
    public int f10376y;

    public zzckq(Context context, zzchv zzchvVar) {
        super(context);
        this.f10376y = 1;
        this.f10375x = false;
        this.f10372u = zzchvVar;
        zzchvVar.m5480a(this);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m5563D() {
        int i2 = this.f10376y;
        return (i2 == 1 || i2 == 2 || this.f10373v == null) ? false : true;
    }

    /* JADX INFO: renamed from: E */
    public final void m5564E(int i2) {
        zzchy zzchyVar = this.f10006t;
        zzchv zzchvVar = this.f10372u;
        if (i2 == 4) {
            zzchvVar.m5483d();
            zzchyVar.f10117d = true;
            zzchyVar.m5485a();
        } else if (this.f10376y == 4) {
            zzchvVar.f10107m = false;
            zzchyVar.f10117d = false;
            zzchyVar.m5485a();
        }
        this.f10376y = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzchx
    /* JADX INFO: renamed from: f */
    public final void mo5408f() {
        if (this.f10373v != null) {
            this.f10006t.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: i */
    public final String mo5409i() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: j */
    public final void mo5410j(zzchi zzchiVar) {
        this.f10374w = zzchiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: k */
    public final void mo5411k(String str) {
        if (str != null) {
            Uri.parse(str).toString();
            this.f10373v = new zzckr();
            m5564E(3);
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzchi zzchiVar = this.f10371s.f10374w;
                    if (zzchiVar != null) {
                        zzchiVar.m5437f();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: l */
    public final void mo5412l() {
        com.google.android.gms.ads.internal.util.zze.m3150k("AdImmersivePlayerView stop");
        zzckr zzckrVar = this.f10373v;
        if (zzckrVar != null) {
            zzckrVar.f10377a.set(false);
            this.f10373v = null;
            m5564E(1);
        }
        this.f10372u.m5481b();
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: m */
    public final void mo5413m() {
        com.google.android.gms.ads.internal.util.zze.m3150k("AdImmersivePlayerView play");
        if (m5563D()) {
            this.f10373v.f10377a.set(true);
            m5564E(4);
            this.f10005s.f10043c = true;
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzckq zzckqVar = this.f10369s;
                    zzchi zzchiVar = zzckqVar.f10374w;
                    if (zzchiVar != null) {
                        if (!zzckqVar.f10375x) {
                            zzchiVar.m5444m();
                            zzckqVar.f10375x = true;
                        }
                        zzckqVar.f10374w.m5438g();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: n */
    public final void mo5414n() {
        com.google.android.gms.ads.internal.util.zze.m3150k("AdImmersivePlayerView pause");
        if (m5563D() && this.f10373v.f10377a.get()) {
            this.f10373v.f10377a.set(false);
            m5564E(5);
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcko
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzchi zzchiVar = this.f10370s.f10374w;
                    if (zzchiVar != null) {
                        zzchiVar.m5439h();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: o */
    public final int mo5415o() {
        return m5563D() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: p */
    public final int mo5416p() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: q */
    public final void mo5417q(int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: r */
    public final void mo5418r(float f2, float f3) {
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: s */
    public final int mo5419s() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: t */
    public final int mo5420t() {
        return 0;
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzckq.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return AbstractC1456a.m2450q(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: u */
    public final long mo5421u() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: v */
    public final long mo5422v() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: w */
    public final long mo5423w() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: x */
    public final int mo5424x() {
        return m5563D() ? 0 : -1;
    }
}
