package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
final class zzaup implements zzaug {

    /* JADX INFO: renamed from: a */
    public File f6957a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f6958b;

    public zzaup(Context context) {
        this.f6958b = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final File zza() {
        if (this.f6957a == null) {
            this.f6957a = new File(this.f6958b.getCacheDir(), "volley");
        }
        return this.f6957a;
    }
}
