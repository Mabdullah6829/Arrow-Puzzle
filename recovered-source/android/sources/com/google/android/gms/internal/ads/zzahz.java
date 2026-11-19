package com.google.android.gms.internal.ads;

import androidx.core.os.EnvironmentCompat;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
final class zzahz implements zzahs {

    /* JADX INFO: renamed from: a */
    public final zzgwt f5401a;

    /* JADX INFO: renamed from: b */
    public final int f5402b;

    public zzahz(int i2, zzgwt zzgwtVar) {
        this.f5402b = i2;
        this.f5401a = zzgwtVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: a */
    public static zzahz m4138a(int i2, zzeu zzeuVar) {
        String str;
        String str2;
        zzahs zzaiaVar;
        String str3;
        zzgwq zzgwqVar = new zzgwq();
        int i3 = zzeuVar.f14889c;
        int iM4135a = -2;
        while (zzeuVar.m6360B() > 8) {
            int iM6377c = zzeuVar.m6377c();
            int iM6377c2 = zzeuVar.f14888b + zzeuVar.m6377c();
            zzeuVar.m6361C(iM6377c2);
            if (iM6377c != 1414744396) {
                switch (iM6377c) {
                    case 1718776947:
                        if (iM4135a != 2) {
                            if (iM4135a == 1) {
                                int iM6371M = zzeuVar.m6371M();
                                if (iM6371M == 1) {
                                    str2 = "audio/raw";
                                } else if (iM6371M == 85) {
                                    str2 = "audio/mpeg";
                                } else if (iM6371M == 255) {
                                    str2 = "audio/mp4a-latm";
                                } else if (iM6371M != 8192) {
                                    str2 = iM6371M != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str2 = "audio/ac3";
                                }
                                if (str2 != null) {
                                    int iM6371M2 = zzeuVar.m6371M();
                                    int iM6377c3 = zzeuVar.m6377c();
                                    zzeuVar.m6365G(6);
                                    int iM6500b = zzfm.m6500b(zzeuVar.m6371M(), ByteOrder.LITTLE_ENDIAN);
                                    int iM6371M3 = zzeuVar.m6360B() > 0 ? zzeuVar.m6371M() : 0;
                                    zzt zztVar = new zzt();
                                    zztVar.m8853e(str2);
                                    zztVar.f20780F = iM6371M2;
                                    zztVar.f20782H = iM6377c3;
                                    if (str2.equals("audio/raw") && iM6500b != 0) {
                                        zztVar.f20783I = iM6500b;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && iM6371M3 > 0) {
                                        byte[] bArr = new byte[iM6371M3];
                                        zzeuVar.m6366H(bArr, 0, iM6371M3);
                                        zztVar.f20805q = zzgwt.m7216n(bArr);
                                    }
                                    zzaiaVar = new zzaia(new zzv(zztVar));
                                } else {
                                    AbstractC5152f.m3776h(new StringBuilder(String.valueOf(iM6371M).length() + 43), "Ignoring track with unsupported format tag ", iM6371M, "StreamFormatChunk");
                                }
                            } else {
                                String str4 = zzfm.f16091a;
                                switch (iM4135a) {
                                    case -2:
                                        str = "none";
                                        break;
                                    case -1:
                                        str = EnvironmentCompat.MEDIA_UNKNOWN;
                                        break;
                                    case 0:
                                        str = "default";
                                        break;
                                    case 1:
                                        str = "audio";
                                        break;
                                    case 2:
                                        str = "video";
                                        break;
                                    case 3:
                                        str = "text";
                                        break;
                                    case 4:
                                        str = "image";
                                        break;
                                    case 5:
                                        str = "metadata";
                                        break;
                                    default:
                                        str = "camera motion";
                                        break;
                                }
                                zzeh.m6211c("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(str));
                            }
                            zzaiaVar = null;
                            break;
                        } else {
                            zzeuVar.m6365G(4);
                            int iM6377c4 = zzeuVar.m6377c();
                            int iM6377c5 = zzeuVar.m6377c();
                            zzeuVar.m6365G(4);
                            int iM6377c6 = zzeuVar.m6377c();
                            switch (iM6377c6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str3 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str3 = "video/avc";
                                    break;
                                case 842289229:
                                    str3 = "video/mp42";
                                    break;
                                case 859066445:
                                    str3 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str3 = "video/mjpeg";
                                    break;
                                default:
                                    str3 = null;
                                    break;
                            }
                            if (str3 != null) {
                                zzt zztVar2 = new zzt();
                                zztVar2.f20809u = iM6377c4;
                                zztVar2.f20810v = iM6377c5;
                                zztVar2.m8853e(str3);
                                zzaiaVar = new zzaia(new zzv(zztVar2));
                            } else {
                                AbstractC5152f.m3776h(new StringBuilder(String.valueOf(iM6377c6).length() + 44), "Ignoring track with unsupported compression ", iM6377c6, "StreamFormatChunk");
                                zzaiaVar = null;
                            }
                        }
                        break;
                    case 1751742049:
                        int iM6377c7 = zzeuVar.m6377c();
                        zzeuVar.m6365G(8);
                        int iM6377c8 = zzeuVar.m6377c();
                        int iM6377c9 = zzeuVar.m6377c();
                        zzeuVar.m6365G(4);
                        zzeuVar.m6377c();
                        zzeuVar.m6365G(12);
                        zzaiaVar = new zzahw(iM6377c7, iM6377c8, iM6377c9);
                        break;
                    case 1752331379:
                        int iM6377c10 = zzeuVar.m6377c();
                        zzeuVar.m6365G(12);
                        zzeuVar.m6377c();
                        int iM6377c11 = zzeuVar.m6377c();
                        int iM6377c12 = zzeuVar.m6377c();
                        zzeuVar.m6365G(4);
                        int iM6377c13 = zzeuVar.m6377c();
                        int iM6377c14 = zzeuVar.m6377c();
                        zzeuVar.m6365G(4);
                        zzaiaVar = new zzahx(iM6377c10, iM6377c11, iM6377c12, iM6377c13, iM6377c14, zzeuVar.m6377c());
                        break;
                    case 1852994675:
                        zzaiaVar = new zzaib(zzeuVar.m6385k(zzeuVar.m6360B(), StandardCharsets.UTF_8));
                        break;
                    default:
                        zzaiaVar = null;
                        break;
                }
            } else {
                zzaiaVar = m4138a(zzeuVar.m6377c(), zzeuVar);
            }
            if (zzaiaVar != null) {
                if (zzaiaVar.zza() == 1752331379) {
                    iM4135a = ((zzahx) zzaiaVar).m4135a();
                }
                zzgwqVar.m7203c(zzaiaVar);
            }
            zzeuVar.m6363E(iM6377c2);
            zzeuVar.m6361C(i3);
        }
        return new zzahz(i2, zzgwqVar.m7214f());
    }

    /* JADX INFO: renamed from: b */
    public final zzahs m4139b(Class cls) {
        zzgwt zzgwtVar = this.f5401a;
        int size = zzgwtVar.size();
        int i2 = 0;
        while (i2 < size) {
            zzahs zzahsVar = (zzahs) zzgwtVar.get(i2);
            i2++;
            if (zzahsVar.getClass() == cls) {
                return zzahsVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zza() {
        return this.f5402b;
    }
}
