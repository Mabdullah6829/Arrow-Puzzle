package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcnp implements zzbar {

    /* JADX INFO: renamed from: s */
    public final Context f10612s;

    /* JADX INFO: renamed from: t */
    public final zzgdl f10613t;

    public zzcnp(Context context, VersionInfoParcel versionInfoParcel) {
        int i2;
        zzgdl zzgdlVar;
        this.f10612s = context;
        zzbio zzbioVar = zzbix.f8864z3;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        int iIntValue = ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue();
        if (iIntValue != 1) {
            i2 = 3;
            if (iIntValue != 2 && iIntValue == 3) {
                i2 = 4;
            }
        } else {
            i2 = 2;
        }
        zzgeh zzgehVarM6947H = zzgei.m6947H();
        float fFloatValue = ((Float) zzbaVar.f3098c.m5030a(zzbix.f8091F3)).floatValue();
        zzgehVarM6947H.m8326l();
        ((zzgei) zzgehVarM6947H.f19780t).m6953J(fFloatValue);
        zzgei zzgeiVar = (zzgei) zzgehVarM6947H.m8328o();
        zzgej zzgejVarM6954K = zzgek.m6954K();
        boolean zBooleanValue = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8108G3)).booleanValue();
        zzgejVarM6954K.m8326l();
        ((zzgek) zzgejVarM6954K.f19780t).m6963M(zBooleanValue);
        long jLongValue = ((Long) zzbaVar.f3098c.m5030a(zzbix.f8142I3)).longValue();
        zzgejVarM6954K.m8326l();
        ((zzgek) zzgejVarM6954K.f19780t).m6964N(jLongValue);
        zzgek zzgekVar = (zzgek) zzgejVarM6954K.m8328o();
        zzgdo zzgdoVarM6903n0 = zzgdq.m6903n0();
        zzgdoVarM6903n0.m8326l();
        ((zzgdq) zzgdoVarM6903n0.f19780t).m6916P(i2);
        String str = versionInfoParcel.f3396s;
        zzgdoVarM6903n0.m8326l();
        ((zzgdq) zzgdoVarM6903n0.f19780t).m6905E(str);
        zzgdoVarM6903n0.m8326l();
        ((zzgdq) zzgdoVarM6903n0.f19780t).m6917Q();
        boolean zBooleanValue2 = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8542g3)).booleanValue();
        zzgdoVarM6903n0.m8326l();
        ((zzgdq) zzgdoVarM6903n0.f19780t).m6940o0(zBooleanValue2);
        boolean zBooleanValue3 = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8159J3)).booleanValue();
        zzgdoVarM6903n0.m8326l();
        ((zzgdq) zzgdoVarM6903n0.f19780t).m6941p0(zBooleanValue3);
        boolean zBooleanValue4 = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8176K3)).booleanValue();
        zzgdoVarM6903n0.m8326l();
        ((zzgdq) zzgdoVarM6903n0.f19780t).m6904D(zBooleanValue4);
        boolean z = ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8813w3)).intValue() == -1;
        zzgdoVarM6903n0.m8326l();
        ((zzgdq) zzgdoVarM6903n0.f19780t).m6911K(z);
        long jIntValue = ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8847y3)).intValue();
        zzgdoVarM6903n0.m8326l();
        ((zzgdq) zzgdoVarM6903n0.f19780t).m6910J(jIntValue);
        long jLongValue2 = ((Long) zzbaVar.f3098c.m5030a(zzbix.f8125H3)).longValue();
        zzgdoVarM6903n0.m8326l();
        ((zzgdq) zzgdoVarM6903n0.f19780t).m6908H(jLongValue2);
        long jIntValue2 = ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8830x3)).intValue();
        zzgdoVarM6903n0.m8326l();
        ((zzgdq) zzgdoVarM6903n0.f19780t).m6907G(jIntValue2);
        zzgdoVarM6903n0.m8326l();
        ((zzgdq) zzgdoVarM6903n0.f19780t).m6906F(zzgeiVar);
        zzgdoVarM6903n0.m8326l();
        ((zzgdq) zzgdoVarM6903n0.f19780t).m6909I(zzgekVar);
        boolean zBooleanValue5 = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8661n4)).booleanValue();
        zzgdoVarM6903n0.m8326l();
        ((zzgdq) zzgdoVarM6903n0.f19780t).m6912L(zBooleanValue5);
        zzgdq zzgdqVar = (zzgdq) zzgdoVarM6903n0.m8328o();
        zzhcp zzhcpVar = zzcfy.f9946a;
        synchronized (zzgdl.f17042b) {
            try {
                if (zzgdl.f17043c == null) {
                    zzgdl.f17043c = new zzgdl(context, zzgdqVar, zzhcpVar);
                }
                zzgdlVar = zzgdl.f17043c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f10613t = zzgdlVar;
        zzgfq zzgfqVar = zzgdlVar.f17044a.f17024a;
        synchronized (zzgfqVar) {
            try {
                if (zzgfqVar.f17146e != null) {
                    return;
                }
                Set set = (Set) zzgfqVar.f17143b.zzb();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzgfo) it.next()).zza());
                }
                zzgqo zzgqoVar = (zzgqo) zzgfqVar.f17145d.zzb();
                ListenableFuture listenableFutureM7375i = zzhcf.m7375i(zzhcf.m7376j(arrayList), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgfp
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj) {
                        return null;
                    }
                }, zzgfqVar.f17144c);
                zzgqoVar.m7064e(2, listenableFutureM7375i);
                zzgfqVar.f17146e = listenableFutureM7375i;
                Iterator it2 = ((Set) zzgfqVar.f17142a.zzb()).iterator();
                while (it2.hasNext()) {
                    ((zzgfo) it2.next()).zza();
                }
                if (zzgfqVar.f17146e != null) {
                } else {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: a */
    public final void mo3254a(int i2, int i3, int i4) {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
        Context context = this.f10612s;
        long j2 = i4;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, j2, 0, com.google.android.gms.ads.internal.util.client.zzf.m3033b(context, i2), com.google.android.gms.ads.internal.util.client.zzf.m3041r(context.getResources().getDisplayMetrics(), i3), 0);
        zzgdl zzgdlVar = this.f10613t;
        zzgdlVar.m6902c(motionEventObtain);
        motionEventObtain.recycle();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, j2, 2, com.google.android.gms.ads.internal.util.client.zzf.m3041r(context.getResources().getDisplayMetrics(), i2), com.google.android.gms.ads.internal.util.client.zzf.m3041r(context.getResources().getDisplayMetrics(), i3), 0);
        zzgdlVar.m6902c(motionEventObtain2);
        motionEventObtain2.recycle();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, j2, 1, com.google.android.gms.ads.internal.util.client.zzf.m3041r(context.getResources().getDisplayMetrics(), i2), com.google.android.gms.ads.internal.util.client.zzf.m3041r(context.getResources().getDisplayMetrics(), i3), 0);
        zzgdlVar.m6902c(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: b */
    public final void mo3255b(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.f10613t.m6902c(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: c */
    public final String mo3256c(Context context, String str, View view, Activity activity) {
        return this.f10613t.m6901b(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: d */
    public final String mo3257d(Context context) {
        return this.f10613t.m6900a(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: e */
    public final void mo3258e(StackTraceElement[] stackTraceElementArr) {
        zzgdl zzgdlVar = this.f10613t;
        List listAsList = Arrays.asList(stackTraceElementArr);
        zzgqa zzgqaVar = zzgdlVar.f17044a.f17026c.f17981b;
        synchronized (zzgqaVar) {
            ArrayList arrayList = zzgqaVar.f18031a;
            arrayList.clear();
            arrayList.addAll(listAsList);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: f */
    public final String mo3259f(Context context) {
        return this.f10613t.m6900a(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: g */
    public final void mo3260g(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: h */
    public final String mo3261h(Context context, String str, View view) {
        return this.f10613t.m6901b(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: i */
    public final String mo3262i(final Context context, final View view, final Activity activity) {
        String string;
        ListenableFuture listenableFuture;
        final zzgdj zzgdjVar = this.f10613t.f17044a;
        zzgew zzgewVar = zzgdjVar.f17028e;
        zzgqo zzgqoVar = zzgdjVar.f17027d;
        zzgqm zzgqmVarM7060a = zzgqoVar.m7060a(4);
        try {
            try {
                try {
                    zzgqmVarM7060a.m7057a();
                    zzgfq zzgfqVar = zzgdjVar.f17024a;
                    synchronized (zzgfqVar) {
                        listenableFuture = zzgfqVar.f17146e;
                        if (listenableFuture == null) {
                            throw null;
                        }
                    }
                    string = (String) ((zzhay) zzhcf.m7374h(listenableFuture, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgdg
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        /* JADX INFO: renamed from: b */
                        public final ListenableFuture mo3248b(Object obj) {
                            return ((zzggc) zzgdjVar.f17025b.f17215f.get()).mo6997a(context, view, activity);
                        }
                    }, zzhbu.f18506s)).get(zzgdjVar.f17029f, TimeUnit.MILLISECONDS);
                } catch (ExecutionException e) {
                    e = e;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zzgqmVarM7060a.m7058b(e);
                    string = Integer.toString(3);
                } catch (Throwable th) {
                    zzgqmVarM7060a.m7058b(th);
                    throw th;
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                zzgqmVarM7060a.m7058b(e2);
                string = "";
            } catch (TimeoutException unused) {
                zzgqoVar.m7061b(57);
                string = Integer.toString(17);
            }
            zzgqmVarM7060a.m7059c();
            zzgewVar.zzb();
            return string;
        } catch (Throwable th2) {
            zzgqmVarM7060a.m7059c();
            zzgewVar.zzb();
            throw th2;
        }
    }
}
