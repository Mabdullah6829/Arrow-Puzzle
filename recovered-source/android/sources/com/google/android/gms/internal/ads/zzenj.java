package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzenj implements zzemg {

    /* JADX INFO: renamed from: a */
    public final Context f14288a;

    /* JADX INFO: renamed from: b */
    public final zzcwx f14289b;

    /* JADX INFO: renamed from: c */
    public View f14290c;

    /* JADX INFO: renamed from: d */
    public zzbvs f14291d;

    public zzenj(Context context, zzcwx zzcwxVar) {
        this.f14288a = context;
        this.f14289b = zzcwxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: a */
    public final Object mo6291a(zzfky zzfkyVar, final zzfkn zzfknVar, final zzemd zzemdVar) throws zzfln {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8381W8)).booleanValue() && zzfknVar.f15929g0) {
            try {
                view = (View) ObjectWrapper.m3697u0(this.f14291d.mo5205a());
                boolean zMo5206b = this.f14291d.mo5206b();
                if (view == null) {
                    throw new zzfln(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zMo5206b) {
                    try {
                        view = (View) ((zzhay) zzhcf.m7374h(zzhcj.f18518t, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeng
                            @Override // com.google.android.gms.internal.ads.zzhbn
                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                                return zzhcf.m7367a(zzcxm.m5861a(this.f14282a.f14288a, view, zzfknVar));
                            }
                        }, zzcfy.f9951f)).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfln(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfln(e2);
            }
        } else {
            view = this.f14290c;
        }
        zzcvt zzcvtVarMo5756d = this.f14289b.mo5756d(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.f14191a), new zzcvz(view, null, new zzcxy() { // from class: com.google.android.gms.internal.ads.zzenh
            @Override // com.google.android.gms.internal.ads.zzcxy
            public final com.google.android.gms.ads.internal.client.zzea zza() throws zzfln {
                try {
                    return ((zzbxi) zzemdVar.f14192b).zzh();
                } catch (RemoteException e3) {
                    throw new zzfln(e3);
                }
            }
        }, (zzfko) zzfknVar.f15956u.get(0)));
        zzcvtVarMo5756d.mo5749i().m5935K0(view);
        ((zzenp) zzemdVar.f14193c).m6294l4(zzcvtVarMo5756d.mo5736f());
        return zzcvtVarMo5756d.mo5747g();
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: b */
    public final void mo6292b(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        try {
            Object obj = zzemdVar.f14192b;
            IInterface iInterface = zzemdVar.f14193c;
            zzbxi zzbxiVar = (zzbxi) obj;
            String str = zzfknVar.f15915Z;
            JSONObject jSONObject = zzfknVar.f15958v;
            zzbxiVar.mo5240I2(str);
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8381W8)).booleanValue();
            Context context = this.f14288a;
            if (zBooleanValue && zzfknVar.f15929g0) {
                String str2 = zzfknVar.f15910U;
                String string = jSONObject.toString();
                zzflg zzflgVar = zzfkyVar.f16005a.f15998a;
                zzbxiVar.mo5251o3(str2, string, zzflgVar.f16040d, new ObjectWrapper(context), new zzeni(this, zzemdVar), (zzbvp) iInterface, zzflgVar.f16042f);
                return;
            }
            String str3 = zzfknVar.f15910U;
            String string2 = jSONObject.toString();
            zzflg zzflgVar2 = zzfkyVar.f16005a.f15998a;
            zzbxiVar.mo5242Z2(str3, string2, zzflgVar2.f16040d, new ObjectWrapper(context), new zzeni(this, zzemdVar), (zzbvp) iInterface, zzflgVar2.f16042f);
        } catch (RemoteException e) {
            throw new zzfln(e);
        }
    }
}
