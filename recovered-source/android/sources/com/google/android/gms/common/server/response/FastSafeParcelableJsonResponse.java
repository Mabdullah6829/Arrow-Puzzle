package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* JADX INFO: renamed from: c */
    public Object mo3625c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* JADX INFO: renamed from: e */
    public boolean mo3627e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field field : mo3623a().values()) {
            if (m3626d(field)) {
                if (!fastJsonResponse.m3626d(field) || !Objects.m3535a(m3624b(field), fastJsonResponse.m3624b(field))) {
                    return false;
                }
            } else if (fastJsonResponse.m3626d(field)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (FastJsonResponse.Field field : mo3623a().values()) {
            if (m3626d(field)) {
                Object objM3624b = m3624b(field);
                Preconditions.m3544h(objM3624b);
                iHashCode = (iHashCode * 31) + objM3624b.hashCode();
            }
        }
        return iHashCode;
    }
}
