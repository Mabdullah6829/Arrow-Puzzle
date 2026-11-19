package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzsy implements zzsx {
    @Override // com.google.android.gms.internal.measurement.zzsx
    /* JADX INFO: renamed from: d */
    public final OutputStream mo10642d(Uri uri) {
        return mo10634g().mo10642d(mo10635h(uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    /* JADX INFO: renamed from: e */
    public final void mo10643e(Uri uri) throws IOException {
        mo10634g().mo10643e(mo10635h(uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    /* JADX INFO: renamed from: f */
    public final void mo10644f(Uri uri, Uri uri2) throws IOException {
        mo10634g().mo10644f(mo10635h(uri), mo10635h(uri2));
    }

    /* JADX INFO: renamed from: g */
    public abstract zzsd mo10634g();

    /* JADX INFO: renamed from: h */
    public Uri mo10635h(Uri uri) {
        throw null;
    }
}
