// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.governance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleEnforcementState extends com.pulumi.resources.ResourceArgs {

    public static final RuleEnforcementState Empty = new RuleEnforcementState();

    /**
     * The cloud provider for the rule enforcement. It should be either AWS, AZURE or GCP.
     * 
     */
    @Import(name="cloudProvider")
    private @Nullable Output<String> cloudProvider;

    /**
     * @return The cloud provider for the rule enforcement. It should be either AWS, AZURE or GCP.
     * 
     */
    public Optional<Output<String>> cloudProvider() {
        return Optional.ofNullable(this.cloudProvider);
    }

    /**
     * Description for rule enforcement.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description for rule enforcement.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Id of the rule enforcement.
     * 
     */
    @Import(name="enforcementId")
    private @Nullable Output<String> enforcementId;

    /**
     * @return Id of the rule enforcement.
     * 
     */
    public Optional<Output<String>> enforcementId() {
        return Optional.ofNullable(this.enforcementId);
    }

    /**
     * Execution schedule in cron format.
     * 
     */
    @Import(name="executionSchedule")
    private @Nullable Output<String> executionSchedule;

    /**
     * @return Execution schedule in cron format.
     * 
     */
    public Optional<Output<String>> executionSchedule() {
        return Optional.ofNullable(this.executionSchedule);
    }

    /**
     * Timezone for the execution schedule.
     * 
     */
    @Import(name="executionTimezone")
    private @Nullable Output<String> executionTimezone;

    /**
     * @return Timezone for the execution schedule.
     * 
     */
    public Optional<Output<String>> executionTimezone() {
        return Optional.ofNullable(this.executionTimezone);
    }

    /**
     * Indicates if the rule enforcement is a dry run. This by default is set to false.
     * 
     */
    @Import(name="isDryRun")
    private @Nullable Output<Boolean> isDryRun;

    /**
     * @return Indicates if the rule enforcement is a dry run. This by default is set to false.
     * 
     */
    public Optional<Output<Boolean>> isDryRun() {
        return Optional.ofNullable(this.isDryRun);
    }

    /**
     * Indicates if the rule enforcement is enabled. This by default is set to true.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return Indicates if the rule enforcement is enabled. This by default is set to true.
     * 
     */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * Name of the rule enforcement.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the rule enforcement.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of rule IDs. Either rule*ids or rule*set_ids should be provided.
     * 
     */
    @Import(name="ruleIds")
    private @Nullable Output<List<String>> ruleIds;

    /**
     * @return List of rule IDs. Either rule*ids or rule*set_ids should be provided.
     * 
     */
    public Optional<Output<List<String>>> ruleIds() {
        return Optional.ofNullable(this.ruleIds);
    }

    /**
     * List of rule set IDs. Either rule*ids or rule*set_ids should be provided.
     * 
     */
    @Import(name="ruleSetIds")
    private @Nullable Output<List<String>> ruleSetIds;

    /**
     * @return List of rule set IDs. Either rule*ids or rule*set_ids should be provided.
     * 
     */
    public Optional<Output<List<String>>> ruleSetIds() {
        return Optional.ofNullable(this.ruleSetIds);
    }

    /**
     * List of target account which can be either AWS Account Ids or Azure Subscription Ids or Gcp Project Ids.
     * 
     */
    @Import(name="targetAccounts")
    private @Nullable Output<List<String>> targetAccounts;

    /**
     * @return List of target account which can be either AWS Account Ids or Azure Subscription Ids or Gcp Project Ids.
     * 
     */
    public Optional<Output<List<String>>> targetAccounts() {
        return Optional.ofNullable(this.targetAccounts);
    }

    /**
     * List of target regions. For GCP it should be left empty but is required in case of AWS or Azure.
     * 
     */
    @Import(name="targetRegions")
    private @Nullable Output<List<String>> targetRegions;

    /**
     * @return List of target regions. For GCP it should be left empty but is required in case of AWS or Azure.
     * 
     */
    public Optional<Output<List<String>>> targetRegions() {
        return Optional.ofNullable(this.targetRegions);
    }

    private RuleEnforcementState() {}

    private RuleEnforcementState(RuleEnforcementState $) {
        this.cloudProvider = $.cloudProvider;
        this.description = $.description;
        this.enforcementId = $.enforcementId;
        this.executionSchedule = $.executionSchedule;
        this.executionTimezone = $.executionTimezone;
        this.isDryRun = $.isDryRun;
        this.isEnabled = $.isEnabled;
        this.name = $.name;
        this.ruleIds = $.ruleIds;
        this.ruleSetIds = $.ruleSetIds;
        this.targetAccounts = $.targetAccounts;
        this.targetRegions = $.targetRegions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleEnforcementState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleEnforcementState $;

        public Builder() {
            $ = new RuleEnforcementState();
        }

        public Builder(RuleEnforcementState defaults) {
            $ = new RuleEnforcementState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudProvider The cloud provider for the rule enforcement. It should be either AWS, AZURE or GCP.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(@Nullable Output<String> cloudProvider) {
            $.cloudProvider = cloudProvider;
            return this;
        }

        /**
         * @param cloudProvider The cloud provider for the rule enforcement. It should be either AWS, AZURE or GCP.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(String cloudProvider) {
            return cloudProvider(Output.of(cloudProvider));
        }

        /**
         * @param description Description for rule enforcement.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description for rule enforcement.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enforcementId Id of the rule enforcement.
         * 
         * @return builder
         * 
         */
        public Builder enforcementId(@Nullable Output<String> enforcementId) {
            $.enforcementId = enforcementId;
            return this;
        }

        /**
         * @param enforcementId Id of the rule enforcement.
         * 
         * @return builder
         * 
         */
        public Builder enforcementId(String enforcementId) {
            return enforcementId(Output.of(enforcementId));
        }

        /**
         * @param executionSchedule Execution schedule in cron format.
         * 
         * @return builder
         * 
         */
        public Builder executionSchedule(@Nullable Output<String> executionSchedule) {
            $.executionSchedule = executionSchedule;
            return this;
        }

        /**
         * @param executionSchedule Execution schedule in cron format.
         * 
         * @return builder
         * 
         */
        public Builder executionSchedule(String executionSchedule) {
            return executionSchedule(Output.of(executionSchedule));
        }

        /**
         * @param executionTimezone Timezone for the execution schedule.
         * 
         * @return builder
         * 
         */
        public Builder executionTimezone(@Nullable Output<String> executionTimezone) {
            $.executionTimezone = executionTimezone;
            return this;
        }

        /**
         * @param executionTimezone Timezone for the execution schedule.
         * 
         * @return builder
         * 
         */
        public Builder executionTimezone(String executionTimezone) {
            return executionTimezone(Output.of(executionTimezone));
        }

        /**
         * @param isDryRun Indicates if the rule enforcement is a dry run. This by default is set to false.
         * 
         * @return builder
         * 
         */
        public Builder isDryRun(@Nullable Output<Boolean> isDryRun) {
            $.isDryRun = isDryRun;
            return this;
        }

        /**
         * @param isDryRun Indicates if the rule enforcement is a dry run. This by default is set to false.
         * 
         * @return builder
         * 
         */
        public Builder isDryRun(Boolean isDryRun) {
            return isDryRun(Output.of(isDryRun));
        }

        /**
         * @param isEnabled Indicates if the rule enforcement is enabled. This by default is set to true.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Indicates if the rule enforcement is enabled. This by default is set to true.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param name Name of the rule enforcement.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the rule enforcement.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ruleIds List of rule IDs. Either rule*ids or rule*set_ids should be provided.
         * 
         * @return builder
         * 
         */
        public Builder ruleIds(@Nullable Output<List<String>> ruleIds) {
            $.ruleIds = ruleIds;
            return this;
        }

        /**
         * @param ruleIds List of rule IDs. Either rule*ids or rule*set_ids should be provided.
         * 
         * @return builder
         * 
         */
        public Builder ruleIds(List<String> ruleIds) {
            return ruleIds(Output.of(ruleIds));
        }

        /**
         * @param ruleIds List of rule IDs. Either rule*ids or rule*set_ids should be provided.
         * 
         * @return builder
         * 
         */
        public Builder ruleIds(String... ruleIds) {
            return ruleIds(List.of(ruleIds));
        }

        /**
         * @param ruleSetIds List of rule set IDs. Either rule*ids or rule*set_ids should be provided.
         * 
         * @return builder
         * 
         */
        public Builder ruleSetIds(@Nullable Output<List<String>> ruleSetIds) {
            $.ruleSetIds = ruleSetIds;
            return this;
        }

        /**
         * @param ruleSetIds List of rule set IDs. Either rule*ids or rule*set_ids should be provided.
         * 
         * @return builder
         * 
         */
        public Builder ruleSetIds(List<String> ruleSetIds) {
            return ruleSetIds(Output.of(ruleSetIds));
        }

        /**
         * @param ruleSetIds List of rule set IDs. Either rule*ids or rule*set_ids should be provided.
         * 
         * @return builder
         * 
         */
        public Builder ruleSetIds(String... ruleSetIds) {
            return ruleSetIds(List.of(ruleSetIds));
        }

        /**
         * @param targetAccounts List of target account which can be either AWS Account Ids or Azure Subscription Ids or Gcp Project Ids.
         * 
         * @return builder
         * 
         */
        public Builder targetAccounts(@Nullable Output<List<String>> targetAccounts) {
            $.targetAccounts = targetAccounts;
            return this;
        }

        /**
         * @param targetAccounts List of target account which can be either AWS Account Ids or Azure Subscription Ids or Gcp Project Ids.
         * 
         * @return builder
         * 
         */
        public Builder targetAccounts(List<String> targetAccounts) {
            return targetAccounts(Output.of(targetAccounts));
        }

        /**
         * @param targetAccounts List of target account which can be either AWS Account Ids or Azure Subscription Ids or Gcp Project Ids.
         * 
         * @return builder
         * 
         */
        public Builder targetAccounts(String... targetAccounts) {
            return targetAccounts(List.of(targetAccounts));
        }

        /**
         * @param targetRegions List of target regions. For GCP it should be left empty but is required in case of AWS or Azure.
         * 
         * @return builder
         * 
         */
        public Builder targetRegions(@Nullable Output<List<String>> targetRegions) {
            $.targetRegions = targetRegions;
            return this;
        }

        /**
         * @param targetRegions List of target regions. For GCP it should be left empty but is required in case of AWS or Azure.
         * 
         * @return builder
         * 
         */
        public Builder targetRegions(List<String> targetRegions) {
            return targetRegions(Output.of(targetRegions));
        }

        /**
         * @param targetRegions List of target regions. For GCP it should be left empty but is required in case of AWS or Azure.
         * 
         * @return builder
         * 
         */
        public Builder targetRegions(String... targetRegions) {
            return targetRegions(List.of(targetRegions));
        }

        public RuleEnforcementState build() {
            return $;
        }
    }

}
