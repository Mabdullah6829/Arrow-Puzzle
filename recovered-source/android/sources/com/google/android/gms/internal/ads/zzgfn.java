package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgfn {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f17140a;

    public zzgfn(ExecutorService executorService) {
        this.f17140a = executorService;
    }

    /* JADX INFO: renamed from: a */
    public final zzgfm m6972a(File file, byte[] bArr, zzgti zzgtiVar) {
        return new zzgfm(file, this.f17140a, new zzgfg(bArr), zzgtiVar);
    }
}
