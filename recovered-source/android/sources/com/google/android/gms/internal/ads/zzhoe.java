package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhoe {

    /* JADX INFO: renamed from: a */
    public final HashMap f19045a;

    /* JADX INFO: renamed from: b */
    public final HashMap f19046b;

    /* JADX INFO: renamed from: c */
    public final HashMap f19047c;

    /* JADX INFO: renamed from: d */
    public final HashMap f19048d;

    public zzhoe() {
        this.f19045a = new HashMap();
        this.f19046b = new HashMap();
        this.f19047c = new HashMap();
        this.f19048d = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m7591a(zzhmh zzhmhVar) throws GeneralSecurityException {
        zzhog zzhogVar = new zzhog(zzhmhVar.f18978a, zzhnz.class);
        HashMap map = this.f19045a;
        if (!map.containsKey(zzhogVar)) {
            map.put(zzhogVar, zzhmhVar);
            return;
        }
        zzhmh zzhmhVar2 = (zzhmh) map.get(zzhogVar);
        if (!zzhmhVar2.equals(zzhmhVar) || !zzhmhVar.equals(zzhmhVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhogVar.toString()));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7592b(zzhme zzhmeVar) throws GeneralSecurityException {
        zzhmeVar.getClass();
        zzhof zzhofVar = new zzhof(zzhnz.class, zzhmeVar.f18976a);
        HashMap map = this.f19046b;
        if (!map.containsKey(zzhofVar)) {
            map.put(zzhofVar, zzhmeVar);
            return;
        }
        zzhme zzhmeVar2 = (zzhme) map.get(zzhofVar);
        if (!zzhmeVar2.equals(zzhmeVar) || !zzhmeVar.equals(zzhmeVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhofVar.toString()));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7593c(zzhnl zzhnlVar) throws GeneralSecurityException {
        zzhog zzhogVar = new zzhog(zzhnlVar.f19011a, zzhoa.class);
        HashMap map = this.f19047c;
        if (!map.containsKey(zzhogVar)) {
            map.put(zzhogVar, zzhnlVar);
            return;
        }
        zzhnl zzhnlVar2 = (zzhnl) map.get(zzhogVar);
        if (!zzhnlVar2.equals(zzhnlVar) || !zzhnlVar.equals(zzhnlVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhogVar.toString()));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7594d(zzhni zzhniVar) throws GeneralSecurityException {
        zzhniVar.getClass();
        zzhof zzhofVar = new zzhof(zzhoa.class, zzhniVar.f19009a);
        HashMap map = this.f19048d;
        if (!map.containsKey(zzhofVar)) {
            map.put(zzhofVar, zzhniVar);
            return;
        }
        zzhni zzhniVar2 = (zzhni) map.get(zzhofVar);
        if (!zzhniVar2.equals(zzhniVar) || !zzhniVar.equals(zzhniVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhofVar.toString()));
        }
    }

    public zzhoe(zzhoh zzhohVar) {
        this.f19045a = new HashMap(zzhohVar.f19053a);
        this.f19046b = new HashMap(zzhohVar.f19054b);
        this.f19047c = new HashMap(zzhohVar.f19055c);
        this.f19048d = new HashMap(zzhohVar.f19056d);
    }
}
