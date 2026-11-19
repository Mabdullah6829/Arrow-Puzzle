package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    /* JADX INFO: renamed from: A */
    public final boolean f3249A;

    /* JADX INFO: renamed from: B */
    public boolean f3250B;

    /* JADX INFO: renamed from: C */
    public final boolean f3251C;

    /* JADX INFO: renamed from: D */
    public final boolean f3252D;

    /* JADX INFO: renamed from: E */
    public final boolean f3253E;

    /* JADX INFO: renamed from: F */
    public final boolean f3254F;

    /* JADX INFO: renamed from: G */
    public final boolean f3255G;

    /* JADX INFO: renamed from: H */
    public final boolean f3256H;

    /* JADX INFO: renamed from: s */
    public final String f3257s;

    /* JADX INFO: renamed from: t */
    public final int f3258t;

    /* JADX INFO: renamed from: u */
    public final int f3259u;

    /* JADX INFO: renamed from: v */
    public final boolean f3260v;

    /* JADX INFO: renamed from: w */
    public final int f3261w;

    /* JADX INFO: renamed from: x */
    public final int f3262x;

    /* JADX INFO: renamed from: y */
    public final zzr[] f3263y;

    /* JADX INFO: renamed from: z */
    public final boolean f3264z;

    public zzr() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
    }

    /* JADX INFO: renamed from: H */
    public static zzr m2980H() {
        return new zzr("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false, false);
    }

    /* JADX INFO: renamed from: w */
    public static zzr m2981w() {
        return new zzr("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 2, this.f3257s);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f3258t);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f3259u);
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f3260v ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 6, 4);
        parcel.writeInt(this.f3261w);
        SafeParcelWriter.m3588n(parcel, 7, 4);
        parcel.writeInt(this.f3262x);
        SafeParcelWriter.m3586l(parcel, 8, this.f3263y, i2);
        SafeParcelWriter.m3588n(parcel, 9, 4);
        parcel.writeInt(this.f3264z ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 10, 4);
        parcel.writeInt(this.f3249A ? 1 : 0);
        boolean z = this.f3250B;
        SafeParcelWriter.m3588n(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 12, 4);
        parcel.writeInt(this.f3251C ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 13, 4);
        parcel.writeInt(this.f3252D ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 14, 4);
        parcel.writeInt(this.f3253E ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 15, 4);
        parcel.writeInt(this.f3254F ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 16, 4);
        parcel.writeInt(this.f3255G ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 17, 4);
        parcel.writeInt(this.f3256H ? 1 : 0);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public zzr(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
    public zzr(Context context, AdSize[] adSizeArr) {
        int i2;
        int i3;
        String string;
        int dimensionPixelSize;
        AdSize adSize = adSizeArr[0];
        this.f3260v = false;
        int i4 = adSize.f2956a;
        int i5 = adSize.f2957b;
        boolean z = i4 == -3 && i5 == -4;
        this.f3249A = z;
        this.f3253E = adSize.f2959d;
        boolean z2 = adSize.f2960e;
        this.f3254F = z2;
        boolean z3 = adSize.f2962g;
        this.f3255G = z3;
        this.f3256H = false;
        if (z) {
            AdSize adSize2 = AdSize.f2946i;
            this.f3261w = adSize2.f2956a;
            i5 = adSize2.f2957b;
            this.f3258t = i5;
        } else if (z2) {
            this.f3261w = i4;
            i5 = adSize.f2961f;
            this.f3258t = i5;
        } else if (z3) {
            this.f3261w = i4;
            i5 = adSize.f2963h;
            this.f3258t = i5;
        } else {
            this.f3261w = i4;
            this.f3258t = i5;
        }
        boolean z4 = this.f3261w == -1;
        boolean z5 = i5 == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z4) {
            com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzay.f3085g.f3086a;
            if (context.getResources().getConfiguration().orientation == 2) {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (((int) (displayMetrics2.heightPixels / displayMetrics2.density)) < 600) {
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i6 = displayMetrics3.heightPixels;
                        int i7 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i8 = displayMetrics3.heightPixels;
                        int i9 = displayMetrics3.widthPixels;
                        if (i8 == i6 && i9 == i7) {
                            int i10 = displayMetrics.widthPixels;
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i10 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.f3262x = dimensionPixelSize;
                        } else {
                            dimensionPixelSize = displayMetrics.widthPixels;
                            this.f3262x = dimensionPixelSize;
                        }
                    } else {
                        dimensionPixelSize = displayMetrics.widthPixels;
                        this.f3262x = dimensionPixelSize;
                    }
                } else {
                    dimensionPixelSize = displayMetrics.widthPixels;
                    this.f3262x = dimensionPixelSize;
                }
            } else {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.f3262x = dimensionPixelSize;
            }
            double d = dimensionPixelSize / displayMetrics.density;
            i2 = (int) d;
            if (d - ((double) i2) >= 0.01d) {
                i2++;
            }
        } else {
            i2 = this.f3261w;
            com.google.android.gms.ads.internal.util.client.zzf zzfVar2 = zzay.f3085g.f3086a;
            this.f3262x = com.google.android.gms.ads.internal.util.client.zzf.m3041r(displayMetrics, i2);
        }
        if (z5) {
            int i11 = (int) (displayMetrics.heightPixels / displayMetrics.density);
            i3 = i11 <= 400 ? 32 : i11 <= 720 ? 50 : 90;
        } else {
            i3 = this.f3258t;
        }
        com.google.android.gms.ads.internal.util.client.zzf zzfVar3 = zzay.f3085g.f3086a;
        this.f3259u = com.google.android.gms.ads.internal.util.client.zzf.m3041r(displayMetrics, i3);
        if (z4 || z5) {
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + AbstractC1456a.m2434a(i2, 1) + 3);
            sb.append(i2);
            sb.append("x");
            sb.append(i3);
            sb.append("_as");
            this.f3257s = sb.toString();
        } else {
            if (z2 || z3) {
                int i12 = this.f3261w;
                int i13 = this.f3258t;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + AbstractC1456a.m2434a(i12, 1) + 3);
                sb2.append(i12);
                sb2.append("x");
                sb2.append(i13);
                sb2.append("_as");
                string = sb2.toString();
            } else if (z) {
                string = "320x50_mb";
            } else {
                this.f3257s = adSize.f2958c;
            }
            this.f3257s = string;
        }
        int length = adSizeArr.length;
        if (length > 1) {
            this.f3263y = new zzr[length];
            for (int i14 = 0; i14 < adSizeArr.length; i14++) {
                this.f3263y[i14] = new zzr(context, adSizeArr[i14]);
            }
        } else {
            this.f3263y = null;
        }
        this.f3264z = false;
        this.f3250B = false;
    }

    public zzr(String str, int i2, int i3, boolean z, int i4, int i5, zzr[] zzrVarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f3257s = str;
        this.f3258t = i2;
        this.f3259u = i3;
        this.f3260v = z;
        this.f3261w = i4;
        this.f3262x = i5;
        this.f3263y = zzrVarArr;
        this.f3264z = z2;
        this.f3249A = z3;
        this.f3250B = z4;
        this.f3251C = z5;
        this.f3252D = z6;
        this.f3253E = z7;
        this.f3254F = z8;
        this.f3255G = z9;
        this.f3256H = z10;
    }
}
