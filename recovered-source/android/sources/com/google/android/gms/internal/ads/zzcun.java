package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcun implements zzbex, zzddu, com.google.android.gms.ads.internal.overlay.zzr, zzddt {

    /* JADX INFO: renamed from: s */
    public final zzcui f11496s;

    /* JADX INFO: renamed from: t */
    public final zzcuj f11497t;

    /* JADX INFO: renamed from: v */
    public final zzbvb f11499v;

    /* JADX INFO: renamed from: w */
    public final Executor f11500w;

    /* JADX INFO: renamed from: x */
    public final Clock f11501x;

    /* JADX INFO: renamed from: u */
    public final HashSet f11498u = new HashSet();

    /* JADX INFO: renamed from: y */
    public final AtomicBoolean f11502y = new AtomicBoolean(false);

    /* JADX INFO: renamed from: z */
    public final zzcum f11503z = new zzcum();

    /* JADX INFO: renamed from: A */
    public boolean f11494A = false;

    /* JADX INFO: renamed from: B */
    public WeakReference f11495B = new WeakReference(this);

    public zzcun(zzbuy zzbuyVar, zzcuj zzcujVar, Executor executor, zzcui zzcuiVar, Clock clock) {
        this.f11496s = zzcuiVar;
        zzbuj zzbujVar = zzbum.f9398a;
        zzbuyVar.m5150a();
        this.f11499v = new zzbvb(zzbuyVar.f9423b);
        this.f11497t = zzcujVar;
        this.f11500w = executor;
        this.f11501x = clock;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: B1 */
    public final void mo3015B1() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: G0 */
    public final void mo3016G0() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: K1 */
    public final synchronized void mo3017K1() {
        this.f11503z.f11490b = true;
        m5840a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: U2 */
    public final void mo3018U2() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: W1 */
    public final void mo3019W1() {
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5840a() {
        try {
            if (this.f11495B.get() == null) {
                synchronized (this) {
                    m5841b();
                    this.f11494A = true;
                }
                return;
            }
            if (this.f11494A || !this.f11502y.get()) {
                return;
            }
            try {
                zzcum zzcumVar = this.f11503z;
                zzcumVar.f11491c = this.f11501x.mo3639a();
                final JSONObject jSONObjectM5839b = this.f11497t.mo5147a(zzcumVar);
                for (final zzclb zzclbVar : this.f11498u) {
                    this.f11500w.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcul
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            JSONObject jSONObject = jSONObjectM5839b;
                            String string = jSONObject.toString();
                            String strM2450q = AbstractC1456a.m2450q(new StringBuilder(string.length() + 31), "Calling AFMA_updateActiveView(", string, ")");
                            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3068a(strM2450q);
                            zzclbVar.mo5131j(jSONObject, "AFMA_updateActiveView");
                        }
                    });
                }
                zzbvb zzbvbVar = this.f11499v;
                zzbvbVar.getClass();
                zzcgb.m5395b(zzhcf.m7374h(zzbvbVar.f9431a, new zzbva(zzbvbVar, jSONObjectM5839b), zzcfy.f9953h), "ActiveViewListener.callActiveViewJs");
                return;
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.m3151l("Failed to call ActiveViewJS", e);
                return;
            }
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: a3 */
    public final void mo3020a3() {
    }

    /* JADX INFO: renamed from: b */
    public final void m5841b() {
        Iterator it = this.f11498u.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            final String str = "/untrackActiveViewUnit";
            final String str2 = "/updateActiveView";
            zzcui zzcuiVar = this.f11496s;
            if (!zHasNext) {
                zzbuy zzbuyVar = zzcuiVar.f11477b;
                final zzbpx zzbpxVar = zzcuiVar.f11480e;
                ListenableFuture listenableFuture = zzbuyVar.f9423b;
                zzgti zzgtiVar = new zzgti() { // from class: com.google.android.gms.internal.ads.zzbuw
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj) {
                        zzbuc zzbucVar = (zzbuc) obj;
                        zzbucVar.mo5133n(str2, zzbpxVar);
                        return zzbucVar;
                    }
                };
                zzhcp zzhcpVar = zzcfy.f9953h;
                ListenableFuture listenableFutureM7375i = zzhcf.m7375i(listenableFuture, zzgtiVar, zzhcpVar);
                zzbuyVar.f9423b = listenableFutureM7375i;
                final zzbpx zzbpxVar2 = zzcuiVar.f11481f;
                zzbuyVar.f9423b = zzhcf.m7375i(listenableFutureM7375i, new zzgti() { // from class: com.google.android.gms.internal.ads.zzbuw
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj) {
                        zzbuc zzbucVar = (zzbuc) obj;
                        zzbucVar.mo5133n(str, zzbpxVar2);
                        return zzbucVar;
                    }
                }, zzhcpVar);
                return;
            }
            zzclb zzclbVar = (zzclb) it.next();
            zzclbVar.mo5613r0("/updateActiveView", zzcuiVar.f11480e);
            zzclbVar.mo5613r0("/untrackActiveViewUnit", zzcuiVar.f11481f);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: c1 */
    public final void mo3021c1(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    /* JADX INFO: renamed from: d */
    public final synchronized void mo5818d(Context context) {
        this.f11503z.f11492d = "u";
        m5840a();
        m5841b();
        this.f11494A = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: d2 */
    public final synchronized void mo3022d2() {
        this.f11503z.f11490b = false;
        m5840a();
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    /* JADX INFO: renamed from: j */
    public final synchronized void mo5819j(Context context) {
        this.f11503z.f11490b = true;
        m5840a();
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    /* JADX INFO: renamed from: m */
    public final synchronized void mo5820m(Context context) {
        this.f11503z.f11490b = false;
        m5840a();
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    /* JADX INFO: renamed from: n */
    public final synchronized void mo5838n() {
        if (this.f11502y.compareAndSet(false, true)) {
            zzcui zzcuiVar = this.f11496s;
            zzbuy zzbuyVar = zzcuiVar.f11477b;
            final String str = "/updateActiveView";
            final zzbpx zzbpxVar = zzcuiVar.f11480e;
            zzbuyVar.m5150a();
            ListenableFuture listenableFuture = zzbuyVar.f9423b;
            zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzbuv
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                    zzbuc zzbucVar = (zzbuc) obj;
                    zzbucVar.mo5134r(str, zzbpxVar);
                    return zzhcf.m7367a(zzbucVar);
                }
            };
            zzhcp zzhcpVar = zzcfy.f9953h;
            zzbuyVar.f9423b = zzhcf.m7374h(listenableFuture, zzhbnVar, zzhcpVar);
            final String str2 = "/untrackActiveViewUnit";
            final zzbpx zzbpxVar2 = zzcuiVar.f11481f;
            zzbuyVar.m5150a();
            zzbuyVar.f9423b = zzhcf.m7374h(zzbuyVar.f9423b, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzbuv
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                    zzbuc zzbucVar = (zzbuc) obj;
                    zzbucVar.mo5134r(str2, zzbpxVar2);
                    return zzhcf.m7367a(zzbucVar);
                }
            }, zzhcpVar);
            zzcuiVar.f11479d = this;
            m5840a();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: s1 */
    public final void mo3023s1() {
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    /* JADX INFO: renamed from: t */
    public final synchronized void mo4826t(zzbew zzbewVar) {
        zzcum zzcumVar = this.f11503z;
        zzcumVar.f11489a = zzbewVar.f7707j;
        zzcumVar.f11493e = zzbewVar;
        m5840a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: u0 */
    public final void mo3024u0() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }
}
