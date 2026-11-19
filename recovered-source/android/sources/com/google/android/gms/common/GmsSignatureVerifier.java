package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzah;
import com.google.android.gms.internal.common.zzai;
import com.google.android.gms.internal.common.zzal;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class GmsSignatureVerifier {
    static {
        zzaa zzaaVar = new zzaa();
        zzaaVar.f4667a = "com.google.android.gms";
        zzaaVar.f4668b = 204200000L;
        zzi zziVar = zzo.f4686f;
        byte[] bArrMo3670k0 = zziVar.mo3670k0();
        byte[] bArrMo3670k1 = zzo.f4684d.mo3670k0();
        byte[] bArrMo3670k2 = zzo.f4682b.mo3670k0();
        zzal zzalVar = zzah.f21578t;
        Object[] objArr = {bArrMo3670k0, bArrMo3670k1, bArrMo3670k2};
        zzai.m9102a(3, objArr);
        zzah zzahVarM9100s = zzah.m9100s(3, objArr);
        Preconditions.m3544h(zzahVarM9100s);
        zzaaVar.f4669c = zzah.m9099r(zzahVarM9100s);
        zzh zzhVar = zzo.f4685e;
        byte[] bArrMo3670k3 = zzhVar.mo3670k0();
        zzf zzfVar = zzo.f4683c;
        Object[] objArr2 = {bArrMo3670k3, zzfVar.mo3670k0(), zzo.f4681a.mo3670k0()};
        zzai.m9102a(3, objArr2);
        zzah zzahVarM9100s2 = zzah.m9100s(3, objArr2);
        Preconditions.m3544h(zzahVarM9100s2);
        zzaaVar.f4670d = zzah.m9099r(zzahVarM9100s2);
        zzaaVar.m3666a();
        zzaa zzaaVar2 = new zzaa();
        zzaaVar2.f4667a = "com.android.vending";
        zzaaVar2.f4668b = 82240000L;
        Object[] objArr3 = {zziVar.mo3670k0()};
        zzai.m9102a(1, objArr3);
        zzah zzahVarM9100s3 = zzah.m9100s(1, objArr3);
        Preconditions.m3544h(zzahVarM9100s3);
        zzaaVar2.f4669c = zzah.m9099r(zzahVarM9100s3);
        Object[] objArr4 = {zzhVar.mo3670k0(), zzfVar.mo3670k0()};
        zzai.m9102a(2, objArr4);
        zzah zzahVarM9100s4 = zzah.m9100s(2, objArr4);
        Preconditions.m3544h(zzahVarM9100s4);
        zzaaVar2.f4670d = zzah.m9099r(zzahVarM9100s4);
        zzaaVar2.m3666a();
        new HashMap();
    }
}
