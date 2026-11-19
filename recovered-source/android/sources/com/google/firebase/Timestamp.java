package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import java.time.Instant;
import java.util.Date;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6456o;
import p011H.AbstractC0271e0;
import p057d0.C6283e;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    private final int nanoseconds;
    private final long seconds;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp createFromParcel(Parcel source) {
            AbstractC6452k.m12181e(source, "source");
            return new Timestamp(source.readLong(), source.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp[] newArray(int i2) {
            return new Timestamp[i2];
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C6283e toPreciseTime(Date date) {
            long j2 = 1000;
            long time = date.getTime() / j2;
            int time2 = (int) ((date.getTime() % j2) * ((long) 1000000));
            return time2 < 0 ? new C6283e(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000)) : new C6283e(Long.valueOf(time), Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateRange(long j2, int i2) {
            if (i2 < 0 || i2 >= 1000000000) {
                throw new IllegalArgumentException(AbstractC0271e0.m396d(i2, "Timestamp nanoseconds out of range: ").toString());
            }
            if (-62135596800L > j2 || j2 >= 253402300800L) {
                throw new IllegalArgumentException(("Timestamp seconds out of range: " + j2).toString());
            }
        }

        public final Timestamp now() {
            return new Timestamp(new Date());
        }

        private Companion() {
        }
    }

    public Timestamp(long j2, int i2) {
        Companion.validateRange(j2, i2);
        this.seconds = j2;
        this.nanoseconds = i2;
    }

    public static final Timestamp now() {
        return Companion.now();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0;
        }
        return true;
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j2 = this.seconds;
        return (((((int) j2) * 1369) + ((int) (j2 >> 32))) * 37) + this.nanoseconds;
    }

    public final Date toDate() {
        return new Date((this.seconds * ((long) 1000)) + ((long) (this.nanoseconds / 1000000)));
    }

    @RequiresApi(26)
    public final Instant toInstant() {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(this.seconds, this.nanoseconds);
        AbstractC6452k.m12180d(instantOfEpochSecond, "ofEpochSecond(...)");
        return instantOfEpochSecond;
    }

    public String toString() {
        return "Timestamp(seconds=" + this.seconds + ", nanoseconds=" + this.nanoseconds + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i2) {
        AbstractC6452k.m12181e(dest, "dest");
        dest.writeLong(this.seconds);
        dest.writeInt(this.nanoseconds);
    }

    @Override // java.lang.Comparable
    public int compareTo(Timestamp other) {
        int iCompareTo;
        AbstractC6452k.m12181e(other, "other");
        InterfaceC6498l[] interfaceC6498lArr = {new AbstractC6456o() { // from class: com.google.firebase.Timestamp.compareTo.1
            @Override // p088w0.InterfaceC6553h
            public Object get(Object obj) {
                return Long.valueOf(((Timestamp) obj).getSeconds());
            }
        }, new AbstractC6456o() { // from class: com.google.firebase.Timestamp.compareTo.2
            @Override // p088w0.InterfaceC6553h
            public Object get(Object obj) {
                return Integer.valueOf(((Timestamp) obj).getNanoseconds());
            }
        }};
        for (int i2 = 0; i2 < 2; i2++) {
            InterfaceC6498l interfaceC6498l = interfaceC6498lArr[i2];
            Comparable comparable = (Comparable) interfaceC6498l.invoke(this);
            Comparable comparable2 = (Comparable) interfaceC6498l.invoke(other);
            if (comparable == comparable2) {
                iCompareTo = 0;
            } else if (comparable == null) {
                iCompareTo = -1;
            } else {
                iCompareTo = comparable2 == null ? 1 : comparable.compareTo(comparable2);
            }
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public Timestamp(Date date) {
        AbstractC6452k.m12181e(date, "date");
        Companion companion = Companion;
        C6283e preciseTime = companion.toPreciseTime(date);
        long jLongValue = ((Number) preciseTime.f24308s).longValue();
        int iIntValue = ((Number) preciseTime.f24309t).intValue();
        companion.validateRange(jLongValue, iIntValue);
        this.seconds = jLongValue;
        this.nanoseconds = iIntValue;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi(26)
    public Timestamp(Instant time) {
        this(time.getEpochSecond(), time.getNano());
        AbstractC6452k.m12181e(time, "time");
    }
}
