package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdal implements zzdgf, zzdls {

    /* JADX INFO: renamed from: s */
    public zzcbg f11888s;

    /* JADX INFO: renamed from: u */
    public final Context f11890u;

    /* JADX INFO: renamed from: v */
    public final zzfqt f11891v;

    /* JADX INFO: renamed from: w */
    public final VersionInfoParcel f11892w;

    /* JADX INFO: renamed from: x */
    public final Executor f11893x;

    /* JADX INFO: renamed from: y */
    public boolean f11894y = false;

    /* JADX INFO: renamed from: z */
    public boolean f11895z = false;

    /* JADX INFO: renamed from: t */
    public final AtomicBoolean f11889t = new AtomicBoolean();

    public zzdal(Context context, zzfqt zzfqtVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.f11890u = context;
        this.f11891v = zzfqtVar;
        this.f11892w = versionInfoParcel;
        this.f11893x = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    /* JADX INFO: renamed from: a */
    public final void mo3343a(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        m5887b();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX INFO: renamed from: b */
    public final void m5887b() {
        final zzcbg zzcbgVar;
        ListenableFuture listenableFutureM5304a;
        int i2;
        zzbup zzbupVarM5145b;
        boolean andSet = this.f11889t.getAndSet(true);
        Executor executor = this.f11893x;
        if (!andSet) {
            if (((Boolean) zzbkx.f9073o.m5057c()).booleanValue()) {
                i2 = 2;
            } else {
                i2 = 3;
                if (!((Boolean) zzbkx.f9074p.m5057c()).booleanValue()) {
                    if (((Boolean) zzbkx.f9072n.m5057c()).booleanValue()) {
                        try {
                            String strOptString = new JSONObject(com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().zzi().f9877e).optString("local_flag_write");
                            if (TextUtils.equals(strOptString, "client")) {
                                i2 = 2;
                            } else if (!TextUtils.equals(strOptString, NotificationCompat.CATEGORY_SERVICE)) {
                                i2 = 1;
                            }
                        } catch (JSONException unused) {
                        }
                    } else {
                        i2 = 1;
                    }
                }
            }
            int i3 = i2 - 1;
            zzfqt zzfqtVar = this.f11891v;
            Context context = this.f11890u;
            if (i3 == 1) {
                zzbupVarM5145b = com.google.android.gms.ads.internal.zzt.f3698C.f3718r.m5145b(context, VersionInfoParcel.m3031w(), zzfqtVar);
            } else if (i3 == 2) {
                zzbupVarM5145b = com.google.android.gms.ads.internal.zzt.f3698C.f3718r.m5144a(context, VersionInfoParcel.m3031w(), zzfqtVar);
            }
            zzbuj zzbujVar = zzbum.f9398a;
            this.f11888s = new zzcbg(context, zzbupVarM5145b.m5148a("google.afma.sdkConstants.getSdkConstants", zzbujVar, zzbujVar), this.f11892w, executor);
            this.f11894y = true;
        }
        if (this.f11894y && (zzcbgVar = this.f11888s) != null) {
            if (!((Boolean) zzbkx.f9059a.m5057c()).booleanValue()) {
                listenableFutureM5304a = zzcbgVar.m5304a();
            } else if (zzcbgVar.f9670f.compareAndSet(false, true)) {
                ListenableFuture listenableFutureM5304a2 = zzcbgVar.m5304a();
                listenableFutureM5304a2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcbgVar.f9670f.set(false);
                    }
                }, zzcfy.f9953h);
                listenableFutureM5304a = listenableFutureM5304a2;
            } else {
                listenableFutureM5304a = zzhcj.f18518t;
            }
            if (!this.f11895z && ((Boolean) zzbkp.f9005i.m5057c()).booleanValue()) {
                listenableFutureM5304a.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdak
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzdal zzdalVar = this.f11887s;
                        zzbii.m5010a(zzdalVar.f11890u);
                        zzdalVar.f11895z = true;
                    }
                }, executor);
            }
            zzcgb.m5394a(listenableFutureM5304a, "persistFlagsClient", zzcfy.f9953h);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: s */
    public final void mo5866s(zzfky zzfkyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    /* JADX INFO: renamed from: y */
    public final void mo3344y(String str) {
        m5887b();
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: z */
    public final void mo5867z(zzcbk zzcbkVar) {
        m5887b();
    }
}
