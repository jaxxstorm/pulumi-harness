// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.autostopping.inputs.RuleVmFilterTagArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleVmFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleVmFilterArgs Empty = new RuleVmFilterArgs();

    /**
     * Regions of instances that needs to be managed using the AutoStopping rules
     * 
     */
    @Import(name="regions")
    private @Nullable Output<List<String>> regions;

    /**
     * @return Regions of instances that needs to be managed using the AutoStopping rules
     * 
     */
    public Optional<Output<List<String>>> regions() {
        return Optional.ofNullable(this.regions);
    }

    /**
     * Tags of instances that needs to be managed using the AutoStopping rules
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<RuleVmFilterTagArgs>> tags;

    /**
     * @return Tags of instances that needs to be managed using the AutoStopping rules
     * 
     */
    public Optional<Output<List<RuleVmFilterTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Ids of instances that needs to be managed using the AutoStopping rules
     * 
     */
    @Import(name="vmIds", required=true)
    private Output<List<String>> vmIds;

    /**
     * @return Ids of instances that needs to be managed using the AutoStopping rules
     * 
     */
    public Output<List<String>> vmIds() {
        return this.vmIds;
    }

    /**
     * Zones of instances that needs to be managed using the AutoStopping rules
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return Zones of instances that needs to be managed using the AutoStopping rules
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private RuleVmFilterArgs() {}

    private RuleVmFilterArgs(RuleVmFilterArgs $) {
        this.regions = $.regions;
        this.tags = $.tags;
        this.vmIds = $.vmIds;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleVmFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleVmFilterArgs $;

        public Builder() {
            $ = new RuleVmFilterArgs();
        }

        public Builder(RuleVmFilterArgs defaults) {
            $ = new RuleVmFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param regions Regions of instances that needs to be managed using the AutoStopping rules
         * 
         * @return builder
         * 
         */
        public Builder regions(@Nullable Output<List<String>> regions) {
            $.regions = regions;
            return this;
        }

        /**
         * @param regions Regions of instances that needs to be managed using the AutoStopping rules
         * 
         * @return builder
         * 
         */
        public Builder regions(List<String> regions) {
            return regions(Output.of(regions));
        }

        /**
         * @param regions Regions of instances that needs to be managed using the AutoStopping rules
         * 
         * @return builder
         * 
         */
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }

        /**
         * @param tags Tags of instances that needs to be managed using the AutoStopping rules
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<RuleVmFilterTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags of instances that needs to be managed using the AutoStopping rules
         * 
         * @return builder
         * 
         */
        public Builder tags(List<RuleVmFilterTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags of instances that needs to be managed using the AutoStopping rules
         * 
         * @return builder
         * 
         */
        public Builder tags(RuleVmFilterTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param vmIds Ids of instances that needs to be managed using the AutoStopping rules
         * 
         * @return builder
         * 
         */
        public Builder vmIds(Output<List<String>> vmIds) {
            $.vmIds = vmIds;
            return this;
        }

        /**
         * @param vmIds Ids of instances that needs to be managed using the AutoStopping rules
         * 
         * @return builder
         * 
         */
        public Builder vmIds(List<String> vmIds) {
            return vmIds(Output.of(vmIds));
        }

        /**
         * @param vmIds Ids of instances that needs to be managed using the AutoStopping rules
         * 
         * @return builder
         * 
         */
        public Builder vmIds(String... vmIds) {
            return vmIds(List.of(vmIds));
        }

        /**
         * @param zones Zones of instances that needs to be managed using the AutoStopping rules
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones Zones of instances that needs to be managed using the AutoStopping rules
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones Zones of instances that needs to be managed using the AutoStopping rules
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public RuleVmFilterArgs build() {
            if ($.vmIds == null) {
                throw new MissingRequiredPropertyException("RuleVmFilterArgs", "vmIds");
            }
            return $;
        }
    }

}