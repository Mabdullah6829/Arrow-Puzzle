package p033S0;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.AbstractC6452k;
import p049b0.C1887c;

/* JADX INFO: renamed from: S0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0625s extends C0623q {
    /* JADX INFO: renamed from: i */
    public static Long m1450i(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // p033S0.C0623q, p033S0.AbstractC0620n
    /* JADX INFO: renamed from: a */
    public final void mo1361a(C0627u c0627u, C0627u target) throws IOException {
        AbstractC6452k.m12181e(target, "target");
        try {
            Files.move(c0627u.m1455g(), target.m1455g(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // p033S0.C0623q, p033S0.AbstractC0620n
    /* JADX INFO: renamed from: e */
    public final C0619m mo1364e(C0627u path) {
        AbstractC6452k.m12181e(path, "path");
        Path pathM1455g = path.m1455g();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathM1455g, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathM1455g) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = C0627u.f1371t;
                C1887c.m2718e(symbolicLink.toString(), false);
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM1450i = fileTimeCreationTime != null ? m1450i(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM1450i2 = fileTimeLastModifiedTime != null ? m1450i(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C0619m(zIsRegularFile, zIsDirectory, lValueOf, lM1450i, lM1450i2, fileTimeLastAccessTime != null ? m1450i(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // p033S0.C0623q
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
