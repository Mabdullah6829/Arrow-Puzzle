package androidx.privacysandbox.ads.adservices.topics;

import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public final class Topic {
    private final long modelVersion;
    private final long taxonomyVersion;
    private final int topicId;

    public Topic(long j2, long j3, int i2) {
        this.taxonomyVersion = j2;
        this.modelVersion = j3;
        this.topicId = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) obj;
        return this.taxonomyVersion == topic.taxonomyVersion && this.modelVersion == topic.modelVersion && this.topicId == topic.topicId;
    }

    public final long getModelVersion() {
        return this.modelVersion;
    }

    public final long getTaxonomyVersion() {
        return this.taxonomyVersion;
    }

    public final int getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return Integer.hashCode(this.topicId) + ((Long.hashCode(this.modelVersion) + (Long.hashCode(this.taxonomyVersion) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.taxonomyVersion);
        sb.append(", ModelVersion=");
        sb.append(this.modelVersion);
        sb.append(", TopicCode=");
        return AbstractC0271e0.m398f("Topic { ", AbstractC0271e0.m402j(sb, " }", this.topicId));
    }
}
