package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzftk extends zzful {
    /* JADX WARN: Code duplicated, block: B:22:0x008b  */
    @Override // com.google.android.gms.internal.ads.zzful
    /* JADX INFO: renamed from: h */
    public final ListenableFuture mo6661h(Context context) {
        zzbvj zzbvjVar = (zzbvj) this.f16558d.f16104c.get();
        if (zzbvjVar == null) {
            return zzhcf.m7368b(new zzfsy());
        }
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        com.google.android.gms.ads.internal.client.zzr zzrVar = new com.google.android.gms.ads.internal.client.zzr();
        AtomicReference atomicReference = this.f16559e;
        zzets zzetsVar = (zzets) this.f16555a.mo2793i1(objectWrapper, zzrVar, ((com.google.android.gms.ads.internal.client.zzfp) atomicReference.get()).f3189s, zzbvjVar, this.f16557c);
        if (zzetsVar == null) {
            return zzhcf.m7368b(new zzfsy());
        }
        zzhcy zzhcyVarM7389q = zzhcy.m7389q();
        try {
            m6697b(((com.google.android.gms.ads.internal.client.zzfp) atomicReference.get()).f3191u);
            zzfsx zzfsxVar = this.f16560f;
            if (zzfsxVar != null) {
                zzbio zzbioVar = zzbix.f8404Y;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    try {
                        zzetsVar.f14862x.f14837A.set(new zzfti(zzfsxVar, this.f16568n, ((Long) zzbaVar.f3098c.m5030a(zzbix.f8420Z)).longValue(), this));
                    } catch (RemoteException e) {
                        e = e;
                        com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to load interstitial ad.", e);
                        return zzhcf.m7368b(new zzfsy());
                    }
                }
            }
            com.google.android.gms.ads.internal.client.zzm zzmVar = ((com.google.android.gms.ads.internal.client.zzfp) atomicReference.get()).f3191u;
            zzfty zzftyVar = new zzfty(this, zzhcyVarM7389q);
            String str = ((com.google.android.gms.ads.internal.client.zzfp) atomicReference.get()).f3189s;
            zzftj zzftjVar = new zzftj();
            zzftjVar.f16492s = zzetsVar;
            zzftjVar.f16493t = zzftyVar;
            zzftjVar.f16494u = str;
            zzetsVar.mo2847U0(zzmVar, zzftjVar);
            return zzhcyVarM7389q;
        } catch (RemoteException e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzful
    /* JADX INFO: renamed from: i */
    public final long mo6662i() {
        return ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8356V)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzful
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx mo6663j(Object obj) {
        try {
            return ((com.google.android.gms.ads.internal.client.zzbu) obj).mo2858r();
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3069b("Failed to get response info for  the interstitial ad.", e);
            return null;
        }
    }
}
