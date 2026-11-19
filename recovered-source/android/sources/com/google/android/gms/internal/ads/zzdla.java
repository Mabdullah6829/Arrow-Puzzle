package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdla extends zzdix implements zzbex {

    /* JADX INFO: renamed from: t */
    public final WeakHashMap f12296t;

    /* JADX INFO: renamed from: u */
    public final Context f12297u;

    /* JADX INFO: renamed from: v */
    public final zzfkn f12298v;

    public zzdla(Context context, Set set, zzfkn zzfknVar) {
        super(set);
        this.f12296t = new WeakHashMap(1);
        this.f12297u = context;
        this.f12298v = zzfknVar;
    }

    /* JADX INFO: renamed from: K0 */
    public final synchronized void m5935K0(View view) {
        try {
            WeakHashMap weakHashMap = this.f12296t;
            zzbez zzbezVar = (zzbez) weakHashMap.get(view);
            if (zzbezVar == null) {
                zzbez zzbezVar2 = new zzbez(this.f12297u, view);
                zzbezVar2.f7714D.add(this);
                zzbezVar2.m4830d(3);
                weakHashMap.put(view, zzbezVar2);
                zzbezVar = zzbezVar2;
            }
            if (this.f12298v.f15913X) {
                zzbio zzbioVar = zzbix.f8374W1;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    long jLongValue = ((Long) zzbaVar.f3098c.m5030a(zzbix.f8358V1)).longValue();
                    com.google.android.gms.ads.internal.util.zzbu zzbuVar = zzbezVar.f7711A;
                    synchronized (zzbuVar.f3545c) {
                        zzbuVar.f3543a = jLongValue;
                    }
                    return;
                }
                throw th;
            }
            com.google.android.gms.ads.internal.util.zzbu zzbuVar2 = zzbezVar.f7711A;
            long j2 = zzbez.f7710G;
            synchronized (zzbuVar2.f3545c) {
                zzbuVar2.f3543a = j2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    /* JADX INFO: renamed from: t */
    public final synchronized void mo4826t(final zzbew zzbewVar) {
        m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdkz
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo5900b(Object obj) {
                ((zzbex) obj).mo4826t(zzbewVar);
            }
        });
    }
}
