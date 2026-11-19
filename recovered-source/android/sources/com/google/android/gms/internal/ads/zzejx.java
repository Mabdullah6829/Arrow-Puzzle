package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzejx implements zzfpt {

    /* JADX INFO: renamed from: s */
    public final zzejl f14060s;

    /* JADX INFO: renamed from: t */
    public final zzejp f14061t;

    public zzejx(zzejl zzejlVar, zzejp zzejpVar) {
        this.f14060s = zzejlVar;
        this.f14061t = zzejpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    /* JADX INFO: renamed from: e */
    public final void mo6090e(zzfpm zzfpmVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8512e7)).booleanValue() && zzfpm.RENDERER == zzfpmVar) {
            zzejl zzejlVar = this.f14060s;
            if (zzejlVar.m6236b() != 0) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - zzejlVar.m6236b();
                synchronized (zzejlVar) {
                    try {
                        synchronized (zzejlVar.f14034j) {
                            try {
                                zzejlVar.f14029e = jElapsedRealtime;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    /* JADX INFO: renamed from: r */
    public final void mo6092r(zzfpm zzfpmVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8512e7)).booleanValue()) {
            if (zzfpm.RENDERER == zzfpmVar) {
                zzejl zzejlVar = this.f14060s;
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                synchronized (zzejlVar) {
                    synchronized (zzejlVar.f14033i) {
                        zzejlVar.f14028d = jElapsedRealtime;
                    }
                }
                return;
            }
            if (zzfpm.PRELOADED_LOADER == zzfpmVar || zzfpm.SERVER_TRANSACTION == zzfpmVar) {
                zzejl zzejlVar2 = this.f14060s;
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                synchronized (zzejlVar2) {
                    try {
                        synchronized (zzejlVar2.f14030f) {
                            try {
                                zzejlVar2.f14025a = jElapsedRealtime2;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                final zzejp zzejpVar = this.f14061t;
                final long jM6235a = zzejlVar2.m6235a();
                zzejpVar.f14054b.m6232a(new zzfos() { // from class: com.google.android.gms.internal.ads.zzejo
                    @Override // com.google.android.gms.internal.ads.zzfos
                    /* JADX INFO: renamed from: b */
                    public final Object mo5874b(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzejpVar.f14053a.mo3172s()) {
                            return null;
                        }
                        zzbic.zzaf.zza.C6588zza c6588zzaM4921U = zzbic.zzaf.zza.m4921U();
                        c6588zzaM4921U.m8326l();
                        zzbic.zzaf.zza zzaVar = (zzbic.zzaf.zza) c6588zzaM4921U.f19780t;
                        long j2 = jM6235a;
                        zzaVar.m4934P(j2);
                        byte[] bArrM8099h = ((zzbic.zzaf.zza) c6588zzaM4921U.m8328o()).m8099h();
                        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
                        zzejw.m6239b(sQLiteDatabase, j2, bArrM8099h);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    /* JADX INFO: renamed from: t */
    public final void mo6093t(zzfpm zzfpmVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8512e7)).booleanValue() && zzfpm.RENDERER == zzfpmVar) {
            zzejl zzejlVar = this.f14060s;
            if (zzejlVar.m6236b() != 0) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - zzejlVar.m6236b();
                synchronized (zzejlVar) {
                    try {
                        synchronized (zzejlVar.f14034j) {
                            try {
                                zzejlVar.f14029e = jElapsedRealtime;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    /* JADX INFO: renamed from: g */
    public final void mo6091g(String str) {
    }
}
