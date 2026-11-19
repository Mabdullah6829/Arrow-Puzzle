package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zzigp implements Iterator {

    /* JADX INFO: renamed from: s */
    public final ArrayDeque f19873s;

    /* JADX INFO: renamed from: t */
    public zzidi f19874t;

    public zzigp(zzidl zzidlVar) {
        if (!(zzidlVar instanceof zzigq)) {
            this.f19873s = null;
            this.f19874t = (zzidi) zzidlVar;
            return;
        }
        zzigq zzigqVar = (zzigq) zzidlVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzigqVar.f19880y);
        this.f19873s = arrayDeque;
        arrayDeque.push(zzigqVar);
        zzidl zzidlVar2 = zzigqVar.f19877v;
        while (zzidlVar2 instanceof zzigq) {
            zzigq zzigqVar2 = (zzigq) zzidlVar2;
            this.f19873s.push(zzigqVar2);
            zzidlVar2 = zzigqVar2.f19877v;
        }
        this.f19874t = (zzidi) zzidlVar2;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzidi next() {
        zzidi zzidiVar;
        zzidi zzidiVar2 = this.f19874t;
        if (zzidiVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f19873s;
            zzidiVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzidl zzidlVar = ((zzigq) arrayDeque.pop()).f19878w;
            while (zzidlVar instanceof zzigq) {
                zzigq zzigqVar = (zzigq) zzidlVar;
                arrayDeque.push(zzigqVar);
                zzidlVar = zzigqVar.f19877v;
            }
            zzidiVar = (zzidi) zzidlVar;
        } while (zzidiVar.mo8132h() == 0);
        this.f19874t = zzidiVar;
        return zzidiVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19874t != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
