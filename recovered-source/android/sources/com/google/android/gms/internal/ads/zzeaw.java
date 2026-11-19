package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeaw {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f13485a = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX INFO: renamed from: a */
    public final synchronized void m6139a(int i2, long j2, long j3) {
        int iIntValue;
        ArrayDeque arrayDeque;
        Long l2;
        try {
            zzbio zzbioVar = zzbix.f8130H8;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                if (i2 == 2) {
                    zzeau zzeauVar = new zzeau();
                    zzeauVar.f13480a = j2;
                    byte b = (byte) (zzeauVar.f13482c | 1);
                    zzeauVar.f13481b = 1;
                    zzeauVar.f13482c = (byte) (b | 2);
                    zzeaz zzeazVarM6136a = zzeauVar.m6136a();
                    ConcurrentHashMap concurrentHashMap = this.f13485a;
                    ArrayDeque arrayDeque2 = (ArrayDeque) concurrentHashMap.get(zzeazVarM6136a);
                    if (arrayDeque2 != null && !arrayDeque2.isEmpty()) {
                        arrayDeque2.removeFirst();
                        if (arrayDeque2.isEmpty()) {
                            concurrentHashMap.remove(zzeazVarM6136a);
                        }
                    }
                    i2 = 2;
                }
                zzeau zzeauVar2 = new zzeau();
                zzeauVar2.f13480a = j2;
                byte b2 = (byte) (zzeauVar2.f13482c | 1);
                zzeauVar2.f13481b = i2;
                zzeauVar2.f13482c = (byte) (b2 | 2);
                zzeaz zzeazVarM6136a2 = zzeauVar2.m6136a();
                int i3 = ((zzeav) zzeazVarM6136a2).f13484b;
                if (i3 == 0) {
                    iIntValue = 0;
                } else if (i3 == 1) {
                    iIntValue = ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8249O8)).intValue();
                } else if (i3 == 2) {
                    iIntValue = ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8266P8)).intValue();
                } else if (i3 != 3) {
                    iIntValue = 0;
                } else {
                    iIntValue = ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8283Q8)).intValue();
                }
                if (iIntValue > 0) {
                    ConcurrentHashMap concurrentHashMap2 = this.f13485a;
                    ArrayDeque arrayDeque3 = (ArrayDeque) concurrentHashMap2.get(zzeazVarM6136a2);
                    if (arrayDeque3 == null) {
                        arrayDeque3 = new ArrayDeque();
                        concurrentHashMap2.put(zzeazVarM6136a2, arrayDeque3);
                    }
                    arrayDeque3.addLast(Long.valueOf(j3));
                    while (arrayDeque3.size() > iIntValue) {
                        arrayDeque3.removeFirst();
                    }
                    m6140b();
                    int iIntValue2 = ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8300R8)).intValue();
                    if (iIntValue2 <= 0) {
                        concurrentHashMap2.clear();
                        return;
                    }
                    while (true) {
                        Iterator it = concurrentHashMap2.values().iterator();
                        int size = 0;
                        while (it.hasNext()) {
                            size += ((ArrayDeque) it.next()).size();
                        }
                        if (size <= iIntValue2) {
                            break;
                        }
                        if (!concurrentHashMap2.isEmpty()) {
                            Long lValueOf = Long.valueOf(LocationRequestCompat.PASSIVE_INTERVAL);
                            Map.Entry entry = null;
                            for (Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                                ArrayDeque arrayDeque4 = (ArrayDeque) entry2.getValue();
                                if (!arrayDeque4.isEmpty() && (l2 = (Long) arrayDeque4.peekFirst()) != null && l2.longValue() < lValueOf.longValue()) {
                                    entry = entry2;
                                    lValueOf = l2;
                                }
                            }
                            if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                                arrayDeque.removeFirst();
                                if (arrayDeque.isEmpty()) {
                                    concurrentHashMap2.remove(entry.getKey());
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX INFO: renamed from: b */
    public final void m6140b() {
        long jLongValue;
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it = this.f13485a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzeaz zzeazVar = (zzeaz) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int iMo6138b = zzeazVar.mo6138b();
            if (iMo6138b == 0) {
                jLongValue = 0;
            } else if (iMo6138b == 1) {
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8198L8)).longValue();
            } else if (iMo6138b == 2) {
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8215M8)).longValue();
            } else if (iMo6138b != 3) {
                jLongValue = 0;
            } else {
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8232N8)).longValue();
            }
            if (jLongValue == 0) {
                it.remove();
                jLongValue = 0;
            }
            if (jLongValue > 0) {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext() && jCurrentTimeMillis - ((Long) it2.next()).longValue() > jLongValue) {
                    it2.remove();
                }
                if (arrayDeque.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
