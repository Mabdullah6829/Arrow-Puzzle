package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzgry {

    /* JADX INFO: renamed from: c */
    public static final zzgsq f18131c = new zzgsq("OverlayDisplayService");

    /* JADX INFO: renamed from: d */
    public static final Intent f18132d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a */
    public final zzgsp f18133a;

    /* JADX INFO: renamed from: b */
    public final String f18134b;

    public zzgry(Context context) {
        if (zzgss.m7114a(context)) {
            Context applicationContext = context.getApplicationContext();
            int i2 = zzgrj.f18109a;
            this.f18133a = new zzgsp(applicationContext, f18131c, f18132d);
        } else {
            this.f18133a = null;
        }
        this.f18134b = context.getPackageName();
    }

    /* JADX INFO: renamed from: b */
    public static void m7104b(String str, zzgrx zzgrxVar) {
        if ((str == null ? "" : str).trim().isEmpty()) {
            return;
        }
        str.getClass();
        zzgrxVar.zza(str.trim());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7105c(zzgsd zzgsdVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2 == null) {
                str2 = "";
            }
            if (!str2.trim().isEmpty()) {
                return true;
            }
        }
        f18131c.m7112c(str, new Object[0]);
        zzgra zzgraVar = new zzgra();
        byte b = (byte) (zzgraVar.f18099e | 1);
        zzgraVar.f18097c = 0;
        zzgraVar.f18095a = 8160;
        zzgraVar.f18099e = (byte) (((byte) (b | 2)) | 1);
        zzgsdVar.mo3025a(zzgraVar.m7092a());
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m7106a(final zzgsf zzgsfVar, final zzgsd zzgsdVar, final int i2) {
        zzgsp zzgspVar = this.f18133a;
        if (zzgspVar == null) {
            f18131c.m7112c("error: %s", "Play Store not found.");
        } else if (m7105c(zzgsdVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(zzgsfVar.mo7100a(), zzgsfVar.mo7101b()))) {
            zzgspVar.m7108a(new zzgsl(zzgspVar, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgrm
                @Override // java.lang.Runnable
                public final void run() {
                    zzgsf zzgsfVar2 = zzgsfVar;
                    int i3 = i2;
                    zzgsd zzgsdVar2 = zzgsdVar;
                    zzgry zzgryVar = this.f18114s;
                    String str = zzgryVar.f18134b;
                    try {
                        zzgsp zzgspVar2 = zzgryVar.f18133a;
                        if (zzgspVar2 == null) {
                            throw null;
                        }
                        zzgqt zzgqtVar = zzgspVar2.f18155j;
                        if (zzgqtVar == null) {
                            return;
                        }
                        final Bundle bundle = new Bundle();
                        bundle.putString("callerPackage", str);
                        bundle.putInt("displayMode", i3);
                        zzgry.m7104b(zzgsfVar2.mo7100a(), new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgru
                            @Override // com.google.android.gms.internal.ads.zzgrx
                            public final /* synthetic */ void zza(String str2) {
                                zzgsq zzgsqVar = zzgry.f18131c;
                                bundle.putString("sessionToken", str2);
                            }
                        });
                        zzgry.m7104b(zzgsfVar2.mo7101b(), new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgrl
                            @Override // com.google.android.gms.internal.ads.zzgrx
                            public final /* synthetic */ void zza(String str2) {
                                zzgsq zzgsqVar = zzgry.f18131c;
                                bundle.putString("appId", str2);
                            }
                        });
                        zzgqtVar.mo7068D2(bundle, new zzgrw(zzgryVar, zzgsdVar2));
                    } catch (RemoteException e) {
                        zzgry.f18131c.m7113d(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i3), str);
                    }
                }
            }));
        }
    }
}
