package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbaw {

    /* JADX INFO: renamed from: c */
    public static final String[] f7499c = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* JADX INFO: renamed from: a */
    public final String[] f7500a = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* JADX INFO: renamed from: b */
    public final zzbar f7501b;

    public zzbaw(zzbar zzbarVar) {
        this.f7501b = zzbarVar;
    }

    /* JADX INFO: renamed from: d */
    public static Uri m4703d(Uri uri, String str) throws zzbax {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals("ad.doubleclick.net") && uri.getPath().contains(";")) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new zzbax("Parameter already exists: dc_ms");
                    }
                    String string = uri.toString();
                    int iIndexOf = string.indexOf(";adurl");
                    if (iIndexOf != -1) {
                        int i2 = iIndexOf + 1;
                        return Uri.parse(string.substring(0, i2) + "dc_ms=" + str + ";" + string.substring(i2));
                    }
                    String encodedPath = uri.getEncodedPath();
                    int iIndexOf2 = string.indexOf(encodedPath);
                    return Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length()));
                }
            } catch (NullPointerException unused) {
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
            return Uri.parse(string2.substring(0, i3) + "ms=" + str + "&" + string2.substring(i3));
        } catch (UnsupportedOperationException unused2) {
            throw new zzbax("Provided Uri is not in a valid state");
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4704a(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f7500a;
            for (int i2 = 0; i2 < 3; i2++) {
                if (host.endsWith(strArr[i2])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final Uri m4705b(Uri uri, Context context, View view, Activity activity) throws zzbax {
        try {
            return m4703d(uri, this.f7501b.mo3256c(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzbax("Provided Uri is not in a valid state");
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4706c(Uri uri) {
        if (m4704a(uri)) {
            for (int i2 = 0; i2 < 3; i2++) {
                if (uri.getPath().endsWith(f7499c[i2])) {
                    return true;
                }
            }
        }
        return false;
    }
}
