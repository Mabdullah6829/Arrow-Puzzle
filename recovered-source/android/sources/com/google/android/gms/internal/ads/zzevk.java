package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevk implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f14976a;

    /* JADX INFO: renamed from: b */
    public final zzdxk f14977b;

    /* JADX INFO: renamed from: c */
    public final zzece f14978c;

    /* JADX INFO: renamed from: d */
    public final zzevm f14979d;

    public zzevk(zzhcp zzhcpVar, zzdxk zzdxkVar, zzece zzeceVar, zzevm zzevmVar) {
        this.f14976a = zzhcpVar;
        this.f14977b = zzdxkVar;
        this.f14978c = zzeceVar;
        this.f14979d = zzevmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        zzevl zzevlVar;
        zzbio zzbioVar = zzbix.f8484cd;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        boolean zBooleanValue = ((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue();
        zzevm zzevmVar = this.f14979d;
        if (zBooleanValue && (zzevlVar = zzevmVar.f14982b) != null) {
            return zzhcf.m7367a(zzevlVar);
        }
        if (zzgtq.m7127a((String) zzbivVar2.m5030a(zzbix.f8406Y1)) || (!((Boolean) zzbivVar2.m5030a(zzbioVar)).booleanValue() && (zzevmVar.f14981a.get() || !this.f14978c.f13541b))) {
            return zzhcf.m7367a(new zzevl(new Bundle()));
        }
        zzevmVar.f14981a.set(true);
        return this.f14976a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzevj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8406Y1)).split(";"));
                Bundle bundle = new Bundle();
                Iterator it = listAsList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    zzevk zzevkVar = this.f14975a;
                    if (!zHasNext) {
                        zzevl zzevlVar2 = new zzevl(bundle);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8484cd)).booleanValue()) {
                            zzevkVar.f14979d.f14982b = zzevlVar2;
                        }
                        return zzevlVar2;
                    }
                    String str = (String) it.next();
                    try {
                        zzfme zzfmeVarM6082a = zzevkVar.f14977b.m6082a(new JSONObject(), str);
                        zzfmeVarM6082a.m6528a();
                        boolean z = zzevkVar.f14978c.f13541b;
                        Bundle bundle2 = new Bundle();
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8484cd)).booleanValue() || z) {
                            try {
                                zzbxx zzbxxVarMo5167U = zzfmeVarM6082a.f16105a.mo5167U();
                                if (zzbxxVarMo5167U != null) {
                                    try {
                                        bundle2.putString("sdk_version", zzbxxVarMo5167U.toString());
                                    } catch (zzfln unused) {
                                    }
                                }
                            } catch (Throwable th) {
                                throw new zzfln(th);
                            }
                        }
                        try {
                            zzbxx zzbxxVarMo5162L = zzfmeVarM6082a.f16105a.mo5162L();
                            if (zzbxxVarMo5162L != null) {
                                try {
                                    bundle2.putString("adapter_version", zzbxxVarMo5162L.toString());
                                } catch (zzfln unused2) {
                                }
                            }
                            bundle.putBundle(str, bundle2);
                        } catch (Throwable th2) {
                            throw new zzfln(th2);
                        }
                    } catch (zzfln unused3) {
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 1;
    }
}
