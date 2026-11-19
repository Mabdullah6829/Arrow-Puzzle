package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgfm extends zzgfe {

    /* JADX INFO: renamed from: b */
    public final ExecutorService f17137b;

    /* JADX INFO: renamed from: c */
    public final zzgfl f17138c;

    /* JADX INFO: renamed from: d */
    public final zzgti f17139d;

    public zzgfm(File file, ExecutorService executorService, zzgfl zzgflVar, zzgti zzgtiVar) {
        super(file);
        this.f17137b = executorService;
        this.f17138c = zzgflVar;
        this.f17139d = zzgtiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6968a() {
        return zzhcf.m7369c(this.f17137b, new Callable() { // from class: com.google.android.gms.internal.ads.zzgfj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object objApply;
                Object objMo6971b;
                zzgfm zzgfmVar = this.f17135a;
                synchronized (zzgfmVar) {
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(zzgfmVar.f17130a);
                            try {
                                objMo6971b = zzgfmVar.f17138c.mo6971b(fileInputStream);
                                fileInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (FileNotFoundException unused) {
                            objApply = zzgfmVar.f17138c.zzc();
                            return objApply;
                        }
                    } catch (zzgfh e) {
                        objApply = zzgfmVar.f17139d.apply(e);
                        return objApply;
                    } catch (IOException e2) {
                        objApply = zzgfmVar.f17139d.apply(new zzgfh(e2));
                        return objApply;
                    }
                }
                return objMo6971b;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    /* JADX INFO: renamed from: b */
    public final ListenableFuture mo6969b(final Object obj) {
        return zzhcf.m7369c(this.f17137b, new Callable() { // from class: com.google.android.gms.internal.ads.zzgfi
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgfm zzgfmVar = this.f17133a;
                Object obj2 = obj;
                synchronized (zzgfmVar) {
                    File file = zzgfmVar.f17130a;
                    zzhaa.m7288b(file);
                    String parent = file.getParent();
                    String name = file.getName();
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 5);
                    sb.append(name);
                    sb.append(".temp");
                    File file2 = new File(parent, sb.toString());
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            zzgfmVar.f17138c.mo6970a(obj2, fileOutputStream);
                            fileOutputStream.close();
                            if (!file2.renameTo(zzgfmVar.f17130a)) {
                                throw new IOException("Failed to rename file.");
                            }
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        file2.delete();
                        throw e;
                    }
                }
                return null;
            }
        });
    }
}
