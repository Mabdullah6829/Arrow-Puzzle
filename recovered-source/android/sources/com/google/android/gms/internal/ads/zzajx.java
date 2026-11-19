package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajx extends zzajs {

    /* JADX INFO: renamed from: b */
    public final String f5566b;

    /* JADX INFO: renamed from: c */
    public final zzgwt f5567c;

    /* JADX WARN: Multi-variable type inference failed */
    public zzajx(String str, String str2, List list) {
        super(str);
        zzgtr.m7128a(!((AbstractCollection) list).isEmpty());
        this.f5566b = str2;
        zzgwt zzgwtVarM7220t = zzgwt.m7220t(list);
        this.f5567c = zzgwtVarM7220t;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m4161b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzao
    /* JADX INFO: renamed from: a */
    public final void mo4149a(zzam zzamVar) {
        byte b;
        switch (this.f5554a) {
            case "TAL":
                b = 6;
                break;
            case "TCM":
                b = 16;
                break;
            case "TDA":
                b = 12;
                break;
            case "TP1":
                b = 2;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 18;
                break;
            case "TRK":
                b = 8;
                break;
            case "TT2":
                b = 0;
                break;
            case "TXT":
                b = 20;
                break;
            case "TYE":
                b = 10;
                break;
            case "TALB":
                b = 7;
                break;
            case "TCOM":
                b = 17;
                break;
            case "TCON":
                b = 22;
                break;
            case "TDAT":
                b = 13;
                break;
            case "TDRC":
                b = 14;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 21;
                break;
            case "TIT2":
                b = 1;
                break;
            case "TPE1":
                b = 3;
                break;
            case "TPE2":
                b = 5;
                break;
            case "TPE3":
                b = 19;
                break;
            case "TRCK":
                b = 9;
                break;
            case "TYER":
                b = 11;
                break;
            default:
                b = -1;
                break;
        }
        zzgwt zzgwtVar = this.f5567c;
        try {
            switch (b) {
                case 0:
                case 1:
                    zzamVar.f5899a = (CharSequence) zzgwtVar.get(0);
                    break;
                case 2:
                case 3:
                    zzamVar.f5900b = (CharSequence) zzgwtVar.get(0);
                    break;
                case 4:
                case 5:
                    zzamVar.f5902d = (CharSequence) zzgwtVar.get(0);
                    break;
                case 6:
                case 7:
                    zzamVar.f5901c = (CharSequence) zzgwtVar.get(0);
                    break;
                case 8:
                case 9:
                    String str = (String) zzgwtVar.get(0);
                    String str2 = zzfm.f16091a;
                    String[] strArrSplit = str.split("/", -1);
                    int i2 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    zzamVar.f5906h = Integer.valueOf(i2);
                    zzamVar.f5907i = numValueOf;
                    break;
                case 10:
                case 11:
                    zzamVar.f5910l = Integer.valueOf(Integer.parseInt((String) zzgwtVar.get(0)));
                    break;
                case 12:
                case 13:
                    String str3 = (String) zzgwtVar.get(0);
                    int i3 = Integer.parseInt(str3.substring(2, 4));
                    int i4 = Integer.parseInt(str3.substring(0, 2));
                    zzamVar.f5911m = Integer.valueOf(i3);
                    zzamVar.f5912n = Integer.valueOf(i4);
                    break;
                case 14:
                    ArrayList arrayListM4161b = m4161b((String) zzgwtVar.get(0));
                    int size = arrayListM4161b.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                zzamVar.f5912n = (Integer) arrayListM4161b.get(2);
                            }
                        }
                        zzamVar.f5911m = (Integer) arrayListM4161b.get(1);
                    }
                    zzamVar.f5910l = (Integer) arrayListM4161b.get(0);
                    break;
                case 15:
                    ArrayList arrayListM4161b2 = m4161b((String) zzgwtVar.get(0));
                    int size2 = arrayListM4161b2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                zzamVar.f5915q = (Integer) arrayListM4161b2.get(2);
                            }
                        }
                        zzamVar.f5914p = (Integer) arrayListM4161b2.get(1);
                    }
                    zzamVar.f5913o = (Integer) arrayListM4161b2.get(0);
                    break;
                case 16:
                case 17:
                    zzamVar.f5917s = (CharSequence) zzgwtVar.get(0);
                    break;
                case 18:
                case 19:
                    zzamVar.f5918t = (CharSequence) zzgwtVar.get(0);
                    break;
                case 20:
                case 21:
                    zzamVar.f5916r = (CharSequence) zzgwtVar.get(0);
                    break;
                case 22:
                    Integer numM7309f = zzhaq.m7309f((String) zzgwtVar.get(0));
                    if (numM7309f != null) {
                        String strM4160a = zzajt.m4160a(numM7309f.intValue());
                        if (strM4160a != null) {
                            zzamVar.f5921w = strM4160a;
                        }
                    } else {
                        zzamVar.f5921w = (CharSequence) zzgwtVar.get(0);
                    }
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajx.class == obj.getClass()) {
            zzajx zzajxVar = (zzajx) obj;
            if (Objects.equals(this.f5554a, zzajxVar.f5554a) && Objects.equals(this.f5566b, zzajxVar.f5566b) && this.f5567c.equals(zzajxVar.f5567c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f5554a.hashCode() + 527;
        String str = this.f5566b;
        return this.f5567c.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final String toString() {
        String strValueOf = String.valueOf(this.f5567c);
        String str = this.f5554a;
        int length = String.valueOf(str).length();
        String str2 = this.f5566b;
        StringBuilder sb = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + strValueOf.length());
        AbstractC0271e0.m413u(sb, str, ": description=", str2, ": values=");
        sb.append(strValueOf);
        return sb.toString();
    }
}
