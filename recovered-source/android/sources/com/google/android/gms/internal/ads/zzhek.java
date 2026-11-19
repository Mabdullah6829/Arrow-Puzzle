package com.google.android.gms.internal.ads;

import androidx.constraintlayout.widget.C1137R;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhek implements zzhel {

    /* JADX INFO: renamed from: a */
    public final List f18567a;

    /* JADX INFO: renamed from: b */
    public final Map f18568b;

    /* JADX INFO: renamed from: c */
    public final zzhek f18569c;

    public zzhek(ArrayList arrayList, Map map, zzhek zzhekVar) {
        this.f18567a = arrayList;
        this.f18568b = map;
        this.f18569c = zzhekVar;
    }

    /* JADX INFO: renamed from: a */
    public static final zzhek m7410a(zzhtk zzhtkVar) {
        zzhdz zzhmmVar;
        boolean z;
        if (zzhtkVar == null || zzhtkVar.m7824F() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(zzhtkVar.m7824F());
        for (zzhtj zzhtjVar : zzhtkVar.m7823E()) {
            int iM7812F = zzhtjVar.m7812F();
            try {
                zzhnz zzhnzVarM7412i = m7412i(zzhtjVar);
                zzhne zzhneVar = zzhne.f19005b;
                zzhey zzheyVar = zzhey.f18574a;
                zzhoh zzhohVar = (zzhoh) zzhneVar.f19006a.get();
                zzhohVar.getClass();
                zzhmmVar = !zzhohVar.f19054b.containsKey(new zzhof(zzhnz.class, zzhnzVarM7412i.f19031b)) ? new zzhmm(zzhnzVarM7412i) : zzhneVar.m7575e(zzhnzVarM7412i, zzheyVar);
                z = false;
            } catch (GeneralSecurityException e) {
                if (((zzhlb) zzhlc.f18917a).f18916a.get()) {
                    throw e;
                }
                zzhnz zzhnzVarM7412i2 = m7412i(zzhtjVar);
                zzhey zzheyVar2 = zzhey.f18574a;
                zzhmmVar = new zzhmm(zzhnzVarM7412i2);
                z = true;
            }
            if (((zzhlb) zzhlc.f18917a).f18916a.get() && !m7413j(zzhtjVar.m7817L())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z2 = true;
            int iM7817L = zzhtjVar.m7817L();
            if (iM7812F != zzhtkVar.m7822D()) {
                z2 = false;
            }
            arrayList.add(new zzhei(zzhmmVar, iM7817L, iM7812F, z2, z, zzhei.f18559h));
        }
        return new zzhek(Collections.unmodifiableList(arrayList), new HashMap());
    }

    /* JADX INFO: renamed from: g */
    public static final zzhek m7411g(zzheq zzheqVar) throws GeneralSecurityException {
        int i2;
        int i3;
        zzhef zzhefVar = new zzhef();
        zzhed zzhedVar = new zzhed(zzheqVar);
        zzhedVar.f18553c = zzhee.f18554a;
        zzhedVar.f18551a = true;
        ArrayList arrayList = zzhefVar.f18555a;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((zzhed) obj).f18551a = false;
        }
        arrayList.add(zzhedVar);
        if (zzhefVar.f18557c) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        zzhefVar.f18557c = true;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i6 = 0;
        while (i6 < arrayList.size() - 1) {
            int i7 = i6 + 1;
            zzhee zzheeVar = ((zzhed) arrayList.get(i6)).f18553c;
            zzhee zzheeVar2 = zzhee.f18554a;
            if (zzheeVar == zzheeVar2 && ((zzhed) arrayList.get(i7)).f18553c != zzheeVar2) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i6 = i7;
        }
        HashSet hashSet = new HashSet();
        int size2 = arrayList.size();
        int i8 = 0;
        Integer num = null;
        while (i8 < size2) {
            Object obj2 = arrayList.get(i8);
            i8++;
            zzhed zzhedVar2 = (zzhed) obj2;
            zzhedVar2.getClass();
            zzheq zzheqVar2 = zzhedVar2.f18552b;
            zzhee zzheeVar3 = zzhedVar2.f18553c;
            if (zzheeVar3 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i9 = 3;
            if (zzheeVar3 == zzhee.f18554a) {
                int i10 = i4;
                while (true) {
                    if (i10 != 0 && !hashSet.contains(Integer.valueOf(i10))) {
                        break;
                    }
                    int i11 = zzhok.f19057a;
                    i10 = i4;
                    while (i10 == 0) {
                        byte[] bArrM7590a = zzhoc.m7590a(4);
                        i10 = (bArrM7590a[3] & 255) | ((bArrM7590a[1] & 255) << 16) | ((bArrM7590a[i4] & 255) << 24) | ((bArrM7590a[2] & 255) << 8);
                        i4 = 0;
                    }
                }
                i2 = i10;
            } else {
                i2 = 0;
            }
            Integer numValueOf = Integer.valueOf(i2);
            if (hashSet.contains(numValueOf)) {
                int i12 = i2;
                throw new GeneralSecurityException(AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i12).length() + 31), "Id ", i12, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            zzhdz zzhdzVarM7565b = zzhmv.f18992c.m7565b(zzheqVar2, true != zzheqVar2.mo7421a() ? null : numValueOf);
            Object obj3 = zzheb.f18547b;
            if (obj3.equals(obj3)) {
                i3 = i9;
            } else if (zzheb.f18548c.equals(obj3)) {
                i3 = 4;
            } else {
                if (!zzheb.f18549d.equals(obj3)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i9 = 5;
                i3 = i9;
            }
            boolean z = zzhedVar2.f18551a;
            zzhei zzheiVar = new zzhei(zzhdzVarM7565b, i3, i2, z, false, zzhei.f18559h);
            if (z) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = numValueOf;
            }
            arrayList2.add(zzheiVar);
            i4 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzhek zzhekVar = new zzhek(arrayList2, zzhefVar.f18556b);
        if (((zzhmp) zzhekVar.mo7414b()) == null) {
            return zzhekVar;
        }
        zzhej zzhejVar = new zzhej();
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size3 = arrayList2.size();
        for (int i13 = 0; i13 < size3; i13++) {
            zzhei zzheiVar2 = (zzhei) arrayList2.get(i13);
            arrayList3.add(new zzhei(zzheiVar2.f18560a, zzheiVar2.f18566g, zzheiVar2.f18562c, zzheiVar2.f18563d, zzheiVar2.f18564e, zzhejVar));
        }
        return new zzhek(arrayList3, zzhekVar.f18568b, zzhekVar);
    }

    /* JADX INFO: renamed from: i */
    public static zzhnz m7412i(zzhtj zzhtjVar) {
        return zzhnz.m7588a(zzhtjVar.m7811E().m7790D(), zzhtjVar.m7811E().m7791E(), zzhtjVar.m7811E().m7792F(), zzhtjVar.m7813G(), zzhtjVar.m7813G() == zzhtx.RAW ? null : Integer.valueOf(zzhtjVar.m7812F()));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m7413j(int i2) {
        int i3 = i2 - 2;
        return i3 == 1 || i3 == 2 || i3 == 3;
    }

    @Override // com.google.android.gms.internal.ads.zzhel
    /* JADX INFO: renamed from: b */
    public final zzhds mo7414b() {
        return (zzhds) this.f18568b.get(zzhmp.class);
    }

    /* JADX INFO: renamed from: c */
    public final zzhtk m7415c() {
        try {
            zzhth zzhthVarM7821J = zzhtk.m7821J();
            for (zzhei zzheiVar : this.f18567a) {
                zzhdz zzhdzVarM7409a = zzheiVar.m7409a();
                int i2 = zzheiVar.f18562c;
                int i3 = zzheiVar.f18566g;
                zzhnz zzhnzVar = (zzhnz) zzhne.f19005b.m7576f(zzhdzVarM7409a, zzhey.f18574a);
                Integer numMo7406b = zzhdzVarM7409a.mo7406b();
                if (numMo7406b != null && numMo7406b.intValue() != i2) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzhti zzhtiVarM7809H = zzhtj.m7809H();
                zzhsz zzhszVarM7788G = zzhtb.m7788G();
                String str = zzhnzVar.f19030a;
                zzhszVarM7788G.m8326l();
                ((zzhtb) zzhszVarM7788G.f19780t).m7793I(str);
                zzidl zzidlVar = zzhnzVar.f19032c;
                zzhszVarM7788G.m8326l();
                ((zzhtb) zzhszVarM7788G.f19780t).m7794J(zzidlVar);
                zzhta zzhtaVar = zzhnzVar.f19033d;
                zzhszVarM7788G.m8326l();
                ((zzhtb) zzhszVarM7788G.f19780t).m7795K(zzhtaVar);
                zzhtiVarM7809H.m8326l();
                ((zzhtj) zzhtiVarM7809H.f19780t).m7814I((zzhtb) zzhszVarM7788G.m8328o());
                zzhtiVarM7809H.m8326l();
                ((zzhtj) zzhtiVarM7809H.f19780t).m7818M(i3);
                zzhtiVarM7809H.m8326l();
                ((zzhtj) zzhtiVarM7809H.f19780t).m7815J(i2);
                zzhtx zzhtxVar = zzhnzVar.f19034e;
                zzhtiVarM7809H.m8326l();
                ((zzhtj) zzhtiVarM7809H.f19780t).m7816K(zzhtxVar);
                zzhtj zzhtjVar = (zzhtj) zzhtiVarM7809H.m8328o();
                zzhthVarM7821J.m8326l();
                ((zzhtk) zzhthVarM7821J.f19780t).m7827L(zzhtjVar);
                if (zzheiVar.f18563d) {
                    zzhthVarM7821J.m8326l();
                    ((zzhtk) zzhthVarM7821J.f19780t).m7826K(i2);
                }
            }
            return (zzhtk) zzhthVarM7821J.m8328o();
        } catch (GeneralSecurityException e) {
            throw new zzhoj(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhel
    /* JADX INFO: renamed from: d */
    public final int mo7416d() {
        return this.f18567a.size();
    }

    /* JADX INFO: renamed from: e */
    public final zzhei m7417e() {
        for (zzhei zzheiVar : this.f18567a) {
            if (zzheiVar != null && zzheiVar.f18563d) {
                if (zzheiVar.f18561b == zzheb.f18547b) {
                    return zzheiVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    /* JADX INFO: renamed from: f */
    public final zzhei m7418f(int i2) {
        List list = this.f18567a;
        if (i2 < 0 || i2 >= list.size()) {
            int size = list.size();
            throw new IndexOutOfBoundsException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i2).length() + 34 + String.valueOf(size).length()), "Invalid index ", i2, " for keyset of size ", size));
        }
        zzhei zzheiVar = (zzhei) list.get(i2);
        if (!m7413j(zzheiVar.f18566g)) {
            throw new IllegalStateException(AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i2).length() + 42), "Keyset-Entry at position ", i2, " has wrong status"));
        }
        if (zzheiVar.f18564e) {
            throw new IllegalStateException(AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i2).length() + 48), "Keyset-Entry at position ", i2, " didn't parse correctly"));
        }
        return (zzhei) list.get(i2);
    }

    /* JADX INFO: renamed from: h */
    public final Object m7419h(zzhdw zzhdwVar, Class cls) throws GeneralSecurityException {
        zzhek zzhekVar = this.f18569c;
        zzhtk zzhtkVarM7415c = (zzhekVar == null ? this : zzhekVar).m7415c();
        int i2 = zzhfb.f18582a;
        int iM7822D = zzhtkVarM7415c.m7822D();
        int i3 = 0;
        boolean z = true;
        int i4 = 0;
        boolean z2 = false;
        for (zzhtj zzhtjVar : zzhtkVarM7415c.m7823E()) {
            if (zzhtjVar.m7817L() == 3) {
                if (!zzhtjVar.m7810D()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhtjVar.m7812F())));
                }
                if (zzhtjVar.m7813G() == zzhtx.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhtjVar.m7812F())));
                }
                if (zzhtjVar.m7817L() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhtjVar.m7812F())));
                }
                if (zzhtjVar.m7812F() == iM7822D) {
                    if (z2) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z2 = true;
                }
                z &= zzhtjVar.m7811E().m7792F() == zzhta.ASYMMETRIC_PUBLIC;
                i4++;
            }
        }
        if (i4 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z2 && !z) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        while (true) {
            List list = this.f18567a;
            if (i3 >= list.size()) {
                if (zzhekVar == null) {
                    zzhekVar = this;
                }
                return zzhdwVar.mo7402a(zzhekVar, cls);
            }
            if (((zzhei) list.get(i3)).f18564e || !m7413j(((zzhei) list.get(i3)).f18566g)) {
                String strM7790D = zzhtkVarM7415c.m7825G(i3).m7811E().m7790D();
                StringBuilder sb = new StringBuilder(String.valueOf(strM7790D).length() + String.valueOf(i3).length() + 44 + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i3);
                sb.append(" and type_url ");
                sb.append(strM7790D);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
            i3++;
        }
    }

    public final String toString() {
        zzhtk zzhtkVarM7415c = m7415c();
        int i2 = zzhfb.f18582a;
        zzhtl zzhtlVarM7833D = zzhto.m7833D();
        int iM7822D = zzhtkVarM7415c.m7822D();
        zzhtlVarM7833D.m8326l();
        ((zzhto) zzhtlVarM7833D.f19780t).m7834E(iM7822D);
        for (zzhtj zzhtjVar : zzhtkVarM7415c.m7823E()) {
            zzhtm zzhtmVarM7828D = zzhtn.m7828D();
            String strM7790D = zzhtjVar.m7811E().m7790D();
            zzhtmVarM7828D.m8326l();
            ((zzhtn) zzhtmVarM7828D.f19780t).m7829E(strM7790D);
            int iM7817L = zzhtjVar.m7817L();
            zzhtmVarM7828D.m8326l();
            ((zzhtn) zzhtmVarM7828D.f19780t).m7832H(iM7817L);
            zzhtx zzhtxVarM7813G = zzhtjVar.m7813G();
            zzhtmVarM7828D.m8326l();
            ((zzhtn) zzhtmVarM7828D.f19780t).m7831G(zzhtxVarM7813G);
            int iM7812F = zzhtjVar.m7812F();
            zzhtmVarM7828D.m8326l();
            ((zzhtn) zzhtmVarM7828D.f19780t).m7830F(iM7812F);
            zzhtn zzhtnVar = (zzhtn) zzhtmVarM7828D.m8328o();
            zzhtlVarM7833D.m8326l();
            ((zzhto) zzhtlVarM7833D.f19780t).m7835F(zzhtnVar);
        }
        return ((zzhto) zzhtlVarM7833D.m8328o()).toString();
    }

    public zzhek(List list, Map map) throws GeneralSecurityException {
        this.f18567a = list;
        this.f18568b = map;
        if (((zzhlb) zzhlc.f18917a).f18916a.get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                zzhei zzheiVar = (zzhei) it.next();
                int i2 = zzheiVar.f18562c;
                int i3 = zzheiVar.f18562c;
                if (hashSet.contains(Integer.valueOf(i2))) {
                    throw new GeneralSecurityException(AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i3).length() + C1137R.styleable.ConstraintSet_transitionEasing), "KeyID ", i3, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
                hashSet.add(Integer.valueOf(i3));
                z |= zzheiVar.f18563d;
            }
            if (!z) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.f18569c = null;
    }
}
