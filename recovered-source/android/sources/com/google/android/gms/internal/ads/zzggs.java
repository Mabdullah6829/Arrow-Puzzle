package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
final class zzggs implements zzggc {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f17223a;

    /* JADX INFO: renamed from: b */
    public final zzimt f17224b;

    /* JADX INFO: renamed from: c */
    public final zzimt f17225c;

    /* JADX INFO: renamed from: d */
    public final zzgpj f17226d;

    /* JADX INFO: renamed from: e */
    public final zzimt f17227e;

    /* JADX INFO: renamed from: f */
    public final zzino f17228f;

    /* JADX INFO: renamed from: g */
    public final zzgdq f17229g;

    public zzggs(ExecutorService executorService, zzimt zzimtVar, zzimt zzimtVar2, zzgpj zzgpjVar, zzimt zzimtVar3, zzino zzinoVar, zzgdq zzgdqVar) {
        this.f17223a = executorService;
        this.f17224b = zzimtVar;
        this.f17225c = zzimtVar2;
        this.f17226d = zzgpjVar;
        this.f17227e = zzimtVar3;
        this.f17228f = zzinoVar;
        this.f17229g = zzgdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6997a(Context context, View view, Activity activity) {
        zzghi zzghiVarMo6943a = ((zzghi) ((zzgeb) this.f17228f).zzb()).mo6943a(context);
        ((zzgef) zzghiVarMo6943a).f17086d = view;
        zzgef zzgefVar = (zzgef) zzghiVarMo6943a;
        zzgefVar.f17087e = activity;
        zzgefVar.f17088f = true != this.f17229g.m6924X() ? "" : null;
        zzgefVar.f17089g = this.f17226d.m7048b(context, view);
        zzgefVar.m6945c(zzayt.m4561F0());
        zzgefVar.f17091i = zzgen.f17094t;
        return ((zzgeg) zzgefVar.m6944b()).m6946a().m7004a();
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    /* JADX INFO: renamed from: b */
    public final void mo6998b(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            zzgha zzghaVar = (zzgha) this.f17227e.zzb();
            MotionEvent motionEvent = (MotionEvent) inputEvent;
            synchronized (zzghaVar) {
                try {
                    if (motionEvent.getAction() == 1) {
                        zzghaVar.f17254b = MotionEvent.obtain(motionEvent);
                    }
                    zzghaVar.f17255c.m7003a(motionEvent);
                    ArrayDeque arrayDeque = zzghaVar.f17253a;
                    if (arrayDeque.size() >= 6) {
                        arrayDeque.remove();
                    }
                    arrayDeque.add(new zzggz(motionEvent));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    /* JADX INFO: renamed from: c */
    public final int mo6999c() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    /* JADX INFO: renamed from: d */
    public final ListenableFuture mo7000d(Context context) {
        zzghi zzghiVarMo6943a = ((zzghi) ((zzgeb) this.f17228f).zzb()).mo6943a(context);
        ((zzgef) zzghiVarMo6943a).f17089g = this.f17226d.m7047a();
        zzgef zzgefVar = (zzgef) zzghiVarMo6943a;
        zzgefVar.m6945c(zzayt.m4561F0());
        zzgefVar.f17091i = zzgen.f17093s;
        return ((zzgeg) zzgefVar.m6944b()).m6946a().m7004a();
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    /* JADX INFO: renamed from: e */
    public final ListenableFuture mo7001e(Context context, String str, View view) {
        zzimt zzimtVar = this.f17227e;
        HashMap mapM7049c = this.f17226d.m7049c();
        zzgha zzghaVar = (zzgha) zzimtVar.zzb();
        synchronized (zzghaVar) {
            try {
                MotionEvent motionEvent = zzghaVar.f17254b;
                if (motionEvent != null) {
                    mapM7049c.put("nv", motionEvent);
                }
                mapM7049c.put("oe", zzghaVar.f17255c);
                ArrayDeque arrayDeque = zzghaVar.f17253a;
                mapM7049c.put("ro", arrayDeque.toArray(new zzggz[arrayDeque.size()]));
                zzghaVar.f17255c = new zzggy();
                arrayDeque.clear();
                MotionEvent motionEvent2 = zzghaVar.f17254b;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    zzghaVar.f17254b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzghi zzghiVarMo6943a = ((zzghi) ((zzgeb) this.f17228f).zzb()).mo6943a(context);
        ((zzgef) zzghiVarMo6943a).f17086d = view;
        zzgef zzgefVar = (zzgef) zzghiVarMo6943a;
        zzgefVar.f17087e = null;
        zzgefVar.f17088f = str;
        zzgefVar.f17089g = mapM7049c;
        zzgefVar.f17091i = zzgen.f17095u;
        zzgefVar.m6945c(zzayt.m4561F0());
        return ((zzgeg) zzgefVar.m6944b()).m6946a().m7004a();
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final String zza() {
        return "1.893135394";
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final ListenableFuture zzb() {
        return zzhcf.m7369c(this.f17223a, new Callable() { // from class: com.google.android.gms.internal.ads.zzggr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzggs zzggsVar = this.f17222a;
                ((zzghl) zzggsVar.f17225c.zzb()).m7005a();
                ((zzgie) zzggsVar.f17224b.zzb()).zza();
                return null;
            }
        });
    }
}
