package com.google.android.gms.measurement.internal;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzab {
    final String zzb;
    final int zzc;
    Boolean zzd;
    Boolean zze;
    Long zzf;
    Long zzg;

    public zzab(String str, int i2) {
        this.zzb = str;
        this.zzc = i2;
    }

    private static Boolean zzd(String str, int i2, boolean z, String str2, List list, String str3, zzgu zzguVar) {
        if (i2 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i2 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i2 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (zzguVar != null) {
                        zzguVar.zze().zzb("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    @VisibleForTesting
    public static Boolean zze(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    @VisibleForTesting
    public static Boolean zzf(String str, com.google.android.gms.internal.measurement.zzfr zzfrVar, zzgu zzguVar) {
        List list;
        Preconditions.m3544h(zzfrVar);
        if (str == null || !zzfrVar.m9937A() || zzfrVar.m9944I() == 1 || (zzfrVar.m9944I() != 7 ? !zzfrVar.m9938B() : zzfrVar.m9943G() == 0)) {
            return null;
        }
        int iM9944I = zzfrVar.m9944I();
        boolean zM9941E = zzfrVar.m9941E();
        String strM9939C = (zM9941E || iM9944I == 2 || iM9944I == 7) ? zzfrVar.m9939C() : zzfrVar.m9939C().toUpperCase(Locale.ENGLISH);
        if (zzfrVar.m9943G() == 0) {
            list = null;
        } else {
            List listM9942F = zzfrVar.m9942F();
            if (!zM9941E) {
                ArrayList arrayList = new ArrayList(listM9942F.size());
                Iterator it = listM9942F.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listM9942F = Collections.unmodifiableList(arrayList);
            }
            list = listM9942F;
        }
        return zzd(str, iM9944I, zM9941E, strM9939C, list, iM9944I == 2 ? strM9939C : null, zzguVar);
    }

    public static Boolean zzg(long j2, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        try {
            return zzj(new BigDecimal(j2), zzflVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean zzh(double d, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        try {
            return zzj(new BigDecimal(d), zzflVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean zzi(String str, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        if (!zzpk.zzm(str)) {
            return null;
        }
        try {
            return zzj(new BigDecimal(str), zzflVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    @VisibleForTesting
    public static Boolean zzj(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.zzfl zzflVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i2;
        Preconditions.m3544h(zzflVar);
        if (zzflVar.m9916A()) {
            if (zzflVar.m9925K() != 1 && (zzflVar.m9925K() != 5 ? zzflVar.m9919D() : zzflVar.m9921F() && zzflVar.m9923H())) {
                int iM9925K = zzflVar.m9925K();
                try {
                    if (zzflVar.m9925K() == 5) {
                        if (zzpk.zzm(zzflVar.m9922G()) && zzpk.zzm(zzflVar.m9924I())) {
                            BigDecimal bigDecimal5 = new BigDecimal(zzflVar.m9922G());
                            bigDecimal4 = new BigDecimal(zzflVar.m9924I());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (iM9925K == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i2 = iM9925K - 1;
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        if (i2 != 3) {
                                            if (i2 == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (zzpk.zzm(zzflVar.m9920E())) {
                        bigDecimal2 = new BigDecimal(zzflVar.m9920E());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (iM9925K == 5) {
                            i2 = iM9925K - 1;
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        if (i2 == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i2 = iM9925K - 1;
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        if (i2 == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public abstract int zza();

    public abstract boolean zzb();

    public abstract boolean zzc();
}
