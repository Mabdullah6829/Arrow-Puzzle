package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzahn;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzaa extends zzab {
    final /* synthetic */ zzad zza;
    private final com.google.android.gms.internal.measurement.zzff zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaa(zzad zzadVar, String str, int i2, com.google.android.gms.internal.measurement.zzff zzffVar) {
        super(str, i2);
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzh = zzffVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final int zza() {
        return this.zzh.m9892B();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean zzc() {
        return this.zzh.m9897G();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0285  */
    /* JADX WARN: Code duplicated, block: B:105:0x0293  */
    /* JADX WARN: Code duplicated, block: B:107:0x0299  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:121:0x030a A[EDGE_INSN: B:121:0x030a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121]] */
    /* JADX WARN: Code duplicated, block: B:122:0x032a A[EDGE_INSN: B:122:0x032a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121]] */
    /* JADX WARN: Code duplicated, block: B:159:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x034a A[EDGE_INSN: B:177:0x034a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x034a A[EDGE_INSN: B:179:0x034a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x034a A[EDGE_INSN: B:188:0x034a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:45:0x0121 A[LOOP:0: B:40:0x00f4->B:45:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x013c  */
    /* JADX WARN: Code duplicated, block: B:55:0x015c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0165  */
    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0183  */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x01df  */
    /* JADX WARN: Code duplicated, block: B:81:0x0201  */
    /* JADX WARN: Code duplicated, block: B:86:0x022e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0240  */
    /* JADX WARN: Code duplicated, block: B:97:0x0273  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzd(Long l2, Long l3, com.google.android.gms.internal.measurement.zzhs zzhsVar, long j2, zzbd zzbdVar, boolean z) {
        HashSet hashSet;
        Iterator it;
        ArrayMap arrayMap;
        Iterator it2;
        Iterator it3;
        com.google.android.gms.internal.measurement.zzfh zzfhVar;
        boolean z2;
        String strM9913H;
        V v;
        Boolean boolZzg;
        Boolean boolZzh;
        String str;
        Boolean boolZzi;
        com.google.android.gms.internal.measurement.zzhw zzhwVar;
        Long lValueOf;
        Double dValueOf;
        com.google.android.gms.internal.measurement.zzfh zzfhVar2;
        zzahn.m9791a();
        zzad zzadVar = this.zza;
        zzic zzicVar = zzadVar.zzu;
        zzal zzalVarZzc = zzicVar.zzc();
        String str2 = this.zzb;
        boolean zZzp = zzalVarZzc.zzp(str2, zzfy.zzaF);
        com.google.android.gms.internal.measurement.zzff zzffVar = this.zzh;
        long j3 = zzffVar.m9902L() ? zzbdVar.zze : j2;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
            zzicVar.zzaW().zzk().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(this.zzc), zzffVar.m9891A() ? Integer.valueOf(zzffVar.m9892B()) : null, zzicVar.zzl().zza(zzffVar.m9893C()));
            zzicVar.zzaW().zzk().zzb("Filter definition", zzadVar.zzg.zzp().zzj(zzffVar));
        }
        if (!zzffVar.m9891A() || zzffVar.m9892B() > 256) {
            zzicVar.zzaW().zze().zzc("Invalid event filter ID. appId, id", zzgu.zzl(str2), String.valueOf(zzffVar.m9891A() ? Integer.valueOf(zzffVar.m9892B()) : null));
            return false;
        }
        Object[] objArr = zzffVar.m9899I() || zzffVar.m9900J() || zzffVar.m9902L();
        if (z && objArr != true) {
            zzicVar.zzaW().zzk().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), zzffVar.m9891A() ? Integer.valueOf(zzffVar.m9892B()) : null);
            return true;
        }
        String strM10127F = zzhsVar.m10127F();
        if (!zzffVar.m9897G()) {
            hashSet = new HashSet();
            it = zzffVar.m9894D().iterator();
            while (true) {
                if (it.hasNext()) {
                    arrayMap = new ArrayMap();
                    it2 = zzhsVar.m10124C().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = zzffVar.m9894D().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                zzfhVar = (com.google.android.gms.internal.measurement.zzfh) it3.next();
                                if (zzfhVar.m9910E() || !zzfhVar.m9911F()) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                strM9913H = zzfhVar.m9913H();
                                if (strM9913H.isEmpty()) {
                                    v = arrayMap.get(strM9913H);
                                    if (v instanceof Long) {
                                        if (v instanceof Double) {
                                            if (v instanceof String) {
                                                if (v == 0) {
                                                    zzicVar.zzaW().zze().zzc("Unknown param type. event, param", zzicVar.zzl().zza(strM10127F), zzicVar.zzl().zzb(strM9913H));
                                                    break;
                                                }
                                                zzicVar.zzaW().zzk().zzc("Missing param for filter. event, param", zzicVar.zzl().zza(strM10127F), zzicVar.zzl().zzb(strM9913H));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (zzfhVar.m9906A()) {
                                                if (zzfhVar.m9908C()) {
                                                    zzicVar.zzaW().zze().zzc("No filter for String param. event, param", zzicVar.zzl().zza(strM10127F), zzicVar.zzl().zzb(strM9913H));
                                                    break;
                                                }
                                                str = (String) v;
                                                if (zzpk.zzm(str)) {
                                                    zzicVar.zzaW().zze().zzc("Invalid param value for number filter. event, param", zzicVar.zzl().zza(strM10127F), zzicVar.zzl().zzb(strM9913H));
                                                    break;
                                                }
                                                boolZzi = zzab.zzi(str, zzfhVar.m9909D());
                                            } else {
                                                boolZzi = zzab.zzf((String) v, zzfhVar.m9907B(), zzicVar.zzaW());
                                            }
                                            if (boolZzi != null) {
                                                break;
                                            }
                                            if (boolZzi.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            if (zzfhVar.m9908C()) {
                                                zzicVar.zzaW().zze().zzc("No number filter for double param. event, param", zzicVar.zzl().zza(strM10127F), zzicVar.zzl().zzb(strM9913H));
                                                break;
                                            }
                                            boolZzh = zzab.zzh(((Double) v).doubleValue(), zzfhVar.m9909D());
                                            if (boolZzh != null) {
                                                break;
                                            }
                                            if (boolZzh.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (zzfhVar.m9908C()) {
                                            zzicVar.zzaW().zze().zzc("No number filter for long param. event, param", zzicVar.zzl().zza(strM10127F), zzicVar.zzl().zzb(strM9913H));
                                            break;
                                        }
                                        boolZzg = zzab.zzg(((Long) v).longValue(), zzfhVar.m9909D());
                                        if (boolZzg != null) {
                                            break;
                                        }
                                        if (boolZzg.booleanValue() == z2) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    }
                                } else {
                                    zzicVar.zzaW().zze().zzb("Event has empty param name. event", zzicVar.zzl().zza(strM10127F));
                                    break;
                                }
                            }
                        } else {
                            zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it2.next();
                            if (!hashSet.contains(zzhwVar.m10156B())) {
                                if (zzhwVar.m10159E()) {
                                    if (zzhwVar.m10163I()) {
                                        if (zzhwVar.m10157C()) {
                                            zzicVar.zzaW().zze().zzc("Unknown value for param. event, param", zzicVar.zzl().zza(strM10127F), zzicVar.zzl().zzb(zzhwVar.m10156B()));
                                            break;
                                        }
                                        arrayMap.put(zzhwVar.m10156B(), zzhwVar.m10158D());
                                    } else {
                                        String strM10156B = zzhwVar.m10156B();
                                        if (zzhwVar.m10163I()) {
                                            dValueOf = Double.valueOf(zzhwVar.m10164J());
                                        } else {
                                            dValueOf = null;
                                        }
                                        arrayMap.put(strM10156B, dValueOf);
                                    }
                                } else {
                                    String strM10156B2 = zzhwVar.m10156B();
                                    if (zzhwVar.m10159E()) {
                                        lValueOf = Long.valueOf(zzhwVar.m10160F());
                                    } else {
                                        lValueOf = null;
                                    }
                                    arrayMap.put(strM10156B2, lValueOf);
                                }
                            }
                        }
                    }
                } else {
                    zzfhVar2 = (com.google.android.gms.internal.measurement.zzfh) it.next();
                    if (zzfhVar2.m9913H().isEmpty()) {
                        zzicVar.zzaW().zze().zzb("null or empty param name in filter. event", zzicVar.zzl().zza(strM10127F));
                        break;
                    }
                    hashSet.add(zzfhVar2.m9913H());
                }
            }
        } else {
            Boolean boolZzg2 = zzab.zzg(j3, zzffVar.m9898H());
            if (boolZzg2 != null) {
                if (boolZzg2.booleanValue()) {
                    hashSet = new HashSet();
                    it = zzffVar.m9894D().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            arrayMap = new ArrayMap();
                            it2 = zzhsVar.m10124C().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    it3 = zzffVar.m9894D().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        zzfhVar = (com.google.android.gms.internal.measurement.zzfh) it3.next();
                                        if (zzfhVar.m9910E()) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                        strM9913H = zzfhVar.m9913H();
                                        if (strM9913H.isEmpty()) {
                                            v = arrayMap.get(strM9913H);
                                            if (v instanceof Long) {
                                                if (v instanceof Double) {
                                                    if (v instanceof String) {
                                                        if (v == 0) {
                                                            zzicVar.zzaW().zze().zzc("Unknown param type. event, param", zzicVar.zzl().zza(strM10127F), zzicVar.zzl().zzb(strM9913H));
                                                            break;
                                                        }
                                                        zzicVar.zzaW().zzk().zzc("Missing param for filter. event, param", zzicVar.zzl().zza(strM10127F), zzicVar.zzl().zzb(strM9913H));
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    if (zzfhVar.m9906A()) {
                                                        if (zzfhVar.m9908C()) {
                                                            zzicVar.zzaW().zze().zzc("No filter for String param. event, param", zzicVar.zzl().zza(strM10127F), zzicVar.zzl().zzb(strM9913H));
                                                            break;
                                                        }
                                                        str = (String) v;
                                                        if (zzpk.zzm(str)) {
                                                            zzicVar.zzaW().zze().zzc("Invalid param value for number filter. event, param", zzicVar.zzl().zza(strM10127F), zzicVar.zzl().zzb(strM9913H));
                                                            break;
                                                        }
                                                        boolZzi = zzab.zzi(str, zzfhVar.m9909D());
                                                    } else {
                                                        boolZzi = zzab.zzf((String) v, zzfhVar.m9907B(), zzicVar.zzaW());
                                                    }
                                                    if (boolZzi != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolZzi.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else if (zzfhVar.m9908C()) {
                                                    boolZzh = zzab.zzh(((Double) v).doubleValue(), zzfhVar.m9909D());
                                                    if (boolZzh != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolZzh.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else {
                                                    zzicVar.zzaW().zze().zzc("No number filter for double param. event, param", zzicVar.zzl().zza(strM10127F), zzicVar.zzl().zzb(strM9913H));
                                                    break;
                                                }
                                            } else if (zzfhVar.m9908C()) {
                                                boolZzg = zzab.zzg(((Long) v).longValue(), zzfhVar.m9909D());
                                                if (boolZzg != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolZzg.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            } else {
                                                zzicVar.zzaW().zze().zzc("No number filter for long param. event, param", zzicVar.zzl().zza(strM10127F), zzicVar.zzl().zzb(strM9913H));
                                                break;
                                            }
                                        } else {
                                            zzicVar.zzaW().zze().zzb("Event has empty param name. event", zzicVar.zzl().zza(strM10127F));
                                            break;
                                        }
                                    }
                                } else {
                                    zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it2.next();
                                    if (!hashSet.contains(zzhwVar.m10156B())) {
                                        if (zzhwVar.m10159E()) {
                                            if (zzhwVar.m10163I()) {
                                                if (zzhwVar.m10157C()) {
                                                    zzicVar.zzaW().zze().zzc("Unknown value for param. event, param", zzicVar.zzl().zza(strM10127F), zzicVar.zzl().zzb(zzhwVar.m10156B()));
                                                    break;
                                                }
                                                arrayMap.put(zzhwVar.m10156B(), zzhwVar.m10158D());
                                            } else {
                                                String strM10156B3 = zzhwVar.m10156B();
                                                if (zzhwVar.m10163I()) {
                                                    dValueOf = Double.valueOf(zzhwVar.m10164J());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                arrayMap.put(strM10156B3, dValueOf);
                                            }
                                        } else {
                                            String strM10156B4 = zzhwVar.m10156B();
                                            if (zzhwVar.m10159E()) {
                                                lValueOf = Long.valueOf(zzhwVar.m10160F());
                                            } else {
                                                lValueOf = null;
                                            }
                                            arrayMap.put(strM10156B4, lValueOf);
                                        }
                                    }
                                }
                            }
                        } else {
                            zzfhVar2 = (com.google.android.gms.internal.measurement.zzfh) it.next();
                            if (zzfhVar2.m9913H().isEmpty()) {
                                zzicVar.zzaW().zze().zzb("null or empty param name in filter. event", zzicVar.zzl().zza(strM10127F));
                                break;
                            }
                            hashSet.add(zzfhVar2.m9913H());
                        }
                    }
                } else {
                    bool = Boolean.FALSE;
                }
            }
        }
        zzicVar.zzaW().zzk().zzb("Event filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.zzd = bool2;
        if (bool.booleanValue()) {
            this.zze = bool2;
            if (objArr != false && zzhsVar.m10128G()) {
                Long lValueOf2 = Long.valueOf(zzhsVar.m10129H());
                if (zzffVar.m9900J()) {
                    if (zZzp && zzffVar.m9897G()) {
                        lValueOf2 = l2;
                    }
                    this.zzg = lValueOf2;
                    return true;
                }
                if (zZzp && zzffVar.m9897G()) {
                    lValueOf2 = l3;
                }
                this.zzf = lValueOf2;
            }
        }
        return true;
    }
}
