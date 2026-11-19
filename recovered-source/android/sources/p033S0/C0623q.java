package p033S0;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: S0.q */
/* JADX INFO: loaded from: classes.dex */
public class C0623q extends AbstractC0620n {
    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: a */
    public void mo1361a(C0627u c0627u, C0627u target) throws IOException {
        AbstractC6452k.m12181e(target, "target");
        if (c0627u.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + c0627u + " to " + target);
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: b */
    public final void mo1362b(C0627u c0627u) throws IOException {
        if (c0627u.toFile().mkdir()) {
            return;
        }
        C0619m c0619mMo1364e = mo1364e(c0627u);
        if (c0619mMo1364e == null || !c0619mMo1364e.f1354b) {
            throw new IOException("failed to create directory: " + c0627u);
        }
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: c */
    public final void mo1363c(C0627u c0627u) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = c0627u.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + c0627u);
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: e */
    public C0619m mo1364e(C0627u path) {
        AbstractC6452k.m12181e(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new C0619m(zIsFile, zIsDirectory, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: f */
    public final C0622p mo1365f(C0627u c0627u) {
        return new C0622p(false, new RandomAccessFile(c0627u.toFile(), "r"));
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: g */
    public final C0622p mo1366g(C0627u c0627u) {
        return new C0622p(true, new RandomAccessFile(c0627u.toFile(), "rw"));
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: h */
    public final InterfaceC0603C mo1367h(C0627u file) {
        AbstractC6452k.m12181e(file, "file");
        File file2 = file.toFile();
        int i2 = AbstractC0626t.f1370a;
        return new C0610d(1, new FileInputStream(file2), AbstractC0605E.f1325a);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
