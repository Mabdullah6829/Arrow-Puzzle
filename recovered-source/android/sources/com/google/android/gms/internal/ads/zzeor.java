package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeor implements zzemg {

    /* JADX INFO: renamed from: a */
    public final Context f14416a;

    /* JADX INFO: renamed from: b */
    public final zzdok f14417b;

    /* JADX INFO: renamed from: c */
    public zzbvy f14418c;

    /* JADX INFO: renamed from: d */
    public final VersionInfoParcel f14419d;

    public zzeor(Context context, zzdok zzdokVar, VersionInfoParcel versionInfoParcel) {
        this.f14416a = context;
        this.f14417b = zzdokVar;
        this.f14419d = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: a */
    public final Object mo6291a(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp {
        ArrayList arrayList = zzfkyVar.f16005a.f15998a.f16044h;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new zzepp(2, "Unified must be used for RTB.");
        }
        zzdqb zzdqbVarM5995l = zzdqb.m5995l(this.f14418c);
        if (!arrayList.contains(Integer.toString(zzdqbVarM5995l.m6011q()))) {
            throw new zzepp(1, "No corresponding native ad listener");
        }
        zzdqd zzdqdVarMo5728d = this.f14417b.mo5728d(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.f14191a), new zzdqm(zzdqbVarM5995l), new zzdsf(null, null, this.f14418c));
        ((zzenp) zzemdVar.f14193c).m6294l4(zzdqdVarMo5728d.mo5736f());
        return zzdqdVarMo5728d.mo5761g();
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
            int i2 = this.f14419d.f3398u;
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8676o2)).intValue();
            Context context = this.f14416a;
            if (i2 < iIntValue) {
                zzbxiVar.mo5247d1(zzfknVar.f15910U, jSONObject.toString(), zzfkyVar.f16005a.f15998a.f16040d, new ObjectWrapper(context), new zzeoq(this, zzemdVar), (zzbvp) iInterface);
                return;
            }
            String str2 = zzfknVar.f15910U;
            String string = jSONObject.toString();
            zzflg zzflgVar = zzfkyVar.f16005a.f15998a;
            zzbxiVar.mo5249k3(str2, string, zzflgVar.f16040d, new ObjectWrapper(context), new zzeoq(this, zzemdVar), (zzbvp) iInterface, zzflgVar.f16046j);
        } catch (RemoteException e) {
            throw new zzfln(e);
        }
    }
}
