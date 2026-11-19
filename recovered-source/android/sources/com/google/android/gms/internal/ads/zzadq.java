package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzadq implements zzbs {

    /* JADX INFO: renamed from: a */
    public final zzbq f5039a = new zzadp();

    @Override // com.google.android.gms.internal.ads.zzbs
    /* JADX INFO: renamed from: a */
    public final zzbu mo4029a(Context context, zzi zziVar, zzl zzlVar, zzbt zzbtVar, Executor executor) {
        try {
            return ((zzbs) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(zzbq.class).newInstance(this.f5039a)).mo4029a(context, zziVar, zzlVar, zzbtVar, executor);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
