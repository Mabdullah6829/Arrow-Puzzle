package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class zzflk {

    /* JADX INFO: renamed from: a */
    public final zzbaw f16063a;

    public zzflk(zzbaw zzbawVar) {
        this.f16063a = zzbawVar;
    }

    /* JADX INFO: renamed from: b */
    public static final Uri m6488b(Uri uri, String str) throws zzbax {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null && path.contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new zzbax("Parameter already exists: dc_ms");
                        }
                        String string = uri.toString();
                        int iIndexOf = string.indexOf(";adurl");
                        if (iIndexOf != -1) {
                            int i2 = iIndexOf + 1;
                            StringBuilder sb = new StringBuilder(string.substring(0, i2));
                            sb.append("dc_ms=");
                            sb.append(str);
                            sb.append(";");
                            sb.append((CharSequence) string, i2, string.length());
                            return Uri.parse(sb.toString());
                        }
                        String encodedPath = uri.getEncodedPath();
                        if (encodedPath == null) {
                            throw new UnsupportedOperationException();
                        }
                        int iIndexOf2 = string.indexOf(encodedPath);
                        StringBuilder sb2 = new StringBuilder(string.substring(0, encodedPath.length() + iIndexOf2));
                        sb2.append(";dc_ms=");
                        sb2.append(str);
                        sb2.append(";");
                        sb2.append((CharSequence) string, iIndexOf2 + encodedPath.length(), string.length());
                        return Uri.parse(sb2.toString());
                    }
                } catch (UnsupportedOperationException unused) {
                    throw new zzbax("Provided Uri is not in a valid state");
                }
            } catch (NullPointerException unused2) {
            }
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new zzbax("Query parameter already exists: ms");
        }
        String string2 = uri.toString();
        int iIndexOf3 = string2.indexOf("&adurl");
        if (iIndexOf3 == -1) {
            iIndexOf3 = string2.indexOf("?adurl");
        }
        if (iIndexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i3 = iIndexOf3 + 1;
        StringBuilder sb3 = new StringBuilder(string2.substring(0, i3));
        sb3.append("ms=");
        sb3.append(str);
        sb3.append("&");
        sb3.append((CharSequence) string2, i3, string2.length());
        return Uri.parse(sb3.toString());
    }

    /* JADX INFO: renamed from: a */
    public final Uri m6489a(Uri uri, Context context, View view, Activity activity) throws zzbax {
        try {
            return m6488b(uri, this.f16063a.f7501b.mo3256c(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzbax("Provided Uri is not in a valid state");
        }
    }
}
