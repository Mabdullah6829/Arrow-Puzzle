package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzene implements zzemg {

    /* JADX INFO: renamed from: a */
    public final Context f14276a;

    /* JADX INFO: renamed from: b */
    public final zzcwx f14277b;

    /* JADX INFO: renamed from: c */
    public final Executor f14278c;

    public zzene(Context context, zzcwx zzcwxVar, Executor executor) {
        this.f14276a = context;
        this.f14277b = zzcwxVar;
        this.f14278c = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: a */
    public final Object mo6291a(zzfky zzfkyVar, final zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        final View view;
        Object obj = zzemdVar.f14192b;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8381W8)).booleanValue() && zzfknVar.f15929g0) {
            try {
                zzbvs zzbvsVarMo5160J = ((zzfme) obj).f16105a.mo5160J();
                if (zzbvsVarMo5160J == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3070c("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                    throw new zzfln(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                }
                try {
                    view = (View) ObjectWrapper.m3697u0(zzbvsVarMo5160J.mo5205a());
                    boolean zMo5206b = zzbvsVarMo5160J.mo5206b();
                    if (view == null) {
                        throw new zzfln(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                    }
                    if (zMo5206b) {
                        try {
                            view = (View) ((zzhay) zzhcf.m7374h(zzhcj.f18518t, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzenc
                                @Override // com.google.android.gms.internal.ads.zzhbn
                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ ListenableFuture mo3248b(Object obj2) {
                                    return zzhcf.m7367a(zzcxm.m5861a(this.f14272a.f14276a, view, zzfknVar));
                                }
                            }, zzcfy.f9951f)).get();
                        } catch (InterruptedException | ExecutionException e) {
                            throw new zzfln(e);
                        }
                    }
                } catch (RemoteException e2) {
                    throw new zzfln(e2);
                }
            } catch (Throwable th) {
                throw new zzfln(th);
            }
        } else {
            try {
                view = (View) ObjectWrapper.m3697u0(((zzfme) obj).f16105a.mo5171b());
            } catch (Throwable th2) {
                throw new zzfln(th2);
            }
        }
        final zzfme zzfmeVar = (zzfme) obj;
        zzcvt zzcvtVarMo5756d = this.f14277b.mo5756d(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.f14191a), new zzcvz(view, null, new zzcxy() { // from class: com.google.android.gms.internal.ads.zzend
            @Override // com.google.android.gms.internal.ads.zzcxy
            public final com.google.android.gms.ads.internal.client.zzea zza() throws zzfln {
                try {
                    return zzfmeVar.f16105a.mo5182t();
                } catch (Throwable th3) {
                    throw new zzfln(th3);
                }
            }
        }, (zzfko) zzfknVar.f15956u.get(0)));
        zzcvtVarMo5756d.mo5749i().m5935K0(view);
        zzcvtVarMo5756d.mo5733a().m5924Y(new zzctg(zzfmeVar), this.f14278c);
        ((zzenp) zzemdVar.f14193c).m6294l4(zzcvtVarMo5756d.mo5735e());
        return zzcvtVarMo5756d.mo5747g();
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: b */
    public final void mo6292b(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        com.google.android.gms.ads.internal.client.zzr zzrVarM6490a;
        zzfks zzfksVar = zzfknVar.f15952s;
        JSONObject jSONObject = zzfknVar.f15958v;
        boolean z = zzfknVar.f15929g0;
        IInterface iInterface = zzemdVar.f14193c;
        Object obj = zzemdVar.f14192b;
        zzflg zzflgVar = zzfkyVar.f16005a.f15998a;
        com.google.android.gms.ads.internal.client.zzr zzrVar = zzflgVar.f16042f;
        boolean z2 = zzrVar.f3254F;
        int i2 = zzrVar.f3258t;
        int i3 = zzrVar.f3261w;
        Context context = this.f14276a;
        if (z2) {
            AdSize adSize = new AdSize(i3, i2);
            adSize.f2960e = true;
            adSize.f2961f = i2;
            zzrVarM6490a = new com.google.android.gms.ads.internal.client.zzr(context, adSize);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8381W8)).booleanValue() && z) {
                AdSize adSize2 = new AdSize(i3, i2);
                adSize2.f2962g = true;
                adSize2.f2963h = i2;
                zzrVarM6490a = new com.google.android.gms.ads.internal.client.zzr(context, adSize2);
            } else {
                zzrVarM6490a = zzflm.m6490a(context, zzfknVar.f15956u);
            }
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar2 = zzrVarM6490a;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8381W8)).booleanValue() && z) {
            zzfme zzfmeVar = (zzfme) obj;
            try {
                zzfmeVar.f16105a.mo5179r3(new ObjectWrapper(context), zzrVar2, zzflgVar.f16040d, jSONObject.toString(), com.google.android.gms.ads.internal.util.zzbp.m3125i(zzfksVar), (zzbvp) iInterface);
                return;
            } catch (Throwable th) {
                throw new zzfln(th);
            }
        }
        zzfme zzfmeVar2 = (zzfme) obj;
        try {
            zzfmeVar2.f16105a.mo5184w0(new ObjectWrapper(context), zzrVar2, zzflgVar.f16040d, jSONObject.toString(), com.google.android.gms.ads.internal.util.zzbp.m3125i(zzfksVar), (zzbvp) iInterface);
        } catch (Throwable th2) {
            throw new zzfln(th2);
        }
    }
}
