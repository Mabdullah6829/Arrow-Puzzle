package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzaah implements zzgts {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzaaz f4761s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzaan f4762t;

    public /* synthetic */ zzaah(zzaaz zzaazVar, zzaan zzaanVar) {
        this.f4761s = zzaazVar;
        this.f4762t = zzaanVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:94:0x0111  */
    @Override // com.google.android.gms.internal.ads.zzgts
    /* JADX INFO: renamed from: b */
    public final boolean mo3897b(Object obj) {
        zzaaz zzaazVar;
        Boolean bool;
        zzaco zzacoVar;
        Spatializer spatializer;
        Spatializer spatializer2;
        Spatializer spatializer3;
        boolean zCanBeSpatialized;
        Spatializer spatializer4;
        int i2;
        byte b;
        zzaco zzacoVar2;
        zzv zzvVar = (zzv) obj;
        if (this.f4762t.f4779A && ((bool = (zzaazVar = this.f4761s).f4833i) == null || !bool.booleanValue())) {
            int i3 = zzvVar.f21037G;
            String str = zzvVar.f21061o;
            if (i3 != -1 && i3 > 2) {
                if (str == null) {
                    if (Build.VERSION.SDK_INT >= 32 && (zzacoVar = zzaazVar.f4831g) != null && zzacoVar.f4918b && (spatializer = zzacoVar.f4917a) != null && spatializer.isAvailable() && (spatializer2 = zzaazVar.f4831g.f4917a) != null && spatializer2.isEnabled()) {
                        zzaco zzacoVar3 = zzaazVar.f4831g;
                        zzd zzdVar = zzaazVar.f4832h;
                        spatializer3 = zzacoVar3.f4917a;
                        if (spatializer3 == null && zzacoVar3.f4918b && spatializer3.isAvailable() && (spatializer4 = zzacoVar3.f4917a) != null && spatializer4.isEnabled()) {
                            int i4 = zzvVar.f21037G;
                            if (Objects.equals(str, "audio/eac3-joc")) {
                                if (i4 == 16) {
                                    i2 = 12;
                                } else {
                                    i2 = i4;
                                }
                            } else if (Objects.equals(str, "audio/iamf")) {
                                if (i4 == -1) {
                                    i2 = 6;
                                } else {
                                    i2 = i4;
                                }
                            } else if (Objects.equals(str, "audio/ac4") && (i4 == 18 || i4 == 21)) {
                                i2 = 24;
                            } else {
                                i2 = i4;
                            }
                            int iM6503e = zzvVar.f21038H;
                            if (iM6503e == -1 || i4 != i2) {
                                iM6503e = zzfm.m6503e(i2);
                            }
                            if (iM6503e != 0) {
                                AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM6503e);
                                int i5 = zzvVar.f21039I;
                                if (i5 != -1) {
                                    channelMask.setSampleRate(i5);
                                }
                                Spatializer spatializer5 = zzacoVar3.f4917a;
                                spatializer5.getClass();
                                zCanBeSpatialized = AbstractC5147a.m3718c(spatializer5).canBeSpatialized(zzdVar.m5884a(), channelMask.build());
                            } else {
                                zCanBeSpatialized = false;
                            }
                        } else {
                            zCanBeSpatialized = false;
                        }
                        if (zCanBeSpatialized) {
                        }
                    }
                    return false;
                }
                switch (str) {
                    case "audio/eac3-joc":
                        b = 2;
                        break;
                    case "audio/ac3":
                        b = 0;
                        break;
                    case "audio/ac4":
                        b = 3;
                        break;
                    case "audio/eac3":
                        b = 1;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if ((b != 0 && b != 1 && b != 2 && b != 3) || (Build.VERSION.SDK_INT >= 32 && (zzacoVar2 = zzaazVar.f4831g) != null && zzacoVar2.f4918b)) {
                    if (Build.VERSION.SDK_INT >= 32) {
                        zzaco zzacoVar4 = zzaazVar.f4831g;
                        zzd zzdVar2 = zzaazVar.f4832h;
                        spatializer3 = zzacoVar4.f4917a;
                        if (spatializer3 == null) {
                            zCanBeSpatialized = false;
                        } else {
                            zCanBeSpatialized = false;
                        }
                        if (zCanBeSpatialized) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
