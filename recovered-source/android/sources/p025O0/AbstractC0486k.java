package p025O0;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6452k;
import kotlinx.serialization.MissingFieldException;
import p011H.AbstractC0242F;
import p018K0.InterfaceC0325a;
import p021M0.InterfaceC0339d;

/* JADX INFO: renamed from: O0.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0486k {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0339d[] f1020a = new InterfaceC0339d[0];

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0325a[] f1021b = new InterfaceC0325a[0];

    /* JADX INFO: renamed from: a */
    public static final Set m1174a(InterfaceC0339d interfaceC0339d) {
        AbstractC6452k.m12181e(interfaceC0339d, "<this>");
        if (interfaceC0339d instanceof InterfaceC0477b) {
            return ((InterfaceC0477b) interfaceC0339d).mo1173b();
        }
        HashSet hashSet = new HashSet(interfaceC0339d.mo499e());
        int iMo499e = interfaceC0339d.mo499e();
        for (int i2 = 0; i2 < iMo499e; i2++) {
            hashSet.add(interfaceC0339d.mo500f(i2));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0339d[] m1175b(List list) {
        InterfaceC0339d[] interfaceC0339dArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC0339dArr = (InterfaceC0339d[]) list.toArray(new InterfaceC0339d[0])) == null) ? f1020a : interfaceC0339dArr;
    }

    /* JADX INFO: renamed from: c */
    public static final int m1176c(InterfaceC0339d interfaceC0339d, InterfaceC0339d[] typeParams) {
        AbstractC6452k.m12181e(typeParams, "typeParams");
        int iHashCode = (interfaceC0339d.mo496a().hashCode() * 31) + Arrays.hashCode(typeParams);
        int iMo499e = interfaceC0339d.mo499e();
        int i2 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iMo499e > 0)) {
                break;
            }
            int i3 = iMo499e - 1;
            int i4 = i2 * 31;
            String strMo496a = interfaceC0339d.mo502h(interfaceC0339d.mo499e() - iMo499e).mo496a();
            if (strMo496a != null) {
                iHashCode2 = strMo496a.hashCode();
            }
            i2 = i4 + iHashCode2;
            iMo499e = i3;
        }
        int iMo499e2 = interfaceC0339d.mo499e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iMo499e2 > 0)) {
                return (((iHashCode * 31) + i2) * 31) + iHashCode3;
            }
            int i5 = iMo499e2 - 1;
            int i6 = iHashCode3 * 31;
            AbstractC0242F kind = interfaceC0339d.mo502h(interfaceC0339d.mo499e() - iMo499e2).getKind();
            iHashCode3 = i6 + (kind != null ? kind.hashCode() : 0);
            iMo499e2 = i5;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m1177d(int i2, int i3, InterfaceC0339d descriptor) {
        AbstractC6452k.m12181e(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i4 = (~i2) & i3;
        for (int i5 = 0; i5 < 32; i5++) {
            if ((i4 & 1) != 0) {
                arrayList.add(descriptor.mo500f(i5));
            }
            i4 >>>= 1;
        }
        String serialName = descriptor.mo496a();
        AbstractC6452k.m12181e(serialName, "serialName");
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? AbstractC1456a.m2451r(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", serialName, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }
}
