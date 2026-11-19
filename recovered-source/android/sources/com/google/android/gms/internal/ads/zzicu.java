package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.internal.ads.zzict;
import com.google.android.gms.internal.ads.zzicu;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzicu<MessageType extends zzicu<MessageType, BuilderType>, BuilderType extends zzict<MessageType, BuilderType>> implements zzifz {
    protected transient int zzq = 0;

    /* JADX INFO: renamed from: l */
    public static void m8096l(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof zzifk) {
            List listZza = ((zzifk) iterable).zza();
            zzifk zzifkVar = (zzifk) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = zzifkVar.size() - size;
                    String strM2448o = AbstractC1456a.m2448o(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                    int size3 = zzifkVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(strM2448o);
                        }
                        zzifkVar.remove(size3);
                    }
                } else if (obj instanceof zzidl) {
                    zzifkVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    zzidl.m8149y(bArr, 0, bArr.length);
                    zzifkVar.zzb();
                } else {
                    zzifkVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzigi) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof zzigk) {
                zzigk zzigkVar = (zzigk) list;
                int i2 = ((zzigk) list).f19866u + size4;
                int length = zzigkVar.f19865t.length;
                if (i2 > length) {
                    if (length != 0) {
                        while (length < i2) {
                            length = AbstractC5152f.m3771c(length, 3, 2, 1, 10);
                        }
                        zzigkVar.f19865t = Arrays.copyOf(zzigkVar.f19865t, length);
                    } else {
                        zzigkVar.f19865t = new Object[Math.max(i2, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    zzict.m8094i(size5, list);
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
                zzict.m8094i(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    /* JADX INFO: renamed from: c */
    public final void mo8097c(OutputStream outputStream) {
        zziep zziepVar = (zziep) this;
        int iMo8101k = zziepVar.mo8101k(null);
        boolean z = zzidu.f19750b;
        if (iMo8101k > 4096) {
            iMo8101k = 4096;
        }
        zzidt zzidtVar = new zzidt(outputStream, iMo8101k);
        zziepVar.mo8104f(zzidtVar);
        if (zzidtVar.f19748e > 0) {
            zzidtVar.m8278F();
        }
    }

    /* JADX INFO: renamed from: g */
    public final zzidl m8098g() {
        try {
            int iMo8101k = ((zziep) this).mo8101k(null);
            zzidl zzidlVar = zzidl.f19719t;
            byte[] bArr = new byte[iMo8101k];
            boolean z = zzidu.f19750b;
            zzidr zzidrVar = new zzidr(bArr, iMo8101k);
            ((zziep) this).mo8104f(zzidrVar);
            zzidrVar.m8282d();
            return new zzidj(bArr);
        } catch (IOException e) {
            throw new RuntimeException(m8102m("ByteString"), e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final byte[] m8099h() {
        try {
            int iMo8101k = ((zziep) this).mo8101k(null);
            byte[] bArr = new byte[iMo8101k];
            boolean z = zzidu.f19750b;
            zzidr zzidrVar = new zzidr(bArr, iMo8101k);
            ((zziep) this).mo8104f(zzidrVar);
            zzidrVar.m8282d();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(m8102m("byte array"), e);
        }
    }

    /* JADX INFO: renamed from: i */
    public int mo8100i() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: k */
    public int mo8101k(zzigr zzigrVar) {
        return mo8100i();
    }

    /* JADX INFO: renamed from: m */
    public final String m8102m(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 18 + str.length() + 44);
        AbstractC0271e0.m413u(sb, "Serializing ", name, " to a ", str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }
}
