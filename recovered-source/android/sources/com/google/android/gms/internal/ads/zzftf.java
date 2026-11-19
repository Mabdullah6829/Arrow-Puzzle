package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzftf extends zzful {
    /* JADX WARN: Code duplicated, block: B:22:0x008a  */
    @Override // com.google.android.gms.internal.ads.zzful
    /* JADX INFO: renamed from: h */
    public final ListenableFuture mo6661h(Context context) {
        zzbvj zzbvjVar = (zzbvj) this.f16558d.f16104c.get();
        if (zzbvjVar == null) {
            return zzhcf.m7368b(new zzfsy());
        }
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        com.google.android.gms.ads.internal.client.zzr zzrVarM2980H = com.google.android.gms.ads.internal.client.zzr.m2980H();
        AtomicReference atomicReference = this.f16559e;
        zzfgu zzfguVar = (zzfgu) this.f16555a.mo2786O3(objectWrapper, zzrVarM2980H, ((com.google.android.gms.ads.internal.client.zzfp) atomicReference.get()).f3189s, zzbvjVar, this.f16557c);
        if (zzfguVar == null) {
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
                        zzfguVar.f15649x.f15630z.set(new zzfti(zzfsxVar, this.f16568n, ((Long) zzbaVar.f3098c.m5030a(zzbix.f8454b0)).longValue(), this));
                    } catch (RemoteException e) {
                        e = e;
                        com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to load app open ad.", e);
                        return zzhcf.m7368b(new zzfsy());
                    }
                }
            }
            com.google.android.gms.ads.internal.client.zzfp zzfpVar = (com.google.android.gms.ads.internal.client.zzfp) atomicReference.get();
            zzfty zzftyVar = new zzfty(this, zzhcyVarM7389q);
            String str = zzfpVar.f3189s;
            zzfte zzfteVar = new zzfte();
            zzfteVar.f16474s = zzftyVar;
            zzfteVar.f16475t = str;
            zzfguVar.mo2854c2(zzfteVar);
            zzfguVar.mo2850Z(((com.google.android.gms.ads.internal.client.zzfp) atomicReference.get()).f3191u);
            return zzhcyVarM7389q;
        } catch (RemoteException e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzful
    /* JADX INFO: renamed from: i */
    public final long mo6662i() {
        return ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8388X)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzful
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx mo6663j(Object obj) {
        try {
            return ((zzbgq) obj).mo4878c();
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3069b("Failed to get response info for the app open ad.", e);
            return null;
        }
    }
}
