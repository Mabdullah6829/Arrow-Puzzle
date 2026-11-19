package com.google.firebase.logger;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p011H.AbstractC0271e0;
import p068j0.InterfaceC6418a;
import p078p0.InterfaceC6498l;
import p091y0.AbstractC6574d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Logger {
    public static final Companion Companion = new Companion(null);
    private static final ConcurrentHashMap<String, Logger> loggers = new ConcurrentHashMap<>();
    private boolean enabled;
    private Level minLevel;
    private final String tag;

    public static final class AndroidLogger extends Logger {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Level.values().length];
                try {
                    iArr[Level.VERBOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Level.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Level.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Level.WARN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Level.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AndroidLogger(String tag, boolean z, Level minLevel) {
            super(tag, z, minLevel, null);
            AbstractC6452k.m12181e(tag, "tag");
            AbstractC6452k.m12181e(minLevel, "minLevel");
        }

        @Override // com.google.firebase.logger.Logger
        public int log(Level level, String format, Object[] args, Throwable th) {
            AbstractC6452k.m12181e(level, "level");
            AbstractC6452k.m12181e(format, "format");
            AbstractC6452k.m12181e(args, "args");
            if (args.length != 0) {
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                format = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i2 == 1) {
                String tag = getTag();
                return th != null ? Log.v(tag, format, th) : Log.v(tag, format);
            }
            if (i2 == 2) {
                String tag2 = getTag();
                return th != null ? Log.d(tag2, format, th) : Log.d(tag2, format);
            }
            if (i2 == 3) {
                String tag3 = getTag();
                return th != null ? Log.i(tag3, format, th) : Log.i(tag3, format);
            }
            if (i2 == 4) {
                String tag4 = getTag();
                return th != null ? Log.w(tag4, format, th) : Log.w(tag4, format);
            }
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            String tag5 = getTag();
            return th != null ? Log.e(tag5, format, th) : Log.e(tag5, format);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public static /* synthetic */ Logger getLogger$default(Companion companion, String str, boolean z, Level level, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            if ((i2 & 4) != 0) {
                level = Level.INFO;
            }
            return companion.getLogger(str, z, level);
        }

        public static /* synthetic */ FakeLogger setupFakeLogger$default(Companion companion, String str, boolean z, Level level, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            if ((i2 & 4) != 0) {
                level = Level.DEBUG;
            }
            return companion.setupFakeLogger(str, z, level);
        }

        public final Logger getLogger(String tag, boolean z, Level minLevel) {
            Object objPutIfAbsent;
            AbstractC6452k.m12181e(tag, "tag");
            AbstractC6452k.m12181e(minLevel, "minLevel");
            ConcurrentHashMap concurrentHashMap = Logger.loggers;
            Object androidLogger = concurrentHashMap.get(tag);
            if (androidLogger == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(tag, (androidLogger = new AndroidLogger(tag, z, minLevel)))) != null) {
                androidLogger = objPutIfAbsent;
            }
            return (Logger) androidLogger;
        }

        @VisibleForTesting
        public final FakeLogger setupFakeLogger(String tag, boolean z, Level minLevel) {
            AbstractC6452k.m12181e(tag, "tag");
            AbstractC6452k.m12181e(minLevel, "minLevel");
            FakeLogger fakeLogger = new FakeLogger(tag, z, minLevel);
            Logger.loggers.put(tag, fakeLogger);
            return fakeLogger;
        }

        private Companion() {
        }
    }

    @VisibleForTesting
    public static final class FakeLogger extends Logger {
        private final List<String> record;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeLogger(String tag, boolean z, Level minLevel) {
            super(tag, z, minLevel, null);
            AbstractC6452k.m12181e(tag, "tag");
            AbstractC6452k.m12181e(minLevel, "minLevel");
            this.record = new ArrayList();
        }

        private final String toLogMessage(Level level, String str, Object[] objArr, Throwable th) {
            if (objArr.length != 0) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            }
            if (th != null) {
                String str2 = level + ' ' + str + ' ' + Log.getStackTraceString(th);
                if (str2 != null) {
                    return str2;
                }
            }
            return level + ' ' + str;
        }

        @VisibleForTesting
        public final void clearLogMessages() {
            this.record.clear();
        }

        @VisibleForTesting
        public final boolean hasLogMessage(String message) {
            AbstractC6452k.m12181e(message, "message");
            List<String> list = this.record;
            if (list != null && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC6574d.m12226v((String) it.next(), message)) {
                    return true;
                }
            }
            return false;
        }

        @VisibleForTesting
        public final boolean hasLogMessageThat(InterfaceC6498l predicate) {
            AbstractC6452k.m12181e(predicate, "predicate");
            List<String> list = this.record;
            if (list != null && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.firebase.logger.Logger
        public int log(Level level, String format, Object[] args, Throwable th) {
            AbstractC6452k.m12181e(level, "level");
            AbstractC6452k.m12181e(format, "format");
            AbstractC6452k.m12181e(args, "args");
            String logMessage = toLogMessage(level, format, args, th);
            System.out.println((Object) AbstractC0271e0.m398f("Log: ", logMessage));
            this.record.add(logMessage);
            return logMessage.length();
        }
    }

    public enum Level {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);

        private static final /* synthetic */ InterfaceC6418a $ENTRIES = AbstractC0243G.m373k(values());
        private final int priority;

        Level(int i2) {
            this.priority = i2;
        }

        public static InterfaceC6418a getEntries() {
            return $ENTRIES;
        }

        public final int getPriority$com_google_firebase_firebase_common() {
            return this.priority;
        }
    }

    public /* synthetic */ Logger(String str, boolean z, Level level, AbstractC6447f abstractC6447f) {
        this(str, z, level);
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        return logger.debug(str, objArr, th);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        return logger.error(str, objArr, th);
    }

    public static final Logger getLogger(String str, boolean z, Level level) {
        return Companion.getLogger(str, z, level);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        return logger.info(str, objArr, th);
    }

    private final int logIfAble(Level level, String str, Object[] objArr, Throwable th) {
        if (!this.enabled) {
            return 0;
        }
        if (this.minLevel.getPriority$com_google_firebase_firebase_common() <= level.getPriority$com_google_firebase_firebase_common() || Log.isLoggable(this.tag, level.getPriority$com_google_firebase_firebase_common())) {
            return log(level, str, objArr, th);
        }
        return 0;
    }

    public static /* synthetic */ int logIfAble$default(Logger logger, Level level, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logIfAble");
        }
        if ((i2 & 4) != 0) {
            objArr = new Object[0];
        }
        return logger.logIfAble(level, str, objArr, th);
    }

    @VisibleForTesting
    public static final FakeLogger setupFakeLogger(String str, boolean z, Level level) {
        return Companion.setupFakeLogger(str, z, level);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        return logger.verbose(str, objArr, th);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        return logger.warn(str, objArr, th);
    }

    public final int debug(String msg) {
        AbstractC6452k.m12181e(msg, "msg");
        return debug$default(this, msg, null, 2, null);
    }

    public final int error(String msg) {
        AbstractC6452k.m12181e(msg, "msg");
        return error$default(this, msg, null, 2, null);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Level getMinLevel() {
        return this.minLevel;
    }

    public final String getTag() {
        return this.tag;
    }

    public final int info(String msg) {
        AbstractC6452k.m12181e(msg, "msg");
        return info$default(this, msg, null, 2, null);
    }

    public abstract int log(Level level, String str, Object[] objArr, Throwable th);

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setMinLevel(Level level) {
        AbstractC6452k.m12181e(level, "<set-?>");
        this.minLevel = level;
    }

    public final int verbose(String msg) {
        AbstractC6452k.m12181e(msg, "msg");
        return verbose$default(this, msg, null, 2, null);
    }

    public final int warn(String msg) {
        AbstractC6452k.m12181e(msg, "msg");
        return warn$default(this, msg, null, 2, null);
    }

    private Logger(String str, boolean z, Level level) {
        this.tag = str;
        this.enabled = z;
        this.minLevel = level;
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        return logger.debug(str, th);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        return logger.error(str, th);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        return logger.info(str, th);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        return logger.verbose(str, th);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        return logger.warn(str, th);
    }

    public final int debug(String format, Object... args) {
        AbstractC6452k.m12181e(format, "format");
        AbstractC6452k.m12181e(args, "args");
        return debug$default(this, format, args, null, 4, null);
    }

    public final int error(String format, Object... args) {
        AbstractC6452k.m12181e(format, "format");
        AbstractC6452k.m12181e(args, "args");
        return error$default(this, format, args, null, 4, null);
    }

    public final int info(String format, Object... args) {
        AbstractC6452k.m12181e(format, "format");
        AbstractC6452k.m12181e(args, "args");
        return info$default(this, format, args, null, 4, null);
    }

    public final int verbose(String format, Object... args) {
        AbstractC6452k.m12181e(format, "format");
        AbstractC6452k.m12181e(args, "args");
        return verbose$default(this, format, args, null, 4, null);
    }

    public final int warn(String format, Object... args) {
        AbstractC6452k.m12181e(format, "format");
        AbstractC6452k.m12181e(args, "args");
        return warn$default(this, format, args, null, 4, null);
    }

    public final int debug(String format, Object[] args, Throwable th) {
        AbstractC6452k.m12181e(format, "format");
        AbstractC6452k.m12181e(args, "args");
        return logIfAble(Level.DEBUG, format, args, th);
    }

    public final int error(String format, Object[] args, Throwable th) {
        AbstractC6452k.m12181e(format, "format");
        AbstractC6452k.m12181e(args, "args");
        return logIfAble(Level.ERROR, format, args, th);
    }

    public final int info(String format, Object[] args, Throwable th) {
        AbstractC6452k.m12181e(format, "format");
        AbstractC6452k.m12181e(args, "args");
        return logIfAble(Level.INFO, format, args, th);
    }

    public final int verbose(String format, Object[] args, Throwable th) {
        AbstractC6452k.m12181e(format, "format");
        AbstractC6452k.m12181e(args, "args");
        return logIfAble(Level.VERBOSE, format, args, th);
    }

    public final int warn(String format, Object[] args, Throwable th) {
        AbstractC6452k.m12181e(format, "format");
        AbstractC6452k.m12181e(args, "args");
        return logIfAble(Level.WARN, format, args, th);
    }

    public final int debug(String msg, Throwable th) {
        AbstractC6452k.m12181e(msg, "msg");
        return logIfAble$default(this, Level.DEBUG, msg, null, th, 4, null);
    }

    public final int error(String msg, Throwable th) {
        AbstractC6452k.m12181e(msg, "msg");
        return logIfAble$default(this, Level.ERROR, msg, null, th, 4, null);
    }

    public final int info(String msg, Throwable th) {
        AbstractC6452k.m12181e(msg, "msg");
        return logIfAble$default(this, Level.INFO, msg, null, th, 4, null);
    }

    public final int verbose(String msg, Throwable th) {
        AbstractC6452k.m12181e(msg, "msg");
        return logIfAble$default(this, Level.VERBOSE, msg, null, th, 4, null);
    }

    public final int warn(String msg, Throwable th) {
        AbstractC6452k.m12181e(msg, "msg");
        return logIfAble$default(this, Level.WARN, msg, null, th, 4, null);
    }
}
