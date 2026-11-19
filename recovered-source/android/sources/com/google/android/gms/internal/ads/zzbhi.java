package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzbhi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbhi> CREATOR = new zzbhj();

    /* JADX INFO: renamed from: A */
    public String f7853A;

    /* JADX INFO: renamed from: B */
    public int f7854B;

    /* JADX INFO: renamed from: s */
    public final String f7855s;

    /* JADX INFO: renamed from: t */
    public final long f7856t;

    /* JADX INFO: renamed from: u */
    public final String f7857u;

    /* JADX INFO: renamed from: v */
    public final String f7858v;

    /* JADX INFO: renamed from: w */
    public final String f7859w;

    /* JADX INFO: renamed from: x */
    public final Bundle f7860x;

    /* JADX INFO: renamed from: y */
    public final boolean f7861y;

    /* JADX INFO: renamed from: z */
    public long f7862z;

    public zzbhi(String str, long j2, String str2, String str3, String str4, Bundle bundle, boolean z, long j3, String str5, int i2) {
        this.f7855s = str;
        this.f7856t = j2;
        this.f7857u = str2 == null ? "" : str2;
        this.f7858v = str3 == null ? "" : str3;
        this.f7859w = str4 == null ? "" : str4;
        this.f7860x = bundle == null ? new Bundle() : bundle;
        this.f7861y = z;
        this.f7862z = j3;
        this.f7853A = str5;
        this.f7854B = i2;
    }

    /* JADX INFO: renamed from: w */
    public static zzbhi m4889w(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 51);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                String string = sb.toString();
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f(string);
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j2 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzbhi(queryParameter, j2, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e) {
            e = e;
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e2) {
            e = e2;
            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 2, this.f7855s);
        SafeParcelWriter.m3588n(parcel, 3, 8);
        parcel.writeLong(this.f7856t);
        SafeParcelWriter.m3583i(parcel, 4, this.f7857u);
        SafeParcelWriter.m3583i(parcel, 5, this.f7858v);
        SafeParcelWriter.m3583i(parcel, 6, this.f7859w);
        SafeParcelWriter.m3575a(7, this.f7860x, parcel);
        SafeParcelWriter.m3588n(parcel, 8, 4);
        parcel.writeInt(this.f7861y ? 1 : 0);
        long j2 = this.f7862z;
        SafeParcelWriter.m3588n(parcel, 9, 8);
        parcel.writeLong(j2);
        SafeParcelWriter.m3583i(parcel, 10, this.f7853A);
        int i3 = this.f7854B;
        SafeParcelWriter.m3588n(parcel, 11, 4);
        parcel.writeInt(i3);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
