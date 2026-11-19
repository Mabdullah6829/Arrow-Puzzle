package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfuq extends zzful {
    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    @Override // com.google.android.gms.internal.ads.zzful
    /* JADX INFO: renamed from: h */
    public final ListenableFuture mo6661h(Context context) {
        zzbvj zzbvjVar = (zzbvj) this.f16558d.f16104c.get();
        if (zzbvjVar == null) {
            return zzhcf.m7368b(new zzfsy());
        }
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        AtomicReference atomicReference = this.f16559e;
        zzfke zzfkeVar = (zzfke) this.f16555a.mo2784J1(objectWrapper, ((com.google.android.gms.ads.internal.client.zzfp) atomicReference.get()).f3189s, zzbvjVar, this.f16557c);
        if (zzfkeVar == null) {
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
                        zzfkeVar.f15851u.f15807A.set(new zzfti(zzfsxVar, this.f16568n, ((Long) zzbaVar.f3098c.m5030a(zzbix.f8437a0)).longValue(), this));
                    } catch (RemoteException unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Failed to load rewarded ad.");
                        return zzhcf.m7368b(new zzfsy());
                    }
                }
            }
            com.google.android.gms.ads.internal.client.zzm zzmVar = ((com.google.android.gms.ads.internal.client.zzfp) atomicReference.get()).f3191u;
            zzfty zzftyVar = new zzfty(this, zzhcyVarM7389q);
            String str = ((com.google.android.gms.ads.internal.client.zzfp) atomicReference.get()).f3189s;
            zzfup zzfupVar = new zzfup();
            zzfupVar.f16592s = zzfkeVar;
            zzfupVar.f16593t = zzftyVar;
            zzfupVar.f16594u = str;
            zzfkeVar.mo2964S1(zzmVar, zzfupVar);
            return zzhcyVarM7389q;
        } catch (RemoteException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzful
    /* JADX INFO: renamed from: i */
    public final long mo6662i() {
        return ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8372W)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzful
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx mo6663j(Object obj) {
        try {
            return ((zzccp) obj).mo2967e();
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3069b("Failed to get response info for the rewarded ad.", e);
            return null;
        }
    }
}
