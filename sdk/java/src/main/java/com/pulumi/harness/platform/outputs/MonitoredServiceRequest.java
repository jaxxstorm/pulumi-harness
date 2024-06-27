// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.MonitoredServiceRequestChangeSource;
import com.pulumi.harness.platform.outputs.MonitoredServiceRequestDependency;
import com.pulumi.harness.platform.outputs.MonitoredServiceRequestHealthSource;
import com.pulumi.harness.platform.outputs.MonitoredServiceRequestNotificationRuleRef;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitoredServiceRequest {
    /**
     * @return Set of change sources for the monitored service.
     * 
     */
    private @Nullable List<MonitoredServiceRequestChangeSource> changeSources;
    /**
     * @return Dependencies of the monitored service.
     * 
     */
    private @Nullable List<MonitoredServiceRequestDependency> dependencies;
    /**
     * @return Description for the monitored service.
     * 
     */
    private @Nullable String description;
    /**
     * @return Enable or disable the monitored service.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Environment in which the service is deployed.
     * 
     */
    private String environmentRef;
    /**
     * @return Environment reference list for the monitored service.
     * 
     */
    private @Nullable List<String> environmentRefLists;
    /**
     * @return Set of health sources for the monitored service.
     * 
     */
    private @Nullable List<MonitoredServiceRequestHealthSource> healthSources;
    /**
     * @return Name for the monitored service.
     * 
     */
    private String name;
    /**
     * @return Notification rule references for the monitored service.
     * 
     */
    private @Nullable List<MonitoredServiceRequestNotificationRuleRef> notificationRuleRefs;
    /**
     * @return Service reference for the monitored service.
     * 
     */
    private String serviceRef;
    /**
     * @return Tags for the monitored service. comma-separated key value string pairs.
     * 
     */
    private @Nullable List<String> tags;
    /**
     * @return Template reference for the monitored service.
     * 
     */
    private @Nullable String templateRef;
    /**
     * @return Type of the monitored service.
     * 
     */
    private String type;
    /**
     * @return Template version label for the monitored service.
     * 
     */
    private @Nullable String versionLabel;

    private MonitoredServiceRequest() {}
    /**
     * @return Set of change sources for the monitored service.
     * 
     */
    public List<MonitoredServiceRequestChangeSource> changeSources() {
        return this.changeSources == null ? List.of() : this.changeSources;
    }
    /**
     * @return Dependencies of the monitored service.
     * 
     */
    public List<MonitoredServiceRequestDependency> dependencies() {
        return this.dependencies == null ? List.of() : this.dependencies;
    }
    /**
     * @return Description for the monitored service.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Enable or disable the monitored service.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Environment in which the service is deployed.
     * 
     */
    public String environmentRef() {
        return this.environmentRef;
    }
    /**
     * @return Environment reference list for the monitored service.
     * 
     */
    public List<String> environmentRefLists() {
        return this.environmentRefLists == null ? List.of() : this.environmentRefLists;
    }
    /**
     * @return Set of health sources for the monitored service.
     * 
     */
    public List<MonitoredServiceRequestHealthSource> healthSources() {
        return this.healthSources == null ? List.of() : this.healthSources;
    }
    /**
     * @return Name for the monitored service.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Notification rule references for the monitored service.
     * 
     */
    public List<MonitoredServiceRequestNotificationRuleRef> notificationRuleRefs() {
        return this.notificationRuleRefs == null ? List.of() : this.notificationRuleRefs;
    }
    /**
     * @return Service reference for the monitored service.
     * 
     */
    public String serviceRef() {
        return this.serviceRef;
    }
    /**
     * @return Tags for the monitored service. comma-separated key value string pairs.
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return Template reference for the monitored service.
     * 
     */
    public Optional<String> templateRef() {
        return Optional.ofNullable(this.templateRef);
    }
    /**
     * @return Type of the monitored service.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Template version label for the monitored service.
     * 
     */
    public Optional<String> versionLabel() {
        return Optional.ofNullable(this.versionLabel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoredServiceRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<MonitoredServiceRequestChangeSource> changeSources;
        private @Nullable List<MonitoredServiceRequestDependency> dependencies;
        private @Nullable String description;
        private @Nullable Boolean enabled;
        private String environmentRef;
        private @Nullable List<String> environmentRefLists;
        private @Nullable List<MonitoredServiceRequestHealthSource> healthSources;
        private String name;
        private @Nullable List<MonitoredServiceRequestNotificationRuleRef> notificationRuleRefs;
        private String serviceRef;
        private @Nullable List<String> tags;
        private @Nullable String templateRef;
        private String type;
        private @Nullable String versionLabel;
        public Builder() {}
        public Builder(MonitoredServiceRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeSources = defaults.changeSources;
    	      this.dependencies = defaults.dependencies;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.environmentRef = defaults.environmentRef;
    	      this.environmentRefLists = defaults.environmentRefLists;
    	      this.healthSources = defaults.healthSources;
    	      this.name = defaults.name;
    	      this.notificationRuleRefs = defaults.notificationRuleRefs;
    	      this.serviceRef = defaults.serviceRef;
    	      this.tags = defaults.tags;
    	      this.templateRef = defaults.templateRef;
    	      this.type = defaults.type;
    	      this.versionLabel = defaults.versionLabel;
        }

        @CustomType.Setter
        public Builder changeSources(@Nullable List<MonitoredServiceRequestChangeSource> changeSources) {

            this.changeSources = changeSources;
            return this;
        }
        public Builder changeSources(MonitoredServiceRequestChangeSource... changeSources) {
            return changeSources(List.of(changeSources));
        }
        @CustomType.Setter
        public Builder dependencies(@Nullable List<MonitoredServiceRequestDependency> dependencies) {

            this.dependencies = dependencies;
            return this;
        }
        public Builder dependencies(MonitoredServiceRequestDependency... dependencies) {
            return dependencies(List.of(dependencies));
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder environmentRef(String environmentRef) {
            if (environmentRef == null) {
              throw new MissingRequiredPropertyException("MonitoredServiceRequest", "environmentRef");
            }
            this.environmentRef = environmentRef;
            return this;
        }
        @CustomType.Setter
        public Builder environmentRefLists(@Nullable List<String> environmentRefLists) {

            this.environmentRefLists = environmentRefLists;
            return this;
        }
        public Builder environmentRefLists(String... environmentRefLists) {
            return environmentRefLists(List.of(environmentRefLists));
        }
        @CustomType.Setter
        public Builder healthSources(@Nullable List<MonitoredServiceRequestHealthSource> healthSources) {

            this.healthSources = healthSources;
            return this;
        }
        public Builder healthSources(MonitoredServiceRequestHealthSource... healthSources) {
            return healthSources(List.of(healthSources));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("MonitoredServiceRequest", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder notificationRuleRefs(@Nullable List<MonitoredServiceRequestNotificationRuleRef> notificationRuleRefs) {

            this.notificationRuleRefs = notificationRuleRefs;
            return this;
        }
        public Builder notificationRuleRefs(MonitoredServiceRequestNotificationRuleRef... notificationRuleRefs) {
            return notificationRuleRefs(List.of(notificationRuleRefs));
        }
        @CustomType.Setter
        public Builder serviceRef(String serviceRef) {
            if (serviceRef == null) {
              throw new MissingRequiredPropertyException("MonitoredServiceRequest", "serviceRef");
            }
            this.serviceRef = serviceRef;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder templateRef(@Nullable String templateRef) {

            this.templateRef = templateRef;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("MonitoredServiceRequest", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder versionLabel(@Nullable String versionLabel) {

            this.versionLabel = versionLabel;
            return this;
        }
        public MonitoredServiceRequest build() {
            final var _resultValue = new MonitoredServiceRequest();
            _resultValue.changeSources = changeSources;
            _resultValue.dependencies = dependencies;
            _resultValue.description = description;
            _resultValue.enabled = enabled;
            _resultValue.environmentRef = environmentRef;
            _resultValue.environmentRefLists = environmentRefLists;
            _resultValue.healthSources = healthSources;
            _resultValue.name = name;
            _resultValue.notificationRuleRefs = notificationRuleRefs;
            _resultValue.serviceRef = serviceRef;
            _resultValue.tags = tags;
            _resultValue.templateRef = templateRef;
            _resultValue.type = type;
            _resultValue.versionLabel = versionLabel;
            return _resultValue;
        }
    }
}