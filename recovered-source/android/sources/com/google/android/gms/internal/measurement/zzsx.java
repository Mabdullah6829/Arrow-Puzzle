package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface zzsx {
    /* JADX INFO: renamed from: a */
    default InputStream mo10631a(Uri uri) throws zzsk {
        throw new zzsk("openForRead not supported by ".concat(zzc()));
    }

    /* JADX INFO: renamed from: b */
    default boolean mo10632b(Uri uri) throws zzsk {
        throw new zzsk("exists not supported by ".concat(zzc()));
    }

    /* JADX INFO: renamed from: c */
    default File mo10633c(Uri uri) throws zzsk {
        String strZzc = zzc();
        String strValueOf = String.valueOf(uri);
        throw new zzsk(AbstractC1456a.m2451r(new StringBuilder(strZzc.length() + 28 + strValueOf.length()), "Cannot convert uri to file ", strZzc, " ", strValueOf));
    }

    /* JADX INFO: renamed from: d */
    default OutputStream mo10642d(Uri uri) throws zzsk {
        throw new zzsk("openForWrite not supported by ".concat(zzc()));
    }

    /* JADX INFO: renamed from: e */
    default void mo10643e(Uri uri) throws zzsk {
        throw new zzsk("deleteFile not supported by ".concat(zzc()));
    }

    /* JADX INFO: renamed from: f */
    default void mo10644f(Uri uri, Uri uri2) throws zzsk {
        throw new zzsk("rename not supported by ".concat(zzc()));
    }

    String zzc();
}
