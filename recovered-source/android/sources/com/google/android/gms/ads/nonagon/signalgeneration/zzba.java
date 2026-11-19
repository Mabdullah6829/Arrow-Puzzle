package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzcbk;
import com.google.android.gms.internal.ads.zzefn;
import com.google.android.gms.internal.ads.zzeha;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class zzba implements zzhbn {

    /* JADX INFO: renamed from: a */
    public final Executor f3902a;

    /* JADX INFO: renamed from: b */
    public final zzefn f3903b;

    public zzba(Executor executor, zzefn zzefnVar) {
        this.f3902a = executor;
        this.f3903b = zzefnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ ListenableFuture mo3248b(Object obj) {
        final zzcbk zzcbkVar = (zzcbk) obj;
        return zzhcf.m7374h(this.f3903b.m6192a(zzcbkVar), new zzhbn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaz
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj2) {
                zzeha zzehaVar = (zzeha) obj2;
                zzbc zzbcVar = new zzbc(new JsonReader(new InputStreamReader(zzehaVar.f13905a)), zzehaVar.f13906b);
                try {
                    zzbcVar.f3906b = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a.m3049n(zzcbkVar.f9682s).toString();
                } catch (JSONException unused) {
                    zzbcVar.f3906b = "{}";
                }
                return zzhcf.m7367a(zzbcVar);
            }
        }, this.f3902a);
    }
}
