package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzkr extends zzbm implements zzks {
    public zzkr() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                Status status = (Status) zzbn.m9818a(parcel, Status.CREATOR);
                zzbn.m9821d(parcel);
                TaskUtil.m3486a(status, null, ((zzkj) this).f22583s);
                return true;
            case 2:
                Status status2 = (Status) zzbn.m9818a(parcel, Status.CREATOR);
                zzbn.m9821d(parcel);
                TaskUtil.m3486a(status2, null, ((zzkj) this).f22583s);
                return true;
            case 3:
                Status status3 = (Status) zzbn.m9818a(parcel, Status.CREATOR);
                zzbn.m9821d(parcel);
                TaskUtil.m3486a(status3, null, ((zzkj) this).f22583s);
                return true;
            case 4:
                Status status4 = (Status) zzbn.m9818a(parcel, Status.CREATOR);
                zzjh zzjhVar = (zzjh) zzbn.m9818a(parcel, zzjh.CREATOR);
                zzbn.m9821d(parcel);
                TaskUtil.m3486a(status4, zzjhVar, ((zzkj) this).f22583s);
                return true;
            case 5:
                Status status5 = (Status) zzbn.m9818a(parcel, Status.CREATOR);
                zzbn.m9821d(parcel);
                TaskUtil.m3486a(status5, null, ((zzkj) this).f22583s);
                return true;
            case 6:
                Status status6 = (Status) zzbn.m9818a(parcel, Status.CREATOR);
                zzjl zzjlVar = (zzjl) zzbn.m9818a(parcel, zzjl.CREATOR);
                zzbn.m9821d(parcel);
                TaskUtil.m3486a(status6, zzjlVar, ((zzkj) this).f22583s);
                return true;
            case 7:
                Status status7 = (Status) zzbn.m9818a(parcel, Status.CREATOR);
                zzjj zzjjVar = (zzjj) zzbn.m9818a(parcel, zzjj.CREATOR);
                zzbn.m9821d(parcel);
                TaskUtil.m3486a(status7, zzjjVar, ((zzkj) this).f22583s);
                return true;
            case 8:
                Status status8 = (Status) zzbn.m9818a(parcel, Status.CREATOR);
                zzbn.m9821d(parcel);
                TaskUtil.m3486a(status8, null, ((zzkj) this).f22583s);
                return true;
            case 9:
                Status status9 = (Status) zzbn.m9818a(parcel, Status.CREATOR);
                zzjo zzjoVar = (zzjo) zzbn.m9818a(parcel, zzjo.CREATOR);
                zzbn.m9821d(parcel);
                TaskUtil.m3486a(status9, zzjoVar, ((zzkj) this).f22583s);
                return true;
            case 10:
                Status status10 = (Status) zzbn.m9818a(parcel, Status.CREATOR);
                zzjh zzjhVar2 = (zzjh) zzbn.m9818a(parcel, zzjh.CREATOR);
                zzbn.m9821d(parcel);
                TaskUtil.m3486a(status10, zzjhVar2, ((zzkj) this).f22583s);
                return true;
            case 11:
                Status status11 = (Status) zzbn.m9818a(parcel, Status.CREATOR);
                parcel.readLong();
                zzbn.m9821d(parcel);
                TaskUtil.m3486a(status11, null, ((zzkj) this).f22583s);
                return true;
            case 12:
                Status status12 = (Status) zzbn.m9818a(parcel, Status.CREATOR);
                zzbn.m9821d(parcel);
                TaskUtil.m3486a(status12, null, ((zzkj) this).f22583s);
                return true;
            case 13:
                Status status13 = (Status) zzbn.m9818a(parcel, Status.CREATOR);
                zzjs zzjsVar = (zzjs) zzbn.m9818a(parcel, zzjs.CREATOR);
                zzbn.m9821d(parcel);
                TaskUtil.m3486a(status13, zzjsVar, ((zzkj) this).f22583s);
                return true;
            case 14:
                Status status14 = (Status) zzbn.m9818a(parcel, Status.CREATOR);
                zzbn.m9821d(parcel);
                TaskUtil.m3486a(status14, null, ((zzkj) this).f22583s);
                return true;
            case 15:
                Status status15 = (Status) zzbn.m9818a(parcel, Status.CREATOR);
                zzbn.m9821d(parcel);
                TaskUtil.m3486a(status15, null, ((zzkj) this).f22583s);
                return true;
            case 16:
                Status status16 = (Status) zzbn.m9818a(parcel, Status.CREATOR);
                long j2 = parcel.readLong();
                zzbn.m9821d(parcel);
                TaskUtil.m3486a(status16, Long.valueOf(j2), ((zzkj) this).f22583s);
                return true;
            default:
                return false;
        }
    }
}
