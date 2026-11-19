package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.ViewCompat;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzanu implements zzdu {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzanv f6143a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f6144b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f6145c;

    public /* synthetic */ zzanu(zzanv zzanvVar, long j2, int i2) {
        this.f6143a = zzanvVar;
        this.f6144b = j2;
        this.f6145c = i2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0122  */
    @Override // com.google.android.gms.internal.ads.zzdu
    /* JADX INFO: renamed from: b */
    public final void mo3942b(Object obj) {
        Iterator it;
        zzank zzankVar = (zzank) obj;
        zzanv zzanvVar = this.f6143a;
        zzanvVar.f6153h.getClass();
        zzgwt zzgwtVar = zzankVar.f6135a;
        long j2 = zzankVar.f6137c;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgwtVar.size());
        Iterator it2 = zzgwtVar.iterator();
        while (it2.hasNext()) {
            zzcy zzcyVar = (zzcy) it2.next();
            zzcyVar.getClass();
            Bundle bundle = new Bundle();
            CharSequence charSequence = zzcyVar.f11743a;
            if (charSequence != null) {
                bundle.putCharSequence(zzcy.f11733q, charSequence);
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    String str = zzdb.f11918a;
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    zzdd[] zzddVarArr = (zzdd[]) spanned.getSpans(0, spanned.length(), zzdd.class);
                    int length = zzddVarArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        zzdd zzddVar = zzddVarArr[i2];
                        zzddVar.getClass();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(zzdd.f12064c, zzddVar.f12066a);
                        bundle2.putInt(zzdd.f12065d, zzddVar.f12067b);
                        arrayList2.add(zzdb.m5888a(spanned, zzddVar, 1, bundle2));
                        i2++;
                        it2 = it2;
                        zzddVarArr = zzddVarArr;
                    }
                    it = it2;
                    zzdf[] zzdfVarArr = (zzdf[]) spanned.getSpans(0, spanned.length(), zzdf.class);
                    int length2 = zzdfVarArr.length;
                    int i3 = 0;
                    while (i3 < length2) {
                        zzdf zzdfVar = zzdfVarArr[i3];
                        zzdfVar.getClass();
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt(zzdf.f12109d, zzdfVar.f12112a);
                        bundle3.putInt(zzdf.f12110e, zzdfVar.f12113b);
                        bundle3.putInt(zzdf.f12111f, zzdfVar.f12114c);
                        arrayList2.add(zzdb.m5888a(spanned, zzdfVar, 2, bundle3));
                        i3++;
                        zzdfVarArr = zzdfVarArr;
                    }
                    for (zzdc zzdcVar : (zzdc[]) spanned.getSpans(0, spanned.length(), zzdc.class)) {
                        arrayList2.add(zzdb.m5888a(spanned, zzdcVar, 3, null));
                    }
                    zzdg[] zzdgVarArr = (zzdg[]) spanned.getSpans(0, spanned.length(), zzdg.class);
                    int length3 = zzdgVarArr.length;
                    int i4 = 0;
                    while (i4 < length3) {
                        zzdg zzdgVar = zzdgVarArr[i4];
                        zzdgVar.getClass();
                        Bundle bundle4 = new Bundle();
                        bundle4.putString(zzdg.f12141b, zzdgVar.f12142a);
                        arrayList2.add(zzdb.m5888a(spanned, zzdgVar, 4, bundle4));
                        i4++;
                        zzdgVarArr = zzdgVarArr;
                    }
                    if (!arrayList2.isEmpty()) {
                        bundle.putParcelableArrayList(zzcy.f11734r, arrayList2);
                    }
                } else {
                    it = it2;
                }
            } else {
                it = it2;
            }
            bundle.putSerializable(zzcy.f11735s, zzcyVar.f11744b);
            bundle.putSerializable(zzcy.f11736t, zzcyVar.f11745c);
            bundle.putFloat(zzcy.f11738v, zzcyVar.f11747e);
            bundle.putInt(zzcy.f11739w, zzcyVar.f11748f);
            bundle.putInt(zzcy.f11740x, zzcyVar.f11749g);
            bundle.putFloat(zzcy.f11741y, zzcyVar.f11750h);
            bundle.putInt(zzcy.f11742z, zzcyVar.f11751i);
            bundle.putInt(zzcy.f11724A, zzcyVar.f11754l);
            bundle.putFloat(zzcy.f11725B, zzcyVar.f11755m);
            bundle.putFloat(zzcy.f11726C, zzcyVar.f11752j);
            bundle.putFloat(zzcy.f11727D, zzcyVar.f11753k);
            bundle.putBoolean(zzcy.f11729F, false);
            bundle.putInt(zzcy.f11728E, ViewCompat.MEASURED_STATE_MASK);
            bundle.putInt(zzcy.f11730G, zzcyVar.f11756n);
            bundle.putFloat(zzcy.f11731H, zzcyVar.f11757o);
            bundle.putInt(zzcy.f11732I, zzcyVar.f11758p);
            Bitmap bitmap = zzcyVar.f11746d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzgtr.m7133f(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                bundle.putByteArray(zzcy.f11737u, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(bundle);
            it2 = it;
        }
        Bundle bundle5 = new Bundle();
        bundle5.putParcelableArrayList("c", arrayList);
        bundle5.putLong("d", j2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle5);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzeu zzeuVar = zzanvVar.f6148c;
        int length4 = bArrMarshall.length;
        zzeuVar.m6397z(length4, bArrMarshall);
        zzahm zzahmVar = zzanvVar.f6146a;
        zzahmVar.mo4121a(length4, zzeuVar);
        long j3 = zzankVar.f6136b;
        long j4 = this.f6144b;
        if (j3 == -9223372036854775807L) {
            zzgtr.m7133f(zzanvVar.f6153h.f21066t == LocationRequestCompat.PASSIVE_INTERVAL);
        } else {
            long j5 = zzanvVar.f6153h.f21066t;
            j4 = j5 == LocationRequestCompat.PASSIVE_INTERVAL ? j4 + j3 : j3 + j5;
        }
        zzahmVar.mo4095b(j4, this.f6145c | 1, length4, 0, null);
    }
}
