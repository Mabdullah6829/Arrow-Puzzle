package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzcvv extends zzcvs {

    /* JADX INFO: renamed from: l */
    public final Context f11585l;

    /* JADX INFO: renamed from: m */
    public final View f11586m;

    /* JADX INFO: renamed from: n */
    public final zzclb f11587n;

    /* JADX INFO: renamed from: o */
    public final zzfko f11588o;

    /* JADX INFO: renamed from: p */
    public final zzcxy f11589p;

    /* JADX INFO: renamed from: q */
    public final zzdql f11590q;

    /* JADX INFO: renamed from: r */
    public final zzdli f11591r;

    /* JADX INFO: renamed from: s */
    public final zzimt f11592s;

    /* JADX INFO: renamed from: t */
    public final Executor f11593t;

    /* JADX INFO: renamed from: u */
    public com.google.android.gms.ads.internal.client.zzr f11594u;

    public zzcvv(zzcxz zzcxzVar, Context context, zzfko zzfkoVar, View view, zzclb zzclbVar, zzcxy zzcxyVar, zzdql zzdqlVar, zzdli zzdliVar, zzimt zzimtVar, Executor executor) {
        super(zzcxzVar);
        this.f11585l = context;
        this.f11586m = view;
        this.f11587n = zzclbVar;
        this.f11588o = zzfkoVar;
        this.f11589p = zzcxyVar;
        this.f11590q = zzdqlVar;
        this.f11591r = zzdliVar;
        this.f11592s = zzimtVar;
        this.f11593t = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    /* JADX INFO: renamed from: a */
    public final void mo5855a() {
        this.f11593t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvu
            @Override // java.lang.Runnable
            public final void run() {
                zzcvv zzcvvVar = this.f11584s;
                zzbnt zzbntVar = zzcvvVar.f11590q.f12657d;
                if (zzbntVar == null) {
                    return;
                }
                try {
                    zzbntVar.mo5076B0((com.google.android.gms.ads.internal.client.zzbu) zzcvvVar.f11592s.zzb(), new ObjectWrapper(zzcvvVar.f11585l));
                } catch (RemoteException e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3071d("RemoteException when notifyAdLoad is called", e);
                }
            }
        });
        super.mo5855a();
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* JADX INFO: renamed from: c */
    public final View mo5847c() {
        return this.f11586m;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* JADX INFO: renamed from: d */
    public final void mo5848d(FrameLayout frameLayout, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzclb zzclbVar;
        if (frameLayout == null || (zzclbVar = this.f11587n) == null) {
            return;
        }
        zzclbVar.mo5602h0(zzcnl.m5676a(zzrVar));
        frameLayout.setMinimumHeight(zzrVar.f3259u);
        frameLayout.setMinimumWidth(zzrVar.f3262x);
        this.f11594u = zzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* JADX INFO: renamed from: f */
    public final com.google.android.gms.ads.internal.client.zzea mo5849f() {
        try {
            return this.f11589p.zza();
        } catch (zzfln unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* JADX INFO: renamed from: g */
    public final zzfko mo5850g() {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.f11594u;
        if (zzrVar != null) {
            return zzrVar.f3249A ? new zzfko(-3, 0, true) : new zzfko(zzrVar.f3261w, zzrVar.f3258t, false);
        }
        zzfkn zzfknVar = this.f11760b;
        if (zzfknVar.f15921c0) {
            for (String str : zzfknVar.f15916a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f11586m;
            return new zzfko(view.getWidth(), view.getHeight(), false);
        }
        return (zzfko) zzfknVar.f15950r.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* JADX INFO: renamed from: h */
    public final zzfko mo5851h() {
        return this.f11588o;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* JADX INFO: renamed from: i */
    public final int mo5852i() {
        zzbio zzbioVar = zzbix.f8381W8;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && this.f11760b.f15929g0) {
            if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8397X8)).booleanValue()) {
                return 0;
            }
        }
        return this.f11759a.f16006b.f16002b.f15974c;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* JADX INFO: renamed from: j */
    public final int mo5853j() {
        return this.f11759a.f16006b.f16002b.f15975d;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* JADX INFO: renamed from: k */
    public final void mo5854k() {
        zzdli zzdliVar = this.f11591r;
        synchronized (zzdliVar) {
            zzdliVar.m5923J0(zzdlh.f12305a);
        }
    }
}
