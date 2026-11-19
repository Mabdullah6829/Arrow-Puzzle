package com.facebook.ads.androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.instagram.common.viewpoint.core.AbstractC20843E;
import com.instagram.common.viewpoint.core.AbstractC5129rd;
import com.instagram.common.viewpoint.core.C2999IN;
import com.instagram.common.viewpoint.core.C5064qI;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static byte[] A05;
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{13, 1, 81, 73, 80, 85, 80, 49, 83, 70, 84, 70, 79, 85, 66, 85, 74, 80, 79, 53, 74, 78, 70, 84, 85, 66, 78, 81, 54, 84, 30, -27, -39, 41, 33, 40, 45, 40, 12, 34, 51, 30, -10, 3, -9, 77, 64, 59, 60, 70, 42, 64, 81, 60, 20, -49, -61, 25, 12, 7, 8, 18, -10, 23, 4, 21, 23, -13, 18, 22, 12, 23, 12, 18, 17, -32, 18, 52, 57, 46, 52, 51, -27, 53, 45, 52, 57, 52, -27, 50, 42, 57, 38, 41, 38, 57, 38, -1, -27, 53, 45, 52, 57, 52, 24, 57, 38, 55, 57, 21, 52, 56, 46, 57, 46, 52, 51, 2};
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] A9a() {
        return AbstractC20843E.A01(this);
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ C5064qI A9b() {
        return AbstractC20843E.A00(this);
    }

    static {
        A01();
        CREATOR = new C2999IN();
    }

    public MotionPhotoMetadata(long j2, long j3, long j4, long j5, long j6) {
        this.A02 = j2;
        this.A01 = j3;
        this.A00 = j4;
        this.A04 = j5;
        this.A03 = j6;
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.A02 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A03 = parcel.readLong();
    }

    public /* synthetic */ MotionPhotoMetadata(Parcel parcel, C2999IN c2999in) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.A02 == motionPhotoMetadata.A02 && this.A01 == motionPhotoMetadata.A01 && this.A00 == motionPhotoMetadata.A00 && this.A04 == motionPhotoMetadata.A04 && this.A03 == motionPhotoMetadata.A03;
    }

    public final int hashCode() {
        int result = AbstractC5129rd.A00(this.A02);
        int iA00 = ((((17 * 31) + result) * 31) + AbstractC5129rd.A00(this.A01)) * 31;
        int result2 = AbstractC5129rd.A00(this.A00);
        int iA01 = (((iA00 + result2) * 31) + AbstractC5129rd.A00(this.A04)) * 31;
        int result3 = AbstractC5129rd.A00(this.A03);
        return iA01 + result3;
    }

    public final String toString() {
        return A00(76, 42, 93) + this.A02 + A00(31, 12, 81) + this.A01 + A00(0, 31, C1137R.styleable.ConstraintSet_transitionEasing) + this.A00 + A00(55, 21, 59) + this.A04 + A00(43, 12, 111) + this.A03;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
    }
}
