package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxh {

    /* JADX INFO: renamed from: a */
    public final HashMap f13247a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final synchronized void m6080a(String str, zzfme zzfmeVar) {
        zzbxx zzbxxVarMo5162L;
        if (this.f13247a.containsKey(str)) {
            return;
        }
        zzbxx zzbxxVarMo5167U = null;
        if (zzfmeVar == null) {
            zzbxxVarMo5162L = null;
        } else {
            try {
                zzbxxVarMo5162L = zzfmeVar.f16105a.mo5162L();
            } catch (Throwable th) {
                try {
                    throw new zzfln(th);
                } catch (zzfln unused) {
                }
            }
        }
        if (zzfmeVar != null) {
            try {
                zzbxxVarMo5167U = zzfmeVar.f16105a.mo5167U();
            } catch (Throwable th2) {
                try {
                    throw new zzfln(th2);
                } catch (zzfln unused2) {
                }
            }
        }
        boolean z = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8132Ha)).booleanValue()) {
            if (zzfmeVar == null) {
                z = false;
            } else {
                try {
                    zzfmeVar.m6528a();
                } catch (zzfln unused3) {
                    z = false;
                }
            }
        }
        this.f13247a.put(str, new zzdxg(str, zzbxxVarMo5162L, zzbxxVarMo5167U, z));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized zzdxg m6081b(String str) {
        return (zzdxg) this.f13247a.get(str);
    }
}
