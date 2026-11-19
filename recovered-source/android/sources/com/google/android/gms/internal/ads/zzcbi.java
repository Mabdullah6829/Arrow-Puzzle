package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzcbi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbi> CREATOR = new zzcbj();

    /* JADX INFO: renamed from: s */
    public ParcelFileDescriptor f9674s;

    /* JADX INFO: renamed from: t */
    public Parcelable f9675t = null;

    /* JADX INFO: renamed from: u */
    public boolean f9676u = true;

    public zzcbi(ParcelFileDescriptor parcelFileDescriptor) {
        this.f9674s = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f9674s == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.f9675t.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                    try {
                        ((zzcfx) zzcfy.f9946a).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbh
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                Parcelable.Creator<zzcbi> creator = zzcbi.CREATOR;
                                byte[] bArr = bArrMarshall;
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = autoCloseOutputStream;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(autoCloseOutputStream2);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            IOUtils.m3649a(dataOutputStream2);
                                        } catch (IOException e) {
                                            e = e;
                                            dataOutputStream = dataOutputStream2;
                                            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error transporting the ad response", e);
                                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("LargeParcelTeleporter.pipeData.1", e);
                                            if (dataOutputStream == null) {
                                                IOUtils.m3649a(autoCloseOutputStream2);
                                            } else {
                                                IOUtils.m3649a(dataOutputStream);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                IOUtils.m3649a(autoCloseOutputStream2);
                                            } else {
                                                IOUtils.m3649a(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        });
                        parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    } catch (IOException e) {
                        e = e;
                        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error transporting the ad response", e);
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("LargeParcelTeleporter.pipeData.2", e);
                        IOUtils.m3649a(autoCloseOutputStream);
                    }
                } catch (IOException e2) {
                    e = e2;
                    autoCloseOutputStream = null;
                }
                this.f9674s = parcelFileDescriptor;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3582h(parcel, 2, this.f9674s, i2);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
