package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhnz implements zzhod {

    /* JADX INFO: renamed from: a */
    public final String f19030a;

    /* JADX INFO: renamed from: b */
    public final zzibk f19031b;

    /* JADX INFO: renamed from: c */
    public final zzidl f19032c;

    /* JADX INFO: renamed from: d */
    public final zzhta f19033d;

    /* JADX INFO: renamed from: e */
    public final zzhtx f19034e;

    /* JADX INFO: renamed from: f */
    public final Integer f19035f;

    public zzhnz(String str, zzibk zzibkVar, zzidl zzidlVar, zzhta zzhtaVar, zzhtx zzhtxVar, Integer num) {
        this.f19030a = str;
        this.f19031b = zzibkVar;
        this.f19032c = zzidlVar;
        this.f19033d = zzhtaVar;
        this.f19034e = zzhtxVar;
        this.f19035f = num;
    }

    /* JADX INFO: renamed from: a */
    public static zzhnz m7588a(String str, zzidl zzidlVar, zzhta zzhtaVar, zzhtx zzhtxVar, Integer num) throws GeneralSecurityException {
        if (zzhtxVar == zzhtx.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        zzibk zzibkVarM7597b = zzhok.m7597b(str);
        int iOrdinal = zzhtaVar.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
            throw new GeneralSecurityException("Unknown KeyMaterialType ".concat(String.valueOf(zzhtaVar)));
        }
        int iOrdinal2 = zzhtxVar.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2 || iOrdinal2 == 3 || iOrdinal2 == 4 || iOrdinal2 == 5) {
            return new zzhnz(str, zzibkVarM7597b, zzidlVar, zzhtaVar, zzhtxVar, num);
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType ".concat(String.valueOf(zzhtxVar)));
    }
}
