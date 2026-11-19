package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzahn;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzad extends zzos {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzad(zzpg zzpgVar) {
        super(zzpgVar);
    }

    private final zzy zzc(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzd(int i2, int i3) {
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i2));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zzc().get(i3);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0247  */
    /* JADX WARN: Code duplicated, block: B:105:0x0257  */
    /* JADX WARN: Code duplicated, block: B:107:0x0262  */
    /* JADX WARN: Code duplicated, block: B:111:0x028e A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, LOOP:11: B:111:0x028e->B:523:?, LOOP_START, TryCatch #6 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:445:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:113:0x029f A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, TryCatch #6 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:445:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02c2 A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:445:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:140:0x0308  */
    /* JADX WARN: Code duplicated, block: B:142:0x031f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0406  */
    /* JADX WARN: Code duplicated, block: B:168:0x040a  */
    /* JADX WARN: Code duplicated, block: B:172:0x0417  */
    /* JADX WARN: Code duplicated, block: B:174:0x0437  */
    /* JADX WARN: Code duplicated, block: B:180:0x044e  */
    /* JADX WARN: Code duplicated, block: B:184:0x046a  */
    /* JADX WARN: Code duplicated, block: B:185:0x0473  */
    /* JADX WARN: Code duplicated, block: B:189:0x0481  */
    /* JADX WARN: Code duplicated, block: B:195:0x0498  */
    /* JADX WARN: Code duplicated, block: B:201:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:204:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:206:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:208:0x0503  */
    /* JADX WARN: Code duplicated, block: B:209:0x0507  */
    /* JADX WARN: Code duplicated, block: B:214:0x0520 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:242:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:248:0x0601  */
    /* JADX WARN: Code duplicated, block: B:254:0x063e  */
    /* JADX WARN: Code duplicated, block: B:261:0x0666  */
    /* JADX WARN: Code duplicated, block: B:267:0x0675  */
    /* JADX WARN: Code duplicated, block: B:278:0x06a4 A[LOOP:3: B:255:0x0640->B:278:0x06a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:279:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:296:0x06de  */
    /* JADX WARN: Code duplicated, block: B:300:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:302:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:306:0x0700  */
    /* JADX WARN: Code duplicated, block: B:312:0x0731  */
    /* JADX WARN: Code duplicated, block: B:314:0x075e A[LOOP:5: B:310:0x072b->B:314:0x075e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:318:0x077a  */
    /* JADX WARN: Code duplicated, block: B:322:0x078f  */
    /* JADX WARN: Code duplicated, block: B:325:0x0797  */
    /* JADX WARN: Code duplicated, block: B:328:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:330:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:334:0x07f2 A[Catch: all -> 0x0823, SQLiteException -> 0x0833, LOOP:7: B:334:0x07f2->B:356:0x085a, LOOP_START, PHI: r4 r8
  0x07f2: PHI (r4v50 java.util.Iterator) = (r4v42 java.util.Iterator), (r4v54 java.util.Iterator) binds: [B:333:0x07f0, B:356:0x085a] A[DONT_GENERATE, DONT_INLINE]
  0x07f2: PHI (r8v45 java.lang.String) = (r8v42 java.lang.String), (r8v47 java.lang.String) binds: [B:333:0x07f0, B:356:0x085a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x0823, blocks: (B:332:0x07ec, B:334:0x07f2, B:335:0x07f7, B:337:0x0808, B:340:0x081a, B:346:0x082d, B:353:0x084f, B:369:0x0878, B:350:0x0838, B:352:0x0848, B:360:0x0865), top: B:439:0x07ec }] */
    /* JADX WARN: Code duplicated, block: B:339:0x0818  */
    /* JADX WARN: Code duplicated, block: B:345:0x0829  */
    /* JADX WARN: Code duplicated, block: B:356:0x085a A[LOOP:7: B:334:0x07f2->B:356:0x085a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:359:0x0861  */
    /* JADX WARN: Code duplicated, block: B:361:0x0867 A[PHI: r0 r13 r36
  0x0867: PHI (r0v120 java.util.Map) = (r0v122 java.util.Map), (r0v128 java.util.Map) binds: [B:370:0x088b, B:360:0x0865] A[DONT_GENERATE, DONT_INLINE]
  0x0867: PHI (r13v4 android.database.Cursor) = (r13v5 android.database.Cursor), (r13v6 android.database.Cursor) binds: [B:370:0x088b, B:360:0x0865] A[DONT_GENERATE, DONT_INLINE]
  0x0867: PHI (r36v4 java.util.Iterator) = (r36v5 java.util.Iterator), (r36v9 java.util.Iterator) binds: [B:370:0x088b, B:360:0x0865] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:376:0x0898  */
    /* JADX WARN: Code duplicated, block: B:380:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:384:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:387:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:389:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:391:0x0903  */
    /* JADX WARN: Code duplicated, block: B:393:0x090e  */
    /* JADX WARN: Code duplicated, block: B:395:0x093b  */
    /* JADX WARN: Code duplicated, block: B:398:0x0945  */
    /* JADX WARN: Code duplicated, block: B:407:0x0990  */
    /* JADX WARN: Code duplicated, block: B:408:0x0999  */
    /* JADX WARN: Code duplicated, block: B:412:0x09ac A[PHI: r16 r37 r40
  0x09ac: PHI (r16v8 java.lang.String) = (r16v9 java.lang.String), (r2v25 java.lang.String) binds: [B:411:0x09aa, B:409:0x099a] A[DONT_GENERATE, DONT_INLINE]
  0x09ac: PHI (r37v3 java.util.Map) = (r37v4 java.util.Map), (r37v5 java.util.Map) binds: [B:411:0x09aa, B:409:0x099a] A[DONT_GENERATE, DONT_INLINE]
  0x09ac: PHI (r40v3 androidx.collection.ArrayMap) = (r40v4 androidx.collection.ArrayMap), (r3v31 androidx.collection.ArrayMap) binds: [B:411:0x09aa, B:409:0x099a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:417:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:430:0x0a5b  */
    /* JADX WARN: Code duplicated, block: B:490:0x05da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x05f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x05c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x05c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x069f A[EDGE_INSN: B:496:0x069f->B:277:0x069f BREAK  A[LOOP:3: B:255:0x0640->B:278:0x06a4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x0720 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x0712 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x0772 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x076c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0855 A[EDGE_INSN: B:508:0x0855->B:355:0x0855 BREAK  A[LOOP:7: B:334:0x07f2->B:356:0x085a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x08ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x09b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x09a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x097c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x0a2d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x09cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x0582 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x045a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x0448 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x0492 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x0325 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x016d  */
    /* JADX WARN: Code duplicated, block: B:564:0x020d A[EDGE_INSN: B:564:0x020d->B:83:0x020d BREAK  A[LOOP:20: B:70:0x01c1->B:84:0x0212], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a2 A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_LEAVE, TryCatch #11 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:452:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01bc A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_ENTER, TryCatch #11 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:452:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0212 A[LOOP:20: B:70:0x01c1->B:84:0x0212, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v20 */
    /* JADX WARN: Type inference failed for: r18v21 */
    /* JADX WARN: Type inference failed for: r18v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r18v23 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r18v29 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v30 */
    /* JADX WARN: Type inference failed for: r18v31 */
    /* JADX WARN: Type inference failed for: r18v38 */
    /* JADX WARN: Type inference failed for: r18v40 */
    /* JADX WARN: Type inference failed for: r18v41 */
    /* JADX WARN: Type inference failed for: r18v42 */
    /* JADX WARN: Type inference failed for: r18v43 */
    /* JADX WARN: Type inference failed for: r18v44 */
    /* JADX WARN: Type inference failed for: r18v45 */
    /* JADX WARN: Type inference failed for: r18v46 */
    /* JADX WARN: Type inference failed for: r18v47 */
    /* JADX WARN: Type inference failed for: r18v48 */
    /* JADX WARN: Type inference failed for: r18v49 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v50 */
    /* JADX WARN: Type inference failed for: r18v51 */
    /* JADX WARN: Type inference failed for: r18v52 */
    /* JADX WARN: Type inference failed for: r18v53 */
    /* JADX WARN: Type inference failed for: r18v54 */
    /* JADX WARN: Type inference failed for: r18v55 */
    /* JADX WARN: Type inference failed for: r18v56 */
    /* JADX WARN: Type inference failed for: r18v57 */
    /* JADX WARN: Type inference failed for: r18v58 */
    /* JADX WARN: Type inference failed for: r18v59 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v60 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r3v62, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v35, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @WorkerThread
    public final List zzb(String str, List list, List list2, Long l2, Long l3, boolean z) throws Throwable {
        int i2;
        int i3;
        boolean z2;
        Map map;
        Cursor cursor;
        boolean z3;
        String str2;
        Cursor cursorQuery;
        Map map2;
        ?? r18;
        HashSet hashSet;
        HashSet<Integer> hashSet2;
        Map map3;
        com.google.android.gms.internal.measurement.zzii zziiVar;
        BitSet bitSet;
        BitSet bitSet2;
        ArrayMap arrayMap;
        com.google.android.gms.internal.measurement.zzii zziiVar2;
        List list3;
        int i4;
        boolean z4;
        Iterator it;
        com.google.android.gms.internal.measurement.zzik zzikVar;
        Long lValueOf;
        String str3;
        Map arrayMap2;
        SQLiteDatabase sQLiteDatabaseZze;
        ?? r5;
        Cursor cursorRawQuery;
        ArrayMap arrayMap3;
        Iterator it2;
        Integer num;
        com.google.android.gms.internal.measurement.zzii zziiVar3;
        List list4;
        Map map4;
        HashSet hashSet3;
        Integer numValueOf;
        List arrayList;
        ?? r10;
        String str4;
        String str5;
        ArrayList arrayList2;
        zzaw zzawVarZzj;
        String str6;
        ContentValues contentValues;
        ArrayMap arrayMap4;
        Iterator it3;
        String strM10421C;
        Map map5;
        Iterator it4;
        Iterator it5;
        boolean zZzd;
        Map map6;
        com.google.android.gms.internal.measurement.zzfn zzfnVar;
        zzic zzicVar;
        Integer numValueOf2;
        zzac zzacVar;
        Integer numValueOf3;
        zzaw zzawVarZzj2;
        String str7;
        ArrayMap arrayMap5;
        Cursor cursor2;
        String str8;
        Cursor cursorQuery2;
        Integer numValueOf4;
        List list5;
        List arrayList3;
        zzz zzzVar;
        ArrayMap arrayMap6;
        Iterator it6;
        com.google.android.gms.internal.measurement.zzhs zzhsVar;
        com.google.android.gms.internal.measurement.zzhs zzhsVarZza;
        zzpg zzpgVar;
        zzbd zzbdVarZzah;
        long j2;
        String strM10127F;
        Map map7;
        zzbd zzbdVar;
        Iterator it7;
        Integer num2;
        int iIntValue;
        Iterator it8;
        boolean zZzd2;
        ?? r19;
        Map map8;
        Iterator it9;
        long j3;
        zzaa zzaaVar;
        Long l4;
        zzaw zzawVarZzj3;
        String str9;
        ArrayMap arrayMap7;
        String str10;
        ?? r6;
        ?? r110;
        ?? r111;
        ?? Query;
        ?? r112;
        ?? r113;
        ?? r114;
        ?? r115;
        Integer numValueOf5;
        List list6;
        ?? r116;
        List arrayList4;
        ArrayMap arrayMap8;
        String str11;
        int i5;
        Cursor cursorQuery3;
        List arrayList5;
        Preconditions.m3541e(str);
        Preconditions.m3544h(list);
        Preconditions.m3544h(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l2;
        this.zze = l3;
        Iterator it10 = list.iterator();
        while (true) {
            i2 = 0;
            i3 = 1;
            if (!it10.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzhs) it10.next()).m10127F())) {
                z2 = true;
                break;
            }
        }
        zzahn.m9791a();
        zzic zzicVar2 = this.zzu;
        boolean zZzp = zzicVar2.zzc().zzp(this.zza, zzfy.zzaF);
        zzahn.m9791a();
        boolean zZzp2 = zzicVar2.zzc().zzp(this.zza, zzfy.zzaE);
        if (z2) {
            zzaw zzawVarZzj4 = this.zzg.zzj();
            String str12 = this.zza;
            zzawVarZzj4.zzay();
            zzawVarZzj4.zzg();
            Preconditions.m3541e(str12);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                zzawVarZzj4.zze().update("events", contentValues2, "app_id = ?", new String[]{str12});
            } catch (SQLiteException e) {
                zzawVarZzj4.zzu.zzaW().zzb().zzc("Error resetting session-scoped event counts. appId", zzgu.zzl(str12), e);
            }
        }
        Map map9 = Collections.EMPTY_MAP;
        String str13 = "audience_id";
        if (zZzp2 && zZzp) {
            zzaw zzawVarZzj5 = this.zzg.zzj();
            String str14 = this.zza;
            Preconditions.m3541e(str14);
            ArrayMap arrayMap9 = new ArrayMap();
            try {
                cursorQuery3 = zzawVarZzj5.zze().query("event_filters", new String[]{"audience_id", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, "app_id=?", new String[]{str14}, null, null, null);
                try {
                    try {
                        if (cursorQuery3.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.m9890M(), cursorQuery3.getBlob(i3))).m9555r();
                                    if (zzffVar.m9897G()) {
                                        Integer numValueOf6 = Integer.valueOf(cursorQuery3.getInt(i2));
                                        List list7 = (List) arrayMap9.get(numValueOf6);
                                        if (list7 == null) {
                                            arrayList5 = new ArrayList();
                                            arrayMap9.put(numValueOf6, arrayList5);
                                        } else {
                                            arrayList5 = list7;
                                        }
                                        arrayList5.add(zzffVar);
                                    }
                                } catch (IOException e2) {
                                    zzawVarZzj5.zzu.zzaW().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str14), e2);
                                }
                                if (!cursorQuery3.moveToNext()) {
                                    break;
                                }
                                i2 = 0;
                                i3 = 1;
                            }
                            cursorQuery3.close();
                            map = arrayMap9;
                        } else {
                            cursorQuery3.close();
                            map = map9;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        zzawVarZzj5.zzu.zzaW().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str14), e);
                        map9 = Collections.EMPTY_MAP;
                        if (cursorQuery3 != null) {
                        }
                        map = map9;
                        zzaw zzawVarZzj6 = this.zzg.zzj();
                        String str15 = this.zza;
                        zzawVarZzj6.zzay();
                        zzawVarZzj6.zzg();
                        Preconditions.m3541e(str15);
                        cursorQuery = zzawVarZzj6.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str15}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    arrayMap8 = new ArrayMap();
                                    str11 = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                    while (true) {
                                        i5 = cursorQuery.getInt(0);
                                        try {
                                            arrayMap8.put(Integer.valueOf(i5), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.zzw(com.google.android.gms.internal.measurement.zzii.m10382I(), cursorQuery.getBlob(1))).m9555r());
                                            z3 = z2;
                                            str2 = str11;
                                        } catch (IOException e4) {
                                            z3 = z2;
                                            str2 = str11;
                                            try {
                                                zzawVarZzj6.zzu.zzaW().zzb().zzd("Failed to merge filter results. appId, audienceId, error", zzgu.zzl(str15), Integer.valueOf(i5), e4);
                                                str2 = str2;
                                            } catch (SQLiteException e5) {
                                                e = e5;
                                                str13 = str13;
                                                zzawVarZzj6.zzu.zzaW().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str15), e);
                                                Map map10 = Collections.EMPTY_MAP;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map2 = map10;
                                                r18 = str2;
                                                if (!map2.isEmpty()) {
                                                    hashSet = new HashSet(map2.keySet());
                                                    if (z3) {
                                                        String str16 = this.zza;
                                                        zzaw zzawVarZzj7 = this.zzg.zzj();
                                                        str3 = this.zza;
                                                        zzawVarZzj7.zzay();
                                                        zzawVarZzj7.zzg();
                                                        Preconditions.m3541e(str3);
                                                        arrayMap2 = new ArrayMap();
                                                        sQLiteDatabaseZze = zzawVarZzj7.zze();
                                                        try {
                                                            try {
                                                                cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                                                try {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) arrayMap2.get(numValueOf);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                arrayMap2.put(numValueOf, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        arrayMap2 = Collections.EMPTY_MAP;
                                                                    }
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    zzawVarZzj7.zzu.zzaW().zzb().zzc("Database error querying scoped filters. appId", zzgu.zzl(str3), e);
                                                                    arrayMap2 = Collections.EMPTY_MAP;
                                                                    if (cursorRawQuery != null) {
                                                                    }
                                                                    Preconditions.m3541e(str16);
                                                                    arrayMap3 = new ArrayMap();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
                                                                            zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                                                            list4 = (List) arrayMap2.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            map4 = arrayMap2;
                                                                            hashSet3 = hashSet;
                                                                            arrayMap3.put(num, zziiVar3);
                                                                            arrayMap2 = map4;
                                                                            hashSet = hashSet3;
                                                                            it2 = it2;
                                                                        }
                                                                    }
                                                                    hashSet2 = hashSet;
                                                                    map3 = arrayMap3;
                                                                    r18 = r18;
                                                                    for (Integer num3 : hashSet2) {
                                                                        num3.getClass();
                                                                        zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num3);
                                                                        bitSet = new BitSet();
                                                                        bitSet2 = new BitSet();
                                                                        arrayMap = new ArrayMap();
                                                                        if (zziiVar != null) {
                                                                            for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zziiVar.m10388E()) {
                                                                                if (zzhqVar.m10100A()) {
                                                                                    Map map11 = map3;
                                                                                    Integer numValueOf7 = Integer.valueOf(zzhqVar.m10101B());
                                                                                    if (zzhqVar.m10102C()) {
                                                                                        lValueOf = Long.valueOf(zzhqVar.m10103D());
                                                                                    } else {
                                                                                        lValueOf = null;
                                                                                    }
                                                                                    arrayMap.put(numValueOf7, lValueOf);
                                                                                    map3 = map11;
                                                                                }
                                                                            }
                                                                        }
                                                                        Map map12 = map3;
                                                                        ArrayMap arrayMap10 = new ArrayMap();
                                                                        if (zziiVar != null) {
                                                                            it = zziiVar.m10390G().iterator();
                                                                            while (it.hasNext()) {
                                                                                zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                                                                if (!zzikVar.m10401A()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        zziiVar2 = zziiVar;
                                                                        if (zziiVar2 != null) {
                                                                            i4 = 0;
                                                                            while (i4 < zziiVar2.m10385B() * 64) {
                                                                                if (zzpk.zzn(zziiVar2.m10384A(), i4)) {
                                                                                    z4 = zZzp;
                                                                                    this.zzu.zzaW().zzk().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i4));
                                                                                    bitSet2.set(i4);
                                                                                    if (zzpk.zzn(zziiVar2.m10386C(), i4)) {
                                                                                        bitSet.set(i4);
                                                                                    }
                                                                                    i4++;
                                                                                    zZzp = z4;
                                                                                } else {
                                                                                    z4 = zZzp;
                                                                                }
                                                                                arrayMap.remove(Integer.valueOf(i4));
                                                                                i4++;
                                                                                zZzp = z4;
                                                                            }
                                                                        }
                                                                        boolean z5 = zZzp;
                                                                        com.google.android.gms.internal.measurement.zzii zziiVar4 = (com.google.android.gms.internal.measurement.zzii) map2.get(num3);
                                                                        if (!zZzp2) {
                                                                        }
                                                                        this.zzc.put(num3, new zzy(this, this.zza, zziiVar4, bitSet, bitSet2, arrayMap, arrayMap10, null));
                                                                        r18 = r18;
                                                                        map = map;
                                                                        str13 = str13;
                                                                        map2 = map2;
                                                                        zZzp = z5;
                                                                        map3 = map12;
                                                                    }
                                                                    r10 = r18;
                                                                    str4 = str13;
                                                                    str5 = "Skipping failed audience ID";
                                                                    if (!list.isEmpty()) {
                                                                        zzzVar = new zzz(this, null);
                                                                        arrayMap6 = new ArrayMap();
                                                                        it6 = list.iterator();
                                                                        while (it6.hasNext()) {
                                                                            zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it6.next();
                                                                            zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                                                            if (zzhsVarZza != null) {
                                                                                zzpgVar = this.zzg;
                                                                                zzbdVarZzah = zzpgVar.zzj().zzah(this.zza, zzhsVar, zzhsVarZza.m10127F());
                                                                                zzpgVar.zzj().zzh(zzbdVarZzah);
                                                                                if (z) {
                                                                                    continue;
                                                                                } else {
                                                                                    j2 = zzbdVarZzah.zzc;
                                                                                    strM10127F = zzhsVarZza.m10127F();
                                                                                    map7 = (Map) arrayMap6.get(strM10127F);
                                                                                    if (map7 == null) {
                                                                                        zzawVarZzj3 = zzpgVar.zzj();
                                                                                        str9 = this.zza;
                                                                                        zzawVarZzj3.zzay();
                                                                                        zzawVarZzj3.zzg();
                                                                                        Preconditions.m3541e(str9);
                                                                                        Preconditions.m3541e(strM10127F);
                                                                                        arrayMap7 = new ArrayMap();
                                                                                        try {
                                                                                            try {
                                                                                                str10 = str9;
                                                                                                try {
                                                                                                    Query = zzawVarZzj3.zze().query("event_filters", new String[]{str4, r10}, "app_id=? AND event_name=?", new String[]{str9, strM10127F}, null, null, null);
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (Query.moveToFirst()) {
                                                                                                                zzbdVar = zzbdVarZzah;
                                                                                                                Query = Query;
                                                                                                                r114 = r18;
                                                                                                                while (true) {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            com.google.android.gms.internal.measurement.zzff zzffVar2 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.m9890M(), Query.getBlob(1))).m9555r();
                                                                                                                            numValueOf5 = Integer.valueOf(Query.getInt(0));
                                                                                                                            list6 = (List) arrayMap7.get(numValueOf5);
                                                                                                                            if (list6 == null) {
                                                                                                                                r114 = Query;
                                                                                                                                try {
                                                                                                                                    arrayList4 = new ArrayList();
                                                                                                                                    arrayMap7.put(numValueOf5, arrayList4);
                                                                                                                                    r116 = r114;
                                                                                                                                } catch (SQLiteException e7) {
                                                                                                                                    e = e7;
                                                                                                                                    r112 = r114;
                                                                                                                                    r6 = r112;
                                                                                                                                    r110 = r112;
                                                                                                                                    try {
                                                                                                                                        zzawVarZzj3.zzu.zzaW().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str10), e);
                                                                                                                                        map7 = Collections.EMPTY_MAP;
                                                                                                                                        r111 = r110;
                                                                                                                                        if (r6 != 0) {
                                                                                                                                            r6.close();
                                                                                                                                            r111 = r110;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th) {
                                                                                                                                        th = th;
                                                                                                                                        if (r6 != 0) {
                                                                                                                                            r6.close();
                                                                                                                                        }
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th2) {
                                                                                                                                    th = th2;
                                                                                                                                    r113 = r114;
                                                                                                                                    r6 = r113;
                                                                                                                                    if (r6 != 0) {
                                                                                                                                        r6.close();
                                                                                                                                    }
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                r116 = Query;
                                                                                                                                arrayList4 = list6;
                                                                                                                            }
                                                                                                                            arrayList4.add(zzffVar2);
                                                                                                                            r115 = r116;
                                                                                                                        } catch (IOException e8) {
                                                                                                                            r115 = Query;
                                                                                                                            zzawVarZzj3.zzu.zzaW().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str10), e8);
                                                                                                                        }
                                                                                                                        if (!r115.moveToNext()) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        Query = r115;
                                                                                                                        r114 = r115;
                                                                                                                    } catch (SQLiteException e9) {
                                                                                                                        e = e9;
                                                                                                                        r112 = Query;
                                                                                                                    }
                                                                                                                }
                                                                                                                r115.close();
                                                                                                                map7 = arrayMap7;
                                                                                                                r111 = r115;
                                                                                                            } else {
                                                                                                                ?? r117 = Query;
                                                                                                                zzbdVar = zzbdVarZzah;
                                                                                                                map7 = Collections.EMPTY_MAP;
                                                                                                                r117.close();
                                                                                                                r111 = r117;
                                                                                                            }
                                                                                                        } catch (Throwable th3) {
                                                                                                            th = th3;
                                                                                                            r113 = Query;
                                                                                                        }
                                                                                                    } catch (SQLiteException e10) {
                                                                                                        e = e10;
                                                                                                        r112 = Query;
                                                                                                        zzbdVar = zzbdVarZzah;
                                                                                                    }
                                                                                                } catch (SQLiteException e11) {
                                                                                                    e = e11;
                                                                                                    zzbdVar = zzbdVarZzah;
                                                                                                    r6 = 0;
                                                                                                    r110 = r18;
                                                                                                    zzawVarZzj3.zzu.zzaW().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str10), e);
                                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                                    r111 = r110;
                                                                                                    if (r6 != 0) {
                                                                                                        r6.close();
                                                                                                        r111 = r110;
                                                                                                    }
                                                                                                    arrayMap6.put(strM10127F, map7);
                                                                                                    r18 = r111;
                                                                                                    it7 = map7.keySet().iterator();
                                                                                                    while (it7.hasNext()) {
                                                                                                        num2 = (Integer) it7.next();
                                                                                                        iIntValue = num2.intValue();
                                                                                                        if (this.zzb.contains(num2)) {
                                                                                                            this.zzu.zzaW().zzk().zzb("Skipping failed audience ID", num2);
                                                                                                        } else {
                                                                                                            it8 = ((List) map7.get(num2)).iterator();
                                                                                                            zZzd2 = true;
                                                                                                            r19 = r18;
                                                                                                            while (true) {
                                                                                                                if (!it8.hasNext()) {
                                                                                                                    map8 = map7;
                                                                                                                    it9 = it7;
                                                                                                                    j3 = j2;
                                                                                                                    r18 = r19;
                                                                                                                    break;
                                                                                                                }
                                                                                                                com.google.android.gms.internal.measurement.zzff zzffVar3 = (com.google.android.gms.internal.measurement.zzff) it8.next();
                                                                                                                map8 = map7;
                                                                                                                it9 = it7;
                                                                                                                zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar3);
                                                                                                                Long l5 = this.zzd;
                                                                                                                l4 = this.zze;
                                                                                                                j3 = j2;
                                                                                                                zZzd2 = zzaaVar.zzd(l5, l4, zzhsVarZza, j3, zzbdVar, zzd(iIntValue, zzffVar3.m9892B()));
                                                                                                                if (!zZzd2) {
                                                                                                                    this.zzb.add(num2);
                                                                                                                    r18 = l4;
                                                                                                                    break;
                                                                                                                }
                                                                                                                zzc(num2).zza(zzaaVar);
                                                                                                                j2 = j3;
                                                                                                                map7 = map8;
                                                                                                                it7 = it9;
                                                                                                                r19 = l4;
                                                                                                            }
                                                                                                            if (!zZzd2) {
                                                                                                                this.zzb.add(num2);
                                                                                                            }
                                                                                                            j2 = j3;
                                                                                                            map7 = map8;
                                                                                                            it7 = it9;
                                                                                                        }
                                                                                                    }
                                                                                                    it6 = it6;
                                                                                                    zzzVar = zzzVar;
                                                                                                }
                                                                                            } catch (Throwable th4) {
                                                                                                th = th4;
                                                                                                r6 = 0;
                                                                                            }
                                                                                        } catch (SQLiteException e12) {
                                                                                            e = e12;
                                                                                            str10 = str9;
                                                                                        }
                                                                                        arrayMap6.put(strM10127F, map7);
                                                                                        r18 = r111;
                                                                                    } else {
                                                                                        zzbdVar = zzbdVarZzah;
                                                                                        r18 = r18;
                                                                                    }
                                                                                    it7 = map7.keySet().iterator();
                                                                                    while (it7.hasNext()) {
                                                                                        num2 = (Integer) it7.next();
                                                                                        iIntValue = num2.intValue();
                                                                                        if (this.zzb.contains(num2)) {
                                                                                            this.zzu.zzaW().zzk().zzb("Skipping failed audience ID", num2);
                                                                                        } else {
                                                                                            it8 = ((List) map7.get(num2)).iterator();
                                                                                            zZzd2 = true;
                                                                                            r19 = r18;
                                                                                            while (true) {
                                                                                                if (!it8.hasNext()) {
                                                                                                    map8 = map7;
                                                                                                    it9 = it7;
                                                                                                    j3 = j2;
                                                                                                    r18 = r19;
                                                                                                    break;
                                                                                                }
                                                                                                com.google.android.gms.internal.measurement.zzff zzffVar4 = (com.google.android.gms.internal.measurement.zzff) it8.next();
                                                                                                map8 = map7;
                                                                                                it9 = it7;
                                                                                                zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar4);
                                                                                                Long l6 = this.zzd;
                                                                                                l4 = this.zze;
                                                                                                j3 = j2;
                                                                                                zZzd2 = zzaaVar.zzd(l6, l4, zzhsVarZza, j3, zzbdVar, zzd(iIntValue, zzffVar4.m9892B()));
                                                                                                if (!zZzd2) {
                                                                                                    this.zzb.add(num2);
                                                                                                    r18 = l4;
                                                                                                    break;
                                                                                                }
                                                                                                zzc(num2).zza(zzaaVar);
                                                                                                j2 = j3;
                                                                                                map7 = map8;
                                                                                                it7 = it9;
                                                                                                r19 = l4;
                                                                                            }
                                                                                            if (!zZzd2) {
                                                                                                this.zzb.add(num2);
                                                                                            }
                                                                                            j2 = j3;
                                                                                            map7 = map8;
                                                                                            it7 = it9;
                                                                                        }
                                                                                    }
                                                                                    it6 = it6;
                                                                                    zzzVar = zzzVar;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        arrayMap4 = new ArrayMap();
                                                                        it3 = list2.iterator();
                                                                        while (it3.hasNext()) {
                                                                            com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it3.next();
                                                                            strM10421C = zziuVar.m10421C();
                                                                            map5 = (Map) arrayMap4.get(strM10421C);
                                                                            if (map5 == null) {
                                                                                zzawVarZzj2 = this.zzg.zzj();
                                                                                str7 = this.zza;
                                                                                zzawVarZzj2.zzay();
                                                                                zzawVarZzj2.zzg();
                                                                                Preconditions.m3541e(str7);
                                                                                Preconditions.m3541e(strM10421C);
                                                                                arrayMap5 = new ArrayMap();
                                                                                try {
                                                                                    cursorQuery2 = zzawVarZzj2.zze().query("property_filters", new String[]{str4, r10}, "app_id=? AND property_name=?", new String[]{str7, strM10421C}, null, null, null);
                                                                                    try {
                                                                                        try {
                                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        com.google.android.gms.internal.measurement.zzfn zzfnVar2 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.m9926I(), cursorQuery2.getBlob(1))).m9555r();
                                                                                                        numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                        list5 = (List) arrayMap5.get(numValueOf4);
                                                                                                        if (list5 == null) {
                                                                                                            it4 = it3;
                                                                                                            try {
                                                                                                                arrayList3 = new ArrayList();
                                                                                                                arrayMap5.put(numValueOf4, arrayList3);
                                                                                                            } catch (SQLiteException e13) {
                                                                                                                e = e13;
                                                                                                                str8 = str7;
                                                                                                                zzawVarZzj2.zzu.zzaW().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str8), e);
                                                                                                                map5 = Collections.EMPTY_MAP;
                                                                                                                if (cursorQuery2 != null) {
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                                arrayMap4.put(strM10421C, map5);
                                                                                                                for (Integer num4 : map5.keySet()) {
                                                                                                                    int iIntValue2 = num4.intValue();
                                                                                                                    if (this.zzb.contains(num4)) {
                                                                                                                        this.zzu.zzaW().zzk().zzb(str5, num4);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    it5 = ((List) map5.get(num4)).iterator();
                                                                                                                    zZzd = true;
                                                                                                                    while (true) {
                                                                                                                        if (it5.hasNext()) {
                                                                                                                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it5.next();
                                                                                                                            zzicVar = this.zzu;
                                                                                                                            map6 = map5;
                                                                                                                            if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
                                                                                                                                zzgs zzgsVarZzk = zzicVar.zzaW().zzk();
                                                                                                                                if (zzfnVar.m9927A()) {
                                                                                                                                    numValueOf3 = Integer.valueOf(zzfnVar.m9928B());
                                                                                                                                } else {
                                                                                                                                    numValueOf3 = null;
                                                                                                                                }
                                                                                                                                zzgsVarZzk.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzicVar.zzl().zzc(zzfnVar.m9929C()));
                                                                                                                                zzicVar.zzaW().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                                                                            }
                                                                                                                            if (zzfnVar.m9927A()) {
                                                                                                                            }
                                                                                                                            zzgs zzgsVarZze = zzicVar.zzaW().zze();
                                                                                                                            Object objZzl = zzgu.zzl(this.zza);
                                                                                                                            if (zzfnVar.m9927A()) {
                                                                                                                                numValueOf2 = Integer.valueOf(zzfnVar.m9928B());
                                                                                                                            } else {
                                                                                                                                numValueOf2 = null;
                                                                                                                            }
                                                                                                                            zzgsVarZze.zzc("Invalid property filter ID. appId, id", objZzl, String.valueOf(numValueOf2));
                                                                                                                            this.zzb.add(num4);
                                                                                                                            map5 = map6;
                                                                                                                            arrayMap4 = arrayMap4;
                                                                                                                            str5 = str5;
                                                                                                                        } else {
                                                                                                                            map6 = map5;
                                                                                                                            str5 = str5;
                                                                                                                            arrayMap4 = arrayMap4;
                                                                                                                        }
                                                                                                                        if (!zZzd) {
                                                                                                                            this.zzb.add(num4);
                                                                                                                        }
                                                                                                                        map5 = map6;
                                                                                                                        arrayMap4 = arrayMap4;
                                                                                                                        str5 = str5;
                                                                                                                        zzc(num4).zza(zzacVar);
                                                                                                                        map5 = map6;
                                                                                                                        arrayMap4 = arrayMap4;
                                                                                                                        str5 = str5;
                                                                                                                    }
                                                                                                                }
                                                                                                                it3 = it4;
                                                                                                            }
                                                                                                        } else {
                                                                                                            it4 = it3;
                                                                                                            arrayList3 = list5;
                                                                                                        }
                                                                                                        arrayList3.add(zzfnVar2);
                                                                                                        str8 = str7;
                                                                                                    } catch (IOException e14) {
                                                                                                        it4 = it3;
                                                                                                        str8 = str7;
                                                                                                        zzawVarZzj2.zzu.zzaW().zzb().zzc("Failed to merge filter", zzgu.zzl(str8), e14);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                                            break;
                                                                                                        }
                                                                                                        it3 = it4;
                                                                                                        str7 = str8;
                                                                                                    } catch (SQLiteException e15) {
                                                                                                        e = e15;
                                                                                                        zzawVarZzj2.zzu.zzaW().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str8), e);
                                                                                                        map5 = Collections.EMPTY_MAP;
                                                                                                        if (cursorQuery2 != null) {
                                                                                                            cursorQuery2.close();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                cursorQuery2.close();
                                                                                                map5 = arrayMap5;
                                                                                            } else {
                                                                                                it4 = it3;
                                                                                                map5 = Collections.EMPTY_MAP;
                                                                                                cursorQuery2.close();
                                                                                            }
                                                                                        } catch (Throwable th5) {
                                                                                            th = th5;
                                                                                            cursor2 = cursorQuery2;
                                                                                            if (cursor2 != null) {
                                                                                                cursor2.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (SQLiteException e16) {
                                                                                        e = e16;
                                                                                        it4 = it3;
                                                                                    }
                                                                                } catch (SQLiteException e17) {
                                                                                    e = e17;
                                                                                    it4 = it3;
                                                                                    str8 = str7;
                                                                                    cursorQuery2 = null;
                                                                                } catch (Throwable th6) {
                                                                                    th = th6;
                                                                                    cursor2 = null;
                                                                                }
                                                                                arrayMap4.put(strM10421C, map5);
                                                                            } else {
                                                                                it4 = it3;
                                                                            }
                                                                            while (r4.hasNext()) {
                                                                                int iIntValue3 = num4.intValue();
                                                                                if (this.zzb.contains(num4)) {
                                                                                    this.zzu.zzaW().zzk().zzb(str5, num4);
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it5 = ((List) map5.get(num4)).iterator();
                                                                                zZzd = true;
                                                                                while (true) {
                                                                                    if (it5.hasNext()) {
                                                                                        zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it5.next();
                                                                                        zzicVar = this.zzu;
                                                                                        map6 = map5;
                                                                                        if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
                                                                                            zzgs zzgsVarZzk2 = zzicVar.zzaW().zzk();
                                                                                            if (zzfnVar.m9927A()) {
                                                                                                numValueOf3 = Integer.valueOf(zzfnVar.m9928B());
                                                                                            } else {
                                                                                                numValueOf3 = null;
                                                                                            }
                                                                                            zzgsVarZzk2.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzicVar.zzl().zzc(zzfnVar.m9929C()));
                                                                                            zzicVar.zzaW().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                                        }
                                                                                        if (zzfnVar.m9927A()) {
                                                                                        }
                                                                                        zzgs zzgsVarZze2 = zzicVar.zzaW().zze();
                                                                                        Object objZzl2 = zzgu.zzl(this.zza);
                                                                                        if (zzfnVar.m9927A()) {
                                                                                            numValueOf2 = Integer.valueOf(zzfnVar.m9928B());
                                                                                        } else {
                                                                                            numValueOf2 = null;
                                                                                        }
                                                                                        zzgsVarZze2.zzc("Invalid property filter ID. appId, id", objZzl2, String.valueOf(numValueOf2));
                                                                                        this.zzb.add(num4);
                                                                                        map5 = map6;
                                                                                        arrayMap4 = arrayMap4;
                                                                                        str5 = str5;
                                                                                    } else {
                                                                                        map6 = map5;
                                                                                        str5 = str5;
                                                                                        arrayMap4 = arrayMap4;
                                                                                    }
                                                                                    if (!zZzd) {
                                                                                        this.zzb.add(num4);
                                                                                    }
                                                                                    map5 = map6;
                                                                                    arrayMap4 = arrayMap4;
                                                                                    str5 = str5;
                                                                                    zzc(num4).zza(zzacVar);
                                                                                    map5 = map6;
                                                                                    arrayMap4 = arrayMap4;
                                                                                    str5 = str5;
                                                                                }
                                                                            }
                                                                            it3 = it4;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    Set<Integer> setKeySet = this.zzc.keySet();
                                                                    setKeySet.removeAll(this.zzb);
                                                                    for (Integer num5 : setKeySet) {
                                                                        int iIntValue4 = num5.intValue();
                                                                        zzy zzyVar = (zzy) this.zzc.get(num5);
                                                                        Preconditions.m3544h(zzyVar);
                                                                        com.google.android.gms.internal.measurement.zzhg zzhgVarZzb = zzyVar.zzb(iIntValue4);
                                                                        arrayList2.add(zzhgVarZzb);
                                                                        zzawVarZzj = this.zzg.zzj();
                                                                        str6 = this.zza;
                                                                        com.google.android.gms.internal.measurement.zzii zziiVarM10078C = zzhgVarZzb.m10078C();
                                                                        zzawVarZzj.zzay();
                                                                        zzawVarZzj.zzg();
                                                                        Preconditions.m3541e(str6);
                                                                        Preconditions.m3544h(zziiVarM10078C);
                                                                        byte[] bArrM9346i = zziiVarM10078C.m9346i();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str6);
                                                                        contentValues.put(str4, num5);
                                                                        contentValues.put("current_results", bArrM9346i);
                                                                        try {
                                                                            try {
                                                                                if (zzawVarZzj.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                    zzawVarZzj.zzu.zzaW().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str6));
                                                                                }
                                                                            } catch (SQLiteException e18) {
                                                                                e = e18;
                                                                                zzawVarZzj.zzu.zzaW().zzb().zzc("Error storing filter results. appId", zzgu.zzl(str6), e);
                                                                            }
                                                                        } catch (SQLiteException e19) {
                                                                            e = e19;
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                                r5 = sQLiteDatabaseZze;
                                                                if (r5 != 0) {
                                                                    r5.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (SQLiteException e20) {
                                                            e = e20;
                                                            cursorRawQuery = null;
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            r5 = 0;
                                                            if (r5 != 0) {
                                                                r5.close();
                                                            }
                                                            throw th;
                                                        }
                                                        cursorRawQuery.close();
                                                        Preconditions.m3541e(str16);
                                                        arrayMap3 = new ArrayMap();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                                                list4 = (List) arrayMap2.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                map4 = arrayMap2;
                                                                hashSet3 = hashSet;
                                                                arrayMap3.put(num, zziiVar3);
                                                                arrayMap2 = map4;
                                                                hashSet = hashSet3;
                                                                it2 = it2;
                                                            }
                                                        }
                                                        hashSet2 = hashSet;
                                                        map3 = arrayMap3;
                                                    } else {
                                                        hashSet2 = hashSet;
                                                        map3 = map2;
                                                    }
                                                    r18 = r18;
                                                    while (r16.hasNext()) {
                                                        num3.getClass();
                                                        zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num3);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        arrayMap = new ArrayMap();
                                                        if (zziiVar != null) {
                                                            while (r7.hasNext()) {
                                                                if (zzhqVar.m10100A()) {
                                                                    Map map13 = map3;
                                                                    Integer numValueOf8 = Integer.valueOf(zzhqVar.m10101B());
                                                                    if (zzhqVar.m10102C()) {
                                                                        lValueOf = Long.valueOf(zzhqVar.m10103D());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    arrayMap.put(numValueOf8, lValueOf);
                                                                    map3 = map13;
                                                                }
                                                            }
                                                        }
                                                        Map map14 = map3;
                                                        ArrayMap arrayMap11 = new ArrayMap();
                                                        if (zziiVar != null) {
                                                            it = zziiVar.m10390G().iterator();
                                                            while (it.hasNext()) {
                                                                zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                                                if (!zzikVar.m10401A()) {
                                                                }
                                                            }
                                                        }
                                                        zziiVar2 = zziiVar;
                                                        if (zziiVar2 != null) {
                                                            i4 = 0;
                                                            while (i4 < zziiVar2.m10385B() * 64) {
                                                                if (zzpk.zzn(zziiVar2.m10384A(), i4)) {
                                                                    z4 = zZzp;
                                                                    this.zzu.zzaW().zzk().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i4));
                                                                    bitSet2.set(i4);
                                                                    if (zzpk.zzn(zziiVar2.m10386C(), i4)) {
                                                                        bitSet.set(i4);
                                                                    }
                                                                    i4++;
                                                                    zZzp = z4;
                                                                } else {
                                                                    z4 = zZzp;
                                                                }
                                                                arrayMap.remove(Integer.valueOf(i4));
                                                                i4++;
                                                                zZzp = z4;
                                                            }
                                                        }
                                                        boolean z6 = zZzp;
                                                        com.google.android.gms.internal.measurement.zzii zziiVar5 = (com.google.android.gms.internal.measurement.zzii) map2.get(num3);
                                                        if (!zZzp2) {
                                                        }
                                                        this.zzc.put(num3, new zzy(this, this.zza, zziiVar5, bitSet, bitSet2, arrayMap, arrayMap11, null));
                                                        r18 = r18;
                                                        map = map;
                                                        str13 = str13;
                                                        map2 = map2;
                                                        zZzp = z6;
                                                        map3 = map14;
                                                    }
                                                }
                                                r10 = r18;
                                                str4 = str13;
                                                str5 = "Skipping failed audience ID";
                                                if (!list.isEmpty()) {
                                                    zzzVar = new zzz(this, null);
                                                    arrayMap6 = new ArrayMap();
                                                    it6 = list.iterator();
                                                    while (it6.hasNext()) {
                                                        zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it6.next();
                                                        zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                                        if (zzhsVarZza != null) {
                                                            zzpgVar = this.zzg;
                                                            zzbdVarZzah = zzpgVar.zzj().zzah(this.zza, zzhsVar, zzhsVarZza.m10127F());
                                                            zzpgVar.zzj().zzh(zzbdVarZzah);
                                                            if (z) {
                                                                j2 = zzbdVarZzah.zzc;
                                                                strM10127F = zzhsVarZza.m10127F();
                                                                map7 = (Map) arrayMap6.get(strM10127F);
                                                                if (map7 == null) {
                                                                    zzawVarZzj3 = zzpgVar.zzj();
                                                                    str9 = this.zza;
                                                                    zzawVarZzj3.zzay();
                                                                    zzawVarZzj3.zzg();
                                                                    Preconditions.m3541e(str9);
                                                                    Preconditions.m3541e(strM10127F);
                                                                    arrayMap7 = new ArrayMap();
                                                                    str10 = str9;
                                                                    Query = zzawVarZzj3.zze().query("event_filters", new String[]{str4, r10}, "app_id=? AND event_name=?", new String[]{str9, strM10127F}, null, null, null);
                                                                    if (Query.moveToFirst()) {
                                                                        zzbdVar = zzbdVarZzah;
                                                                        Query = Query;
                                                                        r114 = r18;
                                                                        while (true) {
                                                                            com.google.android.gms.internal.measurement.zzff zzffVar5 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.m9890M(), Query.getBlob(1))).m9555r();
                                                                            numValueOf5 = Integer.valueOf(Query.getInt(0));
                                                                            list6 = (List) arrayMap7.get(numValueOf5);
                                                                            if (list6 == null) {
                                                                                r114 = Query;
                                                                                arrayList4 = new ArrayList();
                                                                                arrayMap7.put(numValueOf5, arrayList4);
                                                                                r116 = r114;
                                                                            } else {
                                                                                r116 = Query;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(zzffVar5);
                                                                            r115 = r116;
                                                                            if (!r115.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            Query = r115;
                                                                            r114 = r115;
                                                                        }
                                                                        r115.close();
                                                                        map7 = arrayMap7;
                                                                        r111 = r115;
                                                                    } else {
                                                                        ?? r118 = Query;
                                                                        zzbdVar = zzbdVarZzah;
                                                                        map7 = Collections.EMPTY_MAP;
                                                                        r118.close();
                                                                        r111 = r118;
                                                                    }
                                                                    arrayMap6.put(strM10127F, map7);
                                                                    r18 = r111;
                                                                } else {
                                                                    zzbdVar = zzbdVarZzah;
                                                                    r18 = r18;
                                                                }
                                                                it7 = map7.keySet().iterator();
                                                                while (it7.hasNext()) {
                                                                    num2 = (Integer) it7.next();
                                                                    iIntValue = num2.intValue();
                                                                    if (this.zzb.contains(num2)) {
                                                                        this.zzu.zzaW().zzk().zzb("Skipping failed audience ID", num2);
                                                                    } else {
                                                                        it8 = ((List) map7.get(num2)).iterator();
                                                                        zZzd2 = true;
                                                                        r19 = r18;
                                                                        while (true) {
                                                                            if (!it8.hasNext()) {
                                                                                map8 = map7;
                                                                                it9 = it7;
                                                                                j3 = j2;
                                                                                r18 = r19;
                                                                                break;
                                                                            }
                                                                            com.google.android.gms.internal.measurement.zzff zzffVar6 = (com.google.android.gms.internal.measurement.zzff) it8.next();
                                                                            map8 = map7;
                                                                            it9 = it7;
                                                                            zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar6);
                                                                            Long l7 = this.zzd;
                                                                            l4 = this.zze;
                                                                            j3 = j2;
                                                                            zZzd2 = zzaaVar.zzd(l7, l4, zzhsVarZza, j3, zzbdVar, zzd(iIntValue, zzffVar6.m9892B()));
                                                                            if (!zZzd2) {
                                                                                this.zzb.add(num2);
                                                                                r18 = l4;
                                                                                break;
                                                                            }
                                                                            zzc(num2).zza(zzaaVar);
                                                                            j2 = j3;
                                                                            map7 = map8;
                                                                            it7 = it9;
                                                                            r19 = l4;
                                                                        }
                                                                        if (!zZzd2) {
                                                                            this.zzb.add(num2);
                                                                        }
                                                                        j2 = j3;
                                                                        map7 = map8;
                                                                        it7 = it9;
                                                                    }
                                                                }
                                                                it6 = it6;
                                                                zzzVar = zzzVar;
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    arrayMap4 = new ArrayMap();
                                                    it3 = list2.iterator();
                                                    while (it3.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zziu zziuVar2 = (com.google.android.gms.internal.measurement.zziu) it3.next();
                                                        strM10421C = zziuVar2.m10421C();
                                                        map5 = (Map) arrayMap4.get(strM10421C);
                                                        if (map5 == null) {
                                                            zzawVarZzj2 = this.zzg.zzj();
                                                            str7 = this.zza;
                                                            zzawVarZzj2.zzay();
                                                            zzawVarZzj2.zzg();
                                                            Preconditions.m3541e(str7);
                                                            Preconditions.m3541e(strM10421C);
                                                            arrayMap5 = new ArrayMap();
                                                            cursorQuery2 = zzawVarZzj2.zze().query("property_filters", new String[]{str4, r10}, "app_id=? AND property_name=?", new String[]{str7, strM10421C}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                while (true) {
                                                                    com.google.android.gms.internal.measurement.zzfn zzfnVar3 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.m9926I(), cursorQuery2.getBlob(1))).m9555r();
                                                                    numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) arrayMap5.get(numValueOf4);
                                                                    if (list5 == null) {
                                                                        it4 = it3;
                                                                        arrayList3 = new ArrayList();
                                                                        arrayMap5.put(numValueOf4, arrayList3);
                                                                    } else {
                                                                        it4 = it3;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(zzfnVar3);
                                                                    str8 = str7;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    it3 = it4;
                                                                    str7 = str8;
                                                                }
                                                                cursorQuery2.close();
                                                                map5 = arrayMap5;
                                                            } else {
                                                                it4 = it3;
                                                                map5 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            arrayMap4.put(strM10421C, map5);
                                                        } else {
                                                            it4 = it3;
                                                        }
                                                        while (r4.hasNext()) {
                                                            int iIntValue5 = num4.intValue();
                                                            if (this.zzb.contains(num4)) {
                                                                this.zzu.zzaW().zzk().zzb(str5, num4);
                                                                break;
                                                                break;
                                                            }
                                                            it5 = ((List) map5.get(num4)).iterator();
                                                            zZzd = true;
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it5.next();
                                                                    zzicVar = this.zzu;
                                                                    map6 = map5;
                                                                    if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
                                                                        zzgs zzgsVarZzk3 = zzicVar.zzaW().zzk();
                                                                        if (zzfnVar.m9927A()) {
                                                                            numValueOf3 = Integer.valueOf(zzfnVar.m9928B());
                                                                        } else {
                                                                            numValueOf3 = null;
                                                                        }
                                                                        zzgsVarZzk3.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzicVar.zzl().zzc(zzfnVar.m9929C()));
                                                                        zzicVar.zzaW().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                    }
                                                                    if (zzfnVar.m9927A()) {
                                                                    }
                                                                    zzgs zzgsVarZze3 = zzicVar.zzaW().zze();
                                                                    Object objZzl3 = zzgu.zzl(this.zza);
                                                                    if (zzfnVar.m9927A()) {
                                                                        numValueOf2 = Integer.valueOf(zzfnVar.m9928B());
                                                                    } else {
                                                                        numValueOf2 = null;
                                                                    }
                                                                    zzgsVarZze3.zzc("Invalid property filter ID. appId, id", objZzl3, String.valueOf(numValueOf2));
                                                                    this.zzb.add(num4);
                                                                    map5 = map6;
                                                                    arrayMap4 = arrayMap4;
                                                                    str5 = str5;
                                                                } else {
                                                                    map6 = map5;
                                                                    str5 = str5;
                                                                    arrayMap4 = arrayMap4;
                                                                }
                                                                if (!zZzd) {
                                                                    this.zzb.add(num4);
                                                                }
                                                                map5 = map6;
                                                                arrayMap4 = arrayMap4;
                                                                str5 = str5;
                                                                zzc(num4).zza(zzacVar);
                                                                map5 = map6;
                                                                arrayMap4 = arrayMap4;
                                                                str5 = str5;
                                                            }
                                                        }
                                                        it3 = it4;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                Set<Integer> setKeySet2 = this.zzc.keySet();
                                                setKeySet2.removeAll(this.zzb);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num5.intValue();
                                                    zzy zzyVar2 = (zzy) this.zzc.get(num5);
                                                    Preconditions.m3544h(zzyVar2);
                                                    com.google.android.gms.internal.measurement.zzhg zzhgVarZzb2 = zzyVar2.zzb(iIntValue6);
                                                    arrayList2.add(zzhgVarZzb2);
                                                    zzawVarZzj = this.zzg.zzj();
                                                    str6 = this.zza;
                                                    com.google.android.gms.internal.measurement.zzii zziiVarM10078C2 = zzhgVarZzb2.m10078C();
                                                    zzawVarZzj.zzay();
                                                    zzawVarZzj.zzg();
                                                    Preconditions.m3541e(str6);
                                                    Preconditions.m3544h(zziiVarM10078C2);
                                                    byte[] bArrM9346i2 = zziiVarM10078C2.m9346i();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str6);
                                                    contentValues.put(str4, num5);
                                                    contentValues.put("current_results", bArrM9346i2);
                                                    if (zzawVarZzj.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        zzawVarZzj.zzu.zzaW().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str6));
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            z2 = z3;
                                            str11 = str2;
                                            str13 = str13;
                                        } catch (SQLiteException e21) {
                                            e = e21;
                                            zzawVarZzj6.zzu.zzaW().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str15), e);
                                            Map map15 = Collections.EMPTY_MAP;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = map15;
                                            r18 = str2;
                                        }
                                    }
                                    cursorQuery.close();
                                    map2 = arrayMap8;
                                    r18 = str2;
                                } else {
                                    Map map16 = Collections.EMPTY_MAP;
                                    cursorQuery.close();
                                    map2 = map16;
                                    z3 = z2;
                                    r18 = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                    str13 = "audience_id";
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e22) {
                            e = e22;
                            z3 = z2;
                            str2 = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                        }
                        if (!map2.isEmpty()) {
                            hashSet = new HashSet(map2.keySet());
                            if (z3) {
                                String str17 = this.zza;
                                zzaw zzawVarZzj8 = this.zzg.zzj();
                                str3 = this.zza;
                                zzawVarZzj8.zzay();
                                zzawVarZzj8.zzg();
                                Preconditions.m3541e(str3);
                                arrayMap2 = new ArrayMap();
                                sQLiteDatabaseZze = zzawVarZzj8.zze();
                                cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) arrayMap2.get(numValueOf);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            arrayMap2.put(numValueOf, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    arrayMap2 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                Preconditions.m3541e(str17);
                                arrayMap3 = new ArrayMap();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.getClass();
                                        zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                        list4 = (List) arrayMap2.get(num);
                                        if (list4 != null) {
                                        }
                                        map4 = arrayMap2;
                                        hashSet3 = hashSet;
                                        arrayMap3.put(num, zziiVar3);
                                        arrayMap2 = map4;
                                        hashSet = hashSet3;
                                        it2 = it2;
                                    }
                                }
                                hashSet2 = hashSet;
                                map3 = arrayMap3;
                            } else {
                                hashSet2 = hashSet;
                                map3 = map2;
                            }
                            r18 = r18;
                            while (r16.hasNext()) {
                                num3.getClass();
                                zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num3);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                arrayMap = new ArrayMap();
                                if (zziiVar != null) {
                                    while (r7.hasNext()) {
                                        if (zzhqVar.m10100A()) {
                                            Map map17 = map3;
                                            Integer numValueOf9 = Integer.valueOf(zzhqVar.m10101B());
                                            if (zzhqVar.m10102C()) {
                                                lValueOf = Long.valueOf(zzhqVar.m10103D());
                                            } else {
                                                lValueOf = null;
                                            }
                                            arrayMap.put(numValueOf9, lValueOf);
                                            map3 = map17;
                                        }
                                    }
                                }
                                Map map18 = map3;
                                ArrayMap arrayMap12 = new ArrayMap();
                                if (zziiVar != null) {
                                    it = zziiVar.m10390G().iterator();
                                    while (it.hasNext()) {
                                        zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                        if (!zzikVar.m10401A()) {
                                        }
                                    }
                                }
                                zziiVar2 = zziiVar;
                                if (zziiVar2 != null) {
                                    i4 = 0;
                                    while (i4 < zziiVar2.m10385B() * 64) {
                                        if (zzpk.zzn(zziiVar2.m10384A(), i4)) {
                                            z4 = zZzp;
                                            this.zzu.zzaW().zzk().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i4));
                                            bitSet2.set(i4);
                                            if (zzpk.zzn(zziiVar2.m10386C(), i4)) {
                                                bitSet.set(i4);
                                            }
                                            i4++;
                                            zZzp = z4;
                                        } else {
                                            z4 = zZzp;
                                        }
                                        arrayMap.remove(Integer.valueOf(i4));
                                        i4++;
                                        zZzp = z4;
                                    }
                                }
                                boolean z7 = zZzp;
                                com.google.android.gms.internal.measurement.zzii zziiVar6 = (com.google.android.gms.internal.measurement.zzii) map2.get(num3);
                                if (!zZzp2) {
                                }
                                this.zzc.put(num3, new zzy(this, this.zza, zziiVar6, bitSet, bitSet2, arrayMap, arrayMap12, null));
                                r18 = r18;
                                map = map;
                                str13 = str13;
                                map2 = map2;
                                zZzp = z7;
                                map3 = map18;
                            }
                        }
                        r10 = r18;
                        str4 = str13;
                        str5 = "Skipping failed audience ID";
                        if (!list.isEmpty()) {
                            zzzVar = new zzz(this, null);
                            arrayMap6 = new ArrayMap();
                            it6 = list.iterator();
                            while (it6.hasNext()) {
                                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it6.next();
                                zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                if (zzhsVarZza != null) {
                                    zzpgVar = this.zzg;
                                    zzbdVarZzah = zzpgVar.zzj().zzah(this.zza, zzhsVar, zzhsVarZza.m10127F());
                                    zzpgVar.zzj().zzh(zzbdVarZzah);
                                    if (z) {
                                        j2 = zzbdVarZzah.zzc;
                                        strM10127F = zzhsVarZza.m10127F();
                                        map7 = (Map) arrayMap6.get(strM10127F);
                                        if (map7 == null) {
                                            zzawVarZzj3 = zzpgVar.zzj();
                                            str9 = this.zza;
                                            zzawVarZzj3.zzay();
                                            zzawVarZzj3.zzg();
                                            Preconditions.m3541e(str9);
                                            Preconditions.m3541e(strM10127F);
                                            arrayMap7 = new ArrayMap();
                                            str10 = str9;
                                            Query = zzawVarZzj3.zze().query("event_filters", new String[]{str4, r10}, "app_id=? AND event_name=?", new String[]{str9, strM10127F}, null, null, null);
                                            if (Query.moveToFirst()) {
                                                zzbdVar = zzbdVarZzah;
                                                Query = Query;
                                                r114 = r18;
                                                while (true) {
                                                    com.google.android.gms.internal.measurement.zzff zzffVar7 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.m9890M(), Query.getBlob(1))).m9555r();
                                                    numValueOf5 = Integer.valueOf(Query.getInt(0));
                                                    list6 = (List) arrayMap7.get(numValueOf5);
                                                    if (list6 == null) {
                                                        r114 = Query;
                                                        arrayList4 = new ArrayList();
                                                        arrayMap7.put(numValueOf5, arrayList4);
                                                        r116 = r114;
                                                    } else {
                                                        r116 = Query;
                                                        arrayList4 = list6;
                                                    }
                                                    arrayList4.add(zzffVar7);
                                                    r115 = r116;
                                                    if (!r115.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    Query = r115;
                                                    r114 = r115;
                                                }
                                                r115.close();
                                                map7 = arrayMap7;
                                                r111 = r115;
                                            } else {
                                                ?? r119 = Query;
                                                zzbdVar = zzbdVarZzah;
                                                map7 = Collections.EMPTY_MAP;
                                                r119.close();
                                                r111 = r119;
                                            }
                                            arrayMap6.put(strM10127F, map7);
                                            r18 = r111;
                                        } else {
                                            zzbdVar = zzbdVarZzah;
                                            r18 = r18;
                                        }
                                        it7 = map7.keySet().iterator();
                                        while (it7.hasNext()) {
                                            num2 = (Integer) it7.next();
                                            iIntValue = num2.intValue();
                                            if (this.zzb.contains(num2)) {
                                                this.zzu.zzaW().zzk().zzb("Skipping failed audience ID", num2);
                                            } else {
                                                it8 = ((List) map7.get(num2)).iterator();
                                                zZzd2 = true;
                                                r19 = r18;
                                                while (true) {
                                                    if (!it8.hasNext()) {
                                                        map8 = map7;
                                                        it9 = it7;
                                                        j3 = j2;
                                                        r18 = r19;
                                                        break;
                                                    }
                                                    com.google.android.gms.internal.measurement.zzff zzffVar8 = (com.google.android.gms.internal.measurement.zzff) it8.next();
                                                    map8 = map7;
                                                    it9 = it7;
                                                    zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar8);
                                                    Long l8 = this.zzd;
                                                    l4 = this.zze;
                                                    j3 = j2;
                                                    zZzd2 = zzaaVar.zzd(l8, l4, zzhsVarZza, j3, zzbdVar, zzd(iIntValue, zzffVar8.m9892B()));
                                                    if (!zZzd2) {
                                                        this.zzb.add(num2);
                                                        r18 = l4;
                                                        break;
                                                    }
                                                    zzc(num2).zza(zzaaVar);
                                                    j2 = j3;
                                                    map7 = map8;
                                                    it7 = it9;
                                                    r19 = l4;
                                                }
                                                if (!zZzd2) {
                                                    this.zzb.add(num2);
                                                }
                                                j2 = j3;
                                                map7 = map8;
                                                it7 = it9;
                                            }
                                        }
                                        it6 = it6;
                                        zzzVar = zzzVar;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!z) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            arrayMap4 = new ArrayMap();
                            it3 = list2.iterator();
                            while (it3.hasNext()) {
                                com.google.android.gms.internal.measurement.zziu zziuVar3 = (com.google.android.gms.internal.measurement.zziu) it3.next();
                                strM10421C = zziuVar3.m10421C();
                                map5 = (Map) arrayMap4.get(strM10421C);
                                if (map5 == null) {
                                    zzawVarZzj2 = this.zzg.zzj();
                                    str7 = this.zza;
                                    zzawVarZzj2.zzay();
                                    zzawVarZzj2.zzg();
                                    Preconditions.m3541e(str7);
                                    Preconditions.m3541e(strM10421C);
                                    arrayMap5 = new ArrayMap();
                                    cursorQuery2 = zzawVarZzj2.zze().query("property_filters", new String[]{str4, r10}, "app_id=? AND property_name=?", new String[]{str7, strM10421C}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        while (true) {
                                            com.google.android.gms.internal.measurement.zzfn zzfnVar4 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.m9926I(), cursorQuery2.getBlob(1))).m9555r();
                                            numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) arrayMap5.get(numValueOf4);
                                            if (list5 == null) {
                                                it4 = it3;
                                                arrayList3 = new ArrayList();
                                                arrayMap5.put(numValueOf4, arrayList3);
                                            } else {
                                                it4 = it3;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(zzfnVar4);
                                            str8 = str7;
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            it3 = it4;
                                            str7 = str8;
                                        }
                                        cursorQuery2.close();
                                        map5 = arrayMap5;
                                    } else {
                                        it4 = it3;
                                        map5 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    arrayMap4.put(strM10421C, map5);
                                } else {
                                    it4 = it3;
                                }
                                while (r4.hasNext()) {
                                    int iIntValue7 = num4.intValue();
                                    if (this.zzb.contains(num4)) {
                                        this.zzu.zzaW().zzk().zzb(str5, num4);
                                        break;
                                        break;
                                    }
                                    it5 = ((List) map5.get(num4)).iterator();
                                    zZzd = true;
                                    while (true) {
                                        if (it5.hasNext()) {
                                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it5.next();
                                            zzicVar = this.zzu;
                                            map6 = map5;
                                            if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
                                                zzgs zzgsVarZzk4 = zzicVar.zzaW().zzk();
                                                if (zzfnVar.m9927A()) {
                                                    numValueOf3 = Integer.valueOf(zzfnVar.m9928B());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                zzgsVarZzk4.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzicVar.zzl().zzc(zzfnVar.m9929C()));
                                                zzicVar.zzaW().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                            }
                                            if (zzfnVar.m9927A()) {
                                            }
                                            zzgs zzgsVarZze4 = zzicVar.zzaW().zze();
                                            Object objZzl4 = zzgu.zzl(this.zza);
                                            if (zzfnVar.m9927A()) {
                                                numValueOf2 = Integer.valueOf(zzfnVar.m9928B());
                                            } else {
                                                numValueOf2 = null;
                                            }
                                            zzgsVarZze4.zzc("Invalid property filter ID. appId, id", objZzl4, String.valueOf(numValueOf2));
                                            this.zzb.add(num4);
                                            map5 = map6;
                                            arrayMap4 = arrayMap4;
                                            str5 = str5;
                                        } else {
                                            map6 = map5;
                                            str5 = str5;
                                            arrayMap4 = arrayMap4;
                                        }
                                        if (!zZzd) {
                                            this.zzb.add(num4);
                                        }
                                        map5 = map6;
                                        arrayMap4 = arrayMap4;
                                        str5 = str5;
                                        zzc(num4).zza(zzacVar);
                                        map5 = map6;
                                        arrayMap4 = arrayMap4;
                                        str5 = str5;
                                    }
                                }
                                it3 = it4;
                            }
                        }
                        arrayList2 = new ArrayList();
                        Set<Integer> setKeySet3 = this.zzc.keySet();
                        setKeySet3.removeAll(this.zzb);
                        while (r3.hasNext()) {
                            int iIntValue8 = num5.intValue();
                            zzy zzyVar3 = (zzy) this.zzc.get(num5);
                            Preconditions.m3544h(zzyVar3);
                            com.google.android.gms.internal.measurement.zzhg zzhgVarZzb3 = zzyVar3.zzb(iIntValue8);
                            arrayList2.add(zzhgVarZzb3);
                            zzawVarZzj = this.zzg.zzj();
                            str6 = this.zza;
                            com.google.android.gms.internal.measurement.zzii zziiVarM10078C3 = zzhgVarZzb3.m10078C();
                            zzawVarZzj.zzay();
                            zzawVarZzj.zzg();
                            Preconditions.m3541e(str6);
                            Preconditions.m3544h(zziiVarM10078C3);
                            byte[] bArrM9346i3 = zziiVarM10078C3.m9346i();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str6);
                            contentValues.put(str4, num5);
                            contentValues.put("current_results", bArrM9346i3);
                            if (zzawVarZzj.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                zzawVarZzj.zzu.zzaW().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str6));
                            }
                        }
                        return arrayList2;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    if (cursorQuery3 != null) {
                        cursorQuery3.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e23) {
                e = e23;
                cursorQuery3 = null;
            } catch (Throwable th11) {
                th = th11;
                cursorQuery3 = null;
                if (cursorQuery3 != null) {
                    cursorQuery3.close();
                }
                throw th;
            }
        } else {
            map = map9;
        }
        zzaw zzawVarZzj9 = this.zzg.zzj();
        String str18 = this.zza;
        zzawVarZzj9.zzay();
        zzawVarZzj9.zzg();
        Preconditions.m3541e(str18);
        try {
            cursorQuery = zzawVarZzj9.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str18}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map map19 = Collections.EMPTY_MAP;
                cursorQuery.close();
                map2 = map19;
                z3 = z2;
                r18 = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                str13 = "audience_id";
            } else {
                arrayMap8 = new ArrayMap();
                str11 = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                while (true) {
                    i5 = cursorQuery.getInt(0);
                    arrayMap8.put(Integer.valueOf(i5), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.zzw(com.google.android.gms.internal.measurement.zzii.m10382I(), cursorQuery.getBlob(1))).m9555r());
                    z3 = z2;
                    str2 = str11;
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    z2 = z3;
                    str11 = str2;
                    str13 = str13;
                }
                cursorQuery.close();
                map2 = arrayMap8;
                r18 = str2;
            }
        } catch (SQLiteException e24) {
            e = e24;
            z3 = z2;
            str2 = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
            str13 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th12) {
            th = th12;
            cursor = null;
        }
        if (!map2.isEmpty()) {
            hashSet = new HashSet(map2.keySet());
            if (z3) {
                String str19 = this.zza;
                zzaw zzawVarZzj10 = this.zzg.zzj();
                str3 = this.zza;
                zzawVarZzj10.zzay();
                zzawVarZzj10.zzg();
                Preconditions.m3541e(str3);
                arrayMap2 = new ArrayMap();
                sQLiteDatabaseZze = zzawVarZzj10.zze();
                cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) arrayMap2.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            arrayMap2.put(numValueOf, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    arrayMap2 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                Preconditions.m3541e(str19);
                arrayMap3 = new ArrayMap();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                        list4 = (List) arrayMap2.get(num);
                        if (list4 != null || list4.isEmpty()) {
                            map4 = arrayMap2;
                            hashSet3 = hashSet;
                            arrayMap3.put(num, zziiVar3);
                            arrayMap2 = map4;
                            hashSet = hashSet3;
                            it2 = it2;
                        } else {
                            zzpg zzpgVar2 = this.zzg;
                            map4 = arrayMap2;
                            hashSet3 = hashSet;
                            List listZzq = zzpgVar2.zzp().zzq(zziiVar3.m10386C(), list4);
                            if (listZzq.isEmpty()) {
                                arrayMap2 = map4;
                                hashSet = hashSet3;
                            } else {
                                com.google.android.gms.internal.measurement.zzih zzihVar = (com.google.android.gms.internal.measurement.zzih) zziiVar3.m9572r();
                                zzihVar.m10379v();
                                zzihVar.m9552o();
                                ((com.google.android.gms.internal.measurement.zzii) zzihVar.f22030t).m10394M(listZzq);
                                List listZzq2 = zzpgVar2.zzp().zzq(zziiVar3.m10384A(), list4);
                                zzihVar.m10378u();
                                zzihVar.m9552o();
                                ((com.google.android.gms.internal.measurement.zzii) zzihVar.f22030t).m10392K(listZzq2);
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it11 = zziiVar3.m10388E().iterator();
                                while (it11.hasNext()) {
                                    com.google.android.gms.internal.measurement.zzhq zzhqVar2 = (com.google.android.gms.internal.measurement.zzhq) it11.next();
                                    Iterator it12 = it11;
                                    if (!list4.contains(Integer.valueOf(zzhqVar2.m10101B()))) {
                                        arrayList6.add(zzhqVar2);
                                    }
                                    it11 = it12;
                                }
                                zzihVar.m10380x();
                                zzihVar.m9552o();
                                ((com.google.android.gms.internal.measurement.zzii) zzihVar.f22030t).m10396O(arrayList6);
                                ArrayList arrayList7 = new ArrayList();
                                for (com.google.android.gms.internal.measurement.zzik zzikVar2 : zziiVar3.m10390G()) {
                                    if (!list4.contains(Integer.valueOf(zzikVar2.m10402B()))) {
                                        arrayList7.add(zzikVar2);
                                    }
                                }
                                zzihVar.m10381y();
                                zzihVar.m9552o();
                                ((com.google.android.gms.internal.measurement.zzii) zzihVar.f22030t).m10398Q(arrayList7);
                                arrayMap3.put(num, (com.google.android.gms.internal.measurement.zzii) zzihVar.m9555r());
                                arrayMap2 = map4;
                                hashSet = hashSet3;
                                it2 = it2;
                            }
                        }
                    }
                }
                hashSet2 = hashSet;
                map3 = arrayMap3;
            } else {
                hashSet2 = hashSet;
                map3 = map2;
            }
            r18 = r18;
            while (r16.hasNext()) {
                num3.getClass();
                zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num3);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                arrayMap = new ArrayMap();
                if (zziiVar != null && zziiVar.m10389F() != 0) {
                    while (r7.hasNext()) {
                        if (zzhqVar.m10100A()) {
                            Map map110 = map3;
                            Integer numValueOf10 = Integer.valueOf(zzhqVar.m10101B());
                            if (zzhqVar.m10102C()) {
                                lValueOf = Long.valueOf(zzhqVar.m10103D());
                            } else {
                                lValueOf = null;
                            }
                            arrayMap.put(numValueOf10, lValueOf);
                            map3 = map110;
                        }
                    }
                }
                Map map111 = map3;
                ArrayMap arrayMap13 = new ArrayMap();
                if (zziiVar != null && zziiVar.m10391H() != 0) {
                    it = zziiVar.m10390G().iterator();
                    while (it.hasNext()) {
                        zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                        if (!zzikVar.m10401A() && zzikVar.m10404D() > 0) {
                            arrayMap13.put(Integer.valueOf(zzikVar.m10402B()), Long.valueOf(zzikVar.m10405E(zzikVar.m10404D() - 1)));
                            it = it;
                            zziiVar = zziiVar;
                        }
                    }
                }
                zziiVar2 = zziiVar;
                if (zziiVar2 != null) {
                    i4 = 0;
                    while (i4 < zziiVar2.m10385B() * 64) {
                        if (zzpk.zzn(zziiVar2.m10384A(), i4)) {
                            z4 = zZzp;
                            this.zzu.zzaW().zzk().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i4));
                            bitSet2.set(i4);
                            if (zzpk.zzn(zziiVar2.m10386C(), i4)) {
                                bitSet.set(i4);
                            }
                            i4++;
                            zZzp = z4;
                        } else {
                            z4 = zZzp;
                        }
                        arrayMap.remove(Integer.valueOf(i4));
                        i4++;
                        zZzp = z4;
                    }
                }
                boolean z8 = zZzp;
                com.google.android.gms.internal.measurement.zzii zziiVar7 = (com.google.android.gms.internal.measurement.zzii) map2.get(num3);
                if (!zZzp2 && z8 && (list3 = (List) map.get(num3)) != null && this.zze != null && this.zzd != null) {
                    Iterator it13 = list3.iterator();
                    while (it13.hasNext()) {
                        com.google.android.gms.internal.measurement.zzff zzffVar9 = (com.google.android.gms.internal.measurement.zzff) it13.next();
                        int iM9892B = zzffVar9.m9892B();
                        Iterator it14 = it13;
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzffVar9.m9900J()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        Integer numValueOf11 = Integer.valueOf(iM9892B);
                        if (arrayMap.containsKey(numValueOf11)) {
                            arrayMap.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        if (arrayMap13.containsKey(numValueOf11)) {
                            arrayMap13.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        it13 = it14;
                    }
                }
                this.zzc.put(num3, new zzy(this, this.zza, zziiVar7, bitSet, bitSet2, arrayMap, arrayMap13, null));
                r18 = r18;
                map = map;
                str13 = str13;
                map2 = map2;
                zZzp = z8;
                map3 = map111;
            }
        }
        r10 = r18;
        str4 = str13;
        str5 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            zzzVar = new zzz(this, null);
            arrayMap6 = new ArrayMap();
            it6 = list.iterator();
            while (it6.hasNext()) {
                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it6.next();
                zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                if (zzhsVarZza != null) {
                    zzpgVar = this.zzg;
                    zzbdVarZzah = zzpgVar.zzj().zzah(this.zza, zzhsVar, zzhsVarZza.m10127F());
                    zzpgVar.zzj().zzh(zzbdVarZzah);
                    if (z) {
                        j2 = zzbdVarZzah.zzc;
                        strM10127F = zzhsVarZza.m10127F();
                        map7 = (Map) arrayMap6.get(strM10127F);
                        if (map7 == null) {
                            zzawVarZzj3 = zzpgVar.zzj();
                            str9 = this.zza;
                            zzawVarZzj3.zzay();
                            zzawVarZzj3.zzg();
                            Preconditions.m3541e(str9);
                            Preconditions.m3541e(strM10127F);
                            arrayMap7 = new ArrayMap();
                            str10 = str9;
                            Query = zzawVarZzj3.zze().query("event_filters", new String[]{str4, r10}, "app_id=? AND event_name=?", new String[]{str9, strM10127F}, null, null, null);
                            if (Query.moveToFirst()) {
                                zzbdVar = zzbdVarZzah;
                                Query = Query;
                                r114 = r18;
                                while (true) {
                                    com.google.android.gms.internal.measurement.zzff zzffVar10 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.m9890M(), Query.getBlob(1))).m9555r();
                                    numValueOf5 = Integer.valueOf(Query.getInt(0));
                                    list6 = (List) arrayMap7.get(numValueOf5);
                                    if (list6 == null) {
                                        r114 = Query;
                                        arrayList4 = new ArrayList();
                                        arrayMap7.put(numValueOf5, arrayList4);
                                        r116 = r114;
                                    } else {
                                        r116 = Query;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(zzffVar10);
                                    r115 = r116;
                                    if (!r115.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    Query = r115;
                                    r114 = r115;
                                }
                                r115.close();
                                map7 = arrayMap7;
                                r111 = r115;
                            } else {
                                ?? r1110 = Query;
                                zzbdVar = zzbdVarZzah;
                                map7 = Collections.EMPTY_MAP;
                                r1110.close();
                                r111 = r1110;
                            }
                            arrayMap6.put(strM10127F, map7);
                            r18 = r111;
                        } else {
                            zzbdVar = zzbdVarZzah;
                            r18 = r18;
                        }
                        it7 = map7.keySet().iterator();
                        while (it7.hasNext()) {
                            num2 = (Integer) it7.next();
                            iIntValue = num2.intValue();
                            if (this.zzb.contains(num2)) {
                                this.zzu.zzaW().zzk().zzb("Skipping failed audience ID", num2);
                            } else {
                                it8 = ((List) map7.get(num2)).iterator();
                                zZzd2 = true;
                                r19 = r18;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        map8 = map7;
                                        it9 = it7;
                                        j3 = j2;
                                        r18 = r19;
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.zzff zzffVar11 = (com.google.android.gms.internal.measurement.zzff) it8.next();
                                    map8 = map7;
                                    it9 = it7;
                                    zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar11);
                                    Long l9 = this.zzd;
                                    l4 = this.zze;
                                    j3 = j2;
                                    zZzd2 = zzaaVar.zzd(l9, l4, zzhsVarZza, j3, zzbdVar, zzd(iIntValue, zzffVar11.m9892B()));
                                    if (!zZzd2) {
                                        this.zzb.add(num2);
                                        r18 = l4;
                                        break;
                                    }
                                    zzc(num2).zza(zzaaVar);
                                    j2 = j3;
                                    map7 = map8;
                                    it7 = it9;
                                    r19 = l4;
                                }
                                if (!zZzd2) {
                                    this.zzb.add(num2);
                                }
                                j2 = j3;
                                map7 = map8;
                                it7 = it9;
                            }
                        }
                        it6 = it6;
                        zzzVar = zzzVar;
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            arrayMap4 = new ArrayMap();
            it3 = list2.iterator();
            while (it3.hasNext()) {
                com.google.android.gms.internal.measurement.zziu zziuVar4 = (com.google.android.gms.internal.measurement.zziu) it3.next();
                strM10421C = zziuVar4.m10421C();
                map5 = (Map) arrayMap4.get(strM10421C);
                if (map5 == null) {
                    zzawVarZzj2 = this.zzg.zzj();
                    str7 = this.zza;
                    zzawVarZzj2.zzay();
                    zzawVarZzj2.zzg();
                    Preconditions.m3541e(str7);
                    Preconditions.m3541e(strM10421C);
                    arrayMap5 = new ArrayMap();
                    cursorQuery2 = zzawVarZzj2.zze().query("property_filters", new String[]{str4, r10}, "app_id=? AND property_name=?", new String[]{str7, strM10421C}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        while (true) {
                            com.google.android.gms.internal.measurement.zzfn zzfnVar5 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.m9926I(), cursorQuery2.getBlob(1))).m9555r();
                            numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) arrayMap5.get(numValueOf4);
                            if (list5 == null) {
                                it4 = it3;
                                arrayList3 = new ArrayList();
                                arrayMap5.put(numValueOf4, arrayList3);
                            } else {
                                it4 = it3;
                                arrayList3 = list5;
                            }
                            arrayList3.add(zzfnVar5);
                            str8 = str7;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            it3 = it4;
                            str7 = str8;
                        }
                        cursorQuery2.close();
                        map5 = arrayMap5;
                    } else {
                        it4 = it3;
                        map5 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    arrayMap4.put(strM10421C, map5);
                } else {
                    it4 = it3;
                }
                while (r4.hasNext()) {
                    int iIntValue9 = num4.intValue();
                    if (this.zzb.contains(num4)) {
                        this.zzu.zzaW().zzk().zzb(str5, num4);
                        break;
                        break;
                    }
                    it5 = ((List) map5.get(num4)).iterator();
                    zZzd = true;
                    while (true) {
                        if (it5.hasNext()) {
                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it5.next();
                            zzicVar = this.zzu;
                            map6 = map5;
                            if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
                                zzgs zzgsVarZzk5 = zzicVar.zzaW().zzk();
                                if (zzfnVar.m9927A()) {
                                    numValueOf3 = Integer.valueOf(zzfnVar.m9928B());
                                } else {
                                    numValueOf3 = null;
                                }
                                zzgsVarZzk5.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzicVar.zzl().zzc(zzfnVar.m9929C()));
                                zzicVar.zzaW().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                            }
                            if (zzfnVar.m9927A() || zzfnVar.m9928B() > 256) {
                                zzgs zzgsVarZze5 = zzicVar.zzaW().zze();
                                Object objZzl5 = zzgu.zzl(this.zza);
                                if (zzfnVar.m9927A()) {
                                    numValueOf2 = Integer.valueOf(zzfnVar.m9928B());
                                } else {
                                    numValueOf2 = null;
                                }
                                zzgsVarZze5.zzc("Invalid property filter ID. appId, id", objZzl5, String.valueOf(numValueOf2));
                                this.zzb.add(num4);
                                map5 = map6;
                                arrayMap4 = arrayMap4;
                                str5 = str5;
                            } else {
                                zzacVar = new zzac(this, this.zza, iIntValue9, zzfnVar);
                                zZzd = zzacVar.zzd(this.zzd, this.zze, zziuVar4, zzd(iIntValue9, zzfnVar.m9928B()));
                                if (zZzd) {
                                    zzc(num4).zza(zzacVar);
                                    map5 = map6;
                                    arrayMap4 = arrayMap4;
                                    str5 = str5;
                                } else {
                                    this.zzb.add(num4);
                                }
                            }
                        } else {
                            map6 = map5;
                            str5 = str5;
                            arrayMap4 = arrayMap4;
                        }
                        if (!zZzd) {
                            this.zzb.add(num4);
                        }
                        map5 = map6;
                        arrayMap4 = arrayMap4;
                        str5 = str5;
                    }
                }
                it3 = it4;
            }
        }
        arrayList2 = new ArrayList();
        Set<Integer> setKeySet4 = this.zzc.keySet();
        setKeySet4.removeAll(this.zzb);
        while (r3.hasNext()) {
            int iIntValue10 = num5.intValue();
            zzy zzyVar4 = (zzy) this.zzc.get(num5);
            Preconditions.m3544h(zzyVar4);
            com.google.android.gms.internal.measurement.zzhg zzhgVarZzb4 = zzyVar4.zzb(iIntValue10);
            arrayList2.add(zzhgVarZzb4);
            zzawVarZzj = this.zzg.zzj();
            str6 = this.zza;
            com.google.android.gms.internal.measurement.zzii zziiVarM10078C4 = zzhgVarZzb4.m10078C();
            zzawVarZzj.zzay();
            zzawVarZzj.zzg();
            Preconditions.m3541e(str6);
            Preconditions.m3544h(zziiVarM10078C4);
            byte[] bArrM9346i4 = zziiVarM10078C4.m9346i();
            contentValues = new ContentValues();
            contentValues.put("app_id", str6);
            contentValues.put(str4, num5);
            contentValues.put("current_results", bArrM9346i4);
            if (zzawVarZzj.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                zzawVarZzj.zzu.zzaW().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str6));
            }
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbc() {
        return false;
    }
}
