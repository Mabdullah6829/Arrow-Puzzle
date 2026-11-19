package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeps implements zzhbn {

    /* JADX INFO: renamed from: a */
    public final zzfps f14554a;

    /* JADX INFO: renamed from: b */
    public final zzddb f14555b;

    /* JADX INFO: renamed from: c */
    public final zzfsi f14556c;

    /* JADX INFO: renamed from: d */
    public final zzfsm f14557d;

    /* JADX INFO: renamed from: e */
    public final Executor f14558e;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f14559f;

    /* JADX INFO: renamed from: g */
    public final zzcyd f14560g;

    /* JADX INFO: renamed from: h */
    public final zzepl f14561h;

    /* JADX INFO: renamed from: i */
    public final zzemf f14562i;

    /* JADX INFO: renamed from: j */
    public final Context f14563j;

    /* JADX INFO: renamed from: k */
    public final zzfqq f14564k;

    /* JADX INFO: renamed from: l */
    public final zzeov f14565l;

    /* JADX INFO: renamed from: m */
    public final zzdzo f14566m;

    public zzeps(Context context, zzfps zzfpsVar, zzepl zzeplVar, zzddb zzddbVar, zzfsi zzfsiVar, zzfsm zzfsmVar, zzcyd zzcydVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzemf zzemfVar, zzfqq zzfqqVar, zzeov zzeovVar, zzdzo zzdzoVar) {
        this.f14563j = context;
        this.f14554a = zzfpsVar;
        this.f14561h = zzeplVar;
        this.f14555b = zzddbVar;
        this.f14556c = zzfsiVar;
        this.f14557d = zzfsmVar;
        this.f14560g = zzcydVar;
        this.f14558e = executor;
        this.f14559f = scheduledExecutorService;
        this.f14562i = zzemfVar;
        this.f14564k = zzfqqVar;
        this.f14565l = zzeovVar;
        this.f14566m = zzdzoVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX INFO: renamed from: a */
    public static String m6312a(zzfky zzfkyVar) {
        zzbio zzbioVar = zzbix.f8850y6;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        String strM2447n = "No fill.";
        String str = true != ((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() ? "No ad config." : "No fill.";
        zzfkq zzfkqVar = zzfkyVar.f16006b.f16002b;
        int i2 = zzfkqVar.f15977f;
        if (i2 == 0) {
            strM2447n = str;
        } else if (i2 < 200 || i2 >= 300) {
            strM2447n = (i2 < 300 || i2 >= 400) ? AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 35), "Received error HTTP response code: ", i2) : "No location header to follow redirect or too many redirects.";
        } else {
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8833x6)).booleanValue()) {
                strM2447n = str;
            }
        }
        zzfkp zzfkpVar = zzfkqVar.f15981j;
        return zzfkpVar != null ? zzfkpVar.f15971a : strM2447n;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzhbn
    /* JADX INFO: renamed from: b */
    public final ListenableFuture mo3248b(Object obj) {
        ListenableFuture listenableFuture;
        int i2;
        Bundle bundle;
        final zzfky zzfkyVar = (zzfky) obj;
        zzbio zzbioVar = zzbix.f8158J2;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && (bundle = zzfkyVar.f16006b.f16004d) != null) {
            zzdzo zzdzoVar = this.f14566m;
            synchronized (zzdzoVar) {
                zzdzoVar.f13411e.putAll(bundle);
            }
        }
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8175K2)).booleanValue()) {
            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, this.f14566m, "rendering-start");
        }
        String strM6312a = m6312a(zzfkyVar);
        zzemf zzemfVar = this.f14562i;
        zzfkx zzfkxVar = zzfkyVar.f16006b;
        zzfkq zzfkqVar = zzfkxVar.f16002b;
        zzemfVar.f14198d = zzfkqVar;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8836x9)).booleanValue() && (i2 = zzfkqVar.f15977f) != 0 && (i2 < 200 || i2 >= 300)) {
            return zzhcf.m7368b(new zzepp(3, strM6312a));
        }
        String str = zzfkqVar.f15988q;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8797v4)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfkn zzfknVar : zzfkxVar.f16001a) {
                zzemfVar.m6289b(zzfknVar, zzemfVar.f14195a.size());
                Iterator it = zzfknVar.f15916a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzemfVar.m6290c(zzfknVar, 0L, zzfmi.m6535d(1, null, null), false);
                        break;
                    }
                    zzema zzemaVarMo5870a = this.f14560g.mo5870a(zzfknVar.f15918b, (String) it.next());
                    if (zzemaVarMo5870a != null && zzemaVarMo5870a.mo6285b(zzfkyVar, zzfknVar)) {
                        break;
                    }
                }
            }
        } else {
            List list = zzfkxVar.f16001a;
            synchronized (zzemfVar) {
                Map map = zzemfVar.f14196b;
                if (map.containsKey(str)) {
                    com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(str);
                    List list2 = zzemfVar.f14195a;
                    int iIndexOf = list2.indexOf(zzvVar);
                    try {
                        list2.remove(iIndexOf);
                    } catch (IndexOutOfBoundsException e) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry", e);
                    }
                    zzemfVar.f14196b.remove(str);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        zzemfVar.m6289b((zzfkn) it2.next(), iIndexOf);
                        iIndexOf++;
                    }
                }
            }
        }
        zzddb zzddbVar = this.f14555b;
        zzctu zzctuVar = new zzctu(zzfkyVar, this.f14557d, this.f14556c);
        Executor executor = this.f14558e;
        zzddbVar.m5924Y(zzctuVar, executor);
        if (zzfkqVar.f15989r > 1) {
            zzeov zzeovVar = this.f14565l;
            synchronized (zzeovVar) {
                try {
                    if (!zzeovVar.f14433i.getAndSet(true)) {
                        List list3 = zzfkyVar.f16006b.f16001a;
                        if (list3.isEmpty()) {
                            zzeovVar.f14432h.m7321d(new zzepp(3, m6312a(zzfkyVar)));
                        } else {
                            zzeovVar.f14435k = zzfkyVar;
                            zzepl zzeplVar = zzeovVar.f14430f;
                            zzeovVar.f14434j = new zzeow(zzfkyVar, zzeplVar, zzeovVar.f14432h);
                            zzeplVar.m6307a(list3);
                            for (zzfkn zzfknVarM6298a = zzeovVar.f14434j.m6298a(); zzfknVarM6298a != null; zzfknVarM6298a = zzeovVar.f14434j.m6298a()) {
                                zzeovVar.m6297a(zzfknVarM6298a);
                            }
                        }
                    }
                    listenableFuture = zzeovVar.f14432h;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            String strM6312a2 = m6312a(zzfkyVar);
            zzfps zzfpsVar = this.f14554a;
            zzfpm zzfpmVar = zzfpm.RENDER_CONFIG_INIT;
            Objects.requireNonNull(zzfpsVar);
            zzfoz zzfozVarM6555d = new zzfpj(zzfpsVar, zzfpmVar, null, zzfpk.f16241d, Collections.EMPTY_LIST, zzhcf.m7368b(new zzepp(3, strM6312a2))).m6555d();
            final zzepl zzeplVar2 = this.f14561h;
            synchronized (zzeplVar2) {
                zzeplVar2.f14542i = zzeplVar2.f14534a.mo3639a();
            }
            int i3 = 0;
            zzfoz zzfozVarM6555d2 = zzfozVarM6555d;
            for (final zzfkn zzfknVar2 : zzfkxVar.f16001a) {
                for (String str2 : zzfknVar2.f15916a) {
                    final zzema zzemaVarMo5870a2 = this.f14560g.mo5870a(zzfknVar2.f15918b, str2);
                    if (zzemaVarMo5870a2 != null && zzemaVarMo5870a2.mo6285b(zzfkyVar, zzfknVar2)) {
                        zzfpj zzfpjVarM6556a = zzfpsVar.m6556a(zzfozVarM6555d2, zzfpm.RENDER_CONFIG_WATERFALL);
                        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 15 + String.valueOf(str2).length());
                        sb.append("render-config-");
                        sb.append(i3);
                        sb.append("-");
                        sb.append(str2);
                        zzfpj zzfpjVar = new zzfpj(zzfpjVarM6556a.f16240f, zzfpjVarM6556a.f16235a, sb.toString(), zzfpjVarM6556a.f16237c, zzfpjVarM6556a.f16238d, zzfpjVarM6556a.f16239e);
                        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzepr
                            @Override // com.google.android.gms.internal.ads.zzhbn
                            /* JADX INFO: renamed from: b */
                            public final ListenableFuture mo3248b(Object obj2) {
                                zzeps zzepsVar = this.f14550a;
                                zzfqg zzfqgVarM6562l = zzfqg.m6562l(zzepsVar.f14563j, 12);
                                zzfkn zzfknVar3 = zzfknVar2;
                                zzfqgVarM6562l.mo6571p0(zzfknVar3.f15889E);
                                zzfqgVarM6562l.zza();
                                zzema zzemaVar = zzemaVarMo5870a2;
                                zzfky zzfkyVar2 = zzfkyVar;
                                ListenableFuture listenableFutureM7373g = zzhcf.m7373g(zzemaVar.mo6284a(zzfkyVar2, zzfknVar3), zzfknVar3.f15907R, TimeUnit.MILLISECONDS, zzepsVar.f14559f);
                                zzepsVar.f14561h.m6308b(zzfkyVar2, zzfknVar3, listenableFutureM7373g, zzepsVar.f14556c);
                                zzfqp.m6577c(listenableFutureM7373g, zzepsVar.f14564k, zzfqgVarM6562l, false);
                                return listenableFutureM7373g;
                            }
                        };
                        zzfpk zzfpkVar = zzfpjVar.f16240f;
                        zzfozVarM6555d2 = new zzfpj(zzfpkVar, zzfpjVar.f16235a, zzfpjVar.f16236b, zzfpjVar.f16237c, zzfpjVar.f16238d, zzhcf.m7372f(zzfpjVar.f16239e, Throwable.class, zzhbnVar, zzfpkVar.f16242a)).m6555d();
                        break;
                    }
                }
                i3++;
                zzfozVarM6555d2 = zzfozVarM6555d2;
            }
            zzfozVarM6555d2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepq
                @Override // java.lang.Runnable
                public final void run() {
                    zzepl zzeplVar3 = zzeplVar2;
                    synchronized (zzeplVar3) {
                        zzeplVar3.f14541h = zzeplVar3.f14534a.mo3639a() - zzeplVar3.f14542i;
                    }
                }
            }, executor);
            listenableFuture = zzfozVarM6555d2;
        }
        return listenableFuture;
    }
}
