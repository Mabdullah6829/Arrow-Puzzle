package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zzfh implements zzea {

    /* JADX INFO: renamed from: b */
    public static final ArrayList f15667b = new ArrayList(50);

    /* JADX INFO: renamed from: a */
    public final Handler f15668a;

    public zzfh(Handler handler) {
        this.f15668a = handler;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m6440j(zzfg zzfgVar) {
        ArrayList arrayList = f15667b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(zzfgVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static zzfg m6441k() {
        zzfg zzfgVar;
        ArrayList arrayList = f15667b;
        synchronized (arrayList) {
            try {
                zzfgVar = arrayList.isEmpty() ? new zzfg() : (zzfg) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    /* JADX INFO: renamed from: A */
    public final zzdz mo6114A(int i2) {
        zzfg zzfgVarM6441k = m6441k();
        zzfgVarM6441k.f15609a = this.f15668a.obtainMessage(i2);
        return zzfgVarM6441k;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    /* JADX INFO: renamed from: E */
    public final void mo6115E(int i2) {
        this.f15668a.removeMessages(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    /* JADX INFO: renamed from: a */
    public final zzdz mo6116a(int i2, int i3, int i4) {
        zzfg zzfgVarM6441k = m6441k();
        zzfgVarM6441k.f15609a = this.f15668a.obtainMessage(i2, i3, i4);
        return zzfgVarM6441k;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    /* JADX INFO: renamed from: b */
    public final boolean mo6117b(int i2) {
        return this.f15668a.hasMessages(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    /* JADX INFO: renamed from: c */
    public final zzdz mo6118c(Object obj) {
        zzfg zzfgVarM6441k = m6441k();
        zzfgVarM6441k.f15609a = this.f15668a.obtainMessage(31, 0, 0, obj);
        return zzfgVarM6441k;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    /* JADX INFO: renamed from: d */
    public final boolean mo6119d(zzdz zzdzVar) {
        zzfg zzfgVar = (zzfg) zzdzVar;
        Message message = zzfgVar.f15609a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = this.f15668a.sendMessageAtFrontOfQueue(message);
        zzfgVar.f15609a = null;
        m6440j(zzfgVar);
        return zSendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    /* JADX INFO: renamed from: e */
    public final boolean mo6120e(int i2, int i3) {
        return this.f15668a.sendEmptyMessageDelayed(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    /* JADX INFO: renamed from: f */
    public final boolean mo6121f(Runnable runnable) {
        return this.f15668a.postDelayed(runnable, 1000L);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    /* JADX INFO: renamed from: g */
    public final boolean mo6122g(Runnable runnable) {
        return this.f15668a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    /* JADX INFO: renamed from: h */
    public final boolean mo6123h(long j2) {
        return this.f15668a.sendEmptyMessageAtTime(2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    /* JADX INFO: renamed from: i */
    public final zzdz mo6124i(int i2, Object obj) {
        zzfg zzfgVarM6441k = m6441k();
        zzfgVarM6441k.f15609a = this.f15668a.obtainMessage(i2, obj);
        return zzfgVarM6441k;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    /* JADX INFO: renamed from: l */
    public final boolean mo6125l(int i2) {
        return this.f15668a.sendEmptyMessage(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final Looper zza() {
        return this.f15668a.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzl() {
        this.f15668a.removeCallbacksAndMessages(null);
    }
}
