package p089x0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.C6354i;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6378h;
import p080q0.InterfaceC6520a;

/* JADX INFO: renamed from: x0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6564g extends AbstractC6565h implements Iterator, InterfaceC6348c, InterfaceC6520a {

    /* JADX INFO: renamed from: s */
    public int f24788s;

    /* JADX INFO: renamed from: t */
    public Object f24789t;

    /* JADX INFO: renamed from: u */
    public Iterator f24790u;

    /* JADX INFO: renamed from: v */
    public InterfaceC6348c f24791v;

    @Override // p089x0.AbstractC6565h
    /* JADX INFO: renamed from: a */
    public final void mo12215a(Object obj, AbstractC6378h abstractC6378h) {
        this.f24789t = obj;
        this.f24788s = 3;
        this.f24791v = abstractC6378h;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
    }

    /* JADX INFO: renamed from: b */
    public final RuntimeException m12216b() {
        int i2 = this.f24788s;
        if (i2 == 4) {
            return new NoSuchElementException();
        }
        if (i2 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f24788s);
    }

    @Override // p062g0.InterfaceC6348c
    public final InterfaceC6353h getContext() {
        return C6354i.f24409s;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i2 = this.f24788s;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        return true;
                    }
                    if (i2 == 4) {
                        return false;
                    }
                    throw m12216b();
                }
                Iterator it = this.f24790u;
                AbstractC6452k.m12178b(it);
                if (it.hasNext()) {
                    this.f24788s = 2;
                    return true;
                }
                this.f24790u = null;
            }
            this.f24788s = 5;
            InterfaceC6348c interfaceC6348c = this.f24791v;
            AbstractC6452k.m12178b(interfaceC6348c);
            this.f24791v = null;
            interfaceC6348c.resumeWith(C6289k.f24318a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f24788s;
        if (i2 == 0 || i2 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i2 == 2) {
            this.f24788s = 1;
            Iterator it = this.f24790u;
            AbstractC6452k.m12178b(it);
            return it.next();
        }
        if (i2 != 3) {
            throw m12216b();
        }
        this.f24788s = 0;
        Object obj = this.f24789t;
        this.f24789t = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p062g0.InterfaceC6348c
    public final void resumeWith(Object obj) throws Throwable {
        AbstractC0243G.m377o(obj);
        this.f24788s = 4;
    }
}
