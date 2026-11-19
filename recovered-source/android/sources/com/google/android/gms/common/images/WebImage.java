package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.Locale;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new zah();

    /* JADX INFO: renamed from: s */
    public final int f4398s;

    /* JADX INFO: renamed from: t */
    public final Uri f4399t;

    /* JADX INFO: renamed from: u */
    public final int f4400u;

    /* JADX INFO: renamed from: v */
    public final int f4401v;

    public WebImage(int i2, Uri uri, int i3, int i4) {
        this.f4398s = i2;
        this.f4399t = uri;
        this.f4400u = i3;
        this.f4401v = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (Objects.m3535a(this.f4399t, webImage.f4399t) && this.f4400u == webImage.f4400u && this.f4401v == webImage.f4401v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4399t, Integer.valueOf(this.f4400u), Integer.valueOf(this.f4401v)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String string = this.f4399t.toString();
        StringBuilder sbM409q = AbstractC0271e0.m409q("Image ", this.f4400u, "x", this.f4401v, " ");
        sbM409q.append(string);
        return sbM409q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4398s);
        SafeParcelWriter.m3582h(parcel, 2, this.f4399t, i2);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f4400u);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f4401v);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
