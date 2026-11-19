package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class zzgnd {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f17856a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public zzhev f17857b = null;

    /* JADX INFO: renamed from: c */
    public zzhev f17858c = null;

    /* JADX INFO: renamed from: a */
    public final boolean m7038a(zzbdt zzbdtVar) {
        byte[] bArrM8151a = zzbdtVar.m4768D().m4785E().m4790E().m8151a();
        byte[] bArrM8151a2 = zzbdtVar.m4768D().m4787G().m8151a();
        try {
            try {
                if (!this.f17856a.getAndSet(true)) {
                    try {
                        zzhxs.m7994a();
                        zzhek zzhekVarM7423a = zzhez.m7423a(new String(zzgel.m6965a("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false)));
                        zzhdw zzhdwVar = zzhex.f18573a;
                        this.f17857b = (zzhev) zzhekVarM7423a.m7419h(zzhdwVar, zzhev.class);
                        this.f17858c = (zzhev) zzhez.m7423a(new String(zzgel.m6965a("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).m7419h(zzhdwVar, zzhev.class);
                    } catch (Exception e) {
                        throw new GeneralSecurityException("Failed to verify program", e);
                    }
                }
                zzhev zzhevVar = this.f17857b;
                if (zzhevVar == null) {
                    throw new GeneralSecurityException();
                }
                zzhevVar.mo7422a(bArrM8151a, bArrM8151a2);
                return true;
            } catch (GeneralSecurityException unused) {
                zzhev zzhevVar2 = this.f17858c;
                if (zzhevVar2 != null) {
                    zzhevVar2.mo7422a(bArrM8151a, bArrM8151a2);
                    return true;
                }
                return false;
            }
        } catch (GeneralSecurityException unused2) {
            return false;
        }
    }
}
