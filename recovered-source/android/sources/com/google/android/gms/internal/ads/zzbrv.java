package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbrv implements zzate {

    /* JADX INFO: renamed from: a */
    public volatile zzbri f9307a;

    /* JADX INFO: renamed from: b */
    public final Context f9308b;

    public zzbrv(Context context) {
        this.f9308b = context;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x013a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x013b  */
    /* JADX WARN: Code duplicated, block: B:36:0x013f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0148  */
    /* JADX WARN: Code duplicated, block: B:42:0x0150 A[LOOP:1: B:40:0x014d->B:42:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x016b  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzate
    /* JADX INFO: renamed from: a */
    public final zzath mo3107a(zzatl zzatlVar) {
        SafeParcelable safeParcelable;
        zzbrl zzbrlVar;
        String[] strArr;
        String[] strArr2;
        HashMap map;
        Parcelable.Creator<zzbrj> creator = zzbrj.CREATOR;
        Map mapMo3111g = zzatlVar.mo3111g();
        int size = mapMo3111g.size();
        String[] strArr3 = new String[size];
        String[] strArr4 = new String[size];
        int i2 = 0;
        for (Map.Entry entry : mapMo3111g.entrySet()) {
            strArr3[i2] = (String) entry.getKey();
            strArr4[i2] = (String) entry.getValue();
            i2++;
        }
        zzbrj zzbrjVar = new zzbrj(zzatlVar.f6893u, strArr3, strArr4);
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zztVar.f3711k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            zzcgd zzcgdVar = new zzcgd();
            this.f9307a = new zzbri(166, zzcbu.m5311a(this.f9308b), zztVar.f3720t.m3128a(), new zzbrt(this, zzcgdVar), new zzbru(this, zzcgdVar));
            this.f9307a.checkAvailabilityAndConnect();
            zzbrr zzbrrVar = new zzbrr(this, zzbrjVar);
            zzhcp zzhcpVar = zzcfy.f9946a;
            ListenableFuture listenableFutureM7373g = zzhcf.m7373g(zzhcf.m7374h(zzcgdVar, zzbrrVar, zzhcpVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8730r5)).intValue(), TimeUnit.MILLISECONDS, zzcfy.f9949d);
            listenableFutureM7373g.addListener(new zzbrs(this), zzhcpVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) listenableFutureM7373g.get();
            zztVar.f3711k.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 32);
            sb.append("Http assets remote cache took ");
            sb.append(jElapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
            zzcbi zzcbiVar = new zzcbi(parcelFileDescriptor);
            Parcelable.Creator<zzbrl> creator2 = zzbrl.CREATOR;
            if (zzcbiVar.f9676u) {
                if (zzcbiVar.f9674s == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.m3070c("File descriptor is empty, returning null.");
                } else {
                    DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(zzcbiVar.f9674s));
                    try {
                        try {
                            int i3 = dataInputStream.readInt();
                            byte[] bArr = new byte[i3];
                            dataInputStream.readFully(bArr, 0, i3);
                            IOUtils.m3649a(dataInputStream);
                            Parcel parcelObtain = Parcel.obtain();
                            try {
                                parcelObtain.unmarshall(bArr, 0, i3);
                                parcelObtain.setDataPosition(0);
                                zzcbiVar.f9675t = creator2.createFromParcel(parcelObtain);
                                parcelObtain.recycle();
                                zzcbiVar.f9676u = false;
                                safeParcelable = (SafeParcelable) zzcbiVar.f9675t;
                            } catch (Throwable th) {
                                parcelObtain.recycle();
                                throw th;
                            }
                        } catch (IOException e) {
                            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Could not read from parcel file descriptor", e);
                            IOUtils.m3649a(dataInputStream);
                            safeParcelable = null;
                            zzbrlVar = (zzbrl) safeParcelable;
                            if (zzbrlVar == null) {
                                return null;
                            }
                            if (!zzbrlVar.f9293s) {
                                throw new zzatu(zzbrlVar.f9294t);
                            }
                            strArr = zzbrlVar.f9297w;
                            strArr2 = zzbrlVar.f9298x;
                            if (strArr.length != strArr2.length) {
                                return null;
                            }
                            map = new HashMap();
                            for (int i5 = 0; i5 < strArr.length; i5++) {
                                map.put(strArr[i5], strArr2[i5]);
                            }
                            return new zzath(zzbrlVar.f9295u, zzbrlVar.f9296v, map, zzath.m4387a(map), zzbrlVar.f9299y);
                        }
                    } catch (Throwable th2) {
                        IOUtils.m3649a(dataInputStream);
                        throw th2;
                    }
                }
                safeParcelable = null;
            } else {
                safeParcelable = (SafeParcelable) zzcbiVar.f9675t;
            }
            zzbrlVar = (zzbrl) safeParcelable;
            if (zzbrlVar == null) {
                return null;
            }
            if (!zzbrlVar.f9293s) {
                throw new zzatu(zzbrlVar.f9294t);
            }
            strArr = zzbrlVar.f9297w;
            strArr2 = zzbrlVar.f9298x;
            if (strArr.length != strArr2.length) {
                return null;
            }
            map = new HashMap();
            while (i5 < strArr.length) {
                map.put(strArr[i5], strArr2[i5]);
            }
            return new zzath(zzbrlVar.f9295u, zzbrlVar.f9296v, map, zzath.m4387a(map), zzbrlVar.f9299y);
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(jElapsedRealtime3);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.m3150k(sb2.toString());
            return null;
        } catch (Throwable th3) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(jElapsedRealtime4);
            sb3.append("ms");
            com.google.android.gms.ads.internal.util.zze.m3150k(sb3.toString());
            throw th3;
        }
    }
}
