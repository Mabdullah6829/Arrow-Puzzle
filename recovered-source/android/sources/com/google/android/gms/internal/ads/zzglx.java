package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzglx implements zzglm {

    /* JADX INFO: renamed from: a */
    public final zzfzj f17750a;

    /* JADX INFO: renamed from: b */
    public final zzgnh f17751b;

    /* JADX INFO: renamed from: c */
    public final zzgpe f17752c;

    /* JADX INFO: renamed from: d */
    public final zzgqo f17753d;

    /* JADX INFO: renamed from: e */
    public final ExecutorService f17754e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference f17755f = new AtomicReference("2.893135394.-1");

    public zzglx(zzfzj zzfzjVar, zzgnh zzgnhVar, zzgpe zzgpeVar, zzgqo zzgqoVar, ExecutorService executorService) {
        this.f17750a = zzfzjVar;
        this.f17751b = zzgnhVar;
        this.f17752c = zzgpeVar;
        this.f17753d = zzgqoVar;
        this.f17754e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo7027a(final Context context, final View view, final Activity activity) {
        return zzhcf.m7369c(this.f17754e, new Callable() { // from class: com.google.android.gms.internal.ads.zzglt
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzglx zzglxVar = this.f17739a;
                zzgqo zzgqoVar = zzglxVar.f17753d;
                zzfxt zzfxtVarM6819b = zzglxVar.f17750a.m6819b();
                if (zzfxtVarM6819b == null) {
                    zzgqoVar.m7061b(15004);
                    return "";
                }
                String strM6792b = ((zzfyy) zzfxtVarM6819b).m6792b(context, view, activity);
                if (strM6792b != null) {
                    return strM6792b;
                }
                zzgqoVar.m7061b(15007);
                return "";
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    /* JADX INFO: renamed from: b */
    public final void mo7028b(InputEvent inputEvent) {
        zzfxt zzfxtVarM6819b = this.f17750a.m6819b();
        zzgqo zzgqoVar = this.f17753d;
        if (zzfxtVarM6819b == null) {
            zzgqoVar.m7061b(15004);
            return;
        }
        if (inputEvent instanceof MotionEvent) {
            try {
                ((zzfyy) zzfxtVarM6819b).m6794d((MotionEvent) inputEvent);
            } catch (zzfzi e) {
                zzgqoVar.m7063d(e, 15005);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    /* JADX INFO: renamed from: c */
    public final int mo7029c() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    /* JADX INFO: renamed from: d */
    public final ListenableFuture mo7030d(final Context context) {
        return zzhcf.m7369c(this.f17754e, new Callable() { // from class: com.google.android.gms.internal.ads.zzgls
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzglx zzglxVar = this.f17737a;
                zzgqo zzgqoVar = zzglxVar.f17753d;
                zzfxt zzfxtVarM6819b = zzglxVar.f17750a.m6819b();
                if (zzfxtVarM6819b == null) {
                    zzgqoVar.m7061b(15004);
                    return "";
                }
                String strM6791a = ((zzfyy) zzfxtVarM6819b).m6791a(context);
                if (strM6791a != null) {
                    return strM6791a;
                }
                zzgqoVar.m7061b(15006);
                return "";
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    /* JADX INFO: renamed from: e */
    public final ListenableFuture mo7031e(final Context context, final String str, final View view) {
        return zzhcf.m7369c(this.f17754e, new Callable() { // from class: com.google.android.gms.internal.ads.zzglu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzglx zzglxVar = this.f17743a;
                zzgqo zzgqoVar = zzglxVar.f17753d;
                zzfxt zzfxtVarM6819b = zzglxVar.f17750a.m6819b();
                if (zzfxtVarM6819b == null) {
                    zzgqoVar.m7061b(15004);
                    return "";
                }
                String strM6793c = ((zzfyy) zzfxtVarM6819b).m6793c(context, str, view, null);
                if (strM6793c != null) {
                    return strM6793c;
                }
                zzgqoVar.m7061b(15008);
                return "";
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final String zza() {
        return (String) this.f17755f.get();
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final zzhbx zzb() {
        zzhbx zzhbxVarM7360q = zzhbx.m7360q(this.f17751b.zzb());
        zzglw zzglwVar = new zzgti() { // from class: com.google.android.gms.internal.ads.zzglw
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return null;
            }
        };
        zzhbu zzhbuVar = zzhbu.f18506s;
        return (zzhbx) zzhcf.m7375i((zzhbx) zzhcf.m7375i((zzhbx) zzhcf.m7374h((zzhbx) zzhcf.m7375i((zzhbx) zzhcf.m7371e(zzhbxVarM7360q, Throwable.class, zzglwVar, zzhbuVar), new zzgti() { // from class: com.google.android.gms.internal.ads.zzglo
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzggb zzggbVar = (zzggb) obj;
                zzglx zzglxVar = this.f17733a;
                if (zzglxVar.f17752c.mo7044a(zzggbVar) && zzggbVar != null) {
                    return new Boolean(true);
                }
                zzglxVar.f17753d.m7061b(15003);
                throw new zzgln(1);
            }
        }, zzhbuVar), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzglp
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                return this.f17734a.f17751b.mo7041a();
            }
        }, zzhbuVar), new zzgti() { // from class: com.google.android.gms.internal.ads.zzglq
            @Override // com.google.android.gms.internal.ads.zzgti
            public final Object apply(Object obj) {
                final zzfyz zzfyzVar = (zzfyz) obj;
                if (zzfyzVar == null) {
                    throw new zzgln(3);
                }
                File file = zzfyzVar.f16825b;
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                final zzglx zzglxVar = this.f17735a;
                zzglxVar.f17753d.m7065f(15002, new Runnable() { // from class: com.google.android.gms.internal.ads.zzglv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzglx zzglxVar2 = zzglxVar;
                        zzfzj zzfzjVar = zzglxVar2.f17750a;
                        zzfyz zzfyzVar2 = zzfyzVar;
                        if (!zzfzjVar.m6818a(zzfyzVar2)) {
                            throw new zzgln(2);
                        }
                        zzglxVar2.f17755f.set("2.893135394.".concat(String.valueOf(zzfyzVar2.f16824a.m4796D())));
                    }
                });
                return new Boolean(true);
            }
        }, zzhbuVar), new zzgti() { // from class: com.google.android.gms.internal.ads.zzglr
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return null;
            }
        }, zzhbuVar);
    }
}
