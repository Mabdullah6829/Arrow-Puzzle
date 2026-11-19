package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.customaudience.AbstractC1613a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p058e0.C6313u;

/* JADX INFO: loaded from: classes.dex */
public final class DeletionRequest {
    public static final Companion Companion = new Companion(null);
    public static final int DELETION_MODE_ALL = 0;
    public static final int DELETION_MODE_EXCLUDE_INTERNAL_DATA = 1;
    public static final int MATCH_BEHAVIOR_DELETE = 0;
    public static final int MATCH_BEHAVIOR_PRESERVE = 1;
    private final int deletionMode;
    private final List<Uri> domainUris;
    private final Instant end;
    private final int matchBehavior;
    private final List<Uri> originUris;
    private final Instant start;

    public static final class Builder {
        private final int deletionMode;
        private List<? extends Uri> domainUris;
        private Instant end;
        private final int matchBehavior;
        private List<? extends Uri> originUris;
        private Instant start;

        public Builder(int i2, int i3) {
            this.deletionMode = i2;
            this.matchBehavior = i3;
            Instant MIN = Instant.MIN;
            AbstractC6452k.m12180d(MIN, "MIN");
            this.start = MIN;
            Instant MAX = Instant.MAX;
            AbstractC6452k.m12180d(MAX, "MAX");
            this.end = MAX;
            C6313u c6313u = C6313u.f24338s;
            this.domainUris = c6313u;
            this.originUris = c6313u;
        }

        public final DeletionRequest build() {
            return new DeletionRequest(this.deletionMode, this.matchBehavior, this.start, this.end, this.domainUris, this.originUris);
        }

        public final Builder setDomainUris(List<? extends Uri> domainUris) {
            AbstractC6452k.m12181e(domainUris, "domainUris");
            this.domainUris = domainUris;
            return this;
        }

        public final Builder setEnd(Instant end) {
            AbstractC6452k.m12181e(end, "end");
            this.end = end;
            return this;
        }

        public final Builder setOriginUris(List<? extends Uri> originUris) {
            AbstractC6452k.m12181e(originUris, "originUris");
            this.originUris = originUris;
            return this;
        }

        public final Builder setStart(Instant start) {
            AbstractC6452k.m12181e(start, "start");
            this.start = start;
            return this;
        }
    }

    public static final class Companion {

        @Retention(RetentionPolicy.SOURCE)
        public @interface DeletionMode {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface MatchBehavior {
        }

        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeletionRequest(int i2, int i3, Instant start, Instant end, List<? extends Uri> domainUris, List<? extends Uri> originUris) {
        AbstractC6452k.m12181e(start, "start");
        AbstractC6452k.m12181e(end, "end");
        AbstractC6452k.m12181e(domainUris, "domainUris");
        AbstractC6452k.m12181e(originUris, "originUris");
        this.deletionMode = i2;
        this.matchBehavior = i3;
        this.start = start;
        this.end = end;
        this.domainUris = domainUris;
        this.originUris = originUris;
    }

    public final android.adservices.measurement.DeletionRequest convertToAdServices$ads_adservices_release() {
        android.adservices.measurement.DeletionRequest deletionRequestBuild = AbstractC1613a.m2565j().setDeletionMode(this.deletionMode).setMatchBehavior(this.matchBehavior).setStart(this.start).setEnd(this.end).setDomainUris(this.domainUris).setOriginUris(this.originUris).build();
        AbstractC6452k.m12180d(deletionRequestBuild, "Builder()\n            .s…ris)\n            .build()");
        return deletionRequestBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletionRequest)) {
            return false;
        }
        DeletionRequest deletionRequest = (DeletionRequest) obj;
        return this.deletionMode == deletionRequest.deletionMode && new HashSet(this.domainUris).equals(new HashSet(deletionRequest.domainUris)) && new HashSet(this.originUris).equals(new HashSet(deletionRequest.originUris)) && AbstractC6452k.m12177a(this.start, deletionRequest.start) && AbstractC6452k.m12177a(this.end, deletionRequest.end) && this.matchBehavior == deletionRequest.matchBehavior;
    }

    public final int getDeletionMode() {
        return this.deletionMode;
    }

    public final List<Uri> getDomainUris() {
        return this.domainUris;
    }

    public final Instant getEnd() {
        return this.end;
    }

    public final int getMatchBehavior() {
        return this.matchBehavior;
    }

    public final List<Uri> getOriginUris() {
        return this.originUris;
    }

    public final Instant getStart() {
        return this.start;
    }

    public int hashCode() {
        return Integer.hashCode(this.matchBehavior) + ((this.end.hashCode() + ((this.start.hashCode() + ((this.originUris.hashCode() + ((this.domainUris.hashCode() + (Integer.hashCode(this.deletionMode) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "DeletionRequest { DeletionMode=" + (this.deletionMode == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA") + ", MatchBehavior=" + (this.matchBehavior == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE") + ", Start=" + this.start + ", End=" + this.end + ", DomainUris=" + this.domainUris + ", OriginUris=" + this.originUris + " }";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeletionRequest(int i2, int i3, Instant MIN, Instant MAX, List list, List list2, int i4, AbstractC6447f abstractC6447f) {
        if ((i4 & 4) != 0) {
            MIN = Instant.MIN;
            AbstractC6452k.m12180d(MIN, "MIN");
        }
        Instant instant = MIN;
        if ((i4 & 8) != 0) {
            MAX = Instant.MAX;
            AbstractC6452k.m12180d(MAX, "MAX");
        }
        Instant instant2 = MAX;
        int i5 = i4 & 16;
        C6313u c6313u = C6313u.f24338s;
        this(i2, i3, instant, instant2, i5 != 0 ? c6313u : list, (i4 & 32) != 0 ? c6313u : list2);
    }
}
