// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.MonitoredServiceRequestChangeSourceArgs;
import com.pulumi.harness.platform.inputs.MonitoredServiceRequestDependencyArgs;
import com.pulumi.harness.platform.inputs.MonitoredServiceRequestHealthSourceArgs;
import com.pulumi.harness.platform.inputs.MonitoredServiceRequestNotificationRuleRefArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitoredServiceRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoredServiceRequestArgs Empty = new MonitoredServiceRequestArgs();

    /**
     * Set of change sources for the monitored service.
     * 
     */
    @Import(name="changeSources")
    private @Nullable Output<List<MonitoredServiceRequestChangeSourceArgs>> changeSources;

    /**
     * @return Set of change sources for the monitored service.
     * 
     */
    public Optional<Output<List<MonitoredServiceRequestChangeSourceArgs>>> changeSources() {
        return Optional.ofNullable(this.changeSources);
    }

    /**
     * Dependencies of the monitored service.
     * 
     */
    @Import(name="dependencies")
    private @Nullable Output<List<MonitoredServiceRequestDependencyArgs>> dependencies;

    /**
     * @return Dependencies of the monitored service.
     * 
     */
    public Optional<Output<List<MonitoredServiceRequestDependencyArgs>>> dependencies() {
        return Optional.ofNullable(this.dependencies);
    }

    /**
     * Description for the monitored service.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description for the monitored service.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Enable or disable the monitored service.
     * 
     * @deprecated
     * enabled field is deprecated
     * 
     */
    @Deprecated /* enabled field is deprecated */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable or disable the monitored service.
     * 
     * @deprecated
     * enabled field is deprecated
     * 
     */
    @Deprecated /* enabled field is deprecated */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Environment in which the service is deployed.
     * 
     */
    @Import(name="environmentRef", required=true)
    private Output<String> environmentRef;

    /**
     * @return Environment in which the service is deployed.
     * 
     */
    public Output<String> environmentRef() {
        return this.environmentRef;
    }

    /**
     * Environment reference list for the monitored service.
     * 
     */
    @Import(name="environmentRefLists")
    private @Nullable Output<List<String>> environmentRefLists;

    /**
     * @return Environment reference list for the monitored service.
     * 
     */
    public Optional<Output<List<String>>> environmentRefLists() {
        return Optional.ofNullable(this.environmentRefLists);
    }

    /**
     * Set of health sources for the monitored service.
     * 
     */
    @Import(name="healthSources")
    private @Nullable Output<List<MonitoredServiceRequestHealthSourceArgs>> healthSources;

    /**
     * @return Set of health sources for the monitored service.
     * 
     */
    public Optional<Output<List<MonitoredServiceRequestHealthSourceArgs>>> healthSources() {
        return Optional.ofNullable(this.healthSources);
    }

    /**
     * Name for the monitored service.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name for the monitored service.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Notification rule references for the monitored service.
     * 
     */
    @Import(name="notificationRuleRefs")
    private @Nullable Output<List<MonitoredServiceRequestNotificationRuleRefArgs>> notificationRuleRefs;

    /**
     * @return Notification rule references for the monitored service.
     * 
     */
    public Optional<Output<List<MonitoredServiceRequestNotificationRuleRefArgs>>> notificationRuleRefs() {
        return Optional.ofNullable(this.notificationRuleRefs);
    }

    /**
     * Service reference for the monitored service.
     * 
     */
    @Import(name="serviceRef", required=true)
    private Output<String> serviceRef;

    /**
     * @return Service reference for the monitored service.
     * 
     */
    public Output<String> serviceRef() {
        return this.serviceRef;
    }

    /**
     * Tags for the monitored service. comma-separated key value string pairs.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags for the monitored service. comma-separated key value string pairs.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Template reference for the monitored service.
     * 
     */
    @Import(name="templateRef")
    private @Nullable Output<String> templateRef;

    /**
     * @return Template reference for the monitored service.
     * 
     */
    public Optional<Output<String>> templateRef() {
        return Optional.ofNullable(this.templateRef);
    }

    /**
     * Type of the monitored service.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of the monitored service.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Template version label for the monitored service.
     * 
     */
    @Import(name="versionLabel")
    private @Nullable Output<String> versionLabel;

    /**
     * @return Template version label for the monitored service.
     * 
     */
    public Optional<Output<String>> versionLabel() {
        return Optional.ofNullable(this.versionLabel);
    }

    private MonitoredServiceRequestArgs() {}

    private MonitoredServiceRequestArgs(MonitoredServiceRequestArgs $) {
        this.changeSources = $.changeSources;
        this.dependencies = $.dependencies;
        this.description = $.description;
        this.enabled = $.enabled;
        this.environmentRef = $.environmentRef;
        this.environmentRefLists = $.environmentRefLists;
        this.healthSources = $.healthSources;
        this.name = $.name;
        this.notificationRuleRefs = $.notificationRuleRefs;
        this.serviceRef = $.serviceRef;
        this.tags = $.tags;
        this.templateRef = $.templateRef;
        this.type = $.type;
        this.versionLabel = $.versionLabel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoredServiceRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoredServiceRequestArgs $;

        public Builder() {
            $ = new MonitoredServiceRequestArgs();
        }

        public Builder(MonitoredServiceRequestArgs defaults) {
            $ = new MonitoredServiceRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param changeSources Set of change sources for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder changeSources(@Nullable Output<List<MonitoredServiceRequestChangeSourceArgs>> changeSources) {
            $.changeSources = changeSources;
            return this;
        }

        /**
         * @param changeSources Set of change sources for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder changeSources(List<MonitoredServiceRequestChangeSourceArgs> changeSources) {
            return changeSources(Output.of(changeSources));
        }

        /**
         * @param changeSources Set of change sources for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder changeSources(MonitoredServiceRequestChangeSourceArgs... changeSources) {
            return changeSources(List.of(changeSources));
        }

        /**
         * @param dependencies Dependencies of the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder dependencies(@Nullable Output<List<MonitoredServiceRequestDependencyArgs>> dependencies) {
            $.dependencies = dependencies;
            return this;
        }

        /**
         * @param dependencies Dependencies of the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder dependencies(List<MonitoredServiceRequestDependencyArgs> dependencies) {
            return dependencies(Output.of(dependencies));
        }

        /**
         * @param dependencies Dependencies of the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder dependencies(MonitoredServiceRequestDependencyArgs... dependencies) {
            return dependencies(List.of(dependencies));
        }

        /**
         * @param description Description for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Enable or disable the monitored service.
         * 
         * @return builder
         * 
         * @deprecated
         * enabled field is deprecated
         * 
         */
        @Deprecated /* enabled field is deprecated */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable or disable the monitored service.
         * 
         * @return builder
         * 
         * @deprecated
         * enabled field is deprecated
         * 
         */
        @Deprecated /* enabled field is deprecated */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param environmentRef Environment in which the service is deployed.
         * 
         * @return builder
         * 
         */
        public Builder environmentRef(Output<String> environmentRef) {
            $.environmentRef = environmentRef;
            return this;
        }

        /**
         * @param environmentRef Environment in which the service is deployed.
         * 
         * @return builder
         * 
         */
        public Builder environmentRef(String environmentRef) {
            return environmentRef(Output.of(environmentRef));
        }

        /**
         * @param environmentRefLists Environment reference list for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder environmentRefLists(@Nullable Output<List<String>> environmentRefLists) {
            $.environmentRefLists = environmentRefLists;
            return this;
        }

        /**
         * @param environmentRefLists Environment reference list for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder environmentRefLists(List<String> environmentRefLists) {
            return environmentRefLists(Output.of(environmentRefLists));
        }

        /**
         * @param environmentRefLists Environment reference list for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder environmentRefLists(String... environmentRefLists) {
            return environmentRefLists(List.of(environmentRefLists));
        }

        /**
         * @param healthSources Set of health sources for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder healthSources(@Nullable Output<List<MonitoredServiceRequestHealthSourceArgs>> healthSources) {
            $.healthSources = healthSources;
            return this;
        }

        /**
         * @param healthSources Set of health sources for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder healthSources(List<MonitoredServiceRequestHealthSourceArgs> healthSources) {
            return healthSources(Output.of(healthSources));
        }

        /**
         * @param healthSources Set of health sources for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder healthSources(MonitoredServiceRequestHealthSourceArgs... healthSources) {
            return healthSources(List.of(healthSources));
        }

        /**
         * @param name Name for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationRuleRefs Notification rule references for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder notificationRuleRefs(@Nullable Output<List<MonitoredServiceRequestNotificationRuleRefArgs>> notificationRuleRefs) {
            $.notificationRuleRefs = notificationRuleRefs;
            return this;
        }

        /**
         * @param notificationRuleRefs Notification rule references for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder notificationRuleRefs(List<MonitoredServiceRequestNotificationRuleRefArgs> notificationRuleRefs) {
            return notificationRuleRefs(Output.of(notificationRuleRefs));
        }

        /**
         * @param notificationRuleRefs Notification rule references for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder notificationRuleRefs(MonitoredServiceRequestNotificationRuleRefArgs... notificationRuleRefs) {
            return notificationRuleRefs(List.of(notificationRuleRefs));
        }

        /**
         * @param serviceRef Service reference for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder serviceRef(Output<String> serviceRef) {
            $.serviceRef = serviceRef;
            return this;
        }

        /**
         * @param serviceRef Service reference for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder serviceRef(String serviceRef) {
            return serviceRef(Output.of(serviceRef));
        }

        /**
         * @param tags Tags for the monitored service. comma-separated key value string pairs.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags for the monitored service. comma-separated key value string pairs.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags for the monitored service. comma-separated key value string pairs.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param templateRef Template reference for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder templateRef(@Nullable Output<String> templateRef) {
            $.templateRef = templateRef;
            return this;
        }

        /**
         * @param templateRef Template reference for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder templateRef(String templateRef) {
            return templateRef(Output.of(templateRef));
        }

        /**
         * @param type Type of the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param versionLabel Template version label for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder versionLabel(@Nullable Output<String> versionLabel) {
            $.versionLabel = versionLabel;
            return this;
        }

        /**
         * @param versionLabel Template version label for the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder versionLabel(String versionLabel) {
            return versionLabel(Output.of(versionLabel));
        }

        public MonitoredServiceRequestArgs build() {
            if ($.environmentRef == null) {
                throw new MissingRequiredPropertyException("MonitoredServiceRequestArgs", "environmentRef");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("MonitoredServiceRequestArgs", "name");
            }
            if ($.serviceRef == null) {
                throw new MissingRequiredPropertyException("MonitoredServiceRequestArgs", "serviceRef");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("MonitoredServiceRequestArgs", "type");
            }
            return $;
        }
    }

}
