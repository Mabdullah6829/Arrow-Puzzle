package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.internal.ads.AbstractC5152f;
import com.google.android.gms.internal.measurement.zzaca;
import com.google.android.gms.internal.measurement.zzacb;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzacb<MessageType extends zzacb<MessageType, BuilderType>, BuilderType extends zzaca<MessageType, BuilderType>> implements zzafc {
    protected transient int zza = 0;

    /* JADX INFO: renamed from: k */
    public static void m9343k(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof zzaen) {
            List listZza = ((zzaen) iterable).zza();
            zzaen zzaenVar = (zzaen) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = zzaenVar.size() - size;
                    String strM2448o = AbstractC1456a.m2448o(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                    int size3 = zzaenVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(strM2448o);
                        }
                        zzaenVar.remove(size3);
                    }
                } else if (obj instanceof zzacr) {
                    zzaenVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    zzacr.m9379m(bArr, 0, bArr.length);
                    zzaenVar.zzb();
                } else {
                    zzaenVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzafk) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof zzafm) {
                zzafm zzafmVar = (zzafm) list;
                int i2 = ((zzafm) list).f22099u + size4;
                int length = zzafmVar.f22098t.length;
                if (i2 > length) {
                    if (length != 0) {
                        while (length < i2) {
                            length = AbstractC5152f.m3771c(length, 3, 2, 1, 10);
                        }
                        zzafmVar.f22098t = Arrays.copyOf(zzafmVar.f22098t, length);
                    } else {
                        zzafmVar.f22098t = new Object[Math.max(i2, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    zzaca.m9337i(size5, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i3 = 0; i3 < size6; i3++) {
            Object obj3 = list2.get(i3);
            if (obj3 == null) {
                zzaca.m9337i(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    /* JADX INFO: renamed from: b */
    public final zzacr mo9344b() {
        try {
            zzadu zzaduVar = (zzadu) this;
            int iMo9567f = zzaduVar.mo9567f();
            zzacr zzacrVar = zzacr.f21972t;
            byte[] bArr = new byte[iMo9567f];
            boolean z = zzada.f22004b;
            zzacx zzacxVar = new zzacx(bArr, iMo9567f);
            zzaduVar.mo9349g(zzacxVar);
            zzacxVar.m9512d();
            return new zzacq(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(AbstractC1456a.m2450q(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    /* JADX INFO: renamed from: e */
    public final void mo9345e(OutputStream outputStream) {
        zzadu zzaduVar = (zzadu) this;
        int iMo9567f = zzaduVar.mo9567f();
        boolean z = zzada.f22004b;
        if (iMo9567f > 4096) {
            iMo9567f = 4096;
        }
        zzacz zzaczVar = new zzacz(outputStream, iMo9567f);
        zzaduVar.mo9349g(zzaczVar);
        if (zzaczVar.f22000e > 0) {
            zzaczVar.m9508F();
        }
    }

    /* JADX INFO: renamed from: i */
    public final byte[] m9346i() {
        try {
            zzadu zzaduVar = (zzadu) this;
            int iMo9567f = zzaduVar.mo9567f();
            byte[] bArr = new byte[iMo9567f];
            boolean z = zzada.f22004b;
            zzacx zzacxVar = new zzacx(bArr, iMo9567f);
            zzaduVar.mo9349g(zzacxVar);
            zzacxVar.m9512d();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(AbstractC1456a.m2450q(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    /* JADX INFO: renamed from: j */
    public int mo9347j(zzafp zzafpVar) {
        throw null;
    }
}
