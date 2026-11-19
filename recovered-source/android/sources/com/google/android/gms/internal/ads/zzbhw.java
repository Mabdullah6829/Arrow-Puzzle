package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbhw {

    /* JADX INFO: renamed from: a */
    public final zzbib f7884a;

    /* JADX INFO: renamed from: b */
    public final zzbic.zzt.zza f7885b;

    /* JADX INFO: renamed from: c */
    public final boolean f7886c;

    private zzbhw() {
        this.f7885b = zzbic.zzt.m4992P();
        this.f7886c = false;
        this.f7884a = new zzbib();
    }

    /* JADX INFO: renamed from: a */
    public static zzbhw m4893a() {
        return new zzbhw();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4894b(zzbhv zzbhvVar) {
        if (this.f7886c) {
            try {
                zzbhvVar.mo4892a(this.f7885b);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdMobClearcutLogger.modify", e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m4895c(int i2) {
        if (this.f7886c) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8477c6)).booleanValue()) {
                m4897e(i2);
            } else {
                m4896d(i2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m4896d(int i2) {
        zzbic.zzt.zza zzaVar = this.f7885b;
        zzaVar.m8326l();
        ((zzbic.zzt) zzaVar.f19780t).m4998J();
        ArrayList arrayListM3192J = com.google.android.gms.ads.internal.util.zzs.m3192J();
        zzaVar.m8326l();
        ((zzbic.zzt) zzaVar.f19780t).m4997I(arrayListM3192J);
        final zzbia zzbiaVar = new zzbia(this.f7884a, ((zzbic.zzt) zzaVar.m8328o()).m8099h());
        int i3 = i2 - 1;
        zzbiaVar.f7892b = i3;
        synchronized (zzbiaVar) {
            zzbiaVar.f7893c.f7896c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhz
                @Override // java.lang.Runnable
                public final void run() {
                    zzbia zzbiaVar2 = zzbiaVar;
                    synchronized (zzbiaVar2) {
                        try {
                            zzbib zzbibVar = zzbiaVar2.f7893c;
                            if (zzbibVar.f7895b) {
                                zzbibVar.f7894a.mo4822P2(zzbiaVar2.f7891a);
                                zzbibVar.f7894a.mo4820I(0);
                                zzbibVar.f7894a.mo4823R(zzbiaVar2.f7892b);
                                zzbibVar.f7894a.mo4824S0();
                                zzbibVar.f7894a.mo4825b();
                            }
                        } catch (RemoteException e) {
                            com.google.android.gms.ads.internal.util.client.zzo.m3069b("Clearcut log failed", e);
                        }
                    }
                }
            });
        }
        com.google.android.gms.ads.internal.util.zze.m3150k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i3, 10))));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m4897e(int i2) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        zzfzu.f16872a.getClass();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfzv.m6833a(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                fileOutputStream.write(m4898f(i2).getBytes());
            } catch (IOException unused) {
                com.google.android.gms.ads.internal.util.zze.m3150k("Could not write Clearcut to file.");
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                    com.google.android.gms.ads.internal.util.zze.m3150k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused3) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Could not find file for Clearcut");
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized String m4898f(int i2) {
        StringBuilder sb;
        zzbic.zzt.zza zzaVar = this.f7885b;
        String strM5003O = ((zzbic.zzt) zzaVar.f19780t).m5003O();
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(((zzbic.zzt) zzaVar.m8328o()).m8099h(), 3);
        sb = new StringBuilder("id=");
        sb.append(strM5003O);
        sb.append(",timestamp=");
        sb.append(jElapsedRealtime);
        sb.append(",event=");
        sb.append(i2 - 1);
        sb.append(",data=");
        sb.append(strEncodeToString);
        sb.append("\n");
        return sb.toString();
    }

    public zzbhw(zzbib zzbibVar) {
        this.f7885b = zzbic.zzt.m4992P();
        this.f7884a = zzbibVar;
        this.f7886c = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8460b6)).booleanValue();
    }
}
