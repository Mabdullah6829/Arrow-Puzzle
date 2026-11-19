package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: s */
    public final int f4141s;

    /* JADX INFO: renamed from: t */
    public final int f4142t;

    /* JADX INFO: renamed from: u */
    public final PendingIntent f4143u;

    /* JADX INFO: renamed from: v */
    public final String f4144v;

    /* JADX INFO: renamed from: w */
    public final Integer f4145w;

    /* JADX INFO: renamed from: x */
    public static final ConnectionResult f4140x = new ConnectionResult(null, null, 0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zza();

    public ConnectionResult(int i2, int i3, PendingIntent pendingIntent, String str, Integer num) {
        this.f4141s = i2;
        this.f4142t = i3;
        this.f4143u = pendingIntent;
        this.f4144v = str;
        this.f4145w = num;
    }

    /* JADX INFO: renamed from: J */
    public static String m3392J(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i2).length() + 20), "UNKNOWN_ERROR_CODE(", i2, ")");
                }
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m3393H() {
        return this.f4142t == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f4142t == connectionResult.f4142t && Objects.m3535a(this.f4143u, connectionResult.f4143u) && Objects.m3535a(this.f4144v, connectionResult.f4144v) && Objects.m3535a(this.f4145w, connectionResult.f4145w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4142t), this.f4143u, this.f4144v, this.f4145w});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.m3536a(m3392J(this.f4142t), "statusCode");
        toStringHelper.m3536a(this.f4143u, "resolution");
        toStringHelper.m3536a(this.f4144v, "message");
        toStringHelper.m3536a(this.f4145w, "clientMethodKey");
        return toStringHelper.toString();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m3394w() {
        return (this.f4142t == 0 || this.f4143u == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4141s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f4142t);
        SafeParcelWriter.m3582h(parcel, 3, this.f4143u, i2);
        SafeParcelWriter.m3583i(parcel, 4, this.f4144v);
        Integer num = this.f4145w;
        if (num != null) {
            SafeParcelWriter.m3588n(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public ConnectionResult(String str, PendingIntent pendingIntent, int i2) {
        this(1, i2, pendingIntent, str, null);
    }
}
