package androidx.activity;

import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class SystemBarStyle {
    public static final Companion Companion = new Companion(null);
    private final int darkScrim;
    private final InterfaceC6498l detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i2, int i3, InterfaceC6498l interfaceC6498l, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                interfaceC6498l = SystemBarStyle$Companion$auto$1.INSTANCE;
            }
            return companion.auto(i2, i3, interfaceC6498l);
        }

        public final SystemBarStyle auto(int i2, int i3) {
            return auto$default(this, i2, i3, null, 4, null);
        }

        public final SystemBarStyle dark(int i2) {
            return new SystemBarStyle(i2, i2, 2, SystemBarStyle$Companion$dark$1.INSTANCE, null);
        }

        public final SystemBarStyle light(int i2, int i3) {
            return new SystemBarStyle(i2, i3, 1, SystemBarStyle$Companion$light$1.INSTANCE, null);
        }

        private Companion() {
        }

        public final SystemBarStyle auto(int i2, int i3, InterfaceC6498l detectDarkMode) {
            AbstractC6452k.m12181e(detectDarkMode, "detectDarkMode");
            return new SystemBarStyle(i2, i3, 0, detectDarkMode, null);
        }
    }

    public /* synthetic */ SystemBarStyle(int i2, int i3, int i4, InterfaceC6498l interfaceC6498l, AbstractC6447f abstractC6447f) {
        this(i2, i3, i4, interfaceC6498l);
    }

    public static final SystemBarStyle auto(int i2, int i3) {
        return Companion.auto(i2, i3);
    }

    public static final SystemBarStyle dark(int i2) {
        return Companion.dark(i2);
    }

    public static final SystemBarStyle light(int i2, int i3) {
        return Companion.light(i2, i3);
    }

    public final int getDarkScrim$activity_release() {
        return this.darkScrim;
    }

    public final InterfaceC6498l getDetectDarkMode$activity_release() {
        return this.detectDarkMode;
    }

    public final int getNightMode$activity_release() {
        return this.nightMode;
    }

    public final int getScrim$activity_release(boolean z) {
        return z ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z) {
        if (this.nightMode == 0) {
            return 0;
        }
        return z ? this.darkScrim : this.lightScrim;
    }

    private SystemBarStyle(int i2, int i3, int i4, InterfaceC6498l interfaceC6498l) {
        this.lightScrim = i2;
        this.darkScrim = i3;
        this.nightMode = i4;
        this.detectDarkMode = interfaceC6498l;
    }

    public static final SystemBarStyle auto(int i2, int i3, InterfaceC6498l interfaceC6498l) {
        return Companion.auto(i2, i3, interfaceC6498l);
    }
}
