package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegm extends zzegk {

    /* JADX INFO: renamed from: y */
    public final Context f13884y;

    /* JADX INFO: renamed from: z */
    public final Executor f13885z;

    public zzegm(Context context, Executor executor) {
        this.f13884y = context;
        this.f13885z = executor;
        this.f13882x = new zzcam(context, com.google.android.gms.ads.internal.zzt.f3698C.f3720t.m3128a(), this, this);
    }

    /* JADX INFO: renamed from: c */
    public final ListenableFuture m6207c(zzcbk zzcbkVar) {
        synchronized (this.f13878t) {
            try {
                if (this.f13879u) {
                    return this.f13877s;
                }
                this.f13879u = true;
                this.f13881w = zzcbkVar;
                this.f13882x.checkAvailabilityAndConnect();
                zzcgd zzcgdVar = this.f13877s;
                zzcgdVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegl
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f13883s.m6206a();
                    }
                }, zzcfy.f9953h);
                zzegk.m6205b(this.f13884y, zzcgdVar, this.f13885z);
                return zzcgdVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.f13878t) {
            try {
                if (!this.f13880v) {
                    this.f13880v = true;
                    try {
                        ((zzcax) this.f13882x.getService()).mo5297f2(this.f13881w, ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8790ue)).booleanValue() ? new zzegj(this.f13877s, this.f13881w) : new zzegi(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f13877s.m5398b(new zzegz(1));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("RemoteSignalsClientTask.onConnected", th);
                        this.f13877s.m5398b(new zzegz(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
