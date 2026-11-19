package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakc implements zzao {

    /* JADX INFO: renamed from: a */
    public final String f5582a;

    /* JADX INFO: renamed from: b */
    public final String f5583b;

    public zzakc(String str, String str2) {
        this.f5582a = zzgsz.m7120b(str);
        this.f5583b = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzao
    /* JADX INFO: renamed from: a */
    public final void mo4149a(zzam zzamVar) {
        byte b;
        switch (this.f5582a) {
            case "TOTALTRACKS":
                b = 5;
                break;
            case "TOTALDISCS":
                b = 7;
                break;
            case "TRACKNUMBER":
                b = 4;
                break;
            case "ALBUM":
                b = 2;
                break;
            case "GENRE":
                b = 8;
                break;
            case "TITLE":
                b = 0;
                break;
            case "DESCRIPTION":
                b = 9;
                break;
            case "DISCNUMBER":
                b = 6;
                break;
            case "ALBUMARTIST":
                b = 3;
                break;
            case "ARTIST":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        String str = this.f5583b;
        switch (b) {
            case 0:
                zzamVar.f5899a = str;
                break;
            case 1:
                zzamVar.f5900b = str;
                break;
            case 2:
                zzamVar.f5901c = str;
                break;
            case 3:
                zzamVar.f5902d = str;
                break;
            case 4:
                Integer numM7309f = zzhaq.m7309f(str);
                if (numM7309f != null) {
                    zzamVar.f5906h = numM7309f;
                }
                break;
            case 5:
                Integer numM7309f2 = zzhaq.m7309f(str);
                if (numM7309f2 != null) {
                    zzamVar.f5907i = numM7309f2;
                }
                break;
            case 6:
                Integer numM7309f3 = zzhaq.m7309f(str);
                if (numM7309f3 != null) {
                    zzamVar.f5919u = numM7309f3;
                }
                break;
            case 7:
                Integer numM7309f4 = zzhaq.m7309f(str);
                if (numM7309f4 != null) {
                    zzamVar.f5920v = numM7309f4;
                }
                break;
            case 8:
                zzamVar.f5921w = str;
                break;
            case 9:
                zzamVar.f5903e = str;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakc.class == obj.getClass()) {
            zzakc zzakcVar = (zzakc) obj;
            if (this.f5582a.equals(zzakcVar.f5582a) && this.f5583b.equals(zzakcVar.f5583b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5583b.hashCode() + ((this.f5582a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String str = this.f5582a;
        int length = String.valueOf(str).length();
        String str2 = this.f5583b;
        return AbstractC1456a.m2451r(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, "=", str2);
    }
}
