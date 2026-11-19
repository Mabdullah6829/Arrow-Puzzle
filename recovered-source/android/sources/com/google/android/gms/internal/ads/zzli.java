package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(34)
final class zzli {

    /* JADX INFO: renamed from: a */
    public final WeakReference f20215a;

    /* JADX INFO: renamed from: b */
    public final IntConsumer f20216b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzlj f20217c;

    public /* synthetic */ zzli(zzlj zzljVar, Context context) {
        this.f20217c = zzljVar;
        this.f20215a = new WeakReference(context);
        IntConsumer intConsumer = new IntConsumer() { // from class: com.google.android.gms.internal.ads.zzlg
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i2) {
                zzlj zzljVar2 = this.f20213a.f20217c;
                if (zzljVar2.f20242X) {
                    return;
                }
                zzljVar2.m8640y(1, 19, Integer.valueOf(i2));
            }
        };
        this.f20216b = intConsumer;
        final zzea zzeaVarMo5975a = zzljVar.f20267u.mo5975a(zzljVar.f20265s, null);
        context.registerDeviceIdChangeListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzlh
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzeaVarMo5975a.mo6122g(runnable);
            }
        }, intConsumer);
    }
}
