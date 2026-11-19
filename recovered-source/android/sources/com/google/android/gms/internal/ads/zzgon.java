package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
final class zzgon implements zzgnh {

    /* JADX INFO: renamed from: a */
    public final zzglk f17932a;

    /* JADX INFO: renamed from: b */
    public final ExecutorService f17933b;

    /* JADX INFO: renamed from: c */
    public final zzgqo f17934c;

    public zzgon(zzglk zzglkVar, ExecutorService executorService, zzgqo zzgqoVar) {
        this.f17932a = zzglkVar;
        this.f17933b = executorService;
        this.f17934c = zzgqoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo7041a() {
        ListenableFuture listenableFutureM7369c = zzhcf.m7369c(this.f17933b, new Callable() { // from class: com.google.android.gms.internal.ads.zzgoj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzglk zzglkVar = this.f17923a.f17932a;
                zzggb zzggbVarM7023b = zzglkVar.m7023b(1);
                if (zzggbVarM7023b == null) {
                    zzglkVar.f17729e.m7061b(15315);
                    return null;
                }
                String strM4796D = zzggbVarM7023b.m6989D().m4796D();
                File fileM6807a = zzfzb.m6807a(strM4796D, zzglkVar.m7024c(), "pcam.jar");
                fileM6807a.getClass();
                if (!fileM6807a.exists()) {
                    fileM6807a = zzfzb.m6807a(strM4796D, zzglkVar.m7024c(), "pcam");
                    fileM6807a.getClass();
                }
                File fileM6807a2 = zzfzb.m6807a(strM4796D, zzglkVar.m7024c(), "pcopt");
                fileM6807a2.getClass();
                File fileM6807a3 = zzfzb.m6807a(strM4796D, zzglkVar.m7024c(), "pcbc");
                fileM6807a3.getClass();
                return new zzfyz(zzggbVarM7023b.m6989D(), fileM6807a, fileM6807a3, fileM6807a2);
            }
        });
        this.f17934c.m7064e(15314, listenableFutureM7369c);
        return listenableFutureM7369c;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    /* JADX INFO: renamed from: c */
    public final ListenableFuture mo7039c(final zzggb zzggbVar, final byte[] bArr) {
        ListenableFuture listenableFutureM7369c = zzhcf.m7369c(this.f17933b, new Callable() { // from class: com.google.android.gms.internal.ads.zzgok
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f17924a.f17932a.m7022a(zzggbVar, null, bArr);
                return null;
            }
        });
        this.f17934c.m7064e(15305, listenableFutureM7369c);
        return listenableFutureM7369c;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    /* JADX INFO: renamed from: d */
    public final ListenableFuture mo7040d(final zzggb zzggbVar, final byte[] bArr, final byte[] bArr2) {
        ListenableFuture listenableFutureM7369c = zzhcf.m7369c(this.f17933b, new Callable() { // from class: com.google.android.gms.internal.ads.zzgol
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f17927a.f17932a.m7022a(zzggbVar, bArr, bArr2);
                return null;
            }
        });
        this.f17934c.m7064e(15321, listenableFutureM7369c);
        return listenableFutureM7369c;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final ListenableFuture zza() {
        return zzhcf.m7367a(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureM7369c = zzhcf.m7369c(this.f17933b, new Callable() { // from class: com.google.android.gms.internal.ads.zzgom
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzggb zzggbVarM7023b = this.f17931a.f17932a.m7023b(1);
                return zzggbVarM7023b == null ? zzggb.m6988J() : zzggbVarM7023b;
            }
        });
        this.f17934c.m7064e(15302, listenableFutureM7369c);
        return listenableFutureM7369c;
    }
}
