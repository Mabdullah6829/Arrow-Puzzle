package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public interface zzxn {
    /* JADX INFO: renamed from: A */
    void mo8979A(zzxw zzxwVar);

    /* JADX INFO: renamed from: B */
    void mo8980B(Handler handler, zzum zzumVar);

    /* JADX INFO: renamed from: C */
    default void mo8981C(zzxm zzxmVar, zzqh zzqhVar, zzabr zzabrVar) {
        zzabrVar.getClass();
        throw new IllegalStateException("prepareSource(MediaSourceCaller, TransferListener, PlayerId) not implemented");
    }

    /* JADX INFO: renamed from: D */
    void mo8982D(zzxm zzxmVar);

    /* JADX INFO: renamed from: E */
    void mo8983E(Handler handler, zzxw zzxwVar);

    /* JADX INFO: renamed from: F */
    void mo8984F(zzum zzumVar);

    /* JADX INFO: renamed from: J */
    zzak mo9026J();

    /* JADX INFO: renamed from: k */
    void mo9003k();

    /* JADX INFO: renamed from: v */
    void mo8990v(zzxm zzxmVar);

    /* JADX INFO: renamed from: w */
    void mo8991w(zzxm zzxmVar);

    /* JADX INFO: renamed from: x */
    default void mo9021x(zzak zzakVar) {
    }

    /* JADX INFO: renamed from: y */
    zzxj mo9022y(zzxl zzxlVar, zzabm zzabmVar, long j2);

    /* JADX INFO: renamed from: z */
    void mo9023z(zzxj zzxjVar);

    /* JADX INFO: renamed from: U */
    default void mo9027U() {
    }

    /* JADX INFO: renamed from: u */
    default void mo9028u() {
    }
}
