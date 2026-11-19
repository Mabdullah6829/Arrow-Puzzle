package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.graphics.Insets;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevd implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzexg f14952a;

    /* JADX INFO: renamed from: b */
    public final zzflg f14953b;

    /* JADX INFO: renamed from: c */
    public final Context f14954c;

    /* JADX INFO: renamed from: d */
    public final zzcfk f14955d;

    public zzevd(zzexg zzexgVar, zzflg zzflgVar, Context context, zzcfk zzcfkVar) {
        this.f14952a = zzexgVar;
        this.f14953b = zzflgVar;
        this.f14954c = context;
        this.f14955d = zzcfkVar;
    }

    /* JADX INFO: renamed from: a */
    public static final int m6401a(float f2, int i2) {
        if (f2 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i2 / f2);
    }

    /* JADX INFO: renamed from: b */
    public static final Insets m6402b(Insets insets, float f2) {
        return f2 == 0.0f ? Insets.NONE : Insets.m2179of((int) Math.ceil(insets.left / f2), (int) Math.ceil(insets.top / f2), (int) Math.ceil(insets.right / f2), (int) Math.ceil(insets.bottom / f2));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.m7375i(this.f14952a.zza(), new zzgti() { // from class: com.google.android.gms.internal.ads.zzevc
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 com.google.android.gms.internal.ads.zzeve, still in use, count: 4, list:
                  (r5v2 com.google.android.gms.internal.ads.zzeve) from 0x02f1: MOVE (r24v0 com.google.android.gms.internal.ads.zzeve) = (r5v2 com.google.android.gms.internal.ads.zzeve) (LINE:754)
                  (r5v2 com.google.android.gms.internal.ads.zzeve) from 0x01ac: MOVE (r24v3 com.google.android.gms.internal.ads.zzeve) = (r5v2 com.google.android.gms.internal.ads.zzeve) (LINE:429)
                  (r5v2 com.google.android.gms.internal.ads.zzeve) from 0x01d3: MOVE (r24v5 com.google.android.gms.internal.ads.zzeve) = (r5v2 com.google.android.gms.internal.ads.zzeve) (LINE:468)
                  (r5v2 com.google.android.gms.internal.ads.zzeve) from 0x018d: MOVE (r24v7 com.google.android.gms.internal.ads.zzeve) = (r5v2 com.google.android.gms.internal.ads.zzeve) (LINE:398)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
                */
            @Override // com.google.android.gms.internal.ads.zzgti
            public final java.lang.Object apply(java.lang.Object r27) {
                /*
                    Method dump skipped, instruction units count: 1024
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzevc.apply(java.lang.Object):java.lang.Object");
            }
        }, zzcfy.f9953h);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 7;
    }
}
