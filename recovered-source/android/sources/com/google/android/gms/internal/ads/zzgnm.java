package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
final class zzgnm implements zzgnh {

    /* JADX INFO: renamed from: a */
    public final zzgfe f17866a;

    /* JADX INFO: renamed from: b */
    public final zzgfe f17867b;

    /* JADX INFO: renamed from: c */
    public final zzgfe f17868c;

    /* JADX INFO: renamed from: d */
    public final zzgfe f17869d;

    /* JADX INFO: renamed from: e */
    public final zzimt f17870e;

    /* JADX INFO: renamed from: f */
    public final zzimt f17871f;

    /* JADX INFO: renamed from: g */
    public final File f17872g;

    /* JADX INFO: renamed from: h */
    public final ExecutorService f17873h;

    /* JADX INFO: renamed from: i */
    public final zzgqo f17874i;

    public zzgnm(zzgfe zzgfeVar, zzgfe zzgfeVar2, zzimt zzimtVar, zzgfe zzgfeVar3, zzgfe zzgfeVar4, zzimt zzimtVar2, File file, ExecutorService executorService, zzgqo zzgqoVar) {
        this.f17866a = zzgfeVar;
        this.f17868c = zzgfeVar2;
        this.f17870e = zzimtVar;
        this.f17867b = zzgfeVar3;
        this.f17869d = zzgfeVar4;
        this.f17871f = zzimtVar2;
        this.f17872g = file;
        this.f17873h = executorService;
        this.f17874i = zzgqoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo7041a() {
        zzhbx zzhbxVar = (zzhbx) zzhcf.m7375i(zzhbx.m7360q(this.f17866a.mo6968a()), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgni
            @Override // com.google.android.gms.internal.ads.zzgti
            public final Object apply(Object obj) {
                zzggb zzggbVar = (zzggb) obj;
                zzgnm zzgnmVar = this.f17860a;
                zzgnmVar.getClass();
                if (zzggbVar == null || zzggbVar.equals(zzggb.m6988J())) {
                    return null;
                }
                zzbei zzbeiVarM6989D = zzggbVar.m6989D();
                File file = ((zzgfe) zzgnmVar.f17870e.zzb()).f17130a;
                zzgfe zzgfeVar = zzgnmVar.f17868c;
                return new zzfyz(zzbeiVarM6989D, file, zzgfeVar.f17130a, zzgnmVar.f17872g);
            }
        }, zzhbu.f18506s);
        this.f17874i.m7064e(15314, zzhbxVar);
        return zzhbxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    /* JADX INFO: renamed from: c */
    public final ListenableFuture mo7039c(final zzggb zzggbVar, byte[] bArr) {
        ListenableFuture listenableFutureMo6969b = this.f17869d.mo6969b(bArr);
        this.f17874i.m7064e(15305, listenableFutureMo6969b);
        return (zzhbx) zzhcf.m7374h(zzhbx.m7360q(listenableFutureMo6969b), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgnj
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) {
                zzgnm zzgnmVar = this.f17861a;
                ListenableFuture listenableFutureMo6969b2 = zzgnmVar.f17867b.mo6969b(zzggbVar);
                zzgnmVar.f17874i.m7064e(15303, listenableFutureMo6969b2);
                return listenableFutureMo6969b2;
            }
        }, zzhbu.f18506s);
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    /* JADX INFO: renamed from: d */
    public final ListenableFuture mo7040d(final zzggb zzggbVar, byte[] bArr, byte[] bArr2) {
        ListenableFuture listenableFutureMo6969b = ((zzgfe) this.f17871f.zzb()).mo6969b(bArr);
        zzgqo zzgqoVar = this.f17874i;
        zzgqoVar.m7064e(15307, listenableFutureMo6969b);
        ListenableFuture listenableFutureMo6969b2 = this.f17869d.mo6969b(bArr2);
        zzgqoVar.m7064e(15305, listenableFutureMo6969b2);
        return (zzhbx) zzhcf.m7374h(zzhbx.m7360q(new zzhbo(zzgwt.m7221u(new ListenableFuture[]{listenableFutureMo6969b, listenableFutureMo6969b2}), true)), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgnk
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) {
                zzgnm zzgnmVar = this.f17863a;
                ListenableFuture listenableFutureMo6969b3 = zzgnmVar.f17867b.mo6969b(zzggbVar);
                zzgnmVar.f17874i.m7064e(15303, listenableFutureMo6969b3);
                return listenableFutureMo6969b3;
            }
        }, zzhbu.f18506s);
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final ListenableFuture zza() {
        return zzhcf.m7369c(this.f17873h, new Callable() { // from class: com.google.android.gms.internal.ads.zzgnl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzgnm zzgnmVar = this.f17865a;
                zzgqo zzgqoVar = zzgnmVar.f17874i;
                zzgfe zzgfeVar = zzgnmVar.f17867b;
                zzgfe zzgfeVar2 = zzgnmVar.f17869d;
                zzimt zzimtVar = zzgnmVar.f17871f;
                try {
                    File file = zzgfeVar.f17130a;
                    File file2 = zzgfeVar.f17130a;
                    boolean z = false;
                    if (file.exists()) {
                        File file3 = ((zzgfe) zzimtVar.zzb()).f17130a;
                        File file4 = ((zzgfe) zzgnmVar.f17870e.zzb()).f17130a;
                        try {
                            if (file3.exists()) {
                                File parentFile = file4.getParentFile();
                                if (parentFile != null) {
                                    zzfzb.m6811e(parentFile);
                                }
                                zzhaa.m7288b(file4);
                                zzhaa.m7289c(file3, file4);
                            }
                            File file5 = zzgfeVar2.f17130a;
                            File file6 = zzgnmVar.f17868c.f17130a;
                            try {
                                if (file5.exists()) {
                                    zzhaa.m7288b(file6);
                                    zzhaa.m7289c(file5, file6);
                                }
                                File file7 = zzgnmVar.f17866a.f17130a;
                                try {
                                    if (file.exists()) {
                                        zzhaa.m7288b(file7);
                                        zzhaa.m7289c(file, file7);
                                    }
                                    file2.delete();
                                    ((zzgfe) zzimtVar.zzb()).f17130a.delete();
                                    zzgfeVar2.f17130a.delete();
                                    z = true;
                                } catch (IOException | SecurityException e) {
                                    zzgqoVar.m7063d(e, 15313);
                                    zzgfeVar.f17130a.delete();
                                    ((zzgfe) zzimtVar.zzb()).f17130a.delete();
                                    zzgfeVar2.f17130a.delete();
                                }
                            } catch (IOException | SecurityException e2) {
                                zzgqoVar.m7063d(e2, 15312);
                            }
                        } catch (IOException e3) {
                            e = e3;
                            zzgqoVar.m7063d(e, 15311);
                            zzgfeVar.f17130a.delete();
                            ((zzgfe) zzimtVar.zzb()).f17130a.delete();
                            zzgfeVar2.f17130a.delete();
                            return new Boolean(z);
                        } catch (SecurityException e4) {
                            e = e4;
                            zzgqoVar.m7063d(e, 15311);
                            zzgfeVar.f17130a.delete();
                            ((zzgfe) zzimtVar.zzb()).f17130a.delete();
                            zzgfeVar2.f17130a.delete();
                            return new Boolean(z);
                        }
                        return new Boolean(z);
                    }
                    file2.delete();
                    ((zzgfe) zzimtVar.zzb()).f17130a.delete();
                    zzgfeVar2.f17130a.delete();
                    return new Boolean(z);
                } catch (Throwable th) {
                    zzgfeVar.f17130a.delete();
                    ((zzgfe) zzimtVar.zzb()).f17130a.delete();
                    zzgfeVar2.f17130a.delete();
                    throw th;
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureMo6968a = this.f17866a.mo6968a();
        this.f17874i.m7064e(15302, listenableFutureMo6968a);
        return listenableFutureMo6968a;
    }
}
