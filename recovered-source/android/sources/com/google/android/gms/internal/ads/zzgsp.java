package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zzgsp {

    /* JADX INFO: renamed from: b */
    public final Context f18147b;

    /* JADX INFO: renamed from: c */
    public final zzgsq f18148c;

    /* JADX INFO: renamed from: f */
    public boolean f18151f;

    /* JADX INFO: renamed from: g */
    public final Intent f18152g;

    /* JADX INFO: renamed from: i */
    public ServiceConnection f18154i;

    /* JADX INFO: renamed from: j */
    public zzgqt f18155j;

    /* JADX INFO: renamed from: e */
    public final ArrayList f18150e = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final String f18149d = "OverlayDisplayService";

    /* JADX INFO: renamed from: a */
    public final zzguj f18146a = zzgum.m7151a(new zzgso());

    /* JADX INFO: renamed from: h */
    public final IBinder.DeathRecipient f18153h = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzgsk
        @Override // android.os.IBinder.DeathRecipient
        public final /* synthetic */ void binderDied() {
            zzgsp zzgspVar = this.f18140a;
            zzgspVar.f18148c.m7110a("%s : Binder has died.", zzgspVar.f18149d);
            ArrayList arrayList = zzgspVar.f18150e;
            synchronized (arrayList) {
                arrayList.clear();
            }
        }
    };

    public zzgsp(Context context, zzgsq zzgsqVar, Intent intent) {
        this.f18147b = context;
        this.f18148c = zzgsqVar;
        this.f18152g = intent;
    }

    /* JADX INFO: renamed from: a */
    public final void m7108a(final Runnable runnable) {
        ((Handler) this.f18146a.zza()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgsn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    this.f18144s.f18148c.m7112c("error caused by ", e);
                }
            }
        });
    }
}
