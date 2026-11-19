package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc {

    /* JADX INFO: renamed from: a */
    public final zzf f22341a;

    /* JADX INFO: renamed from: b */
    public zzg f22342b;

    /* JADX INFO: renamed from: c */
    public final zzab f22343c;

    /* JADX INFO: renamed from: d */
    public final zzz f22344d;

    public zzc() {
        zzf zzfVar = new zzf();
        this.f22341a = zzfVar;
        this.f22342b = zzfVar.f22486b.m9952c();
        this.f22343c = new zzab();
        this.f22344d = new zzz();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.measurement.zzb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzv(this.f22257a.f22344d);
            }
        };
        zzj zzjVar = zzfVar.f22488d;
        zzjVar.f22522a.put("internal.registerCallback", callable);
        zzjVar.f22522a.put("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.zza
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzk(this.f21848a.f22343c);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9828a(zzaa zzaaVar) throws zzd {
        zzab zzabVar = this.f22343c;
        try {
            zzabVar.f21888a = zzaaVar;
            zzabVar.f21889b = zzaaVar.clone();
            zzabVar.f21890c.clear();
            this.f22341a.f22487c.m9954e("runtime.counter", new zzah(Double.valueOf(0.0d)));
            this.f22344d.m10738a(this.f22342b.m9952c(), zzabVar);
            return (zzabVar.f21889b.equals(zzabVar.f21888a) && zzabVar.f21890c.isEmpty()) ? false : true;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9829b(zzja zzjaVar) throws zzd {
        zzai zzaiVar;
        try {
            zzf zzfVar = this.f22341a;
            this.f22342b = zzfVar.f22486b.m9952c();
            if (zzfVar.m9874a(this.f22342b, (zzje[]) zzjaVar.m10443A().toArray(new zzje[0])) instanceof zzag) {
                throw new IllegalStateException("Program loading failed");
            }
            for (zziy zziyVar : zzjaVar.m10444B().m10439A()) {
                List listM10442B = zziyVar.m10442B();
                String strM10441A = zziyVar.m10441A();
                Iterator it = listM10442B.iterator();
                while (it.hasNext()) {
                    zzao zzaoVarM9874a = zzfVar.m9874a(this.f22342b, (zzje) it.next());
                    if (!(zzaoVarM9874a instanceof zzal)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    zzg zzgVar = this.f22342b;
                    if (zzgVar.m9953d(strM10441A)) {
                        zzao zzaoVarM9956g = zzgVar.m9956g(strM10441A);
                        if (!(zzaoVarM9956g instanceof zzai)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strM10441A)));
                        }
                        zzaiVar = (zzai) zzaoVarM9956g;
                    } else {
                        zzaiVar = null;
                    }
                    if (zzaiVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strM10441A)));
                    }
                    zzaiVar.mo9793c(this.f22342b, Collections.singletonList(zzaoVarM9874a));
                }
            }
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }
}
