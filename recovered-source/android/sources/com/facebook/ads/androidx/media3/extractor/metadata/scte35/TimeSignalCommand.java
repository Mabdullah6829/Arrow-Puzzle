package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.viewpoint.core.C21864v;
import com.instagram.common.viewpoint.core.C219453;
import com.instagram.common.viewpoint.core.C3013Ic;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static String[] A02 = {"fBCCr7VwDgvhDxdGkzRiY2TvWvmZmARS", "lBD0fDkRFVdGPYWDbMcaGx4cyXv4WEJh", "6y4HJXgmtxqVkaNMzYZBmSXA6CGxm4DJ", "vpsLDrGqE5zherZQZMMLL6G3cLRsG8Dm", "qp0fDGr3Nzl8ahCuvet6k2311zos", "c5cBfT4Hj52dvZvyRqGaKhWxL68ft04u", "OtVyWYxYdMxR9geYu5t1Sc80NPuk", "8DkmlbSWSEaEI0nee1I51BPAFd"};
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C3013Ic();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j2, long j3) {
        this.A01 = j2;
        this.A00 = j3;
    }

    public /* synthetic */ TimeSignalCommand(long j2, long j3, C3013Ic c3013Ic) {
        this(j2, j3);
    }

    public static long A00(C21864v c21864v, long j2) {
        long jA0I = c21864v.A0I();
        if ((128 & jA0I) == 0) {
            return -9223372036854775807L;
        }
        long firstByte = c21864v.A0Q();
        long j3 = (((1 & jA0I) << 32) | firstByte) + j2;
        if (A02[7].length() == 21) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[5] = "5vtaLYhnTEc2lUg08l0YEv2QqnnKhzp8";
        strArr[0] = "gGhCeZV4kOFdoFbuN1d60dh6MMvStMtQ";
        return j3 & 8589934591L;
    }

    public static TimeSignalCommand A01(C21864v c21864v, long j2, C219453 c219453) {
        long jA00 = A00(c21864v, j2);
        return new TimeSignalCommand(jA00, c219453.A06(jA00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
