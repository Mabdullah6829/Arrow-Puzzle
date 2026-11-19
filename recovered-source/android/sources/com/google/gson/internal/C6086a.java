package com.google.gson.internal;

import android.database.Cursor;
import android.util.Base64;
import com.arrow.puzzle.escape.maze.free.game.activity.StartActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p063h.EnumC6358d;
import p063h.InterfaceC6362h;
import p069k.C6430k;
import p081r.InterfaceC6528g;
import p085u.AbstractC6540a;

/* JADX INFO: renamed from: com.google.gson.internal.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6086a implements ObjectConstructor, OnCompleteListener, InterfaceC6362h, InterfaceC6528g {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f24047s;

    public /* synthetic */ C6086a(int i2) {
        this.f24047s = i2;
    }

    @Override // p063h.InterfaceC6362h
    /* JADX INFO: renamed from: a */
    public void mo11229a(Exception exc) {
    }

    @Override // p081r.InterfaceC6528g
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            if (string == null) {
                throw new NullPointerException("Null backendName");
            }
            EnumC6358d enumC6358dM12212b = AbstractC6540a.m12212b(cursor.getInt(2));
            String string2 = cursor.getString(3);
            arrayList.add(new C6430k(string, string2 == null ? null : Base64.decode(string2, 0), enumC6358dM12212b));
        }
        return arrayList;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.f24047s) {
            case 0:
                return new ConcurrentHashMap();
            case 1:
                return new ConcurrentSkipListMap();
            case 2:
                return new LinkedHashSet();
            case 3:
                return new TreeSet();
            case 4:
                return new ArrayDeque();
            case 5:
                return ConstructorConstructor.lambda$newMapConstructor$3();
            case 6:
                return new LinkedHashMap();
            default:
                return new TreeMap();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i2 = StartActivity.f2911t;
    }
}
